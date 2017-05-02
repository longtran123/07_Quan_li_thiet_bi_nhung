/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Embedded;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author LongTran
 */
public class SignIn extends javax.swing.JFrame {

    /**
     * Creates new form SignIn
     */
    public SignIn() {
        this.setUndecorated(true);
        initComponents();
        this.setSize(390,400);
        this.setLocation(450, 100);
        this.getRootPane().setDefaultButton(btnSignIn);
    }

    //private Connection conn = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;
    private Connection con = null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbEX1 = new javax.swing.JLabel();
        txtUS = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbEX2 = new javax.swing.JLabel();
        txtPW = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        lbExit = new javax.swing.JLabel();
        btnSignIn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 102, 102)));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/User.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 30, 30);

        lbEX1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbEX1.setForeground(new java.awt.Color(255, 255, 255));
        lbEX1.setText("!");
        jPanel1.add(lbEX1);
        lbEX1.setBounds(290, 10, 10, 30);

        txtUS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtUS.setForeground(new java.awt.Color(153, 153, 153));
        txtUS.setText("Username");
        txtUS.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        txtUS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUSFocusGained(evt);
            }
        });
        txtUS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUSMouseClicked(evt);
            }
        });
        jPanel1.add(txtUS);
        txtUS.setBounds(50, 10, 260, 30);

        jPanel3.add(jPanel1);
        jPanel1.setBounds(30, 100, 330, 50);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Key 21x24.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 10, 30, 30);

        lbEX2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbEX2.setForeground(new java.awt.Color(255, 255, 255));
        lbEX2.setText("!");
        jPanel2.add(lbEX2);
        lbEX2.setBounds(290, 10, 10, 30);

        txtPW.setForeground(new java.awt.Color(153, 153, 153));
        txtPW.setText("jPasswordField1");
        txtPW.setToolTipText("");
        txtPW.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        txtPW.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPWFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPWFocusLost(evt);
            }
        });
        jPanel2.add(txtPW);
        txtPW.setBounds(50, 10, 260, 30);

        jPanel3.add(jPanel2);
        jPanel2.setBounds(30, 150, 330, 50);

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(102, 102, 102)));

        lbExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Off.png"))); // NOI18N
        lbExit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lbExitFocusGained(evt);
            }
        });
        lbExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 357, Short.MAX_VALUE)
                .addComponent(lbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbExit, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4);
        jPanel4.setBounds(0, 0, 390, 30);

        btnSignIn.setBackground(new java.awt.Color(51, 51, 255));
        btnSignIn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSignIn.setForeground(new java.awt.Color(255, 255, 255));
        btnSignIn.setText("Sign in");
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        jPanel3.add(btnSignIn);
        btnSignIn.setBounds(30, 270, 330, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Sign in");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(130, 40, 170, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private String ID(){
        String a = null;
         try {
                    con = Connect.connect();
                    Statement s = con.createStatement();
                    String U = txtUS.getText();
                    String US = "SELECT ID FROM accounta where Username = '"+U+"'";
                        ResultSet rs = s.executeQuery(US);
                    if(rs.next()){
                        
                        a = rs.getString(1);
                   }
                    con.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
         return a;
    }
    
//    private void Remember(){
//        try{
//           con = Connect.connect();
//          
//           Statement s = con.createStatement();
//           String FindID = "select ID from accounta where Username = '"+txtUS.getText()+"' ";
//            ResultSet rs = s.executeQuery(FindID);
//            if(rs.next()){
//                String ID = rs.getString(1);  
//               // System.out.println(ID);
//                if(ckRe.isSelected()){
//                    String sql = "Update remembera set  Status = 'Yes' where ID = '"+ID+"'";
//                    s.executeUpdate(sql);
//                }else if(!ckRe.isSelected()){
//                    String sql = "Update remembera set  Status = 'No' where ID = '"+ID+"'";
//                    s.executeUpdate(sql);
//                }
//        }
//        }catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, "Connect to database fail!! :(");
//        }
//    }
    
    private void Username(){
            txtUS.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
            lbEX1.setForeground(Color.red);
            lbEX1.setVisible(true);
            txtUS.setForeground(Color.gray);
            txtUS.setFont(new java.awt.Font("Tahoma",1,11));
            txtUS.setText("Username");
    }
    private void Password(){
            txtPW.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
            lbEX2.setForeground(Color.red);
            lbEX2.setVisible(true);
            txtPW.setForeground(Color.gray);
            txtPW.setText("jPasswordField1");
    }
    
    private void txtUSFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUSFocusGained

        txtUS.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white));
        if(txtUS.getText().equals("Username")){
            txtUS.setText("");
            txtUS.setForeground(Color.black);
            txtUS.setFont(new java.awt.Font("Tahoma",0,11));
        }
        lbEX1.setVisible(false);
        if(txtPW.getText().equals("")){
            txtPW.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
            lbEX2.setForeground(Color.red);
            lbEX2.setVisible(true);
            txtPW.setForeground(Color.gray);
            txtPW.setText("jPasswordField1");

        }

    }//GEN-LAST:event_txtUSFocusGained

    private void txtUSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUSMouseClicked
               txtUS.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white));
               if(txtUS.getText().equals("Username")){
                        txtUS.setText("");
                        txtUS.setForeground(Color.black);
                        txtUS.setFont(new java.awt.Font("Tahoma",0,11));
                   }
               lbEX1.setVisible(false);
               if(txtPW.getText().equals("")){
                        txtPW.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
                        lbEX2.setVisible(true);
                        txtPW.setForeground(Color.gray);
                        txtPW.setText("jPasswordField1");
            
                    }
    }//GEN-LAST:event_txtUSMouseClicked

    private void txtPWFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPWFocusGained
        txtPW.setText("");
        txtPW.setForeground(Color.black);
        txtPW.setFont(new java.awt.Font("Tahoma", 0, 11));
        txtPW.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white));
        lbEX2.setVisible(false);
        if(txtUS.getText().equals("")){
            txtUS.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
            lbEX1.setForeground(Color.red);
            lbEX1.setVisible(true);
            txtUS.setForeground(Color.gray);
            txtUS.setFont(new java.awt.Font("Tahoma",1,11));
            txtUS.setText("Username");

        }
    }//GEN-LAST:event_txtPWFocusGained

    private void txtPWFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPWFocusLost
        if(txtPW.getText().equals("")){
            txtPW.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
            lbEX2.setForeground(Color.red);
            lbEX2.setVisible(true);
            txtPW.setForeground(Color.gray);
            txtPW.setText("jPasswordField1");

        }
    }//GEN-LAST:event_txtPWFocusLost

    private void lbExitFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lbExitFocusGained

    }//GEN-LAST:event_lbExitFocusGained

    private void lbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbExitMouseClicked

    private boolean hasd(){
        boolean ck = false;
        try {
           con = Connect.connect();
            Statement s = con.createStatement();
            
            String sql = "SELECT * FROM `remembera` where `Status` = 'No' and `Username` = '"+txtUS.getText()+"'";
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){ 
                ck = true;
                
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ck;
    }
    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
//        Remember();
       
        String sql = "Select * from accounta where (Username=? and Password=?) ";
        try{
            con = Connect.connect();
            pst = con.prepareStatement(sql);
            pst.setString(1,txtUS.getText());
            pst.setInt(2,txtPW.getText().hashCode());
            
            rs = pst.executeQuery();

            if(txtUS.getText().equals("") ||txtUS.getText().equals("Username")){
                Username();
                if(txtPW.getText().equals("") || txtPW.getText().equals("jPasswordField1") ){
                    Password();
                }
            }else if(txtPW.getText().equals("") || txtPW.getText().equals("jPasswordField1") ){
                Password();
            }else if(rs.next()){
                Homepage hg = new Homepage();
                if(txtUS.getText().equals("admin") || txtUS.getText().equals("Admin")){
                    hg.setVisible(true);
                    this.dispose();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Username or password incorrect");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_btnSignInActionPerformed
    int posX=0,posY=0;
    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        this.setLocation (evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        posX=evt.getX();
        posY=evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       lbEX1.setVisible(false);
      lbEX2.setVisible(false);
//      try{
//           con = Connect.connect();
//           //conn=DriverManager.getConnection(dbURl);
//           String sql = "Select * from remembera where Status = 'Yes'";
//          
//            Statement s = con.createStatement();
//            
//            ResultSet rs = s.executeQuery(sql);
//           
//           if(rs.next()){
//                String US = rs.getString(1);
//                String PW = rs.getString(2); 
////                ckRe.setSelected(true);
//                txtUS.setText(US);
//                txtPW.setText(PW);
//           }
//       } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, "Connect to database fail!! :(");
//        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbEX1;
    private javax.swing.JLabel lbEX2;
    private javax.swing.JLabel lbExit;
    private javax.swing.JPasswordField txtPW;
    private javax.swing.JTextField txtUS;
    // End of variables declaration//GEN-END:variables
}
