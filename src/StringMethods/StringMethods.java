/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StringMethods;

/**
 *
 * @author pehor9164
 */
public class StringMethods extends javax.swing.JFrame {

    /**
     * Creates new form StringMethods
     */
    public StringMethods() {
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

        jPanel1 = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        lengthLbl = new javax.swing.JLabel();
        aWithXTxtFeild = new javax.swing.JTextField();
        letterBtn = new javax.swing.JButton();
        capsLbl = new javax.swing.JLabel();
        lengthTxtFeild = new javax.swing.JTextField();
        lengthBtn = new javax.swing.JButton();
        fourthLbl = new javax.swing.JLabel();
        capsTxtFeild = new javax.swing.JTextField();
        capsBtn = new javax.swing.JButton();
        identicalLbl = new javax.swing.JLabel();
        fourthTxtFeild = new javax.swing.JTextField();
        letterTxtFeild2 = new javax.swing.JTextField();
        aWithXBtn = new javax.swing.JButton();
        letterLbl = new javax.swing.JLabel();
        identicalTxtFeild1 = new javax.swing.JTextField();
        identicalTxtFeild2 = new javax.swing.JTextField();
        identicalBtn = new javax.swing.JButton();
        fourAndSixLbl = new javax.swing.JLabel();
        letterTxtFeild1 = new javax.swing.JTextField();
        fourthBtn = new javax.swing.JButton();
        aWithXLbl = new javax.swing.JLabel();
        fourAndSixTxtFeild = new javax.swing.JTextField();
        fourAndSixBtn = new javax.swing.JButton();
        lengthOutPutLbl = new javax.swing.JLabel();
        aWithXOutPutLbl = new javax.swing.JLabel();
        capsOutPutLbl = new javax.swing.JLabel();
        fourthOutPutLbl1 = new javax.swing.JLabel();
        identicalOutPutLbl = new javax.swing.JLabel();
        letterOutPutLbl = new javax.swing.JLabel();
        fourAndSixOutPutLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 204, 204));
        titleLbl.setText("Super String Methods");
        jPanel1.add(titleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, -1));

        lengthLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lengthLbl.setText("Find Length Of String");
        jPanel1.add(lengthLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));
        jPanel1.add(aWithXTxtFeild, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 110, -1));

        letterBtn.setText("Find Letter");
        letterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterBtnActionPerformed(evt);
            }
        });
        jPanel1.add(letterBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 130, -1));

        capsLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        capsLbl.setText("Outputs String In CAPS");
        jPanel1.add(capsLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));
        jPanel1.add(lengthTxtFeild, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 110, -1));

        lengthBtn.setText("Find Length");
        lengthBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthBtnActionPerformed(evt);
            }
        });
        jPanel1.add(lengthBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 130, -1));

        fourthLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fourthLbl.setText("Outputs 4th character of string");
        jPanel1.add(fourthLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));
        jPanel1.add(capsTxtFeild, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 110, -1));

        capsBtn.setText("Output in Caps");
        capsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capsBtnActionPerformed(evt);
            }
        });
        jPanel1.add(capsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 130, -1));

        identicalLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        identicalLbl.setText("See If Two Strings are identical");
        jPanel1.add(identicalLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));
        jPanel1.add(fourthTxtFeild, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 110, -1));
        jPanel1.add(letterTxtFeild2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 30, -1));

        aWithXBtn.setText("replace \"a\"");
        aWithXBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aWithXBtnActionPerformed(evt);
            }
        });
        jPanel1.add(aWithXBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 160, -1));

        letterLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        letterLbl.setText("Enter String and letter. See if letter is found in string");
        jPanel1.add(letterLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));
        jPanel1.add(identicalTxtFeild1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 110, -1));
        jPanel1.add(identicalTxtFeild2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 110, -1));

        identicalBtn.setText("Identical");
        identicalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identicalBtnActionPerformed(evt);
            }
        });
        jPanel1.add(identicalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 130, -1));

        fourAndSixLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fourAndSixLbl.setText("Enter a string 8 characters long. Will display 4 and 6");
        jPanel1.add(fourAndSixLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));
        jPanel1.add(letterTxtFeild1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 110, -1));

        fourthBtn.setText("4th caracter");
        fourthBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourthBtnActionPerformed(evt);
            }
        });
        jPanel1.add(fourthBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 130, -1));

        aWithXLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        aWithXLbl.setText("Replaces \"a\" with \"x\" in the string");
        jPanel1.add(aWithXLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));
        jPanel1.add(fourAndSixTxtFeild, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 110, -1));

        fourAndSixBtn.setText("4th and 6th caracters");
        fourAndSixBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourAndSixBtnActionPerformed(evt);
            }
        });
        jPanel1.add(fourAndSixBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 160, -1));

        lengthOutPutLbl.setText("...");
        jPanel1.add(lengthOutPutLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        aWithXOutPutLbl.setText("...");
        jPanel1.add(aWithXOutPutLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, -1, -1));

        capsOutPutLbl.setText("...");
        jPanel1.add(capsOutPutLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        fourthOutPutLbl1.setText("...");
        jPanel1.add(fourthOutPutLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        identicalOutPutLbl.setText("...");
        jPanel1.add(identicalOutPutLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        letterOutPutLbl.setText("...");
        jPanel1.add(letterOutPutLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, -1));

        fourAndSixOutPutLbl.setText("...");
        jPanel1.add(fourAndSixOutPutLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void letterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterBtnActionPerformed
        String imput;
        String imput2;
        
        imput = letterTxtFeild1.getText();
        imput2 = letterTxtFeild2.getText();
        
        if(imput.contains(imput2)){
            letterOutPutLbl.setText("The String Contains The Letter!");
        }
        else{
            letterOutPutLbl.setText("The String Does Not Contains The Letter!");
        }
    }//GEN-LAST:event_letterBtnActionPerformed

    private void identicalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identicalBtnActionPerformed
        String input;
        String input2;
        String output;
        
        input = identicalTxtFeild1.getText();
        input2 = identicalTxtFeild2.getText();
        
        if (input.equals(input2)){
            output = "identical";
        }
        else{
            output = "not identical";
        }
            
            
        identicalOutPutLbl.setText("The String Is: " + output); 
    }//GEN-LAST:event_identicalBtnActionPerformed

    private void aWithXBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aWithXBtnActionPerformed
        String input;
        input = aWithXTxtFeild.getText();
        
        if (input.contains("a")){
            aWithXOutPutLbl.setText("A Replaced With X is: " + input.replace("a", "x"));
        }
        else{
            aWithXOutPutLbl.setText("DOES NOT CONTAIN A");
        }
        
        
    }//GEN-LAST:event_aWithXBtnActionPerformed

    private void lengthBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthBtnActionPerformed
        String input;
        input = lengthTxtFeild.getText();
        
        lengthOutPutLbl.setText("The Length Of The String Is: " + input.length());
        
    }//GEN-LAST:event_lengthBtnActionPerformed

    private void capsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capsBtnActionPerformed
        String input;
        input = capsTxtFeild.getText();
        
        capsOutPutLbl.setText("The String In Caps Is: " + input.toUpperCase()); 
    }//GEN-LAST:event_capsBtnActionPerformed

    private void fourthBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourthBtnActionPerformed
        String input;
        input = fourthTxtFeild.getText();
        
        fourthOutPutLbl1.setText("The Fourth Character Is: " + input.charAt(3)); 
    }//GEN-LAST:event_fourthBtnActionPerformed

    private void fourAndSixBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourAndSixBtnActionPerformed
        String input;
        input = fourAndSixTxtFeild.getText();
        int length;
        length = input.length();
        
        if (length >= 8){
            fourAndSixOutPutLbl.setText("The Fourth To Sixth Characters Are: " + input.charAt(3) + input.charAt(4) + input.charAt(5)); 
        }
        
    }//GEN-LAST:event_fourAndSixBtnActionPerformed

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
            java.util.logging.Logger.getLogger(StringMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StringMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StringMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StringMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StringMethods().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aWithXBtn;
    private javax.swing.JLabel aWithXLbl;
    private javax.swing.JLabel aWithXOutPutLbl;
    private javax.swing.JTextField aWithXTxtFeild;
    private javax.swing.JButton capsBtn;
    private javax.swing.JLabel capsLbl;
    private javax.swing.JLabel capsOutPutLbl;
    private javax.swing.JTextField capsTxtFeild;
    private javax.swing.JButton fourAndSixBtn;
    private javax.swing.JLabel fourAndSixLbl;
    private javax.swing.JLabel fourAndSixOutPutLbl;
    private javax.swing.JTextField fourAndSixTxtFeild;
    private javax.swing.JButton fourthBtn;
    private javax.swing.JLabel fourthLbl;
    private javax.swing.JLabel fourthOutPutLbl1;
    private javax.swing.JTextField fourthTxtFeild;
    private javax.swing.JButton identicalBtn;
    private javax.swing.JLabel identicalLbl;
    private javax.swing.JLabel identicalOutPutLbl;
    private javax.swing.JTextField identicalTxtFeild1;
    private javax.swing.JTextField identicalTxtFeild2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lengthBtn;
    private javax.swing.JLabel lengthLbl;
    private javax.swing.JLabel lengthOutPutLbl;
    private javax.swing.JTextField lengthTxtFeild;
    private javax.swing.JButton letterBtn;
    private javax.swing.JLabel letterLbl;
    private javax.swing.JLabel letterOutPutLbl;
    private javax.swing.JTextField letterTxtFeild1;
    private javax.swing.JTextField letterTxtFeild2;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
