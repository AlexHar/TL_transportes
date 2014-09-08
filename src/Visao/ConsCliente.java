/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Visao;

import Controle.Pessoa;
import Modelo.ClienteDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lailson
 */
public class ConsCliente extends javax.swing.JFrame {
   // Pessoa p;
    //ArrayList lista = new ArrayList();
   // ClienteDAO dao = new ClienteDAO();
    

    /**
     * Creates new form ConsCliente
     */
    public ConsCliente() {
        initComponents();
        //atualizaLista();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        bnome_cli = new javax.swing.JTextField();
        cancelar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bcpf_cli = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        alterar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bServ = new javax.swing.JComboBox();
        atualiza = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(115, 117, 118), 3, true));

        jLabel23.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel23.setText("Consultar Clientes");

        jLabel24.setText("Busca por Nome:");

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarjButton2ActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Busca por CPF:");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        excluir.setText("Excluir");

        jLabel2.setText("Busca por Serviço:");

        bServ.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Selecione um item>", "Transporte Escolar", "Turismo" }));
        bServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bServActionPerformed(evt);
            }
        });

        atualiza.setText("Lista Completa");
        atualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel23)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator6))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(alterar)
                                .addGap(35, 35, 35)
                                .addComponent(excluir)
                                .addGap(35, 35, 35)
                                .addComponent(cancelar)
                                .addGap(154, 154, 154))
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bnome_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 10, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(bcpf_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(146, 146, 146)
                                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(atualiza)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bServ, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(bnome_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bcpf_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(bServ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar)
                    .addComponent(atualiza))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar)
                    .addComponent(excluir)
                    .addComponent(alterar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarjButton2ActionPerformed
        // TODO add your handling code here:
        //Cancelar dados = new Cancelar();
        //dados.setLocationRelativeTo(null);
        //dados.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelarjButton2ActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        if (bnome_cli.getText() != null){
           // atualizaLista(bnome_cli.getText(), null, null);
        }else if(bcpf_cli.getText() != null){
            //atualizaLista(null, bcpf_cli.getText(), null);
        }else if(bServ.getSelectedItem() != "<Selecione um item>"){
            //atualizaLista(null, null, bServ.getSelectedItem());
        }else{
            JOptionPane.showMessageDialog(this, "Informe uma placa.");
           // atualizaLista(null, null, null);
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alterarActionPerformed

    private void bServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bServActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bServActionPerformed

    private void atualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizaActionPerformed
        // TODO add your handling code here:
        //atualizaLista(null, null, null);
    }//GEN-LAST:event_atualizaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar;
    private javax.swing.JButton atualiza;
    private javax.swing.JComboBox bServ;
    private javax.swing.JTextField bcpf_cli;
    private javax.swing.JTextField bnome_cli;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables


    public void atualizaLista(String nome, String cpf, String servico){
        /*String[] nomesColunas = {"código", "Nome", "CPF", "RG", "Endereço", "Nº:", "Bairro", "Complemento", "Apt", "Cidade", "UF"};
        ArrayList lista = new ArrayList((ClienteEscolar.consultar(nome, cpf, servico)));
        Object[][] dadosVetor = new Object[lista.size()][nomesColunas.length];
        for (int i=0; i<lista.size(); i++){
            Pessoa pessoas = (Pessoa)lista.get(i);
            dadosVetor[i][0] = pessoas.getIdPessoa();
            dadosVetor[i][1] = pessoas.getNome();
            dadosVetor[i][2] = pessoas.getCpf();
            dadosVetor[i][3] = pessoas.getRg();
            Endereco e = pessoas.getEndereco();
            dadosVetor[i][4] = e.getRua();
            dadosVetor[i][5] = e.getNumero();
            dadosVetor[i][6] = e.getBairro();
            dadosVetor[i][7] = e.getComplemento();
            dadosVetor[i][8] = e.getApartamento();
            Cidade c = pessoas.getCidade();
            dadosVetor[i][9] = c.getNome();
            dadosVetor[i][10] = c.getUf();
        }
        DefaultTableModel modelo = new DefaultTableModel(dadosVetor,nomesColunas);
        tabela.setModel(modelo);*/
    }

}
