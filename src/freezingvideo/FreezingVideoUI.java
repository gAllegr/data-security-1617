/*
 * This file makes the main user interface.
 * It contains two tab, one for the freezing option and one for the unfreezing one.
 * Every tab perform the interface needed for the option choosen.
 */

package freezingvideo;

import javax.swing.JFrame;
import javax.swing.ImageIcon;

/**
 * @authors G. Allegretta, F. Scarangella
 */

public class FreezingVideoUI extends JFrame {

    // Creates new form FreezingVideoUI
    public FreezingVideoUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane = new javax.swing.JTabbedPane();
        FreezePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FreezeProgressArea = new javax.swing.JTextArea();
        FreezeProgressBar = new javax.swing.JProgressBar();
        ChVideoBtn = new javax.swing.JButton();
        ChVideoTxt = new javax.swing.JTextField();
        FreezeChDestBtn = new javax.swing.JButton();
        FreezeChDestTxt = new javax.swing.JTextField();
        UnfreezePanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Freezing Video");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new ImageIcon(getClass().getResource("/images/snow-icon.png")).getImage());
        setResizable(false);

        FreezeProgressArea.setEditable(false);
        FreezeProgressArea.setColumns(20);
        FreezeProgressArea.setRows(5);
        FreezeProgressArea.setFocusable(false);
        jScrollPane1.setViewportView(FreezeProgressArea);

        ChVideoBtn.setText("Choose");
        ChVideoBtn.setToolTipText("");

        ChVideoTxt.setEditable(false);
        ChVideoTxt.setForeground(new java.awt.Color(153, 153, 153));
        ChVideoTxt.setText("Choose a video to be freezed");
        ChVideoTxt.setToolTipText("");
        ChVideoTxt.setFocusable(false);

        FreezeChDestBtn.setText("Choose");
        FreezeChDestBtn.setToolTipText("");

        FreezeChDestTxt.setEditable(false);
        FreezeChDestTxt.setForeground(new java.awt.Color(153, 153, 153));
        FreezeChDestTxt.setText("Choose a destination folder");
        FreezeChDestTxt.setToolTipText("");
        FreezeChDestTxt.setFocusable(false);

        javax.swing.GroupLayout FreezePanelLayout = new javax.swing.GroupLayout(FreezePanel);
        FreezePanel.setLayout(FreezePanelLayout);
        FreezePanelLayout.setHorizontalGroup(
            FreezePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FreezePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FreezePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FreezeProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FreezePanelLayout.createSequentialGroup()
                        .addGroup(FreezePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ChVideoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                            .addComponent(FreezeChDestTxt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FreezePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FreezeChDestBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ChVideoBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        FreezePanelLayout.setVerticalGroup(
            FreezePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FreezePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FreezePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChVideoBtn)
                    .addComponent(ChVideoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FreezePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FreezeChDestBtn)
                    .addComponent(FreezeChDestTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FreezeProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane.addTab("Freeze Video", null, FreezePanel, "");

        javax.swing.GroupLayout UnfreezePanelLayout = new javax.swing.GroupLayout(UnfreezePanel);
        UnfreezePanel.setLayout(UnfreezePanelLayout);
        UnfreezePanelLayout.setHorizontalGroup(
            UnfreezePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );
        UnfreezePanelLayout.setVerticalGroup(
            UnfreezePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Unfreeze Video", UnfreezePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FreezingVideoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FreezingVideoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FreezingVideoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FreezingVideoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        // Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FreezingVideoUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChVideoBtn;
    private javax.swing.JTextField ChVideoTxt;
    private javax.swing.JButton FreezeChDestBtn;
    private javax.swing.JTextField FreezeChDestTxt;
    private javax.swing.JPanel FreezePanel;
    private javax.swing.JTextArea FreezeProgressArea;
    private javax.swing.JProgressBar FreezeProgressBar;
    private javax.swing.JPanel UnfreezePanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane;
    // End of variables declaration//GEN-END:variables
}
