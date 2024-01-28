/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlypolybob.Dao;

import Model.HoaDon;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import quanlypolybob.Hepper.JDBCHeper;

/**
 *
 * @author Windows
 */
public class HoaDonDao {

    String select_Trangthai1 = "SELECT * FROM Vi WHERE Trangthai = 0";

    public List<HoaDon> selectAll() {
        return selectBySQL(select_Trangthai1);
    }

    public List<HoaDon> selectBySQL(String sql, Object... args) {
        List<HoaDon> list_vi = new ArrayList<>();
        try {
            ResultSet rs = JDBCHeper.query(sql, args);
            while (rs.next()) {
                HoaDon sp = new HoaDon();
                sp.setIdHoaDon(rs.getInt("IdHoaDon"));
                sp.setIdKhachHang(rs.getInt("IdKhachHang"));
                sp.setIdNhanVien(rs.getInt("IdNhanVien"));
                sp.setIdKhuyenMai(rs.getInt("IdKhuyenMai"));
//                sp.setMaHoaDon(rs.getString(MaHoaDon))
//                sp.setID_ThuongHieu(rs.getInt("ID_ThuongHieu"));
//                sp.setMa_Vi(rs.getString("Ma_Vi"));
//                sp.setTenVi(rs.getString("tenVi"));
//                sp.setKieuDang(rs.getString("kieuDang"));
//                sp.setTrangThai(rs.getBoolean("trangThai"));
//                sp.setUrl_Anh(rs.getString("Url_anh"));
                list_vi.add(sp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list_vi;
    }
}
