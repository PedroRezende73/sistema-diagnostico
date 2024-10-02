package org.example.cliente_servidor;

import org.example.sintomas_doencas.*;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;

public class Cliente {

    private String servidorIP;
    private int portaServidor;

    public Cliente(String servidorIP, int portaServidor) {
        this.servidorIP = servidorIP;
        this.portaServidor = portaServidor;
    }

    public String enviarSintomas(List<Sintoma> sintomas) {
        try (Socket socket = new Socket(servidorIP, portaServidor);
             ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
             ObjectInputStream input = new ObjectInputStream(socket.getInputStream())) {

            // Envia a lista de sintomas para o servidor
            String requisicao = "ObterDiagnostico";
            output.writeObject(requisicao);
            output.writeObject(sintomas);

            // Recebe a resposta do servidor
            String resultadoDiagnostico = input.readObject().toString();
            return resultadoDiagnostico;
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro na comunicação com o servidor - Obter Diagnostico";
        }
    }
    
    public String enviarDiagnostico(Doenca doenca, List<Sintoma> sintomas) {
        try (Socket socket = new Socket(servidorIP, portaServidor);
             ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
             ObjectInputStream input = new ObjectInputStream(socket.getInputStream())) {

            HashMap<Doenca,List<Sintoma>> mapDiagnostico = new HashMap<Doenca,List<Sintoma>>();
            mapDiagnostico.put(doenca, sintomas);
            
            // Envia a lista de sintomas para o servidor
            String requisicao = "TreinarDiagnostico";
            output.writeObject(requisicao);
            output.writeObject(mapDiagnostico);

            // Recebe a resposta do servidor
            String resultadoDiagnostico = (String) input.readObject();
            return resultadoDiagnostico;
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro na comunicação com o servidor - Enviar Diagnostico";
        }
    }
    
    public HashMap<Doenca,List<Sintoma>> receberTodosDiagnosticos(){
        try (Socket socket = new Socket(servidorIP, portaServidor);
             ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
             ObjectInputStream input = new ObjectInputStream(socket.getInputStream())) {
            
            // Envia a lista de sintomas para o servidor
            String requisicao = "ListarCasos";
            output.writeObject(requisicao);

            // Recebe a resposta do servidor
            HashMap<Doenca,List<Sintoma>> resultadoDiagnostico = (HashMap<Doenca,List<Sintoma>>) input.readObject();
            return resultadoDiagnostico;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
