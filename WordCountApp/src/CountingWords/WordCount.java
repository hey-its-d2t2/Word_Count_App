package CountingWords;
public class WordCount extends javax.swing.JFrame {
    public WordCount() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WrdCountPanel = new javax.swing.JPanel();
        wrdLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        wrdTextArea1 = new javax.swing.JTextArea();
        totalCounttextField1 = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        wrdCountButton = new javax.swing.JButton();
        Exitbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Clearbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Word Count App");

        WrdCountPanel.setBackground(new java.awt.Color(153, 255, 204));
        WrdCountPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 0, 51)));

        wrdLabel.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        wrdLabel.setForeground(java.awt.Color.red);
        wrdLabel.setText("Type Your Words : ");

        wrdTextArea1.setBackground(new java.awt.Color(255, 235, 252));
        wrdTextArea1.setColumns(20);
        wrdTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        wrdTextArea1.setRows(5);
        jScrollPane1.setViewportView(wrdTextArea1);

        totalCounttextField1.setBackground(new java.awt.Color(255, 235, 252));
        totalCounttextField1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        totalCounttextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalCounttextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Total Words :");

        wrdCountButton.setBackground(new java.awt.Color(255, 255, 204));
        wrdCountButton.setFont(new java.awt.Font("Perpetua", 1, 36)); // NOI18N
        wrdCountButton.setForeground(new java.awt.Color(255, 0, 0));
        wrdCountButton.setText("Count");
        wrdCountButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 153)));
        wrdCountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wrdCountButtonActionPerformed(evt);
            }
        });

        Exitbtn.setBackground(new java.awt.Color(255, 255, 204));
        Exitbtn.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        Exitbtn.setForeground(new java.awt.Color(255, 0, 0));
        Exitbtn.setText("Exit");
        Exitbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 204)));
        Exitbtn.setPreferredSize(new java.awt.Dimension(63, 25));
        Exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitbtnActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(102, 102, 255));
        jLabel3.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(6, 13, 255));
        jLabel3.setText("Word Count App");

        Clearbtn.setBackground(new java.awt.Color(255, 255, 204));
        Clearbtn.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        Clearbtn.setForeground(new java.awt.Color(255, 0, 0));
        Clearbtn.setText("Clear");
        Clearbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 204)));
        Clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout WrdCountPanelLayout = new javax.swing.GroupLayout(WrdCountPanel);
        WrdCountPanel.setLayout(WrdCountPanelLayout);
        WrdCountPanelLayout.setHorizontalGroup(
            WrdCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WrdCountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(WrdCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WrdCountPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WrdCountPanelLayout.createSequentialGroup()
                        .addComponent(wrdLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(267, 267, 267))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WrdCountPanelLayout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(Clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(Exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WrdCountPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalCounttextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(54, 54, 54)
                        .addComponent(wrdCountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
        );
        WrdCountPanelLayout.setVerticalGroup(
            WrdCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WrdCountPanelLayout.createSequentialGroup()
                .addGroup(WrdCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(wrdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addGroup(WrdCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WrdCountPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(WrdCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(wrdCountButton)
                            .addComponent(totalCounttextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(WrdCountPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)))
                .addGap(37, 37, 37)
                .addGroup(WrdCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(WrdCountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(WrdCountPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitbtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitbtnActionPerformed

    private void ClearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearbtnActionPerformed
        wrdTextArea1.setText("");
        totalCounttextField1.setText("");
    }//GEN-LAST:event_ClearbtnActionPerformed

    private void wrdCountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wrdCountButtonActionPerformed
       String sentences = wrdTextArea1.getText();
       int  i = 0, words = 0;
       for(i  = 0;i < sentences.length();i++ ){
           if( sentences.charAt(i) == ' '){
                words++;
            }
       }
       totalCounttextField1.setText(" "+words);
    }//GEN-LAST:event_wrdCountButtonActionPerformed

    private void totalCounttextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalCounttextField1ActionPerformed
        // TODO add your hndling code here:
    }//GEN-LAST:event_totalCounttextField1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WordCount().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clearbtn;
    private javax.swing.JButton Exitbtn;
    private javax.swing.JPanel WrdCountPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.TextField totalCounttextField1;
    private javax.swing.JButton wrdCountButton;
    private javax.swing.JLabel wrdLabel;
    private javax.swing.JTextArea wrdTextArea1;
    // End of variables declaration//GEN-END:variables
}
