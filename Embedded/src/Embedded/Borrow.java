package Embedded;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import SendMail.GoogleMail;
import SendMail.InfoMail;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LongTran
 */
public class Borrow extends javax.swing.JPanel {

    /**
     * Creates new form Borrow
     */
    public Borrow() {
        initComponents();
        ClearConfirm();
        loadTableConfirm();
        ClearList();
        loadTableListW();
        loadTableListR();
        M();
//        if(cbbSelect.getSelectedItem().equals("Select")){
//            txtSearch.setEnabled(false);
//            btnSearch.setEnabled(false);
//        }
    }

   private void Search(){
        try {
            con = Connect.connect();
            
            Statement s = con.createStatement();
            String Search = txtSearch.getText();
            String sql = null;
            String sql2 = null;
            switch (cbbSelect.getSelectedIndex()) {
                case 0:
                    sql = "Select * from borrowde where FullName like '%"+Search+"%' and (ConfirmEm = 'Wait Receive' or ConfirmEm = 'Received')";
                    break;
                case 1:
                    sql = "select * from borrowde where IDEm like '%"+Search+"%' and (ConfirmEm = 'Wait Receive' or ConfirmEm = 'Received') ";
                    break;
                case 2:
                    sql = "select * from borrowde where NameEm like '%"+Search+"%' and (ConfirmEm = 'Wait Receive' or ConfirmEm = 'Received')";
                    break;
                case 3:
                    sql = "select * from borrowde where Project like '%"+Search+"%' and (ConfirmEm = 'Wait Receive' or ConfirmEm = 'Received')";
                    break;
                case 4:
                    sql = "select * from borrowde where ConfirmEm like '%"+Search+"%' ";
                    break;
                case 5:
                   sql = "select * from borrowde where Type like '%"+Search+"%' and (ConfirmEm = 'Wait Receive' or ConfirmEm = 'Received')";
                    break;
                default:
                    break;
            }
            ResultSet rs = s.executeQuery(sql);
            //rs = s.executeQuery(sql2);
            tblList.setModel(tableModelL);
            while(rs.next()){ 
                Object rows[] = new Object[8];
                rows[0] = rs.getString(3);
                rows[1] = rs.getString(1);  
                rows[2] = rs.getString(2);
                rows[3] = rs.getString(4);
                rows[4] = rs.getString(5);
                rows[5] = rs.getInt(6);
                rows[6] = rs.getString(8);
                rows[7] = rs.getString(7);
                tableModelL.addRow(rows);
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
   
    private void No(){
        try {
           con = Connect.connect();
            Statement s = con.createStatement();
            int i =  tblConfirm.getSelectedRow();
            String ID = (String) tableModel.getValueAt(i, 1);
            String FN = (String) tableModel.getValueAt(i, 0);
            String Pro = (String) tableModel.getValueAt(i, 3);
            String Status = (String) tableModel.getValueAt(i, 4);
            int Quan =  (int) tableModel.getValueAt(i, 5);
            String sql = "update borrowde set ConfirmEm = 'No' where IDEm = '"+ID+"' and Status = '"+Status+"' and FullName = '"+FN+"' and Project = '"+Pro+"' and QuantityEm = "+Quan+"";
            String sql2 = "update borrowde2 set ConfirmEm = 'No' where IDEm = '"+ID+"' and Status = '"+Status+"' and FullName = '"+FN+"' and Project = '"+Pro+"' and QuantityEm = "+Quan+"";
            s.executeUpdate(sql);
            s.executeUpdate(sql2);
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void Wait(){
        try {
           con = Connect.connect();
            Statement s = con.createStatement();
            int i =  tblConfirm.getSelectedRow();
            String ID = (String) tableModel.getValueAt(i, 1);
            String FN = (String) tableModel.getValueAt(i, 0);
            String Pro = (String) tableModel.getValueAt(i, 3);
             String Status = (String) tableModel.getValueAt(i, 4);
           int Quan =  (int) tableModel.getValueAt(i, 5);
            String sql = "update borrowde set ConfirmEm = 'Wait to Receive' where IDEm = '"+ID+"' and Status = '"+Status+"' and FullName = '"+FN+"' and Project = '"+Pro+"' and QuantityEm = "+Quan+"";
            String sql2 = "update borrowde2 set ConfirmEm = 'Wait to Receive' where IDEm = '"+ID+"' and Status = '"+Status+"' and FullName = '"+FN+"' and Project = '"+Pro+"' and QuantityEm = "+Quan+"";
            s.executeUpdate(sql);
            s.executeUpdate(sql2);
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void Received(){
        try {
           con = Connect.connect();
            Statement s = con.createStatement();
            int i =  tblList.getSelectedRow();
            String ID = (String) tableModelL.getValueAt(i, 1);
            String FN = (String) tableModelL.getValueAt(i, 0);
            String Pro = (String) tableModelL.getValueAt(i, 3);
             String Status = (String) tableModelL.getValueAt(i, 4);
            
            String sql = "update borrowde set ConfirmEm = 'Received' where IDEm = '"+ID+"' and Status = '"+Status+"' and FullName = '"+FN+"' and Project = '"+Pro+"' ";
            String sql2 = "update borrowde2 set ConfirmEm = 'Received' where IDEm = '"+ID+"' and Status = '"+Status+"' and FullName = '"+FN+"' and Project = '"+Pro+"' ";
            s.executeUpdate(sql);
            s.executeUpdate(sql2);
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbM = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConfirm = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnReload = new javax.swing.JButton();
        cbbSelect = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(193, 218, 193));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Borrow list and confirm");

        lbM.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbM.setForeground(new java.awt.Color(255, 0, 0));
        lbM.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbM)
                .addGap(134, 134, 134))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addComponent(lbM))
        );

        tblConfirm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblConfirmMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblConfirm);

        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblList);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 255));
        jLabel3.setText("Confirm borrow");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 255));
        jLabel4.setText("Borrow list");

        txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchFocusGained(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(51, 0, 255));
        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnReload.setBackground(new java.awt.Color(51, 0, 255));
        btnReload.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReload.setForeground(new java.awt.Color(255, 255, 255));
        btnReload.setText("Reload");
        btnReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadActionPerformed(evt);
            }
        });

        cbbSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Full Name", "ID", "Borrow devices", "Project", "Confirm borrow", "Type" }));
        cbbSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addGap(68, 68, 68)
                        .addComponent(cbbSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReload)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearch)
                        .addComponent(btnReload))
                    .addComponent(jLabel4)
                    .addComponent(cbbSelect))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
       ClearList();
       loadTableListW();
       loadTableListR();
       cbbSelect.setSelectedIndex(0);
       txtSearch.setText(null);
//       txtSearch.setEnabled(false);
//       btnSearch.setEnabled(false);
    }//GEN-LAST:event_btnReloadActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if(txtSearch.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Search data is not empty!");
        }else{
            ClearList();
            Search();
            int Count = tblList.getRowCount();
            if(Count == 0){
                JOptionPane.showMessageDialog(null, "Don't search this database!");
                ClearList();
            }else{
                ClearList();
                Search();
                JOptionPane.showMessageDialog(null, "Search success!");
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed
    
    private String ID(){
         String ID = null;
        try {
            con = Connect.connect();
            
            Statement s = con.createStatement();
            String Search = txtSearch.getText();
            String sql = null;
            int i = tblConfirm.getSelectedRow();
            String name = (String) tableModel.getValueAt(i, 0);
            String IDEm = (String) tableModel.getValueAt(i, 1);
            String Status = (String) tableModel.getValueAt(i, 4);
            int Quan =  (int) tableModel.getValueAt(i, 5);
           
            sql = "select IDUS from borrowde where FullName = '"+name+"' and IDEm = '"+IDEm+"' and Status = '"+Status+"' and QuantityEm = '"+Quan+"' and ConfirmEm = 'Pending' ";
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                ID = rs.getString("IDUS");
            }
            
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    return ID;
    }
    private String Email(){
        String Email = null;
        try {
            con = Connect.connect();
            
            Statement s = con.createStatement();
            String sql = null;
            sql = "select Email from infomem where ID = '"+ID()+"'";
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                Email = rs.getString("Email");
            }
            
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    return Email;
    }
    InfoMail infoMail;
    private void sendMailYes(){
        int i = tblConfirm.getSelectedRow();
        String name = (String) tableModel.getValueAt(i, 2);
        String IDEm = (String) tableModel.getValueAt(i, 1);
        String Status = (String) tableModel.getValueAt(i, 4);
        int Quan =  (int) tableModel.getValueAt(i, 5);
        String body = "You have successfully borrowed  devices "+name+" in quantity is "+Quan+" and status "+Status+" \n You can come here to receive devices!";
        System.out.println("Sending...");
        String Account = "longb1400767@gmail.com"; // nhap dia chi server vo
        String pass = "Tranbalong1"; // nhap mat khau vo
        infoMail = new InfoMail(Account, pass, "Borrow devices", body, Email());
        infoMail.Send();
    }
    
    private void sendMailNo(){
        int i = tblConfirm.getSelectedRow();
        String name = (String) tableModel.getValueAt(i, 2);
        String IDEm = (String) tableModel.getValueAt(i, 1);
        String Status = (String) tableModel.getValueAt(i, 4);
        int Quan =  (int) tableModel.getValueAt(i, 5);
        String body = "Your devices is not confrimed. \n "+name+", "+Status+", "+Quan+" ";
        System.out.println("Sending...");
        String Account = "longb1400767@gmail.com"; // nhap dia chi server vo
        String pass = "Tranbalong1"; // nhap mat khau vo
        infoMail = new InfoMail(Account, pass, "Borrow devices", body, Email());
        infoMail.Send();
    }
    
    private void tblConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConfirmMouseClicked
        int n = JOptionPane.showConfirmDialog(null,"Borrow cofirmation?","?",JOptionPane.YES_NO_CANCEL_OPTION);
        if(n == JOptionPane.YES_OPTION){
            sendMailYes();
            Wait();
            ClearConfirm();
            loadTableConfirm();
            ClearList();
            loadTableListW();
            loadTableListR();
            
            M();
        }else if(n == JOptionPane.NO_OPTION){
            sendMailNo();
            No();
            ClearConfirm();
            loadTableConfirm();
           
            M();
        }else
            return;
       
    }//GEN-LAST:event_tblConfirmMouseClicked

    private void cbbSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbSelectActionPerformed
//        switch (cbbSelect.getSelectedIndex()) {
//            case 1:
//                txtSearch.setEnabled(true);
//                btnSearch.setEnabled(true);
//                break;
//            case 2:
//                txtSearch.setEnabled(true);
//                btnSearch.setEnabled(true);
//                break;
//            case 3:
//                txtSearch.setEnabled(true);
//                btnSearch.setEnabled(true);
//                break;
//            case 4:
//                txtSearch.setEnabled(true);
//                btnSearch.setEnabled(true);
//                break;
//            case 5:
//                txtSearch.setEnabled(true);
//                btnSearch.setEnabled(true);
//                break;
//            case 0:
//                txtSearch.setEnabled(false);
//                btnSearch.setEnabled(false);
//                break;
//            default:
//                break;
//        }
        
    }//GEN-LAST:event_cbbSelectActionPerformed

    private void txtSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusGained
        txtSearch.setText(null);
        ClearList();
        loadTableListW();
        loadTableListR();
    }//GEN-LAST:event_txtSearchFocusGained

    private void tblListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListMouseClicked
        
        con = Connect.connect();
        int i =  tblList.getSelectedRow();
        String Confirm = (String) tableModelL.getValueAt(i, 7);
        if(!Confirm.equals("Received")){
            int n = JOptionPane.showConfirmDialog(null,"Borrow cofirmation?","?",JOptionPane.YES_NO_OPTION);
            if(n == JOptionPane.YES_OPTION){
            Received();
            ClearList();
            loadTableListW();
            loadTableListR();
        }else
            return;
        }
       
    }//GEN-LAST:event_tblListMouseClicked
    
    private DefaultTableModel tableModel = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column)
        {
            return false;
        }
    };
    
    private DefaultTableModel tableModelL = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column)
        {
            return false;
        }
    };
    
    private Connection con = null;
    
    private void ClearConfirm(){
        int count = tblConfirm.getRowCount();
        try{
        while (count > 0 ){
            tableModel.removeRow(0);
        }
        }catch(java.lang.ArrayIndexOutOfBoundsException e){
            e.getMessage();
        }
    }
    
    private void ClearList(){
        int count = tblList.getRowCount();
        try{
        while (count > 0 ){
            tableModelL.removeRow(0);
        }
        }catch(java.lang.ArrayIndexOutOfBoundsException e){
            e.getMessage();
        }
    }
    
    private void loadTableConfirm(){
         try {
            con = Connect.connect();
            
            Statement s = con.createStatement();
            
            ResultSet rs = s.executeQuery("SELECT * FROM borrowde where ConfirmEm = 'Pending'");
            String []colsName = {"Full name", "ID","Borrow devices","Project","Status","Quantity","Type","Confirm borrow"};
            tableModel.setColumnIdentifiers(colsName); 
            tblConfirm.setModel(tableModel);
            while(rs.next()){ 
                Object rows[] = new Object[8];
                rows[0] = rs.getString(3);
                rows[1] = rs.getString(1);  
                rows[2] = rs.getString(2);
                rows[3] = rs.getString(4);
                rows[4] = rs.getString(5);
                rows[5] = rs.getInt(6);
                rows[6] = rs.getString(8);
                rows[7] = rs.getString(7);
                tableModel.addRow(rows);
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

     private void loadTableListW(){
         try {
            con = Connect.connect();
            
            Statement s = con.createStatement();
            
            ResultSet rs = s.executeQuery("SELECT * FROM BorrowDe where ConfirmEm = 'Wait to Receive'");
            String []colsName = {"Full name", "ID","Borrow devices","Project","Status","Quantity","Type","Confirm borrow"};
            tableModelL.setColumnIdentifiers(colsName); 
            tblList.setModel(tableModelL);
            while(rs.next()){ 
                String Quan = String.valueOf(rs.getInt(6));
                Object rows[] = new Object[8];
                rows[0] = rs.getString(3);
                rows[1] = rs.getString(1);  
                rows[2] = rs.getString(2);
                rows[3] = rs.getString(4);
                rows[4] = rs.getString(5);
                rows[5] = Quan;
                rows[6] = rs.getString(8);
                rows[7] = rs.getString(7);
                tableModelL.addRow(rows);
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
     
      private void loadTableListR(){
         try {
            con = Connect.connect();
            
            Statement s = con.createStatement();
            
            ResultSet rs = s.executeQuery("SELECT * FROM BorrowDe where ConfirmEm = 'Received'");
            tblList.setModel(tableModelL);
            while(rs.next()){ 
                Object rows[] = new Object[8];
                String Quan = String.valueOf(rs.getInt(6));
                rows[0] = rs.getString(3);
                rows[1] = rs.getString(1);  
                rows[2] = rs.getString(2);
                rows[3] = rs.getString(4);
                rows[4] = rs.getString(5);
                rows[5] = Quan;
                rows[6] = rs.getString(8);
                rows[7] = rs.getString(7);
                tableModelL.addRow(rows);
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
      private int Count(){
         int c = 0;
        return c = tblConfirm.getRowCount();
        }
      private void M(){
        if(Count() == 0 ){
            lbM.setForeground(Color.blue);
            lbM.setText("0 request for confirmation");
        }else{
            lbM.setText(Count() + " request for confirmation");
        }
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReload;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbbSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbM;
    private javax.swing.JTable tblConfirm;
    private javax.swing.JTable tblList;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
