/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Visao;

import Controle.ClienteTurismo;
import Validacoes.ValidaCPF;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author guitonsic
 */
public class CadastrarCliente extends javax.swing.JFrame {
    
    private ClienteTurismo c;
    private int controlador;

    
    /**
     * Creates new form CadastrarCliente
     */
    public CadastrarCliente() {
        initComponents();
    }
    
    public CadastrarCliente(ClienteTurismo c, int controlador) {
        initComponents();
        if (c != null){
            this.c = c;
            this.controlador = controlador;
            preencheEdits();
        }
    }
    
    public void preencheEdits(){
        campoCPF.setText(c.getCpf());
        campoCidade.setText(c.getCidade());
        campoData.setText(c.getNascimento());
        campoEnde.setText(c.getEndereco());
        campoNome.setText(c.getNome());
        campoNumEnd.setText(Integer.toString(c.getnEndereco()));
        campoRG.setText(Integer.toString(c.getRg()));
        campoTel.setText(Integer.toString(c.getTelefone()));
        campoUf.setText(c.getEstado());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtNome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        txtRG = new javax.swing.JLabel();
        campoRG = new javax.swing.JTextField();
        txtCpf = new javax.swing.JLabel();
        campoCPF = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JLabel();
        campoEnde = new javax.swing.JTextField();
        txtCidade = new javax.swing.JLabel();
        campoCidade = new javax.swing.JTextField();
        txtEstado = new javax.swing.JLabel();
        campoUf = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JLabel();
        campoTel = new javax.swing.JTextField();
        txtData = new javax.swing.JLabel();
        campoData = new javax.swing.JTextField();
        Salvar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        txtEndereco1 = new javax.swing.JLabel();
        campoNumEnd = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(115, 117, 118), 3, true));

        jLabel19.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel19.setText("Cadastro de Clientes de Turismo");

        txtNome.setText("Nome:");

        txtRG.setText("RG:");

        txtCpf.setText("CPF:");

        txtEndereco.setText("Endereço:");

        campoEnde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEndeActionPerformed(evt);
            }
        });

        txtCidade.setText("Cidade:");

        txtEstado.setText("Estado:");

        txtTelefone.setText("Telefone:");

        txtData.setText("Data Nascimento:");

        Salvar.setText("Salvar");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarjButton2ActionPerformed(evt);
            }
        });

        txtEndereco1.setText("Número do Endereço:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(Salvar)
                                .addGap(18, 18, 18)
                                .addComponent(Cancelar))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(campoRG, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                            .addComponent(txtEndereco)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(campoEnde, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                                .addComponent(txtTelefone)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(campoTel))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                                .addComponent(txtCidade)
                                                .addGap(18, 18, 18)
                                                .addComponent(campoUf, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(txtData))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEstado, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtEndereco1, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoNumEnd, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                    .addComponent(campoCidade)
                                    .addComponent(campoData))))
                        .addGap(26, 26, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jSeparator3)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel19)
                                .addGap(158, 158, 158))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome)
                                    .addComponent(txtRG))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCpf)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(campoNome)))))
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRG)
                    .addComponent(txtCpf)
                    .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEndereco)
                        .addComponent(campoEnde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoNumEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEndereco1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade)
                    .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstado))
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone)
                    .addComponent(campoTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtData)
                    .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salvar)
                    .addComponent(Cancelar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoEndeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEndeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEndeActionPerformed

    private void CancelarjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarjButton2ActionPerformed
        // TODO add your handling code here:        
        //Cancelar dados = new Cancelar();
        //dados.setLocationRelativeTo(null);
        //dados.setVisible(true);
        dispose();
    }//GEN-LAST:event_CancelarjButton2ActionPerformed

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        // TODO add your handling code here:
        if (this.campoNome.getText().equals("")){
            JOptionPane.showMessageDialog(null, "O campo nome é obrigatório");
            return;
        } if (this.campoRG.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo RG é obrigatório");
            return;
        } if (this.campoCPF.getText().equals("")){
            JOptionPane.showMessageDialog(null, "O campo CPF é obrigatório");
            return;
        } if (this.campoData.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo data é obrigatório");
            return;
        } if (this.campoTel.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo telefone é obrigatório");
            return;
        } if (this.campoEnde.getText().equals("")){
            JOptionPane.showMessageDialog(null, "O campo endereço é obrigatório");
            return;
        } if (this.campoNumEnd.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo número de endereço é obrigatório");
            return;
        } if (this.campoCidade.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo cidade é obrigatório");
            return;
        } if (this.campoUf.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo UF é obrigatório");
            return;
        }
        
        
        boolean flag = false;
        try {
            ClienteTurismo cliente = new ClienteTurismo();
            
            while (flag == false) {
            
                int rg = Integer.parseInt(this.campoRG.getText());
                //int cpf = Integer.parseInt(this.campoCPF.getText());
                int tel = Integer.parseInt(this.campoTel.getText());
                int numEnd = Integer.parseInt(this.campoNumEnd.getText());
            
                cliente.setNome(this.campoNome.getText());
                cliente.setRg(rg);
                cliente.setCpf(this.campoCPF.getText());
                cliente.setNascimento(this.campoData.getText());
                cliente.setTelefone(tel);
                cliente.setEndereco(this.campoEnde.getText());
                cliente.setnEndereco(numEnd);
                cliente.setCidade(this.campoCidade.getText());
                cliente.setEstado(this.campoUf.getText());
            
                //Caso verficaCPF() for falso, o CPF é inválido, caso contrario ele valida o CPF e encerra o cadastro
                flag = verificaCPF(this.campoCPF.getText());
                if (flag == false) {
                    JOptionPane.showMessageDialog(null, "O CPF" + " " + this.campoCPF.getText() + " " + "é inválido, digite novamente o CPF.",null, JOptionPane.ERROR_MESSAGE);
                    break;
                } else {
                    cliente.cadastrarCliente(cliente);
                
                    if (controlador == 1){
                        cliente.alterarCliente(cliente);
                        JOptionPane.showMessageDialog(this, "Cliente atualizado com sucesso!");
                    } else {
                        cliente.cadastrarCliente(cliente);
                        JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!");
                    }
                    dispose();
                }
            }
            

            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CadastrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(CadastrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //dispose();
    }//GEN-LAST:event_SalvarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CadastrarCliente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Salvar;
    private javax.swing.JTextField campoCPF;
    private javax.swing.JTextField campoCidade;
    private javax.swing.JTextField campoData;
    private javax.swing.JTextField campoEnde;
    private javax.swing.JTextField campoNome;
    private javax.swing.JFormattedTextField campoNumEnd;
    private javax.swing.JTextField campoRG;
    private javax.swing.JTextField campoTel;
    private javax.swing.JTextField campoUf;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel txtCidade;
    private javax.swing.JLabel txtCpf;
    private javax.swing.JLabel txtData;
    private javax.swing.JLabel txtEndereco;
    private javax.swing.JLabel txtEndereco1;
    private javax.swing.JLabel txtEstado;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtRG;
    private javax.swing.JLabel txtTelefone;
    // End of variables declaration//GEN-END:variables

    /*private boolean verificaCPF(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
    boolean verificaCPF (String cpf) {
        return ValidaCPF.calculaCPF(cpf);
    }
}
