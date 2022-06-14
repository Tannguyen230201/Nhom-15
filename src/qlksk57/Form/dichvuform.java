/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlksk57.Form;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import qlksk57.DichVu;
import static qlksk57.MyConnection.getConnection;

/**
 *
 * @author khoa
 */


public class dichvuform extends javax.swing.JFrame {

    /**
     * Creates new form dichvuform
     */
    public dichvuform() {
        initComponents();
        getConnection();
        hienThiDanhSachDichVu();
        setTitle("Quản lý dịch vụ");
    }
    Connection con= null;
    Statement st= null;
    
        public ArrayList<DichVu> layDanhSachDichVu() {
        ArrayList<DichVu> dsdv = new ArrayList<DichVu>();
        Connection con = getConnection();
        try {
            st = (Statement) con.createStatement();
            String sql = "SELECT * FROM dichvu";
            // Thưcj thi câu lệnh truy vấn
            ResultSet rs = st.executeQuery(sql);

            DichVu dv;
            while (rs.next()) {
                dv = new DichVu(rs.getString("MADV"), rs.getString("TENDV"), rs.getDouble("GIADV") );

                //Thêm vào danh sách
                dsdv.add(dv);
            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return dsdv;
    }
    public void hienThiDanhSachDichVu() {
        String colTieuDe1[] = new String[]{"Mã Dịch Vụ", "Tên Dịch Vụ", "Giá Dịch Vụ"};
        ArrayList<DichVu> dsdv = layDanhSachDichVu();

        DefaultTableModel model = new DefaultTableModel(colTieuDe1, 0);

        Object[] row;

        for (int i = 0; i < dsdv.size(); i++) {

            row = new Object[3];

            // GÁN GIÁ TRỊ
            row[0] = dsdv.get(i).getMADV();
            row[1] = dsdv.get(i).getTENNVL();
            row[2] = dsdv.get(i).getGIADV();

            model.addRow(row);
        }
        
        //    }catch(ArrayIndexOutOfBoundsException ex){

        jTableDichvu.setModel(model);

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldMADV = new javax.swing.JTextField();
        jTextFieldTENDV = new javax.swing.JTextField();
        jTextFieldGIADV = new javax.swing.JTextField();
        them2 = new javax.swing.JButton();
        sua2 = new javax.swing.JButton();
        xoa2 = new javax.swing.JButton();
        thoat2 = new javax.swing.JButton();
        jButtonclear1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableDichvu = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setToolTipText("Quản lý dịch vụ");
        jPanel7.setName("Quản lý dịch vụ"); // NOI18N

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setBackground(new java.awt.Color(0, 0, 255));
        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setText("Danh Sách Dịch Vụ");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        jLabel19.setText("Mã dịch vụ:");

        jLabel20.setText("Tên dịch vụ:");

        jLabel21.setText("Giá dịch vụ:");

        jTextFieldMADV.setMinimumSize(new java.awt.Dimension(120, 25));
        jTextFieldMADV.setPreferredSize(new java.awt.Dimension(120, 25));

        jTextFieldTENDV.setPreferredSize(new java.awt.Dimension(120, 25));

        jTextFieldGIADV.setPreferredSize(new java.awt.Dimension(120, 25));

        them2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlksk57/Form/hinh/THEM.png"))); // NOI18N
        them2.setText("Thêm");
        them2.setMaximumSize(new java.awt.Dimension(80, 25));
        them2.setMinimumSize(new java.awt.Dimension(80, 25));
        them2.setPreferredSize(new java.awt.Dimension(80, 25));
        them2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                them2ActionPerformed(evt);
            }
        });

        sua2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlksk57/Form/hinh/SUA.png"))); // NOI18N
        sua2.setText("Sửa");
        sua2.setMaximumSize(new java.awt.Dimension(80, 25));
        sua2.setMinimumSize(new java.awt.Dimension(80, 25));
        sua2.setPreferredSize(new java.awt.Dimension(80, 25));
        sua2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sua2ActionPerformed(evt);
            }
        });

        xoa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlksk57/Form/hinh/XOA.png"))); // NOI18N
        xoa2.setText("Xóa");
        xoa2.setMaximumSize(new java.awt.Dimension(80, 25));
        xoa2.setMinimumSize(new java.awt.Dimension(80, 25));
        xoa2.setPreferredSize(new java.awt.Dimension(80, 25));
        xoa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoa2ActionPerformed(evt);
            }
        });

        thoat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlksk57/Form/hinh/THOAT.png"))); // NOI18N
        thoat2.setText("Thoát");
        thoat2.setMaximumSize(new java.awt.Dimension(80, 25));
        thoat2.setMinimumSize(new java.awt.Dimension(80, 25));
        thoat2.setPreferredSize(new java.awt.Dimension(80, 25));
        thoat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoat2ActionPerformed(evt);
            }
        });

        jButtonclear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlksk57/Form/hinh/CLEAR.png"))); // NOI18N
        jButtonclear1.setText("Clear");
        jButtonclear1.setMaximumSize(new java.awt.Dimension(80, 25));
        jButtonclear1.setMinimumSize(new java.awt.Dimension(80, 25));
        jButtonclear1.setPreferredSize(new java.awt.Dimension(80, 25));
        jButtonclear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonclear1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel21)
                                .addComponent(jLabel20)
                                .addComponent(jLabel19))
                            .addComponent(them2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldMADV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldTENDV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldGIADV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(sua2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(xoa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                        .addComponent(jButtonclear1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(thoat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMADV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTENDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextFieldGIADV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(them2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sua2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xoa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thoat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonclear1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTableDichvu.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableDichvu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDichvuMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableDichvu);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jMenu1.setText("Chức năng");

        jMenuItem1.setText("Quản lý hoá đơn");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Quản lý khách hàng");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Quản lý nhân viên");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Quản lý phòng");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Thông tin");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Thoát");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel7.getAccessibleContext().setAccessibleName("Quản lý dịch vụ");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableDichvuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDichvuMouseClicked
        // TODO add your handling code here
        int i = jTableDichvu.getSelectedRow();
        TableModel model = jTableDichvu.getModel();
        jTextFieldMADV.setText(model.getValueAt(i, 0).toString());
        jTextFieldTENDV.setText(model.getValueAt(i, 1).toString());
        jTextFieldGIADV.setText(model.getValueAt(i, 2).toString());
    }//GEN-LAST:event_jTableDichvuMouseClicked

    private void jButtonclear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonclear1ActionPerformed
        // TODO add your handling code here:
        jTextFieldMADV.setText("");
        jTextFieldTENDV.setText("");
        jTextFieldGIADV.setText("");
        jTextFieldMADV.requestFocus();
    }//GEN-LAST:event_jButtonclear1ActionPerformed

    private void thoat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoat2ActionPerformed
        // TODO add your handling code here:
        thoat2.setToolTipText("Click để thoát chương trình ");
        int selected = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn thoát chương"
            + " trình không", "Thông báo", JOptionPane.YES_NO_CANCEL_OPTION);
        if (selected == JOptionPane.YES_NO_OPTION) {
            this.dispose();

        }
    }//GEN-LAST:event_thoat2ActionPerformed

    private void xoa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoa2ActionPerformed
        // TODO add your handling code here:
        Connection con = getConnection();
        try {
            // Tạo một đối tượng để thực hiện công việc
            st = (Statement) con.createStatement();
            String query = "DELETE FROM dichvu WHERE MADV = '" + jTextFieldMADV.getText() + "'";
            st.executeUpdate(query);
            hienThiDanhSachDichVu();

        } catch (Exception ex) {

            ex.printStackTrace();
        }
    }//GEN-LAST:event_xoa2ActionPerformed

    private void sua2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sua2ActionPerformed
        // TODO add your handling code here:
        Connection con = getConnection();
        if (jTableDichvu.getSelectedRow()== -1) {
            if (jTableDichvu.getRowCount()== 0) {
                // lblError.setText("Table is empty");
            }
            else{
                //  lblError.setText("You must select a Tennis Player");
            }
        }
        else{
            DefaultTableModel model = (DefaultTableModel) jTableDichvu.getModel();
            model.setValueAt(jTextFieldMADV.getText(), jTableDichvu.getSelectedRow(), 0);
            model.setValueAt(jTextFieldTENDV.getText(), jTableDichvu.getSelectedRow(), 1);
            model.setValueAt(jTextFieldGIADV.getText(), jTableDichvu.getSelectedRow(), 2);
            try {
             //Tạo một đối tượng để thực hiện công việc
            st = (Statement) con.createStatement();
            String query = "UPDATE DICHVU "
                    + "SET TENDV = '"+ jTextFieldTENDV.getText() +"' , GIADV = '" + jTextFieldGIADV.getText() + "' "
                    + "WHERE MADV = '"+ jTextFieldMADV.getText() +"' ,";

            st.execute(query);
            hienThiDanhSachDichVu();

        } catch (SQLException ex) {
        }
        }
    }//GEN-LAST:event_sua2ActionPerformed

    private void them2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_them2ActionPerformed
        // TODO add your handling code here:
        Connection con = getConnection();
        try {
            // Tạo một đối tượng để thực hiện công việc
            st = (Statement) con.createStatement();
            String query = "INSERT INTO DichVu(MADV,TENDV, GIADV) VALUES('" + jTextFieldMADV.getText() + "',"
            + "'" + jTextFieldTENDV.getText() + "','" + jTextFieldGIADV.getText() + "')";

            st.execute(query);
            hienThiDanhSachDichVu();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_them2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        hoadonform hdf = new hoadonform();
        hdf.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        khachhangform khf = new khachhangform();
        khf.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        nhanvienform nvf = new nhanvienform();
        nvf.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        phongform pf = new phongform();
        pf.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        thongtinform ttf = new thongtinform();
        ttf.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenu3MouseClicked

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
            java.util.logging.Logger.getLogger(dichvuform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dichvuform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dichvuform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dichvuform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dichvuform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonclear1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableDichvu;
    private javax.swing.JTextField jTextFieldGIADV;
    private javax.swing.JTextField jTextFieldMADV;
    private javax.swing.JTextField jTextFieldTENDV;
    private javax.swing.JButton sua2;
    private javax.swing.JButton them2;
    private javax.swing.JButton thoat2;
    private javax.swing.JButton xoa2;
    // End of variables declaration//GEN-END:variables
}
