/*
 * This file makes the main user interface.
 * It contains two tab, one for the freezing option and one for the unfreezing one.
 * Every tab perform the interface needed for the option choosen.
 */

package freezingvideo;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.io.File;
import freezeOption.manageFreezeOption;
import freezeOption.manageUnfreezeOption;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @authors G. Allegretta, F. Scarangella
 */

public class FreezingVideoUI extends JFrame {

    // File variable for freeze tab
    private File FpathVideo;
    private File FpathFolder;
    // File variable for unfreeze tab
    private File UFSource;
    private File UFDestination;
    
    // Initiatization string for freeze tab
    private final String FfirstAreaText = "Welcome to the freeze tab option! \nPlease select a video to freeze and a destination folder \n";
    private final String FfirstVideoText = "Choose a video to be freezed";
    private final String FfirstFolderText = "Choose a destination folder";
    // Initiatization string for unfreeze tab
    private final String UFfirstAreaText = "Welcome to the unfreeze tab option! \nPlease select the source folder and a destination folder \n";
    private final String UFfirstSourceText = "Select the source folder";
    private final String UFfirstDestinationText = "Select the destination folder";
    
    private final String startText = "You can now click the start button! \n";
    
    // Creates new form FreezingVideoUI
    public FreezingVideoUI() {     
        initComponents();
        FreezeProgressArea.setText(FfirstAreaText);
        UnfreezeProgressArea.setText(UFfirstAreaText);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane = new javax.swing.JTabbedPane();
        FreezePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FreezeProgressArea = new javax.swing.JTextArea();
        ChVideoBtn = new javax.swing.JButton();
        ChVideoTxt = new javax.swing.JTextField();
        FreezeChDestBtn = new javax.swing.JButton();
        FreezeChDestTxt = new javax.swing.JTextField();
        ResetBtn = new javax.swing.JButton();
        FreezeBtn = new javax.swing.JButton();
        UnfreezePanel = new javax.swing.JPanel();
        UFSelectSourceTxt = new javax.swing.JTextField();
        UFSelectSourceBtn = new javax.swing.JButton();
        UFSelectDestinationTxt = new javax.swing.JTextField();
        UFSelectDestinationBtn = new javax.swing.JButton();
        UFResetBtn = new javax.swing.JButton();
        UnfreezeBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        UnfreezeProgressArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Freezing Video");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new ImageIcon(getClass().getResource("/images/snow-icon.png")).getImage());
        setResizable(false);

        FreezeProgressArea.setEditable(false);
        FreezeProgressArea.setColumns(20);
        FreezeProgressArea.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        FreezeProgressArea.setRows(5);
        FreezeProgressArea.setFocusable(false);
        jScrollPane1.setViewportView(FreezeProgressArea);

        ChVideoBtn.setText("Choose");
        ChVideoBtn.setToolTipText("");
        ChVideoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChVideoBtnMouseClicked(evt);
            }
        });

        ChVideoTxt.setEditable(false);
        ChVideoTxt.setForeground(new java.awt.Color(153, 153, 153));
        ChVideoTxt.setText("Choose a video to be freezed");
        ChVideoTxt.setToolTipText("");
        ChVideoTxt.setFocusable(false);

        FreezeChDestBtn.setText("Choose");
        FreezeChDestBtn.setToolTipText("");
        FreezeChDestBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FreezeChDestBtnMouseClicked(evt);
            }
        });

        FreezeChDestTxt.setEditable(false);
        FreezeChDestTxt.setForeground(new java.awt.Color(153, 153, 153));
        FreezeChDestTxt.setText("Choose a destination folder");
        FreezeChDestTxt.setToolTipText("");
        FreezeChDestTxt.setFocusable(false);

        ResetBtn.setText("Reset");
        ResetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetBtnMouseClicked(evt);
            }
        });

        FreezeBtn.setText("Start freezing");
        FreezeBtn.setEnabled(false);
        FreezeBtn.setMaximumSize(new java.awt.Dimension(61, 23));
        FreezeBtn.setMinimumSize(new java.awt.Dimension(61, 23));
        FreezeBtn.setPreferredSize(new java.awt.Dimension(61, 23));
        FreezeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FreezeBtnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FreezeBtnMousePressed(evt);
            }
        });

        javax.swing.GroupLayout FreezePanelLayout = new javax.swing.GroupLayout(FreezePanel);
        FreezePanel.setLayout(FreezePanelLayout);
        FreezePanelLayout.setHorizontalGroup(
            FreezePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FreezePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FreezePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FreezePanelLayout.createSequentialGroup()
                        .addGroup(FreezePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FreezePanelLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FreezeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ChVideoTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                            .addComponent(FreezeChDestTxt, javax.swing.GroupLayout.Alignment.LEADING))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FreezePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ResetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(FreezeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane.addTab("Freeze Video", null, FreezePanel, "");

        UFSelectSourceTxt.setEditable(false);
        UFSelectSourceTxt.setForeground(new java.awt.Color(153, 153, 153));
        UFSelectSourceTxt.setText("Select the source folder");
        UFSelectSourceTxt.setToolTipText("");
        UFSelectSourceTxt.setFocusable(false);
        UFSelectSourceTxt.setPreferredSize(new java.awt.Dimension(148, 20));

        UFSelectSourceBtn.setText("Select");
        UFSelectSourceBtn.setMaximumSize(new java.awt.Dimension(69, 23));
        UFSelectSourceBtn.setMinimumSize(new java.awt.Dimension(69, 23));
        UFSelectSourceBtn.setPreferredSize(new java.awt.Dimension(69, 23));
        UFSelectSourceBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UFSelectSourceBtnMouseClicked(evt);
            }
        });

        UFSelectDestinationTxt.setEditable(false);
        UFSelectDestinationTxt.setForeground(new java.awt.Color(153, 153, 153));
        UFSelectDestinationTxt.setText("Select the destination folder");
        UFSelectDestinationTxt.setFocusable(false);
        UFSelectDestinationTxt.setPreferredSize(new java.awt.Dimension(148, 20));

        UFSelectDestinationBtn.setText("Select");
        UFSelectDestinationBtn.setMaximumSize(new java.awt.Dimension(69, 23));
        UFSelectDestinationBtn.setMinimumSize(new java.awt.Dimension(69, 23));
        UFSelectDestinationBtn.setPreferredSize(new java.awt.Dimension(69, 23));
        UFSelectDestinationBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UFSelectDestinationBtnMouseClicked(evt);
            }
        });

        UFResetBtn.setText("Reset");
        UFResetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UFResetBtnMouseClicked(evt);
            }
        });

        UnfreezeBtn.setText("Start Unfreezing");
        UnfreezeBtn.setEnabled(false);
        UnfreezeBtn.setMaximumSize(new java.awt.Dimension(61, 23));
        UnfreezeBtn.setMinimumSize(new java.awt.Dimension(61, 23));
        UnfreezeBtn.setPreferredSize(new java.awt.Dimension(61, 23));
        UnfreezeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UnfreezeBtnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UnfreezeBtnMousePressed(evt);
            }
        });

        UnfreezeProgressArea.setEditable(false);
        UnfreezeProgressArea.setColumns(20);
        UnfreezeProgressArea.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        UnfreezeProgressArea.setRows(5);
        UnfreezeProgressArea.setFocusable(false);
        UnfreezeProgressArea.setMinimumSize(new java.awt.Dimension(4, 20));
        UnfreezeProgressArea.setPreferredSize(new java.awt.Dimension(144, 84));
        jScrollPane2.setViewportView(UnfreezeProgressArea);

        javax.swing.GroupLayout UnfreezePanelLayout = new javax.swing.GroupLayout(UnfreezePanel);
        UnfreezePanel.setLayout(UnfreezePanelLayout);
        UnfreezePanelLayout.setHorizontalGroup(
            UnfreezePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UnfreezePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UnfreezePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(UnfreezePanelLayout.createSequentialGroup()
                        .addGroup(UnfreezePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(UFSelectSourceTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UFSelectDestinationTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(UnfreezePanelLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(UFResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addComponent(UnfreezeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(UnfreezePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UFSelectDestinationBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UFSelectSourceBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        UnfreezePanelLayout.setVerticalGroup(
            UnfreezePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UnfreezePanelLayout.createSequentialGroup()
                .addGroup(UnfreezePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(UnfreezePanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(UFSelectSourceTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(UFSelectSourceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UnfreezePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UFSelectDestinationTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UFSelectDestinationBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UnfreezePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UFResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UnfreezeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane.addTab("Unfreeze Video", UnfreezePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
    private void ChVideoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChVideoBtnMouseClicked
        // open a JFileChooser window in opening mode to get the video file
        VideoFileChooser chooseVideo = new VideoFileChooser();
        FpathVideo = chooseVideo.getPathV();
        
        if (FpathVideo.getName().equals("null")) {
            // do nothing
        } else {
            // show path file to the JTextField associated
            ChVideoTxt.setText(FpathVideo.toString());
            FreezeProgressArea.append("Selected video: " + FpathVideo.getName() + "\n");
            // check if both video and destination folder are selected and enable the 'start' button
            if (FreezeChDestTxt.getText().equals(FfirstFolderText)) {
                // do nothing
            } else {
                FreezeProgressArea.append(startText);
                FreezeBtn.setEnabled(true);
            }   
        }
    }//GEN-LAST:event_ChVideoBtnMouseClicked

    private void FreezeChDestBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FreezeChDestBtnMouseClicked
        // open a JFileChooser window in opening mode to get the destination folder
        FolderPathChooser chooseFolder = new FolderPathChooser();
        FpathFolder = chooseFolder.getPathF();
        
        if (FpathFolder.getName().equals("null")) {
            // do nothing
        } else {
            // show folder path to the JTextField associated
            FreezeChDestTxt.setText(FpathFolder.toString());
            FreezeProgressArea.append("Selected folder: " + FpathFolder.getName() + "\n");
            // check if both video and destination folder are selected and enable the 'start' button
            if (ChVideoTxt.getText().equals(FfirstVideoText)) {
                // do nothing
            } else {
                FreezeProgressArea.append(startText);
                FreezeBtn.setEnabled(true);
            }
        }
    }//GEN-LAST:event_FreezeChDestBtnMouseClicked

    private void ResetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetBtnMouseClicked
        FreezeProgressArea.setText(null);
        FreezeProgressArea.append(FfirstAreaText);
        ChVideoTxt.setText(FfirstVideoText);
        FreezeChDestTxt.setText(FfirstFolderText);
        FreezeBtn.setEnabled(false);
    }//GEN-LAST:event_ResetBtnMouseClicked

    private void FreezeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FreezeBtnMouseClicked
        manageFreezeOption manageFreezing = new manageFreezeOption(FpathVideo,FpathFolder);
        try {
            FreezeProgressArea.append("\n" + manageFreezing.generateKeyFrames() + "\n");            
        } catch (IOException ex) {
            Logger.getLogger(FreezingVideoUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        FreezeProgressArea.append(manageFreezing.segmentVideo() + "\n");
        try {
            FreezeProgressArea.append(manageFreezing.encryptVideo() + "\n");
        } catch (Exception ex) {
            Logger.getLogger(FreezingVideoUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        FreezeProgressArea.append("FREEZING COMPLETED\n");
    }//GEN-LAST:event_FreezeBtnMouseClicked
    
    private void FreezeBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FreezeBtnMousePressed
        FreezeProgressArea.append("\nFREEZING STARTED\nPlease wait while operations are performed... \n");
    }//GEN-LAST:event_FreezeBtnMousePressed

    private void UFResetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UFResetBtnMouseClicked
        UnfreezeProgressArea.setText(null);
        UnfreezeProgressArea.append(UFfirstAreaText);
        UFSelectSourceTxt.setText(UFfirstSourceText);
        UFSelectDestinationTxt.setText(UFfirstDestinationText);
        UnfreezeBtn.setEnabled(false);
    }//GEN-LAST:event_UFResetBtnMouseClicked

    private void UFSelectSourceBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UFSelectSourceBtnMouseClicked
        // open a JFileChooser window in opening mode to get the source folder
        FolderPathChooser selectSourceFolder = new FolderPathChooser();
        UFSource = selectSourceFolder.getPathF();
        
        if (UFSource.getName().equals("null")) {
            // do nothing
        } else {
            // show folder path to the JTextField associated
            UFSelectSourceTxt.setText(UFSource.toString());
            UnfreezeProgressArea.append("Selected source folder: " + UFSource.getName() + "\n");
            // check if both source and destination folder are selected and enable the 'start' button
            if (UFSelectDestinationTxt.getText().equals(UFfirstDestinationText)) {
                // do nothing
            } else {
                UnfreezeProgressArea.append(startText);
                UnfreezeBtn.setEnabled(true);
            }
        }
    }//GEN-LAST:event_UFSelectSourceBtnMouseClicked

    private void UFSelectDestinationBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UFSelectDestinationBtnMouseClicked
        // open a JFileChooser window in opening mode to get the destination folder
        FolderPathChooser selectDestinationFolder = new FolderPathChooser();
        UFDestination = selectDestinationFolder.getPathF();
        
        if (UFDestination.getName().equals("null")) {
            // do nothing
        } else {
            // show folder path to the JTextField associated
            UFSelectDestinationTxt.setText(UFDestination.toString());
            UnfreezeProgressArea.append("Selected destination folder: " + UFDestination.getName() + "\n");
            // check if both video and destination folder are selected and enable the 'start' button
            if (UFSelectSourceTxt.getText().equals(UFfirstSourceText)) {
                // do nothing
            } else {
                UnfreezeProgressArea.append(startText);
                UnfreezeBtn.setEnabled(true);
            }
        }
    }//GEN-LAST:event_UFSelectDestinationBtnMouseClicked

    private void UnfreezeBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UnfreezeBtnMousePressed
        UnfreezeProgressArea.append("\nUNFREEZING STARTED\nPlease wait while operations are performed... \n");
    }//GEN-LAST:event_UnfreezeBtnMousePressed

    private void UnfreezeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UnfreezeBtnMouseClicked
        manageUnfreezeOption manageUnfreezing = new manageUnfreezeOption(UFSource,UFDestination);
        try {
            UnfreezeProgressArea.append(manageUnfreezing.decryptVideo()+"\n");
        } catch (Exception ex) {
            Logger.getLogger(FreezingVideoUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        UnfreezeProgressArea.append(manageUnfreezing.concatVideo()+"\n");
        UnfreezeProgressArea.append("UNFREEZING COMPLETED\n");
    }//GEN-LAST:event_UnfreezeBtnMouseClicked
    
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
    private javax.swing.JButton FreezeBtn;
    private javax.swing.JButton FreezeChDestBtn;
    private javax.swing.JTextField FreezeChDestTxt;
    private javax.swing.JPanel FreezePanel;
    private javax.swing.JTextArea FreezeProgressArea;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JButton UFResetBtn;
    private javax.swing.JButton UFSelectDestinationBtn;
    private javax.swing.JTextField UFSelectDestinationTxt;
    private javax.swing.JButton UFSelectSourceBtn;
    private javax.swing.JTextField UFSelectSourceTxt;
    private javax.swing.JButton UnfreezeBtn;
    private javax.swing.JPanel UnfreezePanel;
    private javax.swing.JTextArea UnfreezeProgressArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane;
    // End of variables declaration//GEN-END:variables
}
