/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package quanlypolybob;

import Model.HoaDonCT;
import Model.HoaDonCT1;
import Service.HoaDonDAO;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JDayChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KIPOSTEST
 */
public class HoaDonJPanel extends javax.swing.JPanel {

    DefaultTableModel mol = new DefaultTableModel();
    HoaDonDAO service = new HoaDonDAO();
    int index = -1;
    String maHD;

    public HoaDonJPanel() {
        initComponents();
//        this.fillTable(service.getAll());
        fillTableWithPagination();
//         this.fillTable(service.getAll());
        cbNgayBatDau.setEnabled(false);
        cbNgayKetThuc.setEnabled(false);
        dateSelect();

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
        txt_timKiem = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cbo_HinhThucThanhToan = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        cbNgayBatDau = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        cbNgayKetThuc = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_HoaDon = new javax.swing.JTable();
        btnTimKiem = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_hoaDonCT = new javax.swing.JTable();
        btnFirstPage = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        pageLabel = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnLastPage = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnExport = new javax.swing.JButton();
        cb_dateType = new javax.swing.JComboBox<>();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Hóa Đơn");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setText("Tìm kiếm hóa đơn");

        txt_timKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_timKiemKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_timKiemKeyReleased(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hình thức thanh toán", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15))); // NOI18N

        cbo_HinhThucThanhToan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn Hình Thức Thanh Toán", "Tiền Mặt", "Chuyển Khoản" }));
        cbo_HinhThucThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_HinhThucThanhToanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbo_HinhThucThanhToan, 0, 218, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbo_HinhThucThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ngày bắt đầu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbNgayBatDau, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbNgayBatDau, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ngày kết thúc", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(cbNgayKetThuc, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbNgayKetThuc, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        tbl_HoaDon.setAutoCreateRowSorter(true);
        tbl_HoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Hóa Đơn", "Tên Khách Hàng", "Tên Nhân Viên", "Tổng Tiền", "Phương Thức Thanh Toán", "Ngày Thanh Toán"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_HoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_HoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_HoaDon);

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        tbl_hoaDonCT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã HĐCT", "Mã Ví", "Tên Ví", "Số Lượng", "Tổng Tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_hoaDonCT);

        btnFirstPage.setText("|<");
        btnFirstPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstPageActionPerformed(evt);
            }
        });

        btnPrev.setText("<");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        pageLabel.setText("jLabel12");

        btnNext.setText(">");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLastPage.setText(">|");
        btnLastPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastPageActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Hóa Đơn");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Hóa Đơn Chi Tiết");

        btnExport.setText("Export PDF");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        cb_dateType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tùy chỉnh", "Hôm nay", "Tháng này", "Năm nay" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(411, 411, 411)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(41, 41, 41)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(179, 179, 179)
                                    .addComponent(btnTimKiem)
                                    .addGap(44, 44, 44)
                                    .addComponent(cb_dateType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(455, 455, 455)
                            .addComponent(btnExport)
                            .addGap(18, 18, 18)
                            .addComponent(btnFirstPage)
                            .addGap(18, 18, 18)
                            .addComponent(btnPrev)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pageLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnNext)
                            .addGap(18, 18, 18)
                            .addComponent(btnLastPage)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem)
                    .addComponent(cb_dateType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLastPage)
                    .addComponent(btnNext)
                    .addComponent(pageLabel)
                    .addComponent(btnPrev)
                    .addComponent(btnFirstPage)
                    .addComponent(btnExport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_HoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_HoaDonMouseClicked
        // Hiện hóa đơn chi tiết 
        this.showHDCT();
    }//GEN-LAST:event_tbl_HoaDonMouseClicked

    private void txt_timKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_timKiemKeyPressed

    }//GEN-LAST:event_txt_timKiemKeyPressed

    private void txt_timKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_timKiemKeyReleased
        // Tìm kiếm 
//        this.fillTable(service.timKiem(txt_timKiem.getText()));
    }//GEN-LAST:event_txt_timKiemKeyReleased

    private void cbo_HinhThucThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_HinhThucThanhToanActionPerformed
        // Lọc hình thức thanh toán 
//        this.locHinhThucThanhToan();
    }//GEN-LAST:event_cbo_HinhThucThanhToanActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        filterHoaDon();
        String keySearch = txt_timKiem.getText();
        Integer payMethod = cbo_HinhThucThanhToan.getSelectedIndex();
        int totalRecords = service.getTotalFilteredHoaDon(null, null, keySearch, payMethod);
        int totalPages = (int) Math.ceil((double) totalRecords / recordsPerPage);
        pageLabel.setText("Trang: " + currentPage + " / " + totalPages);
        System.out.println("current page: " + currentPage);
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnFirstPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstPageActionPerformed
        if (currentPage > 1) {
            currentPage = 1;
            filterHoaDon();
        }
    }//GEN-LAST:event_btnFirstPageActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        if (currentPage > 1) {
            currentPage--;
            filterHoaDon();
        }
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        int totalRecords = service.getTotalHoaDon();
        int totalPages = (int) Math.ceil((double) totalRecords / recordsPerPage);

        if (currentPage < totalPages) {
            currentPage++;
            filterHoaDon();
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastPageActionPerformed
        int totalRecords = service.getTotalHoaDon();
        int totalPages = (int) Math.ceil((double) totalRecords / recordsPerPage);

        if (currentPage < totalPages) {
            currentPage = totalPages;
            filterHoaDon();
        }
    }//GEN-LAST:event_btnLastPageActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        printToPDF();
    }//GEN-LAST:event_btnExportActionPerformed

    private String removeDiacritics(String input) {
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        return normalized.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }

    private void printToPDF() {
        int selectedRow = tbl_HoaDon.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một hóa đơn để in!");
            return;
        }

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Chọn nơi lưu file PDF");

        FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF Files", "pdf");
        fileChooser.setFileFilter(filter);

        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            try {
                String filePath = fileChooser.getSelectedFile().getAbsolutePath();
                if (!filePath.toLowerCase().endsWith(".pdf")) {
                    filePath += ".pdf";
                }

                Document document = new Document();
                PdfWriter.getInstance(document, new FileOutputStream(filePath));
                Font font = new Font(Font.FontFamily.TIMES_ROMAN, 12);
                document.open();

                for (int j = 0; j < tbl_HoaDon.getColumnCount(); j++) {
                    String label = tbl_HoaDon.getColumnName(j) + ": ";
                    String value = tbl_HoaDon.getValueAt(selectedRow, j).toString();
                    // Xóa dấu của label và value
                    String labelWithoutDiacritics = removeDiacritics(label);
                    String valueWithoutDiacritics = removeDiacritics(value);

                    Paragraph paragraph = new Paragraph(labelWithoutDiacritics + valueWithoutDiacritics, font);
                    paragraph.setFont(font);
                    document.add(paragraph);
                }

                // Kiểm tra xem tbl_HoaDonCT có được chọn hay không
                // Thêm bảng hóa đơn chi tiết vào PDF
                PdfPTable detailTable = new PdfPTable(tbl_hoaDonCT.getColumnCount());
                for (int i = 0; i < tbl_hoaDonCT.getColumnCount(); i++) {
                    String columnName = tbl_hoaDonCT.getColumnName(i);
                    // Xóa dấu của tên cột
                    String columnNameWithoutDiacritics = removeDiacritics(columnName);
                    detailTable.addCell(new PdfPCell(new Phrase(columnNameWithoutDiacritics)));
                }
                for (int i = 0; i < tbl_hoaDonCT.getRowCount(); i++) {
                    for (int j = 0; j < tbl_hoaDonCT.getColumnCount(); j++) {
                        String value = tbl_hoaDonCT.getValueAt(i, j).toString();
                        // Xóa dấu của giá trị
                        String valueWithoutDiacritics = removeDiacritics(value);
                        detailTable.addCell(valueWithoutDiacritics);
                    }
                }
                document.add(detailTable);

                document.close();

                JOptionPane.showMessageDialog(this, "Thông tin đã được in vào file PDF!");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnFirstPage;
    private javax.swing.JButton btnLastPage;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnTimKiem;
    private com.toedter.calendar.JDateChooser cbNgayBatDau;
    private com.toedter.calendar.JDateChooser cbNgayKetThuc;
    private javax.swing.JComboBox<String> cb_dateType;
    private javax.swing.JComboBox<String> cbo_HinhThucThanhToan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel pageLabel;
    private javax.swing.JTable tbl_HoaDon;
    private javax.swing.JTable tbl_hoaDonCT;
    private javax.swing.JTextField txt_timKiem;
    // End of variables declaration//GEN-END:variables

    private void fillTablett(List<HoaDonCT> list) {
        mol = (DefaultTableModel) tbl_HoaDon.getModel();
        mol.setRowCount(0);
        for (HoaDonCT x : list) {
            if (x.getThanhTien() != 0) {
                mol.addRow(new Object[]{
                    x.getMaHD(),
                    x.getTenKH(),
                    x.getTenNV(),
                    x.getThanhTien(),
                    x.getPTTT(),
                    x.getNgayTT(),});
            }
        }
    }

    private void filterHoaDon() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Lấy giá trị từ JDateChooser
        Date startDate = cbNgayBatDau.getDate();
        Date endDate = cbNgayKetThuc.getDate();
        String selectedOption = (String) cb_dateType.getSelectedItem();
        Calendar calendar = Calendar.getInstance();

        switch (selectedOption) {
            case "Hôm nay":
                startDate = calendar.getTime();
                endDate = calendar.getTime();
                break;
            case "Tháng này":
                calendar.set(Calendar.DAY_OF_MONTH, 1);
                startDate = calendar.getTime();
                calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
                endDate = calendar.getTime();
                break;
            case "Năm nay":
                calendar.set(Calendar.MONTH, Calendar.JANUARY);
                calendar.set(Calendar.DAY_OF_MONTH, 1);
                startDate = calendar.getTime();
                calendar.set(Calendar.MONTH, Calendar.DECEMBER);
                calendar.set(Calendar.DAY_OF_MONTH, 31);
                endDate = calendar.getTime();
                break;
            case "Tùy chỉnh":
                // Xử lý tùy chọn tùy chỉnh nếu cần
                break;
            default:
                // Xử lý trường hợp khác nếu cần
                break;
        }
        // Kiểm tra xem cả cbNgayBatDau và cbNgayKetThuc có giá trị null không
        if (startDate != null || endDate != null) {
            String startDateStr = (startDate != null) ? simpleDateFormat.format(startDate) : null;
            String endDateStr = (endDate != null) ? simpleDateFormat.format(endDate) : null;
            String keySearch = txt_timKiem.getText();
            Integer payMethod = cbo_HinhThucThanhToan.getSelectedIndex();

            // Xử lý khi giá trị payMethod là 0, tức là tìm kiếm theo tất cả
            if (payMethod == 0) {
                // Gọi phương thức filterHoaDon từ service với thêm các thông tin tìm kiếm và phân trang
                List<HoaDonCT> hoaDons = service.filterHoaDon(startDateStr, endDateStr, keySearch, null, currentPage, recordsPerPage);

                fillTable(hoaDons);

            } else if (payMethod == 1 || payMethod == 2) {
                // Gọi phương thức filterHoaDon từ service với thêm các thông tin tìm kiếm, phân trang, và hình thức thanh toán
                List<HoaDonCT> hoaDons = service.filterHoaDon(startDateStr, endDateStr, keySearch, payMethod - 1, currentPage, recordsPerPage);

                fillTable(hoaDons);

            } else {
                // Thực hiện xử lý khi giá trị payMethod không hợp lệ
                JOptionPane.showMessageDialog(this, "Lựa chọn hình thức thanh toán không hợp lệ");
            }
        } else {
            // Xử lý khi cả hai ngày đều là null
            String keySearch = txt_timKiem.getText();
            Integer payMethod = cbo_HinhThucThanhToan.getSelectedIndex();

            // Xử lý khi giá trị payMethod là 0, tức là tìm kiếm theo tất cả
            if (payMethod == 0) {
                // Gọi phương thức filterHoaDon từ service với thêm các thông tin tìm kiếm
                List<HoaDonCT> hoaDons = service.filterHoaDon(null, null, keySearch, null, currentPage, recordsPerPage);
                fillTable(hoaDons);

            } else if (payMethod == 1 || payMethod == 2) {
                // Gọi phương thức filterHoaDon từ service với thêm các thông tin tìm kiếm theo hình thức thanh toán
                List<HoaDonCT> hoaDons = service.filterHoaDon(null, null, keySearch, payMethod - 1, currentPage, recordsPerPage);

                fillTable(hoaDons);

            } else {
                // Thực hiện xử lý khi giá trị payMethod không hợp lệ
                JOptionPane.showMessageDialog(this, "Lựa chọn hình thức thanh toán không hợp lệ");
            }
        }
    }

    private void fillTable(List<HoaDonCT> list) {
        mol = (DefaultTableModel) tbl_HoaDon.getModel();
        mol.setRowCount(0);
        for (HoaDonCT x : list) {
            mol.addRow(new Object[]{
                x.getMaHD(),
                x.getTenKH(),
                x.getTenNV(),
                x.getThanhTien(),
                x.getPTTT(),
                x.getNgayTT(),});
        }
        int totalPages = (int) Math.ceil((double) service.getTotalHoaDon() / recordsPerPage);
        pageLabel.setText("Trang: " + currentPage + " / " + totalPages);
    }

    private void fillTableWithPagination() {
        List<HoaDonCT> list = service.getAllByPage(currentPage, recordsPerPage);
        fillTable(list);
        int totalRecords = service.getTotalHoaDon(); // Update total records
        int totalPages = (int) Math.ceil((double) totalRecords / recordsPerPage); // Recalculate total pages
        pageLabel.setText("Trang: " + currentPage + " / " + totalPages);
    }

    private int currentPage = 1;
    private int recordsPerPage = 5;

    private void fillTableByPage() {
        List<HoaDonCT> list = service.getAllByPage(currentPage, recordsPerPage);
        mol = (DefaultTableModel) tbl_HoaDon.getModel();
        mol.setRowCount(0);
        for (HoaDonCT x : list) {
            mol.addRow(new Object[]{
                x.getMaHD(),
                x.getTenKH(),
                x.getTenNV(),
                x.getThanhTien(),
                x.getPTTT(),
                x.getNgayTT(),});
        }
    }

    private void showHDCT() {
        fillHDCTTable();
    }

    private void fillHDCTTable() {
        index = tbl_HoaDon.getSelectedRow();
        if (index != -1) {
            HoaDonCT hd = service.timKiem(txt_timKiem.getText()).get(index);
            maHD = hd.getMaHD();
            DefaultTableModel molHDCT = (DefaultTableModel) tbl_hoaDonCT.getModel();
            molHDCT.setRowCount(0);
            for (HoaDonCT1 hoaDonCT1 : service.getAllCTHD(maHD)) {
                molHDCT.addRow(new Object[]{
                    hoaDonCT1.getMaHDCT(),
                    hoaDonCT1.getMaVi(),
                    hoaDonCT1.getTenVi(),
                    hoaDonCT1.getSoLuong(),
                    hoaDonCT1.getTongTien()
                });
            }
        }
    }

    private void dateSelect() {
        cb_dateType.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox cb = (JComboBox) e.getSource();
                String selectedOption = (String) cb.getSelectedItem();
                if (selectedOption.equals("Tùy chỉnh")) {
                    cbNgayBatDau.setEnabled(true);
                    cbNgayKetThuc.setEnabled(true);
                } else {
                    cbNgayBatDau.setEnabled(false);
                    cbNgayKetThuc.setEnabled(false);
                }
            }
        });
    }

}
