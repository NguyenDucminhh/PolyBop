/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import quanlypolybob.Hepper.JDBCHeper;
import Model.HoaDon;
import Model.HoaDonCT;
import Model.HoaDonCT1;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import Repository.DBconnect;
import java.util.ArrayList;
import java.util.List;

public class HoaDonDAO implements InterfaceHoaDon {

    String INSERT_SQL = "INSERT dbo.HoaDon VALUES (?,?,?,?,?,?,?,?,?,?)";
    String Select_all_Hd = "Select *from HoaDon";

    @Override
    public List<HoaDonCT> getAll() {
        String sql = "SELECT [IDHoaDon]\n"
                + "	  ,[Ma_HoaDon]\n"
                + "      ,KhachHang.TenKhachHang\n"
                + "      ,NhanVien.HoTen as N'Tên nhân viên'\n"
                + "      ,[ID_KhuyenMai]  \n"
                + "      ,[TienSauGiamGia]\n"
                + "      ,[ThanhTien]\n"
                + "      ,[PhuongThucThanhToan]\n"
                + "      ,[NgayThanhToan]\n"
                + "      ,HoaDon.TrangThai\n"
                + "  FROM [PoLyBop].[dbo].[HoaDon]\n"
                + "  join KhachHang on KhachHang.IDKhangHang = HoaDon.ID_KhachHang\n"
                + "  join NhanVien on NhanVien.IDNhanVien = HoaDon.ID_NhanVien\n"
                + "  where HoaDon.TrangThai = 1";
        List<HoaDonCT> listHoaDon = new ArrayList<>();
        try (Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonCT hd = new HoaDonCT(rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getDouble(6), rs.getDouble(7), rs.getInt(8), rs.getString(9), rs.getInt(10));
                listHoaDon.add(hd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDon;
    }

    @Override
    public List<HoaDonCT1> getAllCTHD(String ma) {
        String sql = "SELECT HoaDonChiTiet.Ma_HoaDonChiTiet\n"
                + "      ,[ID_ChiTietVi]\n"
                + "	  ,Vi.Ma_Vi\n"
                + "	  ,Vi.TenVi\n"
                + "      ,HoaDonChiTiet.SoLuong\n"
                + "      ,[DonGia]\n"
                + "  FROM [PoLyBop].[dbo].[HoaDonChiTiet] \n"
                + "  join HoaDon on HoaDon.IDHoaDon = HoaDonChiTiet.ID_HoaDon \n"
                + "  join (ChiTietVi join Vi on Vi.IDVi = ChiTietVi.ID_Vi ) on ChiTietVi.IDChiTietVi = HoaDonChiTiet.ID_ChiTietVi\n"
                + "  where HoaDon.Ma_HoaDon = '" + ma + "' and HoaDonChiTiet.TrangThai = 1";
        List<HoaDonCT1> listHoaDonCT = new ArrayList<>();
        try (Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonCT1 hd1 = new HoaDonCT1(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getDouble(6));
                listHoaDonCT.add(hd1);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDonCT;
    }

    @Override
    public List<HoaDonCT> timKiem(String seach) {
        List<HoaDonCT> listSeach = new ArrayList<>();
        String sql = "SELECT [IDHoaDon]\n"
                + "	 ,[Ma_HoaDon]\n"
                + "      ,KhachHang.TenKhachHang\n"
                + "      ,NhanVien.HoTen "
                + "      ,[ID_KhuyenMai]  \n"
                + "      ,[TienSauGiamGia]\n"
                + "      ,[ThanhTien]\n"
                + "      ,[PhuongThucThanhToan]\n"
                + "      ,[NgayThanhToan]\n"
                + "      ,HoaDon.TrangThai\n"
                + "  FROM [PoLyBop].[dbo].[HoaDon]\n"
                + "  join KhachHang on KhachHang.IDKhangHang = HoaDon.ID_KhachHang\n"
                + "  join NhanVien on NhanVien.IDNhanVien = HoaDon.ID_NhanVien\n"
                + "  where Ma_HoaDon like '%" + seach + "%' or TenKhachHang like N'%" + seach + "%' or NhanVien.HoTen like N'%" + seach + "%' and HoaDon.TrangThai = 1";
        try (Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonCT hd11 = new HoaDonCT(rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getDouble(6), rs.getDouble(7), rs.getInt(8), rs.getString(9), rs.getInt(10));
                listSeach.add(hd11);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listSeach;
    }

    @Override
    public void insert(HoaDon Entity) {
        quanlypolybob.Hepper.JDBCHeper.update(INSERT_SQL, Entity.getIdHoaDon(), Entity.getIdKhachHang(), Entity.getIdNhanVien(),
                Entity.getIdKhuyenMai(), Entity.getMaHoaDon(), Entity.getTienSauGiamGia(), Entity.getThanhTien(), Entity.isPhuongThucThanhToan(),
                Entity.getNgayThanhToan(), Entity.isTrangThai());
    }

    @Override
    public List<HoaDon> SelectAll() {
        return this.selectBySql(Select_all_Hd);
    }

    @Override
    public List<HoaDon> selectBySql(String sql, Object... args) {
        List<HoaDon> listVi = new ArrayList<>();
        try {
            ResultSet rs = JDBCHeper.query(sql, args);
            while (rs.next()) {
                HoaDon Entity = new HoaDon();
                Entity.setIdHoaDon(rs.getInt("IDHoaDon"));
                Entity.setIdKhachHang(rs.getInt("ID_KhachHang"));
                Entity.setIdNhanVien(rs.getInt("ID_NhanVien"));
                Entity.setIdKhuyenMai(rs.getInt("ID_KhuyenMai"));
                Entity.setMaHoaDon(rs.getString("Ma_HoaDon"));
                Entity.setTienSauGiamGia(rs.getDouble("TienSauGiamGia"));
                Entity.setThanhTien(rs.getDouble("ThanhTien"));
                Entity.setPhuongThucThanhToan(rs.getBoolean("PhuongThucThanhToan"));
                Entity.setNgayThanhToan(rs.getDate("NgayThanhToan"));
                Entity.setTrangThai(rs.getBoolean("TrangThai"));
                listVi.add(Entity);
            }
            rs.getStatement().getConnection().close();
            return listVi;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Boolean saveHoaDon(HoaDon hoaDon) {
        int checkInsert = 0;
        String sql = ("INSERT dbo.HoaDon (NgayThanhToan,TrangThai) VALUES (?,?)");
        try (Connection conn = DBconnect.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, hoaDon.getNgayThanhToan());
            ps.setObject(2, hoaDon.isTrangThai());

            checkInsert = ps.executeUpdate();
            return checkInsert > 0;

        } catch (Exception ex) {
            ex.getMessage();
        }
        return null;
    }

    @Override
    public ArrayList<HoaDon> getListHoaDon() {
        ArrayList<HoaDon> list = new ArrayList<>();
        String sql = "Select IDHoaDon,NgayThanhToan,TrangThai from HoaDon";
        try (Connection conn = DBconnect.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon hoaDon = new HoaDon();
                hoaDon.setIdHoaDon(rs.getInt(1));
                hoaDon.setNgayThanhToan(rs.getDate(2));
                hoaDon.setTrangThai(rs.getBoolean(3));
                list.add(hoaDon);
            }

        } catch (Exception ex) {
            ex.getMessage();
        }
        return list;
    }

    @Override
    public List<HoaDonCT> getAllHDChuaHT() {
        String sql = "SELECT [IDHoaDon]\n"
                + "	  ,[Ma_HoaDon]\n"
                + "      ,KhachHang.TenKhachHang\n"
                + "      ,NhanVien.HoTen as N'Tên nhân viên'\n"
                + "      ,[ID_KhuyenMai]  \n"
                + "      ,[TienSauGiamGia]\n"
                + "      ,[ThanhTien]\n"
                + "      ,[PhuongThucThanhToan]\n"
                + "      ,[NgayThanhToan]\n"
                + "      ,HoaDon.TrangThai\n"
                + "  FROM [PoLyBop].[dbo].[HoaDon]\n"
                + "  join KhachHang on KhachHang.IDKhangHang = HoaDon.ID_KhachHang\n"
                + "  join NhanVien on NhanVien.IDNhanVien = HoaDon.ID_NhanVien\n"
                + "  where HoaDon.TrangThai = 0";
        List<HoaDonCT> listHD = new ArrayList<>();
        try (Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonCT hd = new HoaDonCT(rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getDouble(6), rs.getDouble(7), rs.getInt(8), rs.getString(9), rs.getInt(10));
                listHD.add(hd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHD;
    }

    // Lấy ra id nhân viên qua email
    @Override
    public int getIDNhanVien(String emailNV) {
        int id = 0;
        String sql = " SELECT IDNhanVien FROM NhanVien where Email = '" + emailNV + "' ";
        try (Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }

    // lấy ra id khách hàng qua sđt
    @Override
    public int getIDKhachHang(String sdt) {
        int id = 0;
        String sql = " SELECT IDKhangHang FROM KhachHang where SDT = '" + sdt + "' ";
        try (Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }

    // Tạo hóa đơn chờ 
    @Override
    public void addHoaDon(int IDKH, int IDNhanVien, int IDKhuyenMai, String maHD, double tongTien, int PTTT) {
        String sql = "INSERT INTO [dbo].[HoaDon]\n"
                + "           ([ID_KhachHang]\n"
                + "           ,[ID_NhanVien]\n"
                + "           ,[ID_KhuyenMai]\n"
                + "           ,[Ma_HoaDon]\n"
                + "           ,[TienSauGiamGia]\n"
                + "           ,[ThanhTien]\n"
                + "           ,[PhuongThucThanhToan]\n"
                + "           ,[NgayThanhToan]\n"
                + "           ,[TrangThai])\n"
                + "     VALUES\n"
                + "           (" + IDKH + ""
                + "           ," + IDNhanVien + ""
                + "           ," + IDKhuyenMai + ""
                + "           ,'" + maHD + "'"
                + "           ,NULL\n"
                + "           ," + tongTien + "\n"
                + "           ," + PTTT + "\n"
                + "           ,GETDATE()\n"
                + "           ,0)";
        try (Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void removeHoaDon(String ma) {
        String sql = "DELETE FROM [dbo].[HoaDon]\n"
                + "      WHERE Ma_HoaDon = '" + ma + "' ";
        try (Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Lấy ra id hóa đơn 
    @Override
    public int getIDHD(String maHD) {
        int id = 0;
        String sql = "select IDHoaDon from HoaDon where Ma_HoaDon = '" + maHD + "' ";
        try (Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }

    // Thêm sản phẩm vào hóa đơn chi tiết 
    @Override
    public void addSPHDCT(int IDHD, int IDCTSP, String maHDCT, int soLuong, double donGia) {
        String sql = "INSERT INTO [dbo].[HoaDonChiTiet]\n"
                + "           ([ID_HoaDon]\n"
                + "           ,[ID_ChiTietVi]\n"
                + "           ,[Ma_HoaDonChiTiet]\n"
                + "           ,[SoLuong]\n"
                + "           ,[DonGia]\n"
                + "           ,[TrangThai])\n"
                + "     VALUES\n"
                + "           (" + IDHD + "\n"
                + "           ," + IDCTSP + "\n"
                + "           ,'" + maHDCT + "'\n"
                + "           ," + soLuong + "\n"
                + "           ," + donGia + "\n"
                + "           ,1)";
        try (Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Tăng số lượng 
    @Override
    public void updateSLSPHDCT(String maHD, int soLuong) {
        String sql = "update HoaDonChiTiet set SoLuong = SoLuong + " + soLuong + " where Ma_HoaDonChiTiet = '" + maHD + "' ";
        try (Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setSLHDCT(int IDHDCT, int soLuong) {
        String sql = "UPDATE HoaDonChiTiet set SoLuong = " + soLuong + " \n"
                + "where ID_ChiTietVi = " + IDHDCT + " ";
        try (Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getID_CTSP(String maHDCT) {
        int id = 0;
        String sql = "Select ID_ChiTietVi from HoaDonChiTiet where Ma_HoaDonChiTiet = '" + maHDCT + "' ";
        try (Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }

    @Override
    public void deleteSPHDCT(int IDHDCT) {
        String sql = "delete HoaDonChiTiet where ID_ChiTietVi = " + IDHDCT + "";
        try (Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
