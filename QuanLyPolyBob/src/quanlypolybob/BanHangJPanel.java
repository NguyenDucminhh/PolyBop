/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package quanlypolybob;


import quanlypolybob.Dao.LoaiVIDao;

import Model.LoaiVi;
import Model.ThuongHieu;
import Model.ChiTietVi;
import Repository.ChiTietViRepository;
import Model.Vi;
import java.awt.Label;
import quanlypolybob.Dao.ViDao;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import quanlypolybob.Dao.ThuongHieuDao;

/**
 *
 * @author KIPOSTEST
 */
public class BanHangJPanel extends javax.swing.JPanel {
     ViDao dao_vi = new ViDao();
    LoaiVIDao DaoLoaiVi = new LoaiVIDao();
    Locale vn = new Locale("vi", "VN");
    ThuongHieuDao dao_th = new ThuongHieuDao();
    LoaiVIDao dao_loaiVi = new LoaiVIDao();
    ChiTietViRepository ctvi_dao = new ChiTietViRepository();
    int row;
    DefaultTableModel modelCH = new DefaultTableModel();
    DefaultTableModel modelHH = new DefaultTableModel();
    List<LoaiVi> list_loaiVi;
    /**
     * Creates new form BanHangJPanel
     */
     
        
    public BanHangJPanel() {
       
          initComponents();
         // Thêm scrollPane vào giao diện\
          filltableSanPham();
          fillToCbbLoaiVi();
          getDateNow();
    }
  
    public void getDateNow() {
        Date date = new Date();
        String nowDay = quanlypolybob.Hepper.Xdate.toString(date, "yyyy-MM-dd");
        lblNgay.setText(nowDay);
    }
    private int currentPage = 1;
    private int recordsPerPage = 10;
    public void filltableSanPham() {
        
         List<Vi> listSP;
            DefaultTableModel mol;
            listSP = dao_vi.selectAll();
            mol = (DefaultTableModel) tblSanPham.getModel();
            mol.setRowCount(0);
            for (Vi vi : listSP) {
                mol.addRow(new Object[]{
                        vi.getMa_Vi(), 
                        vi.getTenVi(), 
                        vi.getKieuDang(), 
                        vi.isTrangThai()? "Còn" : "Hết Hàng"
                });
            }
                  int totalPages = (int) Math.ceil((double) dao_vi.getTotal()/ recordsPerPage);
                 pagelable.setText("Trang: " + currentPage + " / " + totalPages);
    }

        public void fillToCbbLoaiVi()
        {
        
         DefaultComboBoxModel modelcbo = (DefaultComboBoxModel) cbbLoaiVi.getModel();
         modelcbo.removeAllElements();
        list_loaiVi = dao_loaiVi.selectAll();
        for (LoaiVi loaivi : list_loaiVi) {
            modelcbo.addElement(loaivi.getTenLoaiVi());
        }
        }

    /*public void filltoTableHDCT() {
        DefaultTableModel model = (DefaultTableModel) tblHoadonchitiet.getModel();
        model.setRowCount(0);
        int i = 0;
        try {
            if (numberDesk == null) {
                return;
            }
            List<HoaDonChiTiet> list = DAOHDCHITIET.selectByIDBan(numberDesk.getIdBan());
            if (list.isEmpty()) {
                return;
            }
            for (HoaDonChiTiet hdct : list) {
                if (lblMaHoaDon.getText().equals("......")) {
                    return;
                }

                if (Integer.parseInt(lblMaHoaDon.getText()) == hdct.getID_Hoadon()) {
                    i += GiaTheoSize(hdct.getID_SanPHam()) * hdct.getSoluong();
                }
            }
            for (HoaDonChiTiet hdct : list) {
//                hdct.setGia(GiaTheoSize(hdct.getID_SanPHam()));
                hdct.setTongGia(GiaTheoSize(hdct.getID_SanPHam()) * hdct.getSoluong());
                SanPham sp = DAOSP.selectID(hdct.getID_SanPHam());
                model.addRow(new Object[]{
                    hdct.getID_Hoadon(),
                    hdct.getID_SanPHam(),
                    DAOSP.selecteByIDSP(hdct.getID_SanPHam()).getTen_sp(),
                    hdct.getSoluong(),
                    NumberFormat.getInstance().format(SanPhamGiamGia(sp.getId_sp(), sp.getGia_sp()) == 0 ? sp.getGia_sp() : SanPhamGiamGia(sp.getId_sp(), sp.getGia_sp())),
                    DAODVSP.selectid_DVDU(sp.getId_donviSP()).getTenDonvi(),
                    NumberFormat.getInstance().format(DAODVSP.selectid_DVDU(sp.getId_donviSP()).getThemTien()),
                    NumberFormat.getInstance().format(hdct.getTongGia()),
                    hdct.getGhiChu()
                });
            }

            tongTien(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

    /*public void taoDon() {
        Hoadon hd;
        //    int i = 0;
        //    if (list.isEmpty()) {
        //        i = 1;
        //    }else{
        //        hd = list.get(list.size() -1);
        //        i = hd.getIdHoaDon()+1;
        //    }
        if (numberDesk == null) {
            JOptionPane.showMessageDialog(this, "Chưa chọn bàn!!!!");
            return;
        }
        if (numberDesk.isHoatDong() == true) {
            DAOHOADON.insert(setInforHoaDon());
            DAOBAN.updateHoatDong(numberDesk.getIdBan());
            numberDesk.setHoatDong(false);
            List<Hoadon> list = DAOHOADON.selectAll();
            BanChiTiet bct = new BanChiTiet(list.get(list.size() - 1).getIdHoaDon(), numberDesk.getIdBan(), new Date(), true);
            System.out.println(list.get(list.size() - 1).getIdHoaDon() + "");
            DAOBanCT.insert(bct);
            filltoDesk();
            lblMaHoaDon.setText(list.get(list.size() - 1).getIdHoaDon() + "");
            resettrue();
        } else if (numberDesk.isHoatDong() == false) {
            JOptionPane.showMessageDialog(this, "Bàn có người không thể lập hóa đơn");
            System.out.println(numberDesk.isHoatDong());
        } else {
            if (JOptionPane.showConfirmDialog(this, "Bạn chưa chọn bàn cho đơn này, bạn có chắc đây là đơn mang về") == JOptionPane.YES_OPTION) {
//            lblMaHoaDon.setText(i+"");
//            DAOHOADON.insert(setInforHoaDon(i));
            }
        }
    } */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mnBanHang = new javax.swing.JPopupMenu();
        mnIThem = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoadon = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaGiamGia = new javax.swing.JTextField();
        txtTongTien = new javax.swing.JTextField();
        btnApDung = new javax.swing.JButton();
        btnTaoDon = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTongTien1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTongTien2 = new javax.swing.JTextField();
        btnThanhToan = new javax.swing.JButton();
        lblNgay = new javax.swing.JLabel();
        cbbLoaiVi = new javax.swing.JComboBox<>();
        pagelable = new javax.swing.JLabel();

        mnIThem.setText("jMenuItem1");
        mnBanHang.add(mnIThem);

        jMenuItem2.setText("jMenuItem2");
        mnBanHang.add(jMenuItem2);

        jMenuItem3.setText("jMenuItem3");
        mnBanHang.add(jMenuItem3);

        setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Quản lý bán hàng");

        txtTimKiem.setText("Nhập tên ví");
        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });

        btnTimKiem.setText("Tìm kiếm");

        tblHoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Sản phẩm", "Số lượng", "Đơn giá", "Thành tiền", "Thao tác"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHoadon);

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Ví", "Tên Ví", "Kiểu dáng", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblSanPham);

        jLabel2.setText("Mã giảm giá :");

        jLabel3.setText("Tổng tiền :");

        txtMaGiamGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaGiamGiaActionPerformed(evt);
            }
        });

        txtTongTien.setEnabled(false);

        btnApDung.setText("Áp dụng");

        btnTaoDon.setText("Tạo đơn");

        btnHuy.setText("Hủy");

        jLabel4.setText("Danh sách sản phẩm ");

        jLabel5.setText("Tính tiền");

        jLabel6.setText("Tiền khách trả: ");

        txtTongTien1.setEnabled(false);

        jLabel7.setText("Tiền thừa :");

        txtTongTien2.setEnabled(false);

        btnThanhToan.setText("Thanh Toán");

        lblNgay.setText("jLabel8");

        cbbLoaiVi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4xdư", "ve", "fvdve", "vev" }));

        pagelable.setText("jLabel8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnTimKiem))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbbLoaiVi, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(325, 325, 325))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMaGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTongTien1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTongTien2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnTaoDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnApDung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnHuy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(16, 16, 16))))
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(pagelable)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblNgay))
                .addGap(2, 2, 2)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbLoaiVi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimKiem)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnApDung)
                                .addComponent(txtMaGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTaoDon))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTongTien1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(btnThanhToan))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTongTien2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(btnHuy))
                        .addGap(32, 32, 32)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pagelable)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaGiamGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaGiamGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaGiamGiaActionPerformed

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApDung;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnTaoDon;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JComboBox<String> cbbLoaiVi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNgay;
    private javax.swing.JPopupMenu mnBanHang;
    private javax.swing.JMenuItem mnIThem;
    private javax.swing.JLabel pagelable;
    private javax.swing.JTable tblHoadon;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtMaGiamGia;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTongTien;
    private javax.swing.JTextField txtTongTien1;
    private javax.swing.JTextField txtTongTien2;
    // End of variables declaration//GEN-END:variables
}
