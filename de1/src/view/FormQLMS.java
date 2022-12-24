/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import controller.IOFile;
import controller.SoException;
import controller.TrongException;
import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import model.QLMS;
import model.BanDoc;
import model.Sach;


public class FormQLMS extends javax.swing.JPanel {

    DefaultTableModel d;
    String file = "src/controller/QLMS.dat";
    private boolean them, sua;
    private List<QLMS> list = new ArrayList<>();
    public FormQLMS() {
        initComponents();
        setSize(900, 850);
        String [] cols = {"Ma ban doc ", "Ten ban doc ", "Ma sach" , "So luong "
                , "Ngay muon "};
        d = new DefaultTableModel(cols, 0);
        jTable1.setModel(d);
        loadData();
        loadMa();
        buttonTrue();
        them = false;
        sua = false;
    }
    
    public void loadData()
    {
        File f = new File(file);
        if(f.exists())
            list = IOFile.doc(file);
        else
            IOFile.viet(file, list);
        d.setRowCount(0);
        for(QLMS i : list)
        {
            d.addRow(i.toObject());
        }
    }

    public void buttonTrue()
    {
        buttonThem.setEnabled(true);
        buttonSua.setEnabled(true);
        buttonCapNhat.setEnabled(false);
        buttonBoQua.setEnabled(false);
    }
    
    public void buttonFalse()
    {
        buttonThem.setEnabled(false);
        buttonSua.setEnabled(false);
        buttonCapNhat.setEnabled(true);
        buttonBoQua.setEnabled(true);
    }
    
    private void loadMa()
    {
        List <BanDoc> list1 = IOFile.doc("src/controller/BANDOC.dat");
        List <Sach> list2 = IOFile.doc("src/controller/SACH.dat");
        jComboBox1.removeAllItems();
        jComboBox2.removeAllItems();
        jComboBox4.removeAllItems();
        for(BanDoc i : list1)
        {
            jComboBox1.addItem(i.getId() + "");
            jComboBox4.addItem(i.getTen()+ "");
        }
        for(Sach i : list2)
        {
            jComboBox2.addItem(i.getId() + "");
        }
    }
    
    private boolean ktTrung(int ma1, int ma2)
    {
        for(QLMS i : list)
        {
            if(ma1 == i.getB().getId() && ma2 == i.getS().getId())
                return false;
        }
        return true;
    }
    
    private boolean ktSachMax(int ma)
    {
        int count = 0;
        for(QLMS i : list)
            if(i.getB().getId() == ma)
                count++;
        return count <= 4 ;
    }
    
    private boolean ktSoSach(int soLuong, int ma)
    {
        return soLuong <= getSach(ma).getSoLuong();
    }
    
    private void updateSoLuong(int soLuong, int ma)
    {
        List <Sach> list2 = IOFile.doc("src/controller/SACH.dat");
        for(Sach i : list2)
        {
            if(ma == i.getId())
            {
                i.setSoLuong(i.getSoLuong() - soLuong);
                break;
            }
        }
        IOFile.viet("src/controller/SACH.dat", list2);
    }
    
    private Sach getSach(int ma)
    {
        List <Sach> list2 = IOFile.doc("src/controller/SACH.dat");
        for(Sach i : list2)
        {
            if(ma == i.getId())
            {
                return i;
            }
        }
        return null;
    }
    
    private BanDoc getBanDoc(int ma)
    {
        List <BanDoc> list2 = IOFile.doc("src/controller/BANDOC.dat");
        for(BanDoc i : list2)
        {
            if(ma == i.getId())
            {
                return i;
            }
        }
        return null;
    }
    
    private void sortTen()
    {
        Collections.sort(list, new Comparator<QLMS>(){
            @Override
            public int compare(QLMS q1, QLMS q2)
                {
                    String t1 = q1.getB().getTen();
                    String t2 = q2.getB().getTen();
                    String ten1 = t1.substring(t1.lastIndexOf(" ") + 1) + t1;
                    String ten2 = t2.substring(t1.lastIndexOf(" ") + 1) + t2;
                    return ten1.compareToIgnoreCase(ten2);
                }
        });
        IOFile.viet(file, list);
    }
    
    private void sortSoLuong()
    {
        Collections.sort(list, new Comparator<QLMS>(){
            @Override
            public int compare(QLMS q1, QLMS q2)
                {
                   return q1.getSoLuong() - q2.getSoLuong();
                }
        });
        IOFile.viet(file, list);
    }
    
    private void sortSoLuongTheoTanSuat()
    {
        
    }
    
    private void sortThoiGian()
    {
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        buttonThem = new javax.swing.JButton();
        buttonSua = new javax.swing.JButton();
        buttonXoa = new javax.swing.JButton();
        buttonCapNhat = new javax.swing.JButton();
        buttonGhiFile = new javax.swing.JButton();
        buttonBoQua = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox5 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        buttonThem.setText("Them");
        buttonThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonThemActionPerformed(evt);
            }
        });

        buttonSua.setText("Sua");
        buttonSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSuaActionPerformed(evt);
            }
        });

        buttonXoa.setText("Xoa");
        buttonXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonXoaActionPerformed(evt);
            }
        });

        buttonCapNhat.setText("Cap nhat");
        buttonCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCapNhatActionPerformed(evt);
            }
        });

        buttonGhiFile.setText("Ghi ra File");
        buttonGhiFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhiFileActionPerformed(evt);
            }
        });

        buttonBoQua.setText("Bo qua");
        buttonBoQua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBoQuaActionPerformed(evt);
            }
        });

        jButton4.setText("Sap xep");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Theo ten");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Theo so luong muon");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Theo ngay muon");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonGhiFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonBoQua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addComponent(jButton4)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonThem)
                    .addComponent(buttonXoa)
                    .addComponent(buttonGhiFile)
                    .addComponent(jButton4)
                    .addComponent(jRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSua)
                    .addComponent(buttonCapNhat)
                    .addComponent(buttonBoQua)
                    .addComponent(jRadioButton3))
                .addContainerGap())
        );

        jLabel1.setText("Ma ban doc: ");

        jLabel2.setText("Ma sach: ");

        jLabel3.setText("So luong: ");

        jLabel4.setText("Ngay muon: ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextField2.setEditable(false);
        jTextField2.setText("jTextField5");

        jButton1.setText("Lam moi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Chon ma: ");

        jLabel6.setText("Chon ma ban doc: ");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextField3.setText("jTextField6");

        jButton2.setText("Tim kiem");

        jButton3.setText("Tim kiem");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sap xep theo ten", "Sap xep theo ngay muon", "Sap xep theo so luong muon" }));

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4))
                            .addGap(56, 56, 56)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                .addComponent(jTextField1)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jComboBox4, 0, 135, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton2))
                                .addComponent(jTextField3))))
                    .addComponent(jButton3)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(30, 30, 30)
                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 77, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 39, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThemActionPerformed
        them = true;
        buttonFalse();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String ngay = sdf.format(new Date());
        jTextField2.setText(ngay);
    }//GEN-LAST:event_buttonThemActionPerformed

    private void buttonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonXoaActionPerformed
        int row = jTable1.getSelectedRow();
        if(row < 0 || row > jTable1.getRowCount() - 1)
            JOptionPane.showMessageDialog(this, "Chon dong trong bang! ");
        else
        {
            d.removeRow(row);
            list.remove(row);
        }
    }//GEN-LAST:event_buttonXoaActionPerformed

    private void buttonSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSuaActionPerformed
        int row = jTable1.getSelectedRow();
        if(row < 0 || row > jTable1.getRowCount() - 1)
            JOptionPane.showMessageDialog(this, "Chon dong trong bang! ");
        else
        {
            sua = true;
            buttonFalse();
            jTextField3.requestFocus();
        }
    }//GEN-LAST:event_buttonSuaActionPerformed

    private void buttonCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCapNhatActionPerformed
        
        int maBanDoc = Integer.parseInt(jComboBox1.getSelectedItem().toString());
        int maSach = Integer.parseInt(jComboBox2.getSelectedItem().toString());
        if(them && ktSachMax(maBanDoc))
        {
            if(ktTrung(maBanDoc, maSach))
            {
                them = false;
                buttonTrue();
                int soLuong = Integer.parseInt(jTextField1.getText()
                        .toString());
                if(ktSoSach(soLuong, maSach))
                    updateSoLuong(soLuong, maSach);
                String tgian = jTextField2.getText();
                QLMS qlms = new QLMS(getBanDoc(maBanDoc), getSach(maSach), soLuong, tgian);
                d.addRow(qlms.toObject());
                list.add(qlms);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Da ton tai! ");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Qua so luong sach muon! ");
        }
//        if(sua)
//        {
//            sua = false;
//            try {
//                int row = jTable1.getSelectedRow();
//                int id = Integer.parseInt(jTextField1.getText());
//                String ten = jTextField2.getText();
//                if(ten.isEmpty())
//                    throw new TrongException();
//                String dChi = jTextField3.getText();
//                String sdt = jTextField4.getText();
//                if(dChi.isEmpty() || sdt.isEmpty())
//                    throw new TrongException();
//                if(!sdt.matches("^\\d+"))
//                    throw new SoException();
//                BanDoc temp = new BanDoc(id, ten, dChi, sdt);
//                d.setValueAt(id, row, 0);
//                d.setValueAt(ten, row, 1);
//                d.setValueAt(dChi, row, 2);
//                d.setValueAt(sdt, row, 3);
//                list.set(row, temp);
//            } catch (TrongException ex) {
//                JOptionPane.showMessageDialog(this, "Khong duoc de trong! ");
//            } catch (SoException ex) {
//                JOptionPane.showMessageDialog(this, "Phai nhap so! ");
//            }
//        }
        buttonTrue();
    }//GEN-LAST:event_buttonCapNhatActionPerformed

    private void buttonBoQuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBoQuaActionPerformed
        if(them)
        {
            them = false;
            buttonTrue();
        }
        if(sua)
        {
            sua = false;
            buttonTrue();
        }
    }//GEN-LAST:event_buttonBoQuaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        jComboBox1.setSelectedItem(d.getValueAt(row, 0).toString());
        jComboBox2.setSelectedItem(d.getValueAt(row, 2).toString());
        jTextField1.setText(d.getValueAt(row, 3).toString());
        jTextField2.setText(d.getValueAt(row, 4).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void buttonGhiFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhiFileActionPerformed
        IOFile.viet(file, list);
    }//GEN-LAST:event_buttonGhiFileActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(jRadioButton1.isSelected())
        {
            sortTen();
        }
        if(jRadioButton2.isSelected())
        {
            sortSoLuong();
        }
        if(jRadioButton3.isSelected())
        {
            sortThoiGian();
        }
        d.setRowCount(0);
        list = IOFile.doc(file);
        for(QLMS i : list)
        {
            d.addRow(i.toObject());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loadMa();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBoQua;
    private javax.swing.JButton buttonCapNhat;
    private javax.swing.JButton buttonGhiFile;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonSua;
    private javax.swing.JButton buttonThem;
    private javax.swing.JButton buttonXoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
