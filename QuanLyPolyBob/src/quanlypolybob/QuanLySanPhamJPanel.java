/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package quanlypolybob;

import java.io.File;
import Helper.Ximages;
import Model.ThuongHieu;
import Model.Vi;
import Service.ViService;
import Services.SanPhamService;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import quanlypolybob.Dao.ThuongHieuDao;
import quanlypolybob.Dao.ViDao;
import quanlypolybob.Hepper.MsgBox;

/**
 *
 * @author Windows
 */
public class QuanLySanPhamJPanel extends javax.swing.JPanel {

    Locale vn = new Locale("vi", "VN");
    ViDao dao_vi = new ViDao();
    ThuongHieuDao dao_th = new ThuongHieuDao();
    int row;
    DefaultTableModel modelCH = new DefaultTableModel();
    DefaultTableModel modelHH = new DefaultTableModel();
    List<ThuongHieu> list_TH;

    /**
     * Creates new form QuanLySanPhamJPanl
     */
    public QuanLySanPhamJPanel() {
        initComponents();
        init();
        modelCH = (DefaultTableModel) tblSanPham4.getModel();
        filltotablech();
//        modelHH = (DefaultTableModel) tblSanPham2.getModel();
//        filltotablehh();
    }

    private void init() {
        fillcomboboxThuonghieu();
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblHinh = new javax.swing.JLabel();
        txtKieuDang = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbxThuongHieu = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rdo = new javax.swing.JRadioButton();
        rdo1 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnLammoi = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblSanPham4 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        txtTenVi = new javax.swing.JTextField();
        txtMaVi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnThem1 = new javax.swing.JButton();

        jPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        lblHinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblHinh.setText("Click To Dowload Image");
        lblHinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHinh, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(51, 6, 233, 275);

        txtKieuDang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtKieuDang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKieuDangActionPerformed(evt);
            }
        });
        jPanel1.add(txtKieuDang);
        txtKieuDang.setBounds(350, 180, 222, 30);

        jLabel1.setText("Tên Ví");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(350, 90, 60, 16);

        jLabel2.setText("Kiểu Dáng");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(350, 160, 70, 16);

        cbxThuongHieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxThuongHieuActionPerformed(evt);
            }
        });
        jPanel1.add(cbxThuongHieu);
        cbxThuongHieu.setBounds(650, 30, 228, 29);

        jLabel3.setText("Thương Hiệu");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(650, 6, 69, 16);

        jLabel4.setText("Trạng Thái");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(644, 84, 70, 16);

        buttonGroup1.add(rdo);
        rdo.setText("Hết Hàng");
        rdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoActionPerformed(evt);
            }
        });
        jPanel1.add(rdo);
        rdo.setBounds(749, 118, 74, 21);

        buttonGroup1.add(rdo1);
        rdo1.setSelected(true);
        rdo1.setText("Còn Hàng");
        rdo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo1ActionPerformed(evt);
            }
        });
        jPanel1.add(rdo1);
        rdo1.setBounds(644, 118, 77, 21);

        jPanel4.setBackground(new java.awt.Color(241, 241, 241));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Tìm kiếm(Tên hoặc Mã)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(6, 321, 499, 58);
        jPanel4.getAccessibleContext().setAccessibleName("Tìm kiếm(Tên )");

        jButton1.setText("|<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(572, 343, 72, 36);

        jButton2.setText("<<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(650, 343, 72, 36);

        jButton3.setText(">>");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(740, 343, 72, 36);

        jButton4.setText(">|");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(830, 343, 72, 36);

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSua);
        btnSua.setBounds(949, 84, 100, 38);

        btnLammoi.setText("Làm mới");
        btnLammoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLammoiMouseClicked(evt);
            }
        });
        jPanel1.add(btnLammoi);
        btnLammoi.setBounds(949, 156, 100, 38);

        btnThem.setText("Thêm");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel1.add(btnThem);
        btnThem.setBounds(950, 30, 100, 38);

        tblSanPham4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Ví", "Tên Ví", "Thương Hiệu", "Kiểu Dáng", "Trạng Thái"
            }
        ));
        tblSanPham4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPham1MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblSanPham4);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("", jPanel11);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(-1, 389, 1050, 320);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plus.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(884, 28, 50, 30);

        txtTenVi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTenVi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenViActionPerformed(evt);
            }
        });
        jPanel1.add(txtTenVi);
        txtTenVi.setBounds(350, 110, 222, 30);

        txtMaVi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtMaVi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaViActionPerformed(evt);
            }
        });
        jPanel1.add(txtMaVi);
        txtMaVi.setBounds(350, 30, 222, 30);

        jLabel5.setText("Mã Ví");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(350, 10, 30, 16);

        btnThem1.setText("Chi Tiết Sản Phẩm");
        btnThem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThem1MouseClicked(evt);
            }
        });
        btnThem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnThem1);
        btnThem1.setBounds(900, 230, 150, 38);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1075, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtKieuDangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKieuDangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKieuDangActionPerformed

    private void cbxThuongHieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxThuongHieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxThuongHieuActionPerformed

    private void rdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoActionPerformed

    private void rdo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdo1ActionPerformed

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new ThuongHieuJDiaLog(null, true).setVisible(true);
        fillcomboboxThuonghieu();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel2MouseClicked

    private void lblHinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhMouseClicked
        chooseImages();
    }//GEN-LAST:event_lblHinhMouseClicked

    private void txtTenViActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenViActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenViActionPerformed

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnThemMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        this.insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void txtMaViActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaViActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaViActionPerformed

    private void tblSanPham1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPham1MouseClicked
        // TODO add your handling code here:
        try {
            row = tblSanPham4.getSelectedRow();
            edit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblSanPham1MouseClicked

    private void btnThem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThem1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThem1MouseClicked

    private void btnThem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThem1ActionPerformed

    private void btnLammoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLammoiMouseClicked
        // TODO add your handling code here:
clearForm();
    }//GEN-LAST:event_btnLammoiMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                row = 0;
        if (jTabbedPane1.getSelectedIndex() == 0) {
            tblSanPham4.setRowSelectionInterval(row, row);
            edit();
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (jTabbedPane1.getSelectedIndex() == 0) {
            if (row > 0) {
                row--;
                tblSanPham4.setRowSelectionInterval(row, row);
                edit();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (jTabbedPane1.getSelectedIndex() == 0) {
            if (row < tblSanPham4.getRowCount() - 1) {
                row++;
                tblSanPham4.setRowSelectionInterval(row, row);
                edit();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if (jTabbedPane1.getSelectedIndex() == 0) {
            row = tblSanPham4.getRowCount() - 1;

            tblSanPham4.setRowSelectionInterval(row, row);
            edit();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLammoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThem1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxThuongHieu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblHinh;
    private javax.swing.JRadioButton rdo;
    private javax.swing.JRadioButton rdo1;
    private javax.swing.JTable tblSanPham4;
    private javax.swing.JTextField txtKieuDang;
    private javax.swing.JTextField txtMaVi;
    private javax.swing.JTextField txtTenVi;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    private void filltotablech() {
        modelCH.setRowCount(0);
        try {
            List<Vi> list = dao_vi.selectAll();
            for (Vi x : list) {
                modelCH.addRow(new Object[]{
                    //                    x.getIDVi(),
                    x.getMa_Vi(),
                    x.getTenVi(),
                    dao_th.selectNameByID(x.getID_ThuongHieu()),
                    x.getKieuDang(),
                    x.isTrangThai() ? "Còn Hàng" : "Hết Hàng"
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void filltotablehh() {
        modelHH.setRowCount(0);
        try {
            List<Vi> list = dao_vi.select_TrangThai();
            for (Vi x : list) {
                modelHH.addRow(new Object[]{
                    //                    x.getIDVi(),
                    x.getMa_Vi(),
                    x.getTenVi(),
                    dao_th.selectNameByID(x.getID_ThuongHieu()),
                    x.getKieuDang(),
                    x.isTrangThai() ? "Còn Hàng" : "Hết Hàng"
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void fillcomboboxThuonghieu() {
        DefaultComboBoxModel modelcbo = (DefaultComboBoxModel) cbxThuongHieu.getModel();
        modelcbo.removeAllElements();
        list_TH = dao_th.selectAll();
        for (ThuongHieu th : list_TH) {
            modelcbo.addElement(th.getTenThuongHieu());
        }
    }

    private void chooseImages() {
        JFileChooser file = new JFileChooser("C:\\Users\\Windows\\Desktop\\PolyBop\\QuanLyPolyBob");
        if (file.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File filechoser = file.getSelectedFile();
            Ximages.save(filechoser);
            ImageIcon icon = Ximages.read(filechoser.getName());
            lblHinh.setIcon(icon);
            lblHinh.setToolTipText(filechoser.getName());
            System.out.println(filechoser.getName());
            System.out.println(lblHinh.getToolTipText());
//            System.out.println("getPath : " + filechoser.getPath());
//            System.out.println("getAbsolutePath : " + filechoser.getAbsolutePath());
//            System.out.println("getName : " + filechoser.getName());
        }
    }

    private Vi getInformation() {
        Vi sp = new Vi();
//        sp.setIDVi(Integer.parseInt(txtMaVi.getText()));
        sp.setMa_Vi(txtMaVi.getText());
        sp.setTenVi(txtTenVi.getText());
        sp.setKieuDang(txtKieuDang.getText());
        sp.setID_ThuongHieu(dao_th.selectIdByName(cbxThuongHieu.getSelectedItem() + ""));
        //System.out.println(sp.getId_loaiSP());
        sp.setTrangThai(rdo1.isSelected());
        sp.setUrl_Anh(lblHinh.getToolTipText());
        System.out.println(sp.getTenVi());
        System.out.println(sp.getUrl_Anh());
        return sp;
    }

    private void setForm(Vi sp) {
        String thuonghieu = tblSanPham4.getValueAt(row, 1).toString();
        for (int i = 0; i < list_TH.size(); i++) {
            if (thuonghieu.equals(list_TH.get(i).getTenThuongHieu())) {
                cbxThuongHieu.setSelectedIndex(i);
            }
        }
//        txtMaVi.setText(sp.getIDVi() + "");
        txtMaVi.setText(sp.getMa_Vi());
        txtTenVi.setText(sp.getTenVi());
        txtKieuDang.setText(sp.getKieuDang());
//        cboLoaidouong.setSelectedItem(tblSanPhansd.getValueAt(row, 2).toString());
        rdo1.setSelected(sp.isTrangThai());
        rdo.setSelected(!sp.isTrangThai());
        System.out.println(sp.getUrl_Anh());
        try {
            lblHinh.setToolTipText(sp.getUrl_Anh());
            lblHinh.setIcon((Ximages.read(sp.getUrl_Anh())));
        } catch (Exception e) {
//            lblHinh.setIcon(new ImageIcon("unnamed.png"));
        }
    }

    private void updateStatus() {
        boolean edit = (row >= 0);
        boolean fist = (row == 0);
        boolean last = (row == tblSanPham4.getRowCount() - 1);
        ////
//        txtMaVi.setEditable(!edit);
        btnThem.setEnabled(!edit);
//        btnXoa.setEnabled(edit);
        btnSua.setEnabled(edit);
        ////
        jButton1.setEnabled(edit && !fist);
        jButton2.setEnabled(edit && !fist);
        jButton3.setEnabled(!last && edit);
        jButton4.setEnabled(!last && edit);
    }

    private void updateStatus2() {
        boolean edit = (row >= 0);
        boolean fist = (row == 0);
        boolean last = (row == tblSanPham4.getRowCount() - 1);
        ////
//        txtMaSP.setEditable(!edit);
        btnThem.setEnabled(!edit);
//        btnXoa.setEnabled(edit);
        btnSua.setEnabled(edit);
        ////
        jButton1.setEnabled(edit && !fist);
        jButton2.setEnabled(edit && !fist);
        jButton3.setEnabled(!last && edit);
        jButton4.setEnabled(!last && edit);
    }
//    private void edit() {
//        Integer masp = Integer.valueOf(tblSanPham1.getValueAt(row, 0).toString());
//        Vi sp = dao_vi.selectID(masp);
//        setForm(sp);
////        updateStatus();
//    }

    private void edit() {
        String masp = tblSanPham4.getValueAt(row, 0).toString();
        Vi sp = dao_vi.selectID1(masp);
        setForm(sp);
        updateStatus();
    }
//    private void edithh() {
//        Integer masp = Integer.valueOf(tblSanPham2.getValueAt(row, 0).toString()) ;
//        Vi sp = dao_vi.selectID(masp);
//        setForm(sp);
//        updateStatus();
//    }
//    private void edithh() {
//        Integer masp = Integer.valueOf(tblSanPham2.getValueAt(row, 0).toString());
//        Vi sp = dao_vi.selectID(masp);
//        setForm(sp);
//        updateStatus2();
//    }
    ViService service = new ViService();

    private void clearForm() {
//        txtMaVi.setText("");
        txtMaVi.setText("");
        txtTenVi.setText("");
        txtKieuDang.setText("");
        lblHinh.setIcon(null);
        row = -1;
        identityMasp2();
        if (jTabbedPane1.getSelectedIndex() == 0) {
            updateStatus();
        }
    }

    private void identityMasp2() {
        if (dao_vi.selectAlll().isEmpty()) {
            txtMaVi.setText("V001");
        } else {
            txtMaVi.setText("V0" + (dao_vi.select_Max_id_java() + 1));
        }
    }

    private void insert() {
        if (Checknull()) {
            return;
        } else if (CheckSPInuput()) {
            return;
        } else {
            try {
                if (MsgBox.confirm(this, "Bạn có muốn thêm sản phẩm này ?")) {
                    //SanPham sp = getInformation();
                    service.insert(getInformation());
                    if (jTabbedPane1.getSelectedIndex() == 0) {
                        filltotablech();
                        jTabbedPane1.setSelectedIndex(0);
                    } else {
                        filltotablehh();
                        jTabbedPane1.setSelectedIndex(1);
                    }
                    clearForm();
                    JOptionPane.showMessageDialog(this, "Đã thêm");
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Ops! Lỗi truy vấn dữ liệu rồi!");
            }
        }

    }

    private void delete() {
        try {
            int chon = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa ?");
            if (row == -1) {
                JOptionPane.showMessageDialog(this, "Dữ liệu chưa được hiển thị để xóa!");
                return;
            }
            if (chon == JOptionPane.YES_OPTION) {
                Integer manv = Integer.valueOf(txtTenVi.getText());
                dao_vi.delete(manv);
                filltotablehh();
                filltotablech();
                jTabbedPane1.setSelectedIndex(1);
                clearForm();
                JOptionPane.showMessageDialog(this, "Yeah! Đã xóa");
            }

        } catch (Exception e) {
            e.printStackTrace();
//            JOptionPane.showMessageDialog(this, "xóa không thành công");
        }
    }

    private void update() {
//        if (CheckNumber()) {
//            return;
//        } else {
        try {
            if (MsgBox.confirm(this, "Bạn có muốn sửa sản phẩm ?")) {
                Vi sp = getInformation();
                dao_vi.update(sp);
//                filltotablehh();
                filltotablech();
                clearForm();
                jTabbedPane1.setSelectedIndex(0);
                JOptionPane.showMessageDialog(this, "Đã sửa");
            } else ;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ops! Sửa thất bại");
            e.printStackTrace();
        }

//        }
    }

    private boolean Checknull() {
        if (txtMaVi.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã sản phẩm!");
            txtMaVi.requestFocus();

            return true;
        }
        if (txtTenVi.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tên sản phẩm!");
            txtTenVi.requestFocus();

            return true;
        }
        if (txtKieuDang.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập kiểu dáng sản phẩm!");
            txtKieuDang.requestFocus();

            return true;
        }
        List<Vi> list = dao_vi.selectAlll();
        String id = txtMaVi.getText();
        String tensp = txtTenVi.getText();
        for (int i = 0; i < list.size(); i++) {
            if (id.equalsIgnoreCase(list.get(i).getMa_Vi())) {
                JOptionPane.showMessageDialog(this, "Trùng khóa chính");
                txtMaVi.requestFocus();
                return true;
            } else if (tensp.equalsIgnoreCase(list.get(i).getTenVi())) {
                JOptionPane.showMessageDialog(this, "Tên sản phẩm đã tồn tại");
                txtTenVi.requestFocus();
                return true;
            }
        }
        if (lblHinh.getIcon() == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn hình sản phẩm!");
            return true;
        } else if (txtMaVi.getText().length() < 3) {
            JOptionPane.showMessageDialog(this, "Mã sản phẩm phải trên 2 kí tự");
            return true;
        } else if (txtTenVi.getText().length() < 5) {
            JOptionPane.showMessageDialog(this, "Tên sản phẩm phải trên 5 kí tự");
            return true;
        }
        return false;

    }

    private boolean CheckSPInuput() {

        modelCH.setRowCount(0);
        try {
            List<Vi> list = dao_vi.Select_ByName(txtTenVi.getText());
            for (int i = 0; i < list.size(); i++) {
                modelCH.addRow(new Object[]{list.get(i).getMa_Vi(), list.get(i).getTenVi(),
                    dao_th.selectNameByID(list.get(i).getID_ThuongHieu()),
                    list.get(i).isTrangThai() ? "Còn Hàng" : "Không còn hàng"});
            }
        } catch (Exception e) {
        }
        return false;
    }

    private void search() {
        if (jTabbedPane1.getSelectedIndex() == 0) {
            String timkiem = txtTimKiem.getText();
            TableRowSorter<DefaultTableModel> sanpham = new TableRowSorter<>(modelCH);
            tblSanPham4.setRowSorter(sanpham);
            sanpham.setRowFilter(javax.swing.RowFilter.regexFilter(timkiem));
            jTabbedPane1.setSelectedIndex(0);
        }
    }
}
