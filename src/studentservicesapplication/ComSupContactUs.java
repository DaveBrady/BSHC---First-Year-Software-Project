/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentservicesapplication;

/**
 *
 * @author x12112267
 */
public class ComSupContactUs extends javax.swing.JFrame {

    /**
     * Creates new form ComSupContactUs
     */
    public ComSupContactUs() {
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButton1 = new javax.swing.JButton();
        Picture1PicLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Picture1InfoLbl = new javax.swing.JLabel();
        Picture2InfoLbl = new javax.swing.JLabel();
        Picture2PicLbl = new javax.swing.JLabel();
        TitleLbl = new javax.swing.JLabel();
        SilverBackgroundLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setIcon(new javax.swing.ImageIcon("H:\\Semester 2\\Object Orientated Programming\\Team C OOP Project\\Images\\ComputerSupportApp\\SENDTODAVE\\HomeButtonLbl.fw.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(20, 10, 50, 50);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Picture1PicLbl.setText("IMAGE OF PERSON");
        Picture1PicLbl.setBounds(40, 150, 150, 120);
        jLayeredPane1.add(Picture1PicLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Phone: 01 6599260");
        jLabel2.setBounds(20, 450, 320, 40);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Email: computingsupport@ncirl.ie");
        jLabel1.setBounds(20, 400, 370, 70);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Picture1InfoLbl.setText("INFOINFOINFOINFO");
        Picture1InfoLbl.setBounds(230, 150, 130, 110);
        jLayeredPane1.add(Picture1InfoLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Picture2InfoLbl.setText("INFOINFOINFOINFO");
        Picture2InfoLbl.setBounds(30, 280, 120, 110);
        jLayeredPane1.add(Picture2InfoLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Picture2PicLbl.setText("IMAGE OF PERSON");
        Picture2PicLbl.setBounds(230, 290, 100, 90);
        jLayeredPane1.add(Picture2PicLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        TitleLbl.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        TitleLbl.setForeground(new java.awt.Color(51, 51, 51));
        TitleLbl.setText("Contact Us");
        TitleLbl.setBounds(100, 40, 190, 110);
        jLayeredPane1.add(TitleLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        SilverBackgroundLbl.setIcon(new javax.swing.ImageIcon("H:\\Semester 2\\Object Orientated Programming\\Team C OOP Project\\Images\\ComputerSupportApp\\SENDTODAVE\\silver-background.jpg")); // NOI18N
        SilverBackgroundLbl.setBounds(0, 0, 400, 500);
        jLayeredPane1.add(SilverBackgroundLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainPage myMainPage = new MainPage();
        myMainPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ComSupContactUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComSupContactUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComSupContactUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComSupContactUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ComSupContactUs().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Picture1InfoLbl;
    private javax.swing.JLabel Picture1PicLbl;
    private javax.swing.JLabel Picture2InfoLbl;
    private javax.swing.JLabel Picture2PicLbl;
    private javax.swing.JLabel SilverBackgroundLbl;
    private javax.swing.JLabel TitleLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
