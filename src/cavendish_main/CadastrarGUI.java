package cavendish_main;

/**
 *
 * @author Baguy
 */
public class CadastrarGUI extends javax.swing.JFrame {

    private InicialGUI telaANTERIOR;
    
    /**
     * Creates new form fCADASTRAR
     */
    private CadastrarGUI() {
        initComponents();
        myInitComponents();
    }
    
    // ♥ para fechar tela anterior
    public CadastrarGUI(InicialGUI telaANTERIOR){
        this();
        this.telaANTERIOR = telaANTERIOR;
        
    }
    
   // ♥ criar inicialização dos componentes personalizado
   // ♥ Netbeans não permite edição no método -- private void initComponents()
    public void myInitComponents() {
        
        //deixar caixas de texto e bordas -- jNOMEUSUÁRIO -- com fundo transparente
        jINPUT01.setOpaque(false);
        jINPUT01.setBorder(null);
        
        jINPUT02.setOpaque(false);
        jINPUT02.setBorder(null);
        
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jINPUT01 = new javax.swing.JTextField();
        jcaixaTEXTO01 = new javax.swing.JLabel();
        jINPUT02 = new javax.swing.JTextField();
        jLabelNOME = new javax.swing.JLabel();
        jLabelEMAIL = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jCONTINUAR = new javax.swing.JLabel();
        JcaixaTEXTO02 = new javax.swing.JLabel();
        jLOGO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(820, 650));
        setSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        jINPUT01.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jINPUT01.setForeground(new java.awt.Color(255, 255, 255));
        jINPUT01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jINPUT01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jINPUT01ActionPerformed(evt);
            }
        });
        getContentPane().add(jINPUT01);
        jINPUT01.setBounds(260, 260, 460, 50);

        jcaixaTEXTO01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cavendish_main/botoes/cTEXTO.png"))); // NOI18N
        getContentPane().add(jcaixaTEXTO01);
        jcaixaTEXTO01.setBounds(220, 240, 530, 90);

        jINPUT02.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jINPUT02.setForeground(new java.awt.Color(255, 255, 255));
        jINPUT02.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jINPUT02);
        jINPUT02.setBounds(260, 370, 460, 50);

        jLabelNOME.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 22)); // NOI18N
        jLabelNOME.setText("Nome de usuário");
        getContentPane().add(jLabelNOME);
        jLabelNOME.setBounds(70, 260, 150, 50);

        jLabelEMAIL.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 22)); // NOI18N
        jLabelEMAIL.setText("E-mail");
        getContentPane().add(jLabelEMAIL);
        jLabelEMAIL.setBounds(70, 380, 140, 40);

        jPanel1.setBackground(new java.awt.Color(130, 148, 190));
        jPanel1.setMinimumSize(new java.awt.Dimension(820, 650));

        jCONTINUAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cavendish_main/botoes/bVOLTAR.png"))); // NOI18N
        jCONTINUAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCONTINUARMouseClicked(evt);
            }
        });

        JcaixaTEXTO02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cavendish_main/botoes/cTEXTO.png"))); // NOI18N
        JcaixaTEXTO02.setText("jLabel1");

        jLOGO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cavendish_main/botoes/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jCONTINUAR, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(JcaixaTEXTO02, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(JcaixaTEXTO02, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jCONTINUAR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
        // ♥ reabilitar a  janela anterior (tela INICIAL) que foidesabilitada...
        // ♥ ...quando clicou-se no botão CADASTRAR
        telaANTERIOR.setEnabled(true);
        
    }//GEN-LAST:event_formWindowClosed

    private void jINPUT01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jINPUT01ActionPerformed
        
        // ♥ input do NOME DE USUÁRIO e email
        
        String nome = jINPUT01.getText();
        String email = jINPUT02.getText();
        
    }//GEN-LAST:event_jINPUT01ActionPerformed

    private void jCONTINUARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCONTINUARMouseClicked
        
        // ♥ fechar janela ao clicar botão CONTINUAR
        this.dispose();

        // ♥ reabilitar a  janela anterior (tela INICIAL) que foi desabilitada...
        // ♥ ...quando clicou-se no botão CADASTRAR
        telaANTERIOR.setEnabled(true);
        
    }//GEN-LAST:event_jCONTINUARMouseClicked

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
            java.util.logging.Logger.getLogger(CadastrarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JcaixaTEXTO02;
    private javax.swing.JLabel jCONTINUAR;
    private javax.swing.JTextField jINPUT01;
    private javax.swing.JTextField jINPUT02;
    private javax.swing.JLabel jLOGO;
    private javax.swing.JLabel jLabelEMAIL;
    private javax.swing.JLabel jLabelNOME;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jcaixaTEXTO01;
    // End of variables declaration//GEN-END:variables
}
