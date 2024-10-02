/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.example;

import org.example.interfaces.ClienteGUI;
import org.example.cliente_servidor.ServidorDiagnostico;

public class DiagnosticoMedico {

    public static void main(String[] args) {
        
        // Criando uma thread para o servidor
        Thread servidorThread = new Thread(() -> {
            int portaServidor = 12345; // Porta do servidor
            ServidorDiagnostico servidor = new ServidorDiagnostico(portaServidor);
            servidor.iniciarServidor();
        });

        // Criando uma thread para o ClienteGUI
        Thread clienteGUIThread = new Thread(() -> {
            ClienteGUI clienteGUI = new ClienteGUI();
            clienteGUI.setVisible(true);
        });

        // Iniciando o servidor e o ClienteGUI em threads separadas
        servidorThread.start();
        clienteGUIThread.start();
    }
}
