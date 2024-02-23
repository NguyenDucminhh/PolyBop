/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package quanlypolybob;

import Model.KhachHang;
import Model.NhanVien;
import Repository.NhanVienRepository;
import Service.NhanVienService;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import quanlypolybob.Hepper.Xdate;

/**
 *
 * @author ADMIN
 */
public class NhanVienJpanel extends javax.swing.JPanel {
    List<NhanVien> list;
    DefaultTableModel dtm;
    NhanVienRepository nhanVienRepository = new NhanVienRepository();
    /**
     * Creates new form NhanVien
     */
    public NhanVienJpanel() {
        initComponents();
        fillTableNhanVienKhongHoatDong();
        fillTableNhanVien();
        ButtonGroup bG1 = new ButtonGroup();
        bG1.add(rdoNam);
        bG1.add(rdoNu);
         ButtonGroup bG2 = new ButtonGroup();
        bG2.add(rdoCV1);
        bG2.add(rdoCV2);
         ButtonGroup bG3 = new ButtonGroup();
        bG3.add(rdoTT1);
        bG3.add(rdoTT2);
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        rdoTT1 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rdoCV1 = new javax.swing.JRadioButton();
        rdoTT2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnXoa = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        txtsearchNVKHD = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblNV1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblNV = new javax.swing.JTable();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        pageLabel = new javax.swing.JLabel();
        btnFirstPage = new javax.swing.JButton();
        btnLastPage = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        rdoNam = new javax.swing.JRadioButton();
        btnThem = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        rdoNu = new javax.swing.JRadioButton();
        txtHoTen = new javax.swing.JTextField();
        rdoCV2 = new javax.swing.JRadioButton();
        txtSdt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        txtNgaySinh = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup2.add(rdoTT1);
        rdoTT1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoTT1.setSelected(true);
        rdoTT1.setText("Làm việc");
        add(rdoTT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 574, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Giới Tính");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 471, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Trạng thái");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 573, -1, -1));

        buttonGroup1.add(rdoCV1);
        rdoCV1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoCV1.setSelected(true);
        rdoCV1.setText("Quản lý");
        add(rdoCV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 534, -1, -1));

        buttonGroup2.add(rdoTT2);
        rdoTT2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoTT2.setText("Nghỉ việc");
        rdoTT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoTT2ActionPerformed(evt);
            }
        });
        add(rdoTT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 574, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Ngày Sinh");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 499, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Chức Vụ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 533, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Mã Nhân Viên");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 391, -1, -1));

        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 470, 114, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red));

        txtsearchNVKHD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchNVKHDKeyReleased(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setText("Tìm kiếm");

        tblNV1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Họ tên", "Sđt", "Ngày sinh", "Email", "Địa chỉ", "Mật khẩu", "Giới tính", "Chức vụ", "Trạng thái"
            }
        ));
        tblNV1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNV1MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblNV1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtsearchNVKHD, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 651, Short.MAX_VALUE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsearchNVKHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        jTabbedPane1.addTab("Nhân viên không hoạt động", jPanel3);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jButton6.setText("Tìm kiếm");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        tblNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Họ tên", "Sđt", "Ngày sinh", "Email", "Địa chỉ", "Mật khẩu", "Giới tính", "Chức vụ", "Trạng thái"
            }
        ));
        tblNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNVMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblNV);

        btnPrev.setText("<");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setText(">");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        pageLabel.setText("jLabel12");

        btnFirstPage.setText("|<");
        btnFirstPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstPageActionPerformed(evt);
            }
        });

        btnLastPage.setText(">|");
        btnLastPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastPageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 972, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFirstPage, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPrev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pageLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLastPage, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6)
                    .addComponent(btnPrev)
                    .addComponent(btnNext)
                    .addComponent(pageLabel)
                    .addComponent(btnLastPage)
                    .addComponent(btnFirstPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221))
        );

        jTabbedPane1.addTab("Nhân viên hoạt động", jPanel1);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 81, 990, 292));

        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 430, 114, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Địa Chỉ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 391, -1, -1));

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClear.setText("Làm Mới");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 510, 114, -1));

        rdoNam.setSelected(true);
        rdoNam.setText("Nam");
        add(rdoNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 472, -1, -1));

        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 390, 114, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Số Điện Thoại");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 533, -1, -1));
        add(txtMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 391, 169, -1));

        rdoNu.setText("Nữ");
        add(rdoNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 472, -1, -1));
        add(txtHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 431, 169, -1));

        buttonGroup1.add(rdoCV2);
        rdoCV2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoCV2.setText("Nhân viên");
        add(rdoCV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 534, -1, -1));
        add(txtSdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 533, 169, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Họ Tên");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 431, -1, -1));

        txtDiaChi.setColumns(20);
        txtDiaChi.setRows(5);
        jScrollPane3.setViewportView(txtDiaChi);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 391, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("QUẢN LÝ NHÂN VIÊN");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 560, 57));
        add(txtNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 499, 169, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Email");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 499, -1, -1));
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 499, 237, -1));
        add(txtMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 573, 169, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Mật Khẩu");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 573, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        this.delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        this.update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        this.clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        this.insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        searchNhanVien(txtSearch.getText());
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtsearchNVKHDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchNVKHDKeyReleased
        searchNhanVienKhongHoatDong(txtsearchNVKHD.getText());
    }//GEN-LAST:event_txtsearchNVKHDKeyReleased

    private void tblNV1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNV1MouseClicked
       int index = tblNV1.getSelectedRow();
        NhanVien kh = nhanVienRepository.getById(tblNV1.getValueAt(index, 0).toString());
        show(kh);
    }//GEN-LAST:event_tblNV1MouseClicked

    private void tblNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNVMouseClicked
        int index = tblNV.getSelectedRow();
        NhanVien kh = nhanVienRepository.getById(tblNV.getValueAt(index, 0).toString());
        show(kh);
    }//GEN-LAST:event_tblNVMouseClicked

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        this.nextPage();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        this.prevPage();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnLastPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastPageActionPerformed
        this.goToLastPage();
    }//GEN-LAST:event_btnLastPageActionPerformed

    private void btnFirstPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstPageActionPerformed
        this.goToFirstPage();
    }//GEN-LAST:event_btnFirstPageActionPerformed

    private void rdoTT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoTT2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoTT2ActionPerformed
    
    public void searchNhanVien(String ma) {
        list = nhanVienService.Search(ma);
        dtm = (DefaultTableModel) tblNV.getModel();
        dtm.setRowCount(0);
        for (NhanVien s : list) {
            dtm.addRow(new Object[]{s.getIdNhanVien(), s.getHoTen(), s.getSdt(), s.getNgaySinh(), s.getEmail(), s.getDiaChi(), s.getMatKhau(), s.isGioiTinh()? "Nam" : "Nữ", s.isChucVu()? "Quản lý" : "Nhân viên", s.isTrangThai()? "Còn hoạt động" : "Không hoạt động"});
        }
        updatePageLabel();
    }
    
    private void updatePageLabel() {
        if (list != null) {
            int totalPages = (int) Math.ceil((double) list.size() / recordsPerPage);
            currentPage = 1; // Trang hiện tại sẽ là trang đầu tiên
            pageLabel.setText("Trang: " + currentPage + " / " + Math.max(1, totalPages)); // Ensure at least 1 page is shown
        } else {
            pageLabel.setText("Trang: 0 / 0");
        }
    }

    public void searchNhanVienKhongHoatDong(String ma) {
        list = nhanVienService.SearchNVKHD(ma);
        dtm = (DefaultTableModel) tblNV1.getModel();
        dtm.setRowCount(0);
        for (NhanVien s : list) {
            dtm.addRow(new Object[]{s.getIdNhanVien(), s.getHoTen(), s.getSdt(), s.getNgaySinh(), s.getEmail(), s.getDiaChi(), s.getMatKhau(), s.isGioiTinh()? "Nam" : "Nữ", s.isChucVu()? "Quản lý" : "Nhân viên", s.isTrangThai()? "Còn hoạt động" : "Không hoạt động"});
        }
    }
    private int currentPage = 1;
    private int recordsPerPage = 10;
    public void fillTableNhanVien() {

            List<NhanVien> listNV;
            DefaultTableModel mol;
//            listNV = nhanVienRepository.getAllNhanVien();
            listNV = nhanVienRepository.getNhanVienByPage(currentPage, recordsPerPage);
            mol = (DefaultTableModel) tblNV.getModel();
            mol.setRowCount(0);
            for (NhanVien nv : listNV) {
                mol.addRow(new Object[]{
                        nv.getIdNhanVien(), 
                        nv.getHoTen(), 
                        nv.getSdt(), 
                        nv.getNgaySinh(),
                        nv.getEmail(), 
                        nv.getDiaChi(),
                        nv.getMatKhau(),
                        nv.isGioiTinh()? "Nam" : "Nữ",
                        nv.isChucVu()? "Quản lý" : "Nhân viên",
                        nv.isTrangThai()? "Còn hoạt động" : "Không hoạt động"
                });
            }
                  int totalPages = (int) Math.ceil((double) nhanVienRepository.getTotalNhanVien() / recordsPerPage);
                 pageLabel.setText("Trang: " + currentPage + " / " + totalPages);
        }
    public void fillTableNhanVienKhongHoatDong() {
            DefaultTableModel model = (DefaultTableModel) tblNV1.getModel();
            model.setRowCount(0);
            try {
                List<NhanVien> list = nhanVienRepository.getAllNhanVienKhongHoatDong();
                for (NhanVien nv : list) {
                    model.addRow(new Object[]{
                         nv.getIdNhanVien(), 
                        nv.getHoTen(), 
                        nv.getSdt(), 
                        nv.getNgaySinh(),
                        nv.getEmail(), 
                        nv.getDiaChi(),
                        nv.getMatKhau(),
                        nv.isGioiTinh()? "Nam" : "Nữ",
                        nv.isChucVu()? "Quản lý" : "Nhân viên",
                        nv.isTrangThai()? "Còn hoạt động" : "Không hoạt động"
                    });
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu");
                e.printStackTrace();
            }
        }
    
     public void show(NhanVien nv) {
        txtDiaChi.setText(nv.getDiaChi());
        txtMaNV.setText(String.valueOf(nv.getIdNhanVien()));
        txtEmail.setText(nv.getEmail());
        txtNgaySinh.setDate(nv.getNgaySinh());
        txtSdt.setText(nv.getSdt());
        txtHoTen.setText(nv.getHoTen());
        txtMatKhau.setText(nv.getHoTen());
        
        if (nv.isGioiTinh()== true) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }
        
        if (nv.isChucVu()== true) {
            rdoCV1.setSelected(true);
        } else {
            rdoCV2.setSelected(true);
        }
        
        if (nv.isTrangThai()== true) {
            rdoTT1.setSelected(true);
        } else {
            rdoTT2.setSelected(true);
        }
    }
     
     public NhanVien getForm() {
        NhanVien nv = new NhanVien();
        nv.setIdNhanVien(Integer.parseInt(txtMaNV.getText()));
        nv.setHoTen(txtHoTen.getText());
        nv.setTrangThai(rdoTT1.isSelected());
        nv.setGioiTinh(rdoNam.isSelected());
        nv.setChucVu(rdoCV1.isSelected());
        //String ngaySinh = format.format(jDateNgaysinh.getDate());
        nv.setNgaySinh(Xdate.toDate(Xdate.toString(txtNgaySinh.getDate(), "yyyy-MM-dd"), "yyyy-MM-dd"));
        nv.setEmail(txtEmail.getText());
        nv.setSdt(txtSdt.getText());
        nv.setDiaChi(txtDiaChi.getText());
        nv.setMatKhau(txtMatKhau.getText());
        return nv;
    }
     
     public NhanVien getFormAdd() {
        NhanVien nv = new NhanVien();
        nv.setHoTen(txtHoTen.getText());
        nv.setTrangThai(rdoTT1.isSelected());
        nv.setGioiTinh(rdoNam.isSelected());
        nv.setChucVu(rdoCV1.isSelected());
        //String ngaySinh = format.format(jDateNgaysinh.getDate());
        nv.setNgaySinh(Xdate.toDate(Xdate.toString(txtNgaySinh.getDate(), "yyyy-MM-dd"), "yyyy-MM-dd"));
        nv.setEmail(txtEmail.getText());
        nv.setSdt(txtSdt.getText());
        nv.setDiaChi(txtDiaChi.getText());
        nv.setMatKhau(txtMatKhau.getText());
        return nv;
    }
     
     void delete() {
        int chooser = JOptionPane.showConfirmDialog(this, "Bạn muốn xóa nhân viên?");
        if (chooser == JOptionPane.YES_OPTION) {
            try {
                String manv = txtMaNV.getText();
                nhanVienService.delete(manv);
                fillTableNhanVien();
                fillTableNhanVienKhongHoatDong();
                JOptionPane.showMessageDialog(this, "Xóa thành công!!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Xóa thất bại");
                e.printStackTrace();
            }
        }
    }
     
     NhanVienService nhanVienService  = new NhanVienService();
     void update() {
            try {
                nhanVienService.update(getForm());
                fillTableNhanVien();
                fillTableNhanVienKhongHoatDong();
                this.clear();
                JOptionPane.showMessageDialog(this, "Update thành công!!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Cập nhật thất bại!" + "\n" + "Vui lòng chọn dữ liệu ở mục danh sách để cập nhật");
                e.printStackTrace();
            }
    }
     
     void insert() {
        try {
            if (validateForm()) { // Nếu thông tin hợp lệ thì thực hiện thêm mới
                nhanVienService.insert(getFormAdd());
                fillTableNhanVien();
                fillTableNhanVienKhongHoatDong();
                this.clear();
                JOptionPane.showMessageDialog(this, "Thêm mới thành công");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Thêm mới thất bại");
        }   
    }
     
     public void nextPage() {
        int totalRecords = nhanVienRepository.getTotalNhanVien();
        int totalPages = (int) Math.ceil((double) totalRecords / recordsPerPage);

        if (currentPage < totalPages) {
            currentPage++;
            fillTableNhanVien();
        }
    }

    public void prevPage() {
        if (currentPage > 1) {
            currentPage--;
            fillTableNhanVien();
        }
    }
    
    public void goToLastPage() {
        int totalRecords = nhanVienRepository.getTotalNhanVien();
        int totalPages = (int) Math.ceil((double) totalRecords / recordsPerPage);

        if (currentPage < totalPages) {
            currentPage = totalPages;
            fillTableNhanVien();
        }
    }
    
    public void goToFirstPage() {
        if (currentPage > 1) {
            currentPage = 1;
            fillTableNhanVien();
        }
    }
    
    //    Sđt trùng
    private boolean isPhoneNumberDuplicate(String phoneNumber) {
        DefaultTableModel model = (DefaultTableModel) tblNV.getModel();
        int rowCount = model.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            String existingPhoneNumber = (String) model.getValueAt(i, 2); // Assuming 2 is the column index for phone number
            if (existingPhoneNumber.equals(phoneNumber)) {
                return true; // Phone number already exists in the table
            }
        }

        return false; // Phone number is not a duplicate
    }
    
    //    Email trùng
    private boolean isEmailDuplicate(String email) {
        DefaultTableModel model = (DefaultTableModel) tblNV.getModel();
        int rowCount = model.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            String existingEmail = (String) model.getValueAt(i, 4); // Assuming 4 is the column index for email
            if (existingEmail.equals(email)) {
                return true;
            }
        }

        return false;
    }

    private boolean validateForm() {
        // Kiểm tra họ tên
        if (txtHoTen.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập Họ tên");
            return false;
        }

        // Kiểm tra số điện thoại
        if (txtSdt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập Số điện thoại");
            return false;
        } else if (!isValidPhoneNumber(txtSdt.getText())) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không hợp lệ");
            return false;
        } else if (isPhoneNumberDuplicate(txtSdt.getText())) {
            JOptionPane.showMessageDialog(this, "Số điện thoại đã tồn tại trong danh sách khách hàng");
            return false;
        }   

        // Kiểm tra ngày sinh
        if (txtNgaySinh.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn Ngày sinh");
            return false;
        }

        // Kiểm tra email (có thể thêm kiểm tra định dạng email)
        if (txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập Email");
            return false;
        } else if (!isValidEmail(txtEmail.getText())) {
            JOptionPane.showMessageDialog(this, "Email không hợp lệ");
            return false;
        } else if (isEmailDuplicate(txtEmail.getText())) {
            JOptionPane.showMessageDialog(this, "Email đã tồn tại trong danh sách khách hàng");
            return false;
        }

        // Kiểm tra địa chỉ
        if (txtDiaChi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập Địa chỉ");
            return false;
        }

        // Kiểm tra mật khẩu
        if (txtMatKhau.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập Mật khẩu");
            return false;
        }

        // Kiểm tra radio button giới tính
        if (!rdoNam.isSelected() && !rdoNu.isSelected()) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn Giới tính");
            return false;
        }

        // Kiểm tra radio button chức vụ
        if (!rdoCV1.isSelected() && !rdoCV2.isSelected()) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn Chức vụ");
            return false;
        }

        // Kiểm tra radio button trạng thái
        if (!rdoTT1.isSelected() && !rdoTT2.isSelected()) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn Trạng thái");
            return false;
        }

        return true; // Đã kiểm tra hết, thông tin hợp lệ
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        // Định dạng số điện thoại: 10 hoặc 11 chữ số, bắt đầu từ 0 hoặc 84
        String regex = "^(0|84)?[0-9]{9,10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

// Hàm kiểm tra regex cho email
    private boolean isValidEmail(String email) {
        // Định dạng email sử dụng regex cơ bản
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    private void clear() {
        txtMaNV.setText("");
        txtHoTen.setText("");
        txtSdt.setText("");
        txtNgaySinh.setDate(null);
        txtEmail.setText("");
        txtDiaChi.setText("");
        txtMatKhau.setText("");
        rdoNam.setSelected(false);
        rdoNu.setSelected(false);
        rdoCV1.setSelected(false);
        rdoCV2.setSelected(false);
        rdoTT1.setSelected(false);
        rdoTT2.setSelected(false);
    }
    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnFirstPage;
    private javax.swing.JButton btnLastPage;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel pageLabel;
    private javax.swing.JRadioButton rdoCV1;
    private javax.swing.JRadioButton rdoCV2;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JRadioButton rdoTT1;
    private javax.swing.JRadioButton rdoTT2;
    private javax.swing.JTable tblNV;
    private javax.swing.JTable tblNV1;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMatKhau;
    private com.toedter.calendar.JDateChooser txtNgaySinh;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtsearchNVKHD;
    // End of variables declaration//GEN-END:variables
}
