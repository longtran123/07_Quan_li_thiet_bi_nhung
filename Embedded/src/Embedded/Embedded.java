/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Embedded;

import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author LongTran
 */
public class Embedded extends javax.swing.JPanel {

    /**
     * Creates new form Embedded
     */
    public Embedded() {
        initComponents();
        Clear();
        loadTable();
        btnSave.setEnabled(false);
        loadCBB();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEm = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFun = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtQuan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbbType = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(193, 218, 193));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Embedded devices");

        btnSearch.setBackground(new java.awt.Color(255, 153, 0));
        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));
        txtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(238, 238, 238)
                .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(btnSearch)
                .addGap(72, 72, 72))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tblEm.setModel(new javax.swing.table.DefaultTableModel(
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
        tblEm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEm);

        btnAdd.setBackground(new java.awt.Color(255, 153, 51));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(255, 153, 51));
        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 153, 51));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(255, 153, 51));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 153, 51));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Function");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Quantity");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Type");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                    .addComponent(txtName)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addComponent(jLabel6))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFun)
                                    .addComponent(txtQuan)
                                    .addComponent(cbbType, 0, 275, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFun, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbbType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private DefaultTableModel tableModel = new DefaultTableModel(){

        @Override
        public boolean isCellEditable(int row, int column)
        {
            return false;
        }
         
    };
    

     
    
    private Connection con = null;
    private void loadTable(){
         try {
            con = Connect.connect();
            
            Statement s = con.createStatement();
            
            ResultSet rs = s.executeQuery("SELECT * FROM embedded");
            String []colsName = {"ID", "Name","Function","Status","Quantity","Type"};
            tableModel.setColumnIdentifiers(colsName); 
            tblEm.setModel(tableModel);
            while(rs.next()){ 
                Object rows[] = new Object[6];
                rows[0] = rs.getString(1);
                rows[1] = rs.getString(2);  
                rows[2] = rs.getString(3);
                rows[3] = rs.getString(4);
                rows[4] = rs.getString(5);
                rows[5] = rs.getString(6);
                tableModel.addRow(rows);
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void Clear(){
        int dem = tblEm.getRowCount();
        try{
        while (dem > 0 ){
            tableModel.removeRow(0);
        }
        }catch(java.lang.ArrayIndexOutOfBoundsException e){
            e.getMessage();
        }
    }
    
    private void loadText(){
         try {
           con = Connect.connect();
            Statement st = con.createStatement();
            
            int i =  tblEm.getSelectedRow();
                Object ID = tableModel.getValueAt(i, 0);
                Object Name = tableModel.getValueAt(i, 1);
                Object Fun = tableModel.getValueAt(i, 2);
                Object Quan = tableModel.getValueAt(i, 4);
                Object Type = tableModel.getValueAt(i, 5);
                txtID.setText((String) ID);
                txtName.setText((String) Name);
                txtFun.setText((String) Fun);
                txtQuan.setText((String) Quan);
                cbbType.setSelectedItem(Type);
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
     }
    
    private void textNull(){
        txtFun.setText("");
        txtID.setText("");
        txtName.setText("");
        txtQuan.setText("");
    }
    
    private void Add(){
           try {
           con = Connect.connect();
            Statement st = con.createStatement();
            String ID = txtID.getText();
            String Name = txtName.getText();
            String Quan = txtQuan.getText();
            String Fun = txtFun.getText();
            String Type = (String) cbbType.getSelectedItem();
           
            String em = "insert into Embedded  values('"+ID+"','"+Name+"','"+Fun+"','Good',"+Quan+",'"+Type+"')";
            st.executeUpdate(em);
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
     
      }
    
    private void Edit(){
         try {
            con = Connect.connect();
            Statement st = con.createStatement();
            String ID = txtID.getText();
            String Name = txtName.getText();
            String Quan = txtQuan.getText();
            String Fun = txtFun.getText();
            String Type = (String) cbbType.getSelectedItem();
            String Em = "Update embedded set NameEm = '"+Name+"',FunctionEm = '"+Fun+"', QuantityEm = "+Quan+", Type = '"+Type+"' where IDEm = '"+ID+"'";
            st.executeUpdate(Em);
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
     }
    
    private void Delete(){
          try {
            con = Connect.connect();
            Statement st = con.createStatement();
            String ID = txtID.getText();
            String Name = txtName.getText();
            int i =  tblEm.getSelectedRow();
                Object Status = tableModel.getValueAt(i, 3);
            String Em = "Delete from embedded where IDEm ='"+ID+"' and NameEm = '"+Name+"' and StatusEm = '"+Status+"'";
            st.executeUpdate(Em);
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
     }
    
    private void Search(){
         try {
           con = Connect.connect();
            Statement s = con.createStatement();
            String Search = txtSearch.getText();
            String sql = "SELECT * FROM `embedded` where `IDEm` Like '%"+Search+"%' or `NameEm` Like '%"+Search+"%' or `FunctionEm` Like '%"+Search+"%'or `QuantityEm` = '"+Search+"' or `Type` Like '%"+Search+"%'";
            ResultSet rs = s.executeQuery(sql);
            while(rs.next()){ 
                Object rows[] = new Object[6];
                rows[0] = rs.getString(1);
                rows[1] = rs.getString(2);  
                rows[2] = rs.getString(3);
                rows[3] = rs.getString(4);
                rows[4] = rs.getInt(5);
                rows[5] = rs.getString(6);
                tableModel.addRow(rows);
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
     }
    
    private void loadCBB(){
        try {
           con = Connect.connect();
            Statement s = con.createStatement();
          
            String sql = "SELECT * FROM Type";
            ResultSet rs = s.executeQuery(sql);
            cbbType.removeAllItems();
            while(rs.next()){ 
               
               cbbType.addItem(rs.getString(2));
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
     }
    
    
    private int check = 0;
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        check = 2;
        btnAdd.setEnabled(false);
        btnDelete.setEnabled(false);
        btnSave.setEnabled(true);
        txtID.setEnabled(false);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        check = 1;
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
        btnSave.setEnabled(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        check = 3;
        btnEdit.setEnabled(false);
        btnAdd.setEnabled(false);
        btnSave.setEnabled(true);
        txtFun.setEnabled(false);
        txtID.setEnabled(false);
        txtName.setEnabled(false);
        txtQuan.setEnabled(false);
        cbbType.setEnabled(false);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private ResultSet rs = null;
    private PreparedStatement pst = null;
    String regix = "^[0-9]+$";
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(check == 1){
            if(txtID.getText().equals("")){
                JOptionPane.showMessageDialog(null, "ID not empty!");
            }else if(txtName.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Name not empty!");
            }else if(txtFun.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Function not empty!");
            }else if(txtQuan.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Quantity not empty!");
            }else{
                String sql = "select * from embedded where IDEm = ?";
                try{
                    //**************//
                   con = Connect.connect();
                   pst = con.prepareStatement(sql);
                   pst.setString(1,txtID.getText());

                   rs = pst.executeQuery();
                   if(rs.next()){
                       JOptionPane.showMessageDialog(null, "ID duplicate!");
                   }else{
                       if(txtQuan.getText().matches(regix)){
                        Add();
                        Clear();
                        loadTable();
                        textNull();
                        JOptionPane.showMessageDialog(null, "Add database success!");
                       }
                       else{
                          JOptionPane.showMessageDialog(null, "Quantity must be a number!"); 
                       }
                   }
               } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Connect database fail!! :(");
                }
          }
       }else if(check == 2){
           if(txtName.getText().equals("")){
                 JOptionPane.showMessageDialog(null, "Name not empty!");
           } else if(txtFun.getText().equals("")){
                 JOptionPane.showMessageDialog(null, "Function not empty!");
           } else if(txtQuan.getText().equals("")){
                 JOptionPane.showMessageDialog(null, "Quantity not empty!");
           }else {
            Edit();
            Clear();
            loadTable();
            textNull();
             JOptionPane.showMessageDialog(null, "Edit database success!");
           }
        }else if(check == 3){
            if(txtID.getText().equals("")){
                JOptionPane.showMessageDialog(null, "You need select the row!");
            }else{
            int n = JOptionPane.showConfirmDialog(null,"Do you want delete?","ADVERTISE",JOptionPane.YES_NO_OPTION);
            
            if(n == JOptionPane.YES_OPTION){
            
                        Delete();
                        Clear();
                        loadTable();
                        textNull();
                        JOptionPane.showMessageDialog(null, "Delete database success!");
            }else {
            return;
            }
          }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        btnEdit.setEnabled(true);
        btnDelete.setEnabled(true);
        btnSave.setEnabled(false);
        btnAdd.setEnabled(true);
        textNull();
        txtFun.setEnabled(true);
        txtID.setEnabled(true);
        txtName.setEnabled(true);
        txtQuan.setEnabled(true);
        cbbType.setEnabled(true);
        txtSearch.setText(null);
        Clear();
        loadTable();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void tblEmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmMouseClicked
        loadText();
    }//GEN-LAST:event_tblEmMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       if(txtSearch.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Search not empty!");
       }else{
            Clear();
                    Search();
                    int Count = tblEm.getRowCount();
                    if(Count == 0){
                        JOptionPane.showMessageDialog(null, "Don't search this database!");
                        Clear();
                    }else{
                        Clear();
                        Search();
                        JOptionPane.showMessageDialog(null, "Search success!");
                   }
       }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseClicked
       Clear();
       loadTable();
       txtSearch.setText(null);
    }//GEN-LAST:event_txtSearchMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbbType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEm;
    private javax.swing.JTextField txtFun;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtQuan;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void setText(String aStr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
