/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Member;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author LongTran
 */
public class ChangePass extends javax.swing.JPanel {

    /**
     * Creates new form ChangePass
     */
     private int randomValue;
    private final static int NOV = 10000;
    private java.util.Random rd = new Random();
    public ChangePass() {
        initComponents();
        randomValue = rd.nextInt(NOV);
        String a = String.format("%04d", randomValue);
        txtCapcha.setText(a);
        txtCapcha.setEditable(false);
        txtConfirm.setDocument(new LengthRestrictedDocument(4));
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
        jLabel1 = new javax.swing.JLabel();
        lbID = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbUS = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtOPW = new javax.swing.JPasswordField();
        txtNPW = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        txtCapcha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnChange = new javax.swing.JButton();
        txtConfirm = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCPW = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(179, 216, 252));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Change Password");

        lbID.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbID.setForeground(new java.awt.Color(51, 51, 255));
        lbID.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbID)
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addComponent(lbID))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Username");

        lbUS.setText("Username");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Old password");

        txtOPW.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtOPWFocusGained(evt);
            }
        });

        txtNPW.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNPWFocusGained(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("New password");

        txtCapcha.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        txtCapcha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCapcha.setText("2");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Capcha");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Confirm");

        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        btnOK.setBackground(new java.awt.Color(0, 153, 153));
        btnOK.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnOK.setForeground(new java.awt.Color(255, 255, 255));
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Confirm password");

        txtCPW.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCPWFocusGained(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)))
                        .addGap(21, 21, 21)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtOPW)
                            .addComponent(lbUS, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNPW, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(txtConfirm, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCPW, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCapcha, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 186, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbUS))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtOPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtCPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCapcha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOK)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private Connection con = null;
    private void ChangePass(){
        try {
            con = Connect.connect();
            Statement st = con.createStatement();
            String ID = lbID.getText();
            String US = lbUS.getText();
            String NPW = txtNPW.getText();
            
            String CP1 = "Update account set Password = '"+NPW+"' where ID = '"+ID+"' and Username = '"+US+"'";
            String CP2 = "Update infomem set Password = '"+NPW+"' where ID = '"+ID+"' and Username = '"+US+"'";
            String CP3 = "Update remember set Password = '"+NPW+"' where ID = '"+ID+"' and Username = '"+US+"'";
            st.executeUpdate(CP1);
            st.executeUpdate(CP2);
            st.executeUpdate(CP3);
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
       randomValue = rd.nextInt(NOV);
        String a = String.format("%04d", randomValue);
        txtCapcha.setText(a);
        txtCapcha.setEditable(false);
        txtConfirm.setDocument(new LengthRestrictedDocument(4));
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        if(txtOPW.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Old password not empty!");
        }else if(txtNPW.getText().equals("")){
            JOptionPane.showMessageDialog(null, "New password not empty!");
        }else if (txtCPW.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Confirm password not empty!");
        }else if(txtConfirm.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Confirm capcha not empty!");
        }else{
            try {
           con = Connect.connect();
            Statement s = con.createStatement();
            
            String sql = "SELECT * FROM `account` where Username = '"+lbUS.getText()+"' and Password = '"+txtOPW.getText()+"'";
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){ 
                if(txtNPW.getText().equals(txtCPW.getText())){
                    if(txtCapcha.getText().equals(txtConfirm.getText())){
                        ChangePass();
                        JOptionPane.showMessageDialog(null, "Change password secceess!");
                        txtCPW.setText(null);
                        txtConfirm.setText(null);
                        txtNPW.setText(null);
                        txtOPW.setText(null);
                    }else{
                        JOptionPane.showMessageDialog(null, "COnfirm capcha not correct!");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Confirm passoword not correct!");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Old password not correct!");
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void txtOPWFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOPWFocusGained
       txtOPW.setText(null);
    }//GEN-LAST:event_txtOPWFocusGained

    private void txtNPWFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNPWFocusGained
        txtNPW.setText(null);
    }//GEN-LAST:event_txtNPWFocusGained

    private void txtCPWFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCPWFocusGained
        txtCPW.setText(null);
    }//GEN-LAST:event_txtCPWFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnChange;
    public javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lbID;
    public javax.swing.JLabel lbUS;
    public javax.swing.JPasswordField txtCPW;
    public javax.swing.JTextField txtCapcha;
    public javax.swing.JTextField txtConfirm;
    public javax.swing.JPasswordField txtNPW;
    public javax.swing.JPasswordField txtOPW;
    // End of variables declaration//GEN-END:variables
    public final class LengthRestrictedDocument extends PlainDocument {

      private final int limit;

      public LengthRestrictedDocument(int limit) {
        this.limit = limit;
      }

      @Override
      public void insertString(int offs, String str, AttributeSet a)
          throws BadLocationException {
        if (str == null)
          return;

        if ((getLength() + str.length()) <= limit) {
          super.insertString(offs, str, a);
        }
      }
    }

}