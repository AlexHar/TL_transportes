/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Visao;

import Controle.Login;
import Modelo.LoginDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lailson
 */
public class CadLogin extends javax.swing.JFrame {

    /**
     * Creates new form CadLogin
     */
    public CadLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        usuario = new javax.swing.JLabel();
        senha = new javax.swing.JLabel();
        tUsuario = new javax.swing.JTextField();
        tSenha = new javax.swing.JTextField();
        salvar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(115, 117, 118), 3, true));

        jLabel21.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel21.setText("Logins");

        usuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        usuario.setText("Nome Usuário:");

        senha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        senha.setText("Senha:");

        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuario)
                            .addComponent(senha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tUsuario)
                            .addComponent(tSenha))))
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(129, 129, 129))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuario)
                    .addComponent(tUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senha)
                    .addComponent(tSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar)
                    .addComponent(cancelar))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        // TODO add your handling code here:
        
        
        try {
            Login log = new Login();
            LoginDAO l = new LoginDAO();
            log.setId(Long.MIN_VALUE);
            log.setLogin(this.tUsuario.getText());
            log.setSenha(this.tSenha.getText());
            l.cadastrar(log);
            JOptionPane.showMessageDialog(null, "Login Salvo com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(CadLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_salvarActionPerformed

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
            java.util.logging.Logger.getLogger(CadLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Cancelar1;
    private javax.swing.JButton Salvar;
    private javax.swing.JButton Salvar1;
    private javax.swing.JTextField campoCPF;
    private javax.swing.JTextField campoCPF1;
    private javax.swing.JTextField campoCidade;
    private javax.swing.JTextField campoCidade1;
    private javax.swing.JTextField campoData;
    private javax.swing.JTextField campoData1;
    private javax.swing.JTextField campoEnde;
    private javax.swing.JTextField campoEnde1;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoNome1;
    private javax.swing.JFormattedTextField campoNumEnd;
    private javax.swing.JFormattedTextField campoNumEnd1;
    private javax.swing.JTextField campoRG;
    private javax.swing.JTextField campoRG1;
    private javax.swing.JTextField campoServico;
    private javax.swing.JTextField campoServico1;
    private javax.swing.JTextField campoTel;
    private javax.swing.JTextField campoTel1;
    private javax.swing.JTextField campoUf;
    private javax.swing.JTextField campoUf1;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton salvar;
    private javax.swing.JLabel senha;
    private javax.swing.JTextField tSenha;
    private javax.swing.JTextField tUsuario;
    private javax.swing.JLabel txtCidade;
    private javax.swing.JLabel txtCidade1;
    private javax.swing.JLabel txtCpf;
    private javax.swing.JLabel txtCpf1;
    private javax.swing.JLabel txtData;
    private javax.swing.JLabel txtData1;
    private javax.swing.JLabel txtEndereco;
    private javax.swing.JLabel txtEndereco1;
    private javax.swing.JLabel txtEndereco2;
    private javax.swing.JLabel txtEndereco3;
    private javax.swing.JLabel txtEstado;
    private javax.swing.JLabel txtEstado1;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtNome1;
    private javax.swing.JLabel txtRG;
    private javax.swing.JLabel txtRG1;
    private javax.swing.JLabel txtServico;
    private javax.swing.JLabel txtServico1;
    private javax.swing.JLabel txtTelefone;
    private javax.swing.JLabel txtTelefone1;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
