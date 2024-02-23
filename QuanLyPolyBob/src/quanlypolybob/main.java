/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlypolybob;

import View.LoginView;
import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import View.DoiMK_View;
import View.LoginView;

/**
 *
 * @author Windows
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    String email, name;
    int chucVu;

    public main(String email, String name, int chucVu) {
        initComponents();
        setLocationRelativeTo(null);
        this.email = email;
        this.name = name;
        this.chucVu = chucVu;
        lblTenNV.setText(name);
//        new LoginView().setVisible(false);
        setExtendedState(this.MAXIMIZED_BOTH);
        setColor(lblTrangChu);
        setColorJpanel(pnTrangChu);
        // set chức vụ 
        if (chucVu == 1) {
            lblChucVu.setText("ADMIN");
        } else {
            lblChucVu.setText("NHÂN VIÊN");
        }

//       showPanel(new TrangChuJPanel());
//mm
    }

    public main() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(this.MAXIMIZED_BOTH);
        System.out.println(this.email);
    }

    String getTenNhanVien() {
        return lblTenNV.getText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        mnDMK = new javax.swing.JMenuItem();
        mnThoat = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        pnTrangChu = new javax.swing.JPanel();
        lblTrangChu = new javax.swing.JLabel();
        pnSanPham = new javax.swing.JPanel();
        lblSanPham = new javax.swing.JLabel();
        pnNhanVien = new javax.swing.JPanel();
        lblNhanVien = new javax.swing.JLabel();
        pnKhachHang = new javax.swing.JPanel();
        lblKhachHang = new javax.swing.JLabel();
        pnKhuyenMai = new javax.swing.JPanel();
        lblKhuyenMai = new javax.swing.JLabel();
        pnThongKe = new javax.swing.JPanel();
        lblThongke = new javax.swing.JLabel();
        pnHoaDon = new javax.swing.JPanel();
        lblHoaDon = new javax.swing.JLabel();
        pnBanHang = new javax.swing.JPanel();
        lblBanHang = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTenNV = new javax.swing.JLabel();
        lblChucVu = new javax.swing.JLabel();
        pnscrene = new javax.swing.JPanel();

        mnDMK.setText("Đổi Mật Khẩu");
        mnDMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDMKActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mnDMK);

        mnThoat.setText("Thoát");
        mnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnThoatActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mnThoat);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(62, 74, 88));

        jPanel3.setBackground(new java.awt.Color(62, 74, 88));
        jPanel3.setForeground(new java.awt.Color(102, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnTrangChu.setBackground(new java.awt.Color(62, 74, 88));
        pnTrangChu.setPreferredSize(new java.awt.Dimension(228, 60));
        pnTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnTrangChuMouseClicked(evt);
            }
        });

        lblTrangChu.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        lblTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        lblTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hom.png"))); // NOI18N
        lblTrangChu.setText("Trang Chủ");
        lblTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTrangChuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnTrangChuLayout = new javax.swing.GroupLayout(pnTrangChu);
        pnTrangChu.setLayout(pnTrangChuLayout);
        pnTrangChuLayout.setHorizontalGroup(
            pnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTrangChuLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblTrangChu)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        pnTrangChuLayout.setVerticalGroup(
            pnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTrangChuLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        jPanel3.add(pnTrangChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 132, 270, -1));

        pnSanPham.setBackground(new java.awt.Color(62, 74, 88));
        pnSanPham.setPreferredSize(new java.awt.Dimension(248, 60));
        pnSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnSanPhamMouseClicked(evt);
            }
        });

        lblSanPham.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        lblSanPham.setForeground(new java.awt.Color(255, 255, 255));
        lblSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/drink.png"))); // NOI18N
        lblSanPham.setText("Sản Phẩm");
        lblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSanPhamMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnSanPhamLayout = new javax.swing.GroupLayout(pnSanPham);
        pnSanPham.setLayout(pnSanPhamLayout);
        pnSanPhamLayout.setHorizontalGroup(
            pnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSanPhamLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        pnSanPhamLayout.setVerticalGroup(
            pnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel3.add(pnSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 198, 270, -1));

        pnNhanVien.setBackground(new java.awt.Color(62, 74, 88));
        pnNhanVien.setPreferredSize(new java.awt.Dimension(225, 60));
        pnNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnNhanVienMouseClicked(evt);
            }
        });

        lblNhanVien.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        lblNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        lblNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon-user.png"))); // NOI18N
        lblNhanVien.setText("Nhân Viên");
        lblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNhanVienMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnNhanVienLayout = new javax.swing.GroupLayout(pnNhanVien);
        pnNhanVien.setLayout(pnNhanVienLayout);
        pnNhanVienLayout.setHorizontalGroup(
            pnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNhanVienLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblNhanVien)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnNhanVienLayout.setVerticalGroup(
            pnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel3.add(pnNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 396, 245, -1));

        pnKhachHang.setBackground(new java.awt.Color(62, 74, 88));
        pnKhachHang.setPreferredSize(new java.awt.Dimension(259, 60));
        pnKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnKhachHangMouseClicked(evt);
            }
        });

        lblKhachHang.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        lblKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        lblKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon-user.png"))); // NOI18N
        lblKhachHang.setText("Khách Hàng");
        lblKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKhachHangMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnKhachHangLayout = new javax.swing.GroupLayout(pnKhachHang);
        pnKhachHang.setLayout(pnKhachHangLayout);
        pnKhachHangLayout.setHorizontalGroup(
            pnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnKhachHangLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(lblKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        pnKhachHangLayout.setVerticalGroup(
            pnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblKhachHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel3.add(pnKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 462, 245, -1));

        pnKhuyenMai.setBackground(new java.awt.Color(62, 74, 88));
        pnKhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnKhuyenMaiMouseClicked(evt);
            }
        });

        lblKhuyenMai.setBackground(new java.awt.Color(62, 74, 88));
        lblKhuyenMai.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        lblKhuyenMai.setForeground(new java.awt.Color(255, 255, 255));
        lblKhuyenMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/voucher.png"))); // NOI18N
        lblKhuyenMai.setText("Khuyến Mãi");
        lblKhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKhuyenMaiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnKhuyenMaiLayout = new javax.swing.GroupLayout(pnKhuyenMai);
        pnKhuyenMai.setLayout(pnKhuyenMaiLayout);
        pnKhuyenMaiLayout.setHorizontalGroup(
            pnKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnKhuyenMaiLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnKhuyenMaiLayout.setVerticalGroup(
            pnKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblKhuyenMai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel3.add(pnKhuyenMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 528, 245, -1));

        pnThongKe.setBackground(new java.awt.Color(62, 74, 88));
        pnThongKe.setForeground(new java.awt.Color(51, 51, 255));
        pnThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnThongKeMouseClicked(evt);
            }
        });

        lblThongke.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        lblThongke.setForeground(new java.awt.Color(255, 255, 255));
        lblThongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/rank.png"))); // NOI18N
        lblThongke.setText("Thống Kê");
        lblThongke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThongkeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnThongKeLayout = new javax.swing.GroupLayout(pnThongKe);
        pnThongKe.setLayout(pnThongKeLayout);
        pnThongKeLayout.setHorizontalGroup(
            pnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnThongKeLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(lblThongke, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        pnThongKeLayout.setVerticalGroup(
            pnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongKeLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblThongke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        jPanel3.add(pnThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 594, -1, -1));

        pnHoaDon.setBackground(new java.awt.Color(62, 74, 88));
        pnHoaDon.setPreferredSize(new java.awt.Dimension(226, 60));
        pnHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnHoaDonMouseClicked(evt);
            }
        });

        lblHoaDon.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        lblHoaDon.setForeground(new java.awt.Color(242, 242, 242));
        lblHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bill.png"))); // NOI18N
        lblHoaDon.setText("Hoá Đơn");

        javax.swing.GroupLayout pnHoaDonLayout = new javax.swing.GroupLayout(pnHoaDon);
        pnHoaDon.setLayout(pnHoaDonLayout);
        pnHoaDonLayout.setHorizontalGroup(
            pnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHoaDonLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        pnHoaDonLayout.setVerticalGroup(
            pnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(pnHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 250, -1));

        pnBanHang.setBackground(new java.awt.Color(62, 74, 88));
        pnBanHang.setPreferredSize(new java.awt.Dimension(294, 60));
        pnBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnBanHangMouseClicked(evt);
            }
        });

        lblBanHang.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        lblBanHang.setForeground(new java.awt.Color(242, 242, 242));
        lblBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sell.png"))); // NOI18N
        lblBanHang.setText("Bán Hàng");

        javax.swing.GroupLayout pnBanHangLayout = new javax.swing.GroupLayout(pnBanHang);
        pnBanHang.setLayout(pnBanHangLayout);
        pnBanHangLayout.setHorizontalGroup(
            pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBanHangLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnBanHangLayout.setVerticalGroup(
            pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel3.add(pnBanHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 264, 245, -1));

        jPanel4.setBackground(new java.awt.Color(62, 74, 88));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/use.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 77, 90));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 0, -1, -1));

        lblTenNV.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTenNV.setForeground(new java.awt.Color(242, 242, 242));
        lblTenNV.setText("WELL COME TO HERE");
        jPanel3.add(lblTenNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 197, -1));

        lblChucVu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblChucVu.setForeground(new java.awt.Color(242, 242, 242));
        lblChucVu.setText("Chức Vụ");
        jPanel3.add(lblChucVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 70, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        pnscrene.setBackground(new java.awt.Color(241, 241, 241));
        pnscrene.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnscrene, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pnscrene, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMouseClicked
        // TODO add your handling code here:
        setColorJpanel(pnSanPham);
        resetColorJpane(pnBanHang);
        resetColorJpane(pnKhuyenMai);
        resetColorJpane(pnHoaDon);
        resetColorJpane(pnNhanVien);
        resetColorJpane(pnTrangChu);
        resetColorJpane(pnThongKe);
        resetColorJpane(pnKhachHang);

        setColor(lblSanPham);
        resetColor(lblHoaDon);
        resetColor(lblBanHang);
        resetColor(lblNhanVien);
        resetColor(lblTrangChu);
        resetColor(lblThongke);
        resetColor(lblKhuyenMai);
        resetColor(lblKhachHang);
        showPanel(new QuanLySanPhamJPanel());

    }//GEN-LAST:event_lblSanPhamMouseClicked

    private void lblTrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTrangChuMouseClicked
        // TODO add your handling code here:
        setColorJpanel(pnTrangChu);
        resetColorJpane(pnBanHang);
        resetColorJpane(pnKhuyenMai);
        resetColorJpane(pnHoaDon);
        resetColorJpane(pnNhanVien);
        resetColorJpane(pnSanPham);
        resetColorJpane(pnThongKe);
        resetColorJpane(pnKhachHang);

        setColor(lblTrangChu);
        resetColor(lblHoaDon);
        resetColor(lblBanHang);
        resetColor(lblNhanVien);
        resetColor(lblSanPham);
        resetColor(lblThongke);
        resetColor(lblKhuyenMai);
        resetColor(lblKhachHang);
        showPanel(new TrangChuJPanel());
    }//GEN-LAST:event_lblTrangChuMouseClicked

    private void pnTrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnTrangChuMouseClicked
        // TODO add your handling code here:
        setColorJpanel(pnTrangChu);
        resetColorJpane(pnBanHang);
        resetColorJpane(pnKhuyenMai);
        resetColorJpane(pnHoaDon);
        resetColorJpane(pnNhanVien);
        resetColorJpane(pnSanPham);
        resetColorJpane(pnThongKe);
        resetColorJpane(pnKhachHang);

        setColor(lblTrangChu);
        resetColor(lblHoaDon);
        resetColor(lblBanHang);
        resetColor(lblNhanVien);
        resetColor(lblSanPham);
        resetColor(lblThongke);
        resetColor(lblKhuyenMai);
        resetColor(lblKhachHang);
        showPanel(new TrangChuJPanel());
    }//GEN-LAST:event_pnTrangChuMouseClicked

    private void pnSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnSanPhamMouseClicked
        // TODO add your handling code here:
        setColorJpanel(pnSanPham);
        resetColorJpane(pnBanHang);
        resetColorJpane(pnKhuyenMai);
        resetColorJpane(pnHoaDon);
        resetColorJpane(pnNhanVien);
        resetColorJpane(pnTrangChu);
        resetColorJpane(pnThongKe);
        resetColorJpane(pnKhachHang);

        setColor(lblSanPham);
        resetColor(lblHoaDon);
        resetColor(lblBanHang);
        resetColor(lblNhanVien);
        resetColor(lblTrangChu);
        resetColor(lblThongke);
        resetColor(lblKhuyenMai);
        resetColor(lblKhachHang);
        showPanel(new QuanLySanPhamJPanel());
    }//GEN-LAST:event_pnSanPhamMouseClicked

    private void lblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangMouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        setColorJpanel(pnKhachHang);
        resetColorJpane(pnBanHang);
        resetColorJpane(pnKhuyenMai);
        resetColorJpane(pnHoaDon);
        resetColorJpane(pnNhanVien);
        resetColorJpane(pnTrangChu);
        resetColorJpane(pnThongKe);
        resetColorJpane(pnSanPham);

        setColor(lblKhachHang);
        resetColor(lblHoaDon);
        resetColor(lblBanHang);
        resetColor(lblNhanVien);
        resetColor(lblTrangChu);
        resetColor(lblThongke);
        resetColor(lblKhuyenMai);
        resetColor(lblSanPham);
        showPanel(new KhachHangJPanel());
    }//GEN-LAST:event_lblKhachHangMouseClicked

    private void pnKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnKhachHangMouseClicked
        // TODO add your handling code here:
        setColorJpanel(pnKhachHang);
        resetColorJpane(pnBanHang);
        resetColorJpane(pnKhuyenMai);
        resetColorJpane(pnHoaDon);
        resetColorJpane(pnNhanVien);
        resetColorJpane(pnTrangChu);
        resetColorJpane(pnThongKe);
        resetColorJpane(pnSanPham);

        setColor(lblKhachHang);
        resetColor(lblHoaDon);
        resetColor(lblBanHang);
        resetColor(lblNhanVien);
        resetColor(lblTrangChu);
        resetColor(lblThongke);
        resetColor(lblKhuyenMai);
        resetColor(lblSanPham);
        showPanel(new KhachHangJPanel());
    }//GEN-LAST:event_pnKhachHangMouseClicked

    private void pnNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnNhanVienMouseClicked
        // TODO add your handling code here:
        setColorJpanel(pnNhanVien);
        resetColorJpane(pnBanHang);
        resetColorJpane(pnKhuyenMai);
        resetColorJpane(pnHoaDon);
        resetColorJpane(pnKhachHang);
        resetColorJpane(pnTrangChu);
        resetColorJpane(pnThongKe);
        resetColorJpane(pnSanPham);

        setColor(lblNhanVien);
        resetColor(lblHoaDon);
        resetColor(lblBanHang);
        resetColor(lblKhachHang);
        resetColor(lblTrangChu);
        resetColor(lblThongke);
        resetColor(lblKhuyenMai);
        resetColor(lblSanPham);
        showPanel(new NhanVienJpanel());
    }//GEN-LAST:event_pnNhanVienMouseClicked

    private void pnKhuyenMaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnKhuyenMaiMouseClicked
        // TODO add your handling code here:
        setColorJpanel(pnKhuyenMai);
        resetColorJpane(pnBanHang);
        resetColorJpane(pnNhanVien);
        resetColorJpane(pnHoaDon);
        resetColorJpane(pnKhachHang);
        resetColorJpane(pnTrangChu);
        resetColorJpane(pnThongKe);
        resetColorJpane(pnSanPham);

        setColor(lblKhuyenMai);
        resetColor(lblHoaDon);
        resetColor(lblBanHang);
        resetColor(lblKhachHang);
        resetColor(lblTrangChu);
        resetColor(lblThongke);
        resetColor(lblNhanVien);
        resetColor(lblSanPham);
        showPanel(new KhuyenMaiJPanel());
    }//GEN-LAST:event_pnKhuyenMaiMouseClicked

    private void pnThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnThongKeMouseClicked
        // TODO add your handling code here:
        setColorJpanel(pnThongKe);
        resetColorJpane(pnBanHang);
        resetColorJpane(pnNhanVien);
        resetColorJpane(pnHoaDon);
        resetColorJpane(pnKhachHang);
        resetColorJpane(pnTrangChu);
        resetColorJpane(pnKhuyenMai);
        resetColorJpane(pnSanPham);

        setColor(lblThongke);
        resetColor(lblHoaDon);
        resetColor(lblBanHang);
        resetColor(lblKhachHang);
        resetColor(lblTrangChu);
        resetColor(lblKhuyenMai);
        resetColor(lblNhanVien);
        resetColor(lblSanPham);
        showPanel(new ThongKeJpanel());
    }//GEN-LAST:event_pnThongKeMouseClicked

    private void pnBanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBanHangMouseClicked
        // TODO add your handling code here:
        setColorJpanel(pnBanHang);
        resetColorJpane(pnThongKe);
        resetColorJpane(pnNhanVien);
        resetColorJpane(pnHoaDon);
        resetColorJpane(pnKhachHang);
        resetColorJpane(pnTrangChu);
        resetColorJpane(pnKhuyenMai);
        resetColorJpane(pnSanPham);

        setColor(lblBanHang);
        resetColor(lblHoaDon);
        resetColor(lblThongke);
        resetColor(lblKhachHang);
        resetColor(lblTrangChu);
        resetColor(lblKhuyenMai);
        resetColor(lblNhanVien);
        resetColor(lblSanPham);
        showPanel(new BanHangJPanel(lblTenNV.getText(), email));
    }//GEN-LAST:event_pnBanHangMouseClicked

    private void pnHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnHoaDonMouseClicked
        // TODO add your handling code here:
        setColorJpanel(pnHoaDon);
        resetColorJpane(pnThongKe);
        resetColorJpane(pnNhanVien);
        resetColorJpane(pnBanHang);
        resetColorJpane(pnKhachHang);
        resetColorJpane(pnTrangChu);
        resetColorJpane(pnKhuyenMai);
        resetColorJpane(pnSanPham);

        setColor(lblHoaDon);
        resetColor(lblBanHang);
        resetColor(lblThongke);
        resetColor(lblKhachHang);
        resetColor(lblTrangChu);
        resetColor(lblKhuyenMai);
        resetColor(lblNhanVien);
        resetColor(lblSanPham);
        showPanel(new HoaDonJPanel());

    }//GEN-LAST:event_pnHoaDonMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        jPopupMenu1.show(evt.getComponent(), -45, 70);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void mnDMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDMKActionPerformed
        // Đổi mật khẩu 
        DoiMK_View dmk = new DoiMK_View(email);
        dmk.setVisible(true);

    }//GEN-LAST:event_mnDMKActionPerformed

    private void mnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnThoatActionPerformed
        // Thoát 
        LoginView lg = new LoginView();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnThoatActionPerformed

    private void lblThongkeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongkeMouseClicked
        // TODO add your handling code here:
        setColorJpanel(pnThongKe);
        resetColorJpane(pnBanHang);
        resetColorJpane(pnNhanVien);
        resetColorJpane(pnHoaDon);
        resetColorJpane(pnKhachHang);
        resetColorJpane(pnTrangChu);
        resetColorJpane(pnKhuyenMai);
        resetColorJpane(pnSanPham);

        setColor(lblThongke);
        resetColor(lblHoaDon);
        resetColor(lblBanHang);
        resetColor(lblKhachHang);
        resetColor(lblTrangChu);
        resetColor(lblKhuyenMai);
        resetColor(lblNhanVien);
        resetColor(lblSanPham);
        showPanel(new ThongKeJpanel());
    }//GEN-LAST:event_lblThongkeMouseClicked

    private void lblKhuyenMaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhuyenMaiMouseClicked
        // TODO add your handling code here:
        setColorJpanel(pnKhuyenMai);
        resetColorJpane(pnBanHang);
        resetColorJpane(pnNhanVien);
        resetColorJpane(pnHoaDon);
        resetColorJpane(pnKhachHang);
        resetColorJpane(pnTrangChu);
        resetColorJpane(pnThongKe);
        resetColorJpane(pnSanPham);

        setColor(lblKhuyenMai);
        resetColor(lblHoaDon);
        resetColor(lblBanHang);
        resetColor(lblKhachHang);
        resetColor(lblTrangChu);
        resetColor(lblThongke);
        resetColor(lblNhanVien);
        resetColor(lblSanPham);
        showPanel(new KhuyenMaiJPanel());
    }//GEN-LAST:event_lblKhuyenMaiMouseClicked

    private void lblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienMouseClicked
        // TODO add your handling code here:
        setColorJpanel(pnNhanVien);
        resetColorJpane(pnBanHang);
        resetColorJpane(pnKhuyenMai);
        resetColorJpane(pnHoaDon);
        resetColorJpane(pnKhachHang);
        resetColorJpane(pnTrangChu);
        resetColorJpane(pnThongKe);
        resetColorJpane(pnSanPham);

        setColor(lblNhanVien);
        resetColor(lblHoaDon);
        resetColor(lblBanHang);
        resetColor(lblKhachHang);
        resetColor(lblTrangChu);
        resetColor(lblThongke);
        resetColor(lblKhuyenMai);
        resetColor(lblSanPham);
        showPanel(new NhanVienJpanel());
    }//GEN-LAST:event_lblNhanVienMouseClicked

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lblBanHang;
    private javax.swing.JLabel lblChucVu;
    private javax.swing.JLabel lblHoaDon;
    private javax.swing.JLabel lblKhachHang;
    private javax.swing.JLabel lblKhuyenMai;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JLabel lblSanPham;
    private javax.swing.JLabel lblTenNV;
    private javax.swing.JLabel lblThongke;
    private javax.swing.JLabel lblTrangChu;
    private javax.swing.JMenuItem mnDMK;
    private javax.swing.JMenuItem mnThoat;
    private javax.swing.JPanel pnBanHang;
    private javax.swing.JPanel pnHoaDon;
    private javax.swing.JPanel pnKhachHang;
    private javax.swing.JPanel pnKhuyenMai;
    private javax.swing.JPanel pnNhanVien;
    private javax.swing.JPanel pnSanPham;
    private javax.swing.JPanel pnThongKe;
    private javax.swing.JPanel pnTrangChu;
    private javax.swing.JPanel pnscrene;
    // End of variables declaration//GEN-END:variables

    private JPanel chidrenpanel;

    public void showPanel(JPanel panel) {
//        chidrenpanel = panel;
        pnscrene.removeAll();
        pnscrene.add(panel);
        pnscrene.validate();
    }

    public void SetAlignCenter() {
        lblBanHang.setHorizontalAlignment(JLabel.CENTER);
        lblHoaDon.setHorizontalAlignment(JLabel.CENTER);
        lblNhanVien.setHorizontalAlignment(JLabel.CENTER);
        lblSanPham.setHorizontalAlignment(JLabel.CENTER);
        lblKhuyenMai.setHorizontalAlignment(JLabel.CENTER);
        lblTrangChu.setHorizontalAlignment(JLabel.CENTER);
        lblKhachHang.setHorizontalAlignment(JLabel.CENTER);
//        lblDoiMK.setHorizontalAlignment(JLabel.CENTER);
    }
    private JPanel childPanel;

    public void fillPanel(JPanel pnl) {
        childPanel = pnl;
        pnscrene.removeAll();
        pnscrene.add(childPanel);
        pnscrene.validate();
        SetAlignCenter();
    }

    public void setColorJpanel(JPanel pane) {
        pane.setBackground(new java.awt.Color(46, 183, 169));
    }

    public void resetColorJpane(JPanel pane) {
        pane.setBackground(new java.awt.Color(62, 74, 88));
    }

    public void setColor(JLabel label) {
        label.setForeground(Color.black);
    }

    public void resetColor(JLabel label) {
        label.setForeground(Color.white);
    }
}
