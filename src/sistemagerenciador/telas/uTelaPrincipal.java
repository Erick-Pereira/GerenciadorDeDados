package sistemagerenciador.telas;
import javax.swing.JOptionPane;
import sistemagerenciador.telas.uTelaIntegracaoDadosCSV;
import sistemagerenciador.telas.uTelaIntegracaoDadosTxT;

public class uTelaPrincipal extends javax.swing.JFrame {

    public uTelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        mmFerramentas = new javax.swing.JMenuBar();
        mmCadRh = new javax.swing.JMenu();
        mmIntegracaoCSV = new javax.swing.JMenuItem();
        mmIntegracaoTxT = new javax.swing.JMenuItem();
        mmOpcoes = new javax.swing.JMenu();
        mmOpcaoSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktop.setPreferredSize(new java.awt.Dimension(534, 550));
        desktop.setRequestFocusEnabled(false);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );

        mmCadRh.setText("Cadastro");

        mmIntegracaoCSV.setText("Integracao de dados - CSV");
        mmIntegracaoCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmIntegracaoCSVActionPerformed(evt);
            }
        });
        mmCadRh.add(mmIntegracaoCSV);

        mmIntegracaoTxT.setText("Integracao de dados - TxT");
        mmIntegracaoTxT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmIntegracaoTxTActionPerformed(evt);
            }
        });
        mmCadRh.add(mmIntegracaoTxT);

        mmFerramentas.add(mmCadRh);

        mmOpcoes.setText("Opções");

        mmOpcaoSair.setText("Sair");
        mmOpcaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmOpcaoSairActionPerformed(evt);
            }
        });
        mmOpcoes.add(mmOpcaoSair);

        mmFerramentas.add(mmOpcoes);

        setJMenuBar(mmFerramentas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mmOpcaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmOpcaoSairActionPerformed
        int wSair = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Atenção", JOptionPane.YES_NO_OPTION);

        if (wSair == JOptionPane.YES_OPTION) {
            System.exit(0); //Encerra o sistema
        }
    }//GEN-LAST:event_mmOpcaoSairActionPerformed

    private void mmIntegracaoCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmIntegracaoCSVActionPerformed
         uTelaIntegracaoDadosCSV dadosCSV = new uTelaIntegracaoDadosCSV();
         dadosCSV.setVisible(true);
         desktop.add(dadosCSV);
    }//GEN-LAST:event_mmIntegracaoCSVActionPerformed

    private void mmIntegracaoTxTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmIntegracaoTxTActionPerformed
         uTelaIntegracaoDadosTxT dadosTxT = new uTelaIntegracaoDadosTxT();
         dadosTxT.setVisible(true);
         desktop.add(dadosTxT);
    }//GEN-LAST:event_mmIntegracaoTxTActionPerformed

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
            java.util.logging.Logger.getLogger(uTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new uTelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu mmCadRh;
    private javax.swing.JMenuBar mmFerramentas;
    private javax.swing.JMenuItem mmIntegracaoCSV;
    private javax.swing.JMenuItem mmIntegracaoTxT;
    private javax.swing.JMenuItem mmOpcaoSair;
    private javax.swing.JMenu mmOpcoes;
    // End of variables declaration//GEN-END:variables
}
