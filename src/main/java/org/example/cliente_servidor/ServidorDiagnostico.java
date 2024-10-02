package org.example.cliente_servidor;

import org.example.sintomas_doencas.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class ServidorDiagnostico {
    private int porta;
    private DiagnosticoApriori apriori = new DiagnosticoApriori();

    public ServidorDiagnostico(int porta) {
        this.porta = porta;
    }

    public void iniciarServidor() {
        try (ServerSocket servidorSocket = new ServerSocket(porta)) {
            System.out.println("Servidor de Diagnóstico médico iniciado na porta " + porta);

            while (true) {
                Socket clienteSocket = servidorSocket.accept();
                System.out.println("Cliente conectado: " + clienteSocket.getInetAddress());

                // Criando uma nova thread para lidar com o cliente
                Thread clienteThread = new Thread(() -> processarCliente(clienteSocket));
                clienteThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void processarCliente(Socket clienteSocket){
        
        try (
            ObjectInputStream entrada = new ObjectInputStream(clienteSocket.getInputStream());
            ObjectOutputStream saida = new ObjectOutputStream(clienteSocket.getOutputStream())) {
        
            // Receber a mensagem do cliente para identificar a ação desejada
            String mensagem = (String) entrada.readObject();

            if (mensagem.equals("ListarCasos")) {
                // Ação de listar os casos
                HashMap<Doenca,List<Sintoma>> casos = apriori.listAllDiagnosticos();
                saida.writeObject(casos);
                
            } else if (mensagem.equals("ObterDiagnostico")) {
                
                // Recebendo a lista de sintomas do cliente
                List<Sintoma> sintomas = (List<Sintoma>) entrada.readObject();
                double minSupport = 1.0;
                String doencaDiagnostico = apriori.diagnosticar(sintomas, minSupport);
                saida.writeObject(doencaDiagnostico);
                
            } else if (mensagem.equals("TreinarDiagnostico")) {
                
                // Recebendo o diagnóstico para treinamento
                HashMap<Doenca, List<Sintoma>> mapDiagnostico = (HashMap<Doenca, List<Sintoma>>) entrada.readObject();
                
                Set<Doenca> chaves = mapDiagnostico.keySet();
                
                Doenca doenca = chaves.iterator().next();
                
                apriori.adicionarExemploTreinamento(doenca,mapDiagnostico.get(doenca));
                 
                String msgResposta = new String("Diagnóstico cadastrado com sucesso!");
                
                // Enviando o diagnóstico de volta para o cliente
                saida.writeObject(msgResposta);
            }   
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                clienteSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
