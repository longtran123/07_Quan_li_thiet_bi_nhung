package Embedded;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LongTran
 */
public class GetReturn extends javax.swing.JFrame {

    /**
     * Creates new form GetReturn
     */
    public GetReturn() {
        this.setUndecorated(true);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbID = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbPro = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbbStatus = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtQuan = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        btnCan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("GET");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("RETURN");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("DEVICES");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Full Name:");

        lbName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbName.setForeground(new java.awt.Color(0, 0, 255));
        lbName.setText("Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("ID Device:");

        lbID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbID.setForeground(new java.awt.Color(0, 0, 255));
        lbID.setText("ID");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Project:");

        lbPro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbPro.setForeground(new java.awt.Color(0, 0, 255));
        lbPro.setText("Pro");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Status");

        cbbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Normal", "Bad" }));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Quantity");

        txtQuan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtQuanFocusGained(evt);
            }
        });

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnCan.setText("Cancel");
        btnCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(100, 100, 100)
                                    .addComponent(txtQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(100, 100, 100)
                                    .addComponent(cbbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel10)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(51, 51, 51)
                                    .addComponent(lbPro))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel4))
                                    .addGap(40, 40, 40)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbName)
                                        .addComponent(lbID)))))
                        .addGap(40, 40, 40))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCan, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbName))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbID))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lbPro))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOK, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(btnCan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private String IDUS;
    public void setIDUS(String IDUS){
        this.IDUS = IDUS;
    }
    private String Type;
    public void setType(String Type){
        this.Type = Type;
    }
    private String Name;
    public void setName(String Name){
        this.Name = Name;
    }
    
    private Connection con = null;
    private void deleteBorrow(){
         try {
          con = Connect.connect();
          Statement s = con.createStatement();
          String FN = lbName.getText();
          String ID = lbID.getText();
          String Pro = lbPro.getText();
          String Status = (String) cbbStatus.getSelectedItem();
          String Quan = txtQuan.getText();
          String sql = "Delete from `borrowde` where IDEm = '"+ID+"' and FullName = '"+FN+"' and Project = '"+Pro+"' and Status = '"+Status+"' and QuantityEm = '"+Quan+"' ";
          s.executeUpdate(sql);
          con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void deleteBorrowQuan(){
         try {
          con = Connect.connect();
          Statement s = con.createStatement();
          String FN = lbName.getText();
          String ID = lbID.getText();
          String Pro = lbPro.getText();
          String Status = (String) cbbStatus.getSelectedItem();
          String Quan = txtQuan.getText();
          String sql = "Delete from `borrowde` where IDEm = '"+ID+"' and FullName = '"+FN+"' and Project = '"+Pro+"' and QuantityEm = '"+Quan+"' ";
          s.executeUpdate(sql);
          con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    private void InsertGB(){
         try {
          con = Connect.connect();
          Statement s = con.createStatement();
          String FN = lbName.getText();
          String ID = lbID.getText();
          String Pro = lbPro.getText();
          String Status = (String) cbbStatus.getSelectedItem();
          String Quan = txtQuan.getText();
          String sql = "insert into `giveback` values ('"+FN+"','"+ID+"','"+Name+"','"+Pro+"','"+Status+"',"+Quan+",'"+Type+"','"+IDUS+"')";
          s.executeUpdate(sql);
          con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private int addQuan(){
        int Q = 0;
        try {
            con = Connect.connect();
            Statement s = con.createStatement();
            String ID = lbID.getText();
            String Status = (String) cbbStatus.getSelectedItem();
            String Quan = txtQuan.getText();
            int b = Integer.parseInt(Quan);
            String find = "select QuantityEm from embedded where IDEm = '"+ID+"' and StatusEm = '"+Status+"'";
            ResultSet rs = s.executeQuery(find);
            if(rs.next()){
                int a = rs.getInt(1);
                if(b <= a){
                    Q = a + b;
                }
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return Q;
    }
    
    private int deleteQuan(){
        int Q = 0;
        try {
            con = Connect.connect();
            Statement s = con.createStatement();
            String FN = lbName.getText();
            String ID = lbID.getText();
            String Status = (String) cbbStatus.getSelectedItem();
            String Quan = txtQuan.getText();
            int b = Integer.parseInt(Quan);
            String find = "select QuantityEm from borrowde where IDEm = '"+ID+"' and FullName = '"+FN+"' and IDUS = '"+IDUS+"' and ConfirmEm = 'Received' and Type = '"+Type+"' and IDUS = '"+IDUS+"'";
            ResultSet rs = s.executeQuery(find);
            if(rs.next()){
                int a = rs.getInt(1);
                if(b <= a){
                    Q = a - b;
                }else{
                    JOptionPane.showMessageDialog(null, "Quantity incorrect!");
                }
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return Q;
    }
    
    private void Upem(){
        try {
          con = Connect.connect();
          Statement s = con.createStatement();
          String FN = lbName.getText();
          String ID = lbID.getText();
          String Pro = lbPro.getText();
          String Status = (String) cbbStatus.getSelectedItem();
          String Quan = txtQuan.getText();
          String sql = "update `embedded` set QuantityEm = '"+addQuan()+"' where IDEm = '"+ID+"' and NameEm = '"+Name+"' and Type = '"+Type+"' and StatusEm = '"+Status+"'";
          s.executeUpdate(sql);
          con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private String Fun(){
        String fun =  null;
        try {
            con = Connect.connect();
            Statement s = con.createStatement();
            String ID = lbID.getText();
            
            String Quan = txtQuan.getText();
            int b = Integer.parseInt(Quan);
            String find = "select FunctionEm from embedded where IDEm = '"+ID+"'";
            ResultSet rs = s.executeQuery(find);
            if(rs.next()){
               fun = rs.getString("FunctionEm");
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return fun;
    }
    
    private void Upemst(){
        try {
          con = Connect.connect();
          Statement s = con.createStatement();
          String FN = lbName.getText();
          String ID = lbID.getText();
          String Pro = lbPro.getText();
          String Status = (String) cbbStatus.getSelectedItem();
          String Quan = txtQuan.getText();
          String sql = "select * from embedded where IDEm = '"+ID+"' and NameEm = '"+Name+"' and StatusEm = '"+Status+"' and Type = '"+Type+"'";
          ResultSet rs = s.executeQuery(sql);
          if(rs.next()){
              String up = "update embedded set QuantityEm = '"+addQuan()+"' where IDEm = '"+ID+"' and StatusEm = '"+Status+"' and Type = '"+Type+"'";
              s.executeUpdate(up);
          }else{
              String in = "insert into embedded values ('"+ID+"', '"+Name+"', '"+Fun()+"', '"+Status+"', "+Quan+", '"+Type+"')";
              s.executeUpdate(in);
          }
          con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void upBorrow(){
        try {
          con = Connect.connect();
          Statement s = con.createStatement();
          String FN = lbName.getText();
          String ID = lbID.getText();
          String Pro = lbPro.getText();
          String Status = (String) cbbStatus.getSelectedItem();
          String Quan = txtQuan.getText();
          String sql = "update `borrowde` set QuantityEm = '"+deleteQuan()+"' where IDEm = '"+ID+"' and NameEm = '"+Name+"' and Type = '"+Type+"' and Status = '"+Status+"' and FullName = '"+FN+"'";
          s.executeUpdate(sql);
          con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void upBorrowQuan(){
        try {
          con = Connect.connect();
          Statement s = con.createStatement();
          String FN = lbName.getText();
          String ID = lbID.getText();
          String Pro = lbPro.getText();
          String Status = (String) cbbStatus.getSelectedItem();
          String Quan = txtQuan.getText();
          String sql = "update `borrowde` set QuantityEm = '"+deleteQuan()+"' where IDEm = '"+ID+"' and NameEm = '"+Name+"' and Type = '"+Type+"'  and FullName = '"+FN+"' and ConfirmEm = 'Received' and IDUS = '"+IDUS+"'";
          s.executeUpdate(sql);
          con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
    
    private void GiveBack(){
        String a = txtQuan.getText();
        int b = Integer.parseInt(a);
        if(b<=Quan){
        try {
            
            con = Connect.connect();
            Statement s = con.createStatement();
            String FN = lbName.getText();
            String ID = lbID.getText();
            String Pro = lbPro.getText();
            String Status = (String) cbbStatus.getSelectedItem();
            String Quan = txtQuan.getText();
            String sql = "select * from borrowde where IDEm = '"+ID+"' and FullName = '"+FN+"' and ConfirmEm = 'Received' and QuantityEm = "+Quan+"";
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                String sql2 = "select * from borrowde where IDEm = '"+ID+"' and FullName = '"+FN+"' and ConfirmEm = 'Received' and Status = '"+Status+"'";
                ResultSet rs2 = s.executeQuery(sql2);
                if(rs2.next()){
                    deleteBorrow();
                    InsertGB();
                    Upem();
                    JOptionPane.showMessageDialog(null, "Seccess!");
                }else{
                    deleteBorrowQuan();
                    InsertGB();
                    Upemst();
                    
                    JOptionPane.showMessageDialog(null, "Seccess!");
                }
            }else{
                String sql2 = "select * from borrowde where IDEm = '"+ID+"' and FullName = '"+FN+"' and ConfirmEm = 'Received' and Status = '"+Status+"'";
                ResultSet rs2 = s.executeQuery(sql2);
                if(rs2.next()){
                    upBorrow();
                    Upem();
                    InsertGB();
                    JOptionPane.showMessageDialog(null, "Seccess!");
                }else{
                    upBorrowQuan();
                    InsertGB();
                    Upemst();
                    
                    JOptionPane.showMessageDialog(null, "Seccess!");
                }
            }
            con.close();
          } catch (Exception ex) {
              ex.printStackTrace();
          }
      }else{
            JOptionPane.showMessageDialog(null, "Quantity incorrect!");
        }
    }
    
    private int Quan;
    public void setQuan(int Quan){
        this.Quan = Quan;
    }
    
    private void btnCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanActionPerformed
       this.dispose();
        
    }//GEN-LAST:event_btnCanActionPerformed

    private void txtQuanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuanFocusGained
       txtQuan.setText(null);
    }//GEN-LAST:event_txtQuanFocusGained

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed

    GiveBack();
     
    }//GEN-LAST:event_btnOKActionPerformed
    int posX=0,posY=0;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        posX=evt.getX();
        posY=evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
       this.setLocation (evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);
    }//GEN-LAST:event_jPanel1MouseDragged

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
            java.util.logging.Logger.getLogger(GetReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GetReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GetReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GetReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GetReturn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCan;
    private javax.swing.JButton btnOK;
    public javax.swing.JComboBox<String> cbbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lbID;
    public javax.swing.JLabel lbName;
    public javax.swing.JLabel lbPro;
    public javax.swing.JTextField txtQuan;
    // End of variables declaration//GEN-END:variables
}