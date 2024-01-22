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
    String Select_all_Hd = "Select * from HoaDon";
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
                + "  where HoaDon.Ma_HoaDon = '" + ma + "'";
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
                + "  where Ma_HoaDon like '%"+seach+"%' or TenKhachHang like N'%"+seach+"%' or NhanVien.HoTen like N'%"+seach+"%' and HoaDon.TrangThai = 1";
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

    private List<HoaDon> selectBySql(String sql, Object... args) {
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
                Entity.isPhuongThucThanhToan(rs.getBoolean("PhuongThucThanhToan"));  
                Entity.setNgayThanhToan(rs.getDate("NgayThanhToan"));  
                Entity.isTrangThai(rs.getBoolean("TrangThai")); 
                listVi.add(Entity);
            }
            rs.getStatement().getConnection().close();
            return listVi;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
