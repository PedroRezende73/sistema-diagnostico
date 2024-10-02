package org.example.interfaces;

import org.example.cliente_servidor.Cliente;
import org.example.sintomas_doencas.*;
import org.example.sintomas_doencas.Sintoma;
import java.util.ArrayList;
import java.util.List;

public class ClienteGUI extends javax.swing.JFrame {

    private List<Sintoma> sintomasSelecionados = new ArrayList<>();
    private Doenca doencaSelecionadas = null;
    private Cliente cliente;
    
    public ClienteGUI() {
        initComponents();
        this.cliente = new Cliente("127.0.0.1", 12345);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoDoencas = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        S0 = new javax.swing.JCheckBox();
        S1 = new javax.swing.JCheckBox();
        S2 = new javax.swing.JCheckBox();
        S3 = new javax.swing.JCheckBox();
        S4 = new javax.swing.JCheckBox();
        S5 = new javax.swing.JCheckBox();
        S6 = new javax.swing.JCheckBox();
        S7 = new javax.swing.JCheckBox();
        S8 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        ObterDiagnostico = new javax.swing.JButton();
        ListarCasos = new javax.swing.JButton();
        EnviarDiagnostico = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        D0 = new javax.swing.JCheckBox();
        D1 = new javax.swing.JCheckBox();
        D2 = new javax.swing.JCheckBox();
        D3 = new javax.swing.JCheckBox();
        D4 = new javax.swing.JCheckBox();
        D5 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Sintomas"));

        S0.setText("S0");
        S0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S0ActionPerformed(evt);
            }
        });

        S1.setText("S1");
        S1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S1ActionPerformed(evt);
            }
        });

        S2.setText("S2");
        S2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S2ActionPerformed(evt);
            }
        });

        S3.setText("S3");
        S3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S3ActionPerformed(evt);
            }
        });

        S4.setText("S4");
        S4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S4ActionPerformed(evt);
            }
        });

        S5.setText("S5");
        S5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S5ActionPerformed(evt);
            }
        });

        S6.setText("S6");
        S6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S6ActionPerformed(evt);
            }
        });

        S7.setText("S8");
        S7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S7ActionPerformed(evt);
            }
        });

        S8.setText("S7");
        S8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(S0, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(S3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(S6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(S6)
                        .addGap(26, 26, 26)
                        .addComponent(S8)
                        .addGap(27, 27, 27)
                        .addComponent(S7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(S3)
                        .addGap(26, 26, 26)
                        .addComponent(S4)
                        .addGap(27, 27, 27)
                        .addComponent(S5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(S0)
                        .addGap(26, 26, 26)
                        .addComponent(S1)
                        .addGap(27, 27, 27)
                        .addComponent(S2)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Diagnóstico"));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );

        ObterDiagnostico.setText("Obter Diagnostico");
        ObterDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObterDiagnosticoActionPerformed(evt);
            }
        });

        ListarCasos.setText("Listar Casos");
        ListarCasos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarCasosActionPerformed(evt);
            }
        });

        EnviarDiagnostico.setText("Enviar Diagnostico");
        EnviarDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarDiagnosticoActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Doenças"));

        grupoDoencas.add(D0);
        D0.setMnemonic('0');
        D0.setText("D0");
        D0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D0ActionPerformed(evt);
            }
        });

        grupoDoencas.add(D1);
        D1.setMnemonic('1');
        D1.setText("D1");
        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });

        grupoDoencas.add(D2);
        D2.setMnemonic('2');
        D2.setText("D2");
        D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2ActionPerformed(evt);
            }
        });

        grupoDoencas.add(D3);
        D3.setMnemonic('3');
        D3.setText("D3");
        D3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D3ActionPerformed(evt);
            }
        });

        grupoDoencas.add(D4);
        D4.setMnemonic('4');
        D4.setText("D4");
        D4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4ActionPerformed(evt);
            }
        });

        grupoDoencas.add(D5);
        D5.setMnemonic('5');
        D5.setText("D5");
        D5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(D0, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(D3)
                        .addGap(26, 26, 26)
                        .addComponent(D4)
                        .addGap(27, 27, 27)
                        .addComponent(D5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(D0)
                        .addGap(26, 26, 26)
                        .addComponent(D1)
                        .addGap(27, 27, 27)
                        .addComponent(D2)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ObterDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ListarCasos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EnviarDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ObterDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListarCasos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnviarDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void S0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S0ActionPerformed

    }//GEN-LAST:event_S0ActionPerformed

    private void S1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S1ActionPerformed

    }//GEN-LAST:event_S1ActionPerformed

    private void S2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S2ActionPerformed

    }//GEN-LAST:event_S2ActionPerformed

    private void S3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S3ActionPerformed

    }//GEN-LAST:event_S3ActionPerformed

    private void S4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S4ActionPerformed

    }//GEN-LAST:event_S4ActionPerformed

    private void S5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S5ActionPerformed

    }//GEN-LAST:event_S5ActionPerformed

    private void S6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S6ActionPerformed

    }//GEN-LAST:event_S6ActionPerformed

    private void S7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S7ActionPerformed

    }//GEN-LAST:event_S7ActionPerformed

    private void S8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S8ActionPerformed

    }//GEN-LAST:event_S8ActionPerformed

    private void ObterDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObterDiagnosticoActionPerformed
        // Limpando a lista de sintomas selecionados
        sintomasSelecionados.clear();

        // Verificando quais JCheckBox estão selecionados e adicionando os sintomas selecionados à lista
        if (S0.isSelected()) {
            sintomasSelecionados.add(Sintoma.S0);
        }
        if (S1.isSelected()) {
            sintomasSelecionados.add(Sintoma.S1);
        }
        if (S2.isSelected()) {
            sintomasSelecionados.add(Sintoma.S2);
        }
        if (S3.isSelected()) {
            sintomasSelecionados.add(Sintoma.S3);
        }
        if (S4.isSelected()) {
            sintomasSelecionados.add(Sintoma.S4);
        }
        if (S5.isSelected()) {
            sintomasSelecionados.add(Sintoma.S5);
        }
        if (S6.isSelected()) {
            sintomasSelecionados.add(Sintoma.S6);
        }
        if (S7.isSelected()) {
            sintomasSelecionados.add(Sintoma.S7);
        }
        if (S8.isSelected()) {
            sintomasSelecionados.add(Sintoma.S8);
        }
        
        String resultadoDiagnostico = cliente.enviarSintomas(sintomasSelecionados);

        // Atualizando a JTextArea com o resultado do diagnóstico
        jTextArea1.setText(resultadoDiagnostico);
    }//GEN-LAST:event_ObterDiagnosticoActionPerformed

    private void ListarCasosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarCasosActionPerformed
        jTextArea1.setText(this.cliente.receberTodosDiagnosticos().toString());
    }//GEN-LAST:event_ListarCasosActionPerformed

    private void EnviarDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarDiagnosticoActionPerformed
        
        D0.setMnemonic(0);
        D1.setMnemonic(1);
        D2.setMnemonic(2);
        D3.setMnemonic(3);
        D4.setMnemonic(4);

        // Limpando a lista de sintomas selecionados
        sintomasSelecionados.clear();

        // Verificando quais JCheckBox estão selecionados e adicionando os sintomas selecionados à lista
        if (S0.isSelected()) {
            sintomasSelecionados.add(Sintoma.S0);
        }
        if (S1.isSelected()) {
            sintomasSelecionados.add(Sintoma.S1);
        }
        if (S2.isSelected()) {
            sintomasSelecionados.add(Sintoma.S2);
        }
        if (S3.isSelected()) {
            sintomasSelecionados.add(Sintoma.S3);
        }
        if (S4.isSelected()) {
            sintomasSelecionados.add(Sintoma.S4);
        }
        if (S5.isSelected()) {
            sintomasSelecionados.add(Sintoma.S5);
        }
        if (S6.isSelected()) {
            sintomasSelecionados.add(Sintoma.S6);
        }
        if (S7.isSelected()) {
            sintomasSelecionados.add(Sintoma.S7);
        }
        if (S8.isSelected()) {
            sintomasSelecionados.add(Sintoma.S8);
        }
        
        // Limpando a lista de sintomas selecionados
        doencaSelecionadas = null;
        
        System.out.println(grupoDoencas.getSelection().getMnemonic());
        // Verificando quais JCheckBox estão selecionados e adicionando as Doencas selecionadas à lista         
        switch(grupoDoencas.getSelection().getMnemonic()){
            case 0:
                this.doencaSelecionadas = Doenca.D0;
            break;
            case 1:
                this.doencaSelecionadas = Doenca.D1;
            break;
            case 2:
                this.doencaSelecionadas = Doenca.D2;
            break;
            case 3:
                this.doencaSelecionadas = Doenca.D3;
            break;
            case 4:
                this.doencaSelecionadas = Doenca.D4;
            break;
            default:
                this.doencaSelecionadas = Doenca.D5;
            break;   
        }
        
        jTextArea1.setText(cliente.enviarDiagnostico(doencaSelecionadas, sintomasSelecionados));
    }//GEN-LAST:event_EnviarDiagnosticoActionPerformed

    private void D0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D0ActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D1ActionPerformed

    private void D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D2ActionPerformed

    private void D3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D3ActionPerformed

    private void D4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D4ActionPerformed

    private void D5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox D0;
    private javax.swing.JCheckBox D1;
    private javax.swing.JCheckBox D2;
    private javax.swing.JCheckBox D3;
    private javax.swing.JCheckBox D4;
    private javax.swing.JCheckBox D5;
    private javax.swing.JButton EnviarDiagnostico;
    private javax.swing.JButton ListarCasos;
    private javax.swing.JButton ObterDiagnostico;
    private javax.swing.JCheckBox S0;
    private javax.swing.JCheckBox S1;
    private javax.swing.JCheckBox S2;
    private javax.swing.JCheckBox S3;
    private javax.swing.JCheckBox S4;
    private javax.swing.JCheckBox S5;
    private javax.swing.JCheckBox S6;
    private javax.swing.JCheckBox S7;
    private javax.swing.JCheckBox S8;
    private javax.swing.ButtonGroup grupoDoencas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
