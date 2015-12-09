/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JOptionPane;

/**
 *
 * @author ashik
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pOne = new javax.swing.JPanel();
        bAddNew = new javax.swing.JButton();
        bEdit = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfSearchBox = new javax.swing.JTextField();
        cmSearchBy = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContactList = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfDetailsInformation = new javax.swing.JTextArea();
        mbOne = new javax.swing.JMenuBar();
        jmFile = new javax.swing.JMenu();
        jmiAddNewEntry = new javax.swing.JMenuItem();
        jmiEditAEntry = new javax.swing.JMenuItem();
        hmiDeleteAEntry = new javax.swing.JMenuItem();
        jmiQuit = new javax.swing.JMenuItem();
        jmHelp = new javax.swing.JMenu();
        jmiNeedHelp = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phone Book Manager");

        bAddNew.setText("Add New");
        bAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddNewActionPerformed(evt);
            }
        });

        bEdit.setText("Edit");
        bEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditActionPerformed(evt);
            }
        });

        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        jLabel1.setText("Search");

        cmSearchBy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "By Name", "By Phone Number", "By Email" }));

        tblContactList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Primary Phone Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblContactList);

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jLabel2.setText("Details Information");

        tfDetailsInformation.setColumns(20);
        tfDetailsInformation.setRows(5);
        jScrollPane2.setViewportView(tfDetailsInformation);

        javax.swing.GroupLayout pOneLayout = new javax.swing.GroupLayout(pOne);
        pOne.setLayout(pOneLayout);
        pOneLayout.setHorizontalGroup(
            pOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(pOneLayout.createSequentialGroup()
                        .addComponent(bAddNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDelete)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)))
                .addGroup(pOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pOneLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSearchBox, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmSearchBy, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pOneLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pOneLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );

        pOneLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bAddNew, bDelete, bEdit});

        pOneLayout.setVerticalGroup(
            pOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAddNew)
                    .addComponent(bEdit)
                    .addComponent(bDelete)
                    .addComponent(jLabel1)
                    .addComponent(tfSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmSearchBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                    .addGroup(pOneLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );

        jmFile.setText("File");

        jmiAddNewEntry.setText("Add New Entry");
        jmiAddNewEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAddNewEntryActionPerformed(evt);
            }
        });
        jmFile.add(jmiAddNewEntry);

        jmiEditAEntry.setText("Edit A Entry");
        jmiEditAEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEditAEntryActionPerformed(evt);
            }
        });
        jmFile.add(jmiEditAEntry);

        hmiDeleteAEntry.setText("Delete A Entry");
        hmiDeleteAEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hmiDeleteAEntryActionPerformed(evt);
            }
        });
        jmFile.add(hmiDeleteAEntry);

        jmiQuit.setText("Quit");
        jmiQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiQuitActionPerformed(evt);
            }
        });
        jmFile.add(jmiQuit);

        mbOne.add(jmFile);

        jmHelp.setText("Help");

        jmiNeedHelp.setText("Need Help ?");
        jmHelp.add(jmiNeedHelp);

        mbOne.add(jmHelp);

        setJMenuBar(mbOne);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiQuitActionPerformed

        try {
            
            System.exit(0);
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_jmiQuitActionPerformed

    private void bAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bAddNewActionPerformed

    private void bEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bEditActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bDeleteActionPerformed

    private void jmiAddNewEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAddNewEntryActionPerformed

        this.bAddNewActionPerformed(evt);
    }//GEN-LAST:event_jmiAddNewEntryActionPerformed

    private void jmiEditAEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEditAEntryActionPerformed

        this.bEditActionPerformed(evt);
    }//GEN-LAST:event_jmiEditAEntryActionPerformed

    private void hmiDeleteAEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hmiDeleteAEntryActionPerformed

        this.bDeleteActionPerformed(evt);
    }//GEN-LAST:event_hmiDeleteAEntryActionPerformed

    /**
     * Launching this Frame from here.....
     */
    public static void launch() {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAddNew;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bEdit;
    private javax.swing.JComboBox cmSearchBy;
    private javax.swing.JMenuItem hmiDeleteAEntry;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu jmFile;
    private javax.swing.JMenu jmHelp;
    private javax.swing.JMenuItem jmiAddNewEntry;
    private javax.swing.JMenuItem jmiEditAEntry;
    private javax.swing.JMenuItem jmiNeedHelp;
    private javax.swing.JMenuItem jmiQuit;
    private javax.swing.JMenuBar mbOne;
    private javax.swing.JPanel pOne;
    private javax.swing.JTable tblContactList;
    private javax.swing.JTextArea tfDetailsInformation;
    private javax.swing.JTextField tfSearchBox;
    // End of variables declaration//GEN-END:variables
}
