/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentservicesapplication;

/**
 *
 * @author x12112267
 */
public class DisAPPMap extends javax.swing.JFrame {

    /**
     * Creates new form DisAPPMap
     */
    public DisAPPMap() {
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
        MapTitle = new javax.swing.JLabel();
        BasementBtn = new javax.swing.JButton();
        GroundBtn = new javax.swing.JButton();
        Floor1Btn = new javax.swing.JButton();
        floor2Btn = new javax.swing.JButton();
        Floor3Btn = new javax.swing.JButton();
        Floor4Btn = new javax.swing.JButton();
        MapImageLabel = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        MapBackgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MapTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        MapTitle.setForeground(new java.awt.Color(153, 0, 0));
        MapTitle.setText("Map");
        MapTitle.setBounds(160, 0, 90, 40);
        jLayeredPane1.add(MapTitle, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BasementBtn.setText("Basement");
        BasementBtn.setBounds(0, 40, 80, 23);
        jLayeredPane1.add(BasementBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        GroundBtn.setText("Ground");
        GroundBtn.setBounds(80, 40, 70, 23);
        jLayeredPane1.add(GroundBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Floor1Btn.setText("Floor1");
        Floor1Btn.setBounds(150, 40, 63, 23);
        jLayeredPane1.add(Floor1Btn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        floor2Btn.setText("2");
        floor2Btn.setBounds(210, 40, 70, 23);
        jLayeredPane1.add(floor2Btn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Floor3Btn.setText("3");
        Floor3Btn.setBounds(280, 40, 60, 23);
        jLayeredPane1.add(Floor3Btn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Floor4Btn.setText("4");
        Floor4Btn.setBounds(340, 40, 60, 23);
        jLayeredPane1.add(Floor4Btn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MapImageLabel.setBounds(20, 80, 360, 300);
        jLayeredPane1.add(MapImageLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        homeBtn.setIcon(new javax.swing.ImageIcon("H:\\Semester 2\\Object Orientated Programming\\Team C OOP Project\\Images\\ComputerSupportApp\\SENDTODAVE\\HomeButtonLbl.fw.png")); // NOI18N
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        homeBtn.setBounds(170, 410, 50, 50);
        jLayeredPane1.add(homeBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        MapBackgroundLabel.setIcon(new javax.swing.ImageIcon("H:\\Semester 2\\Object Orientated Programming\\Background.jpg")); // NOI18N
        MapBackgroundLabel.setText("jLabel1");
        MapBackgroundLabel.setBounds(0, 0, 400, 500);
        jLayeredPane1.add(MapBackgroundLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        MainPage myMainPage = new MainPage();
        myMainPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeBtnActionPerformed

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
            java.util.logging.Logger.getLogger(DisAPPMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisAPPMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisAPPMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisAPPMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new DisAPPMap().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BasementBtn;
    private javax.swing.JButton Floor1Btn;
    private javax.swing.JButton Floor3Btn;
    private javax.swing.JButton Floor4Btn;
    private javax.swing.JButton GroundBtn;
    private javax.swing.JLabel MapBackgroundLabel;
    private javax.swing.JLabel MapImageLabel;
    private javax.swing.JLabel MapTitle;
    private javax.swing.JButton floor2Btn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}