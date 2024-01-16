/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlypolybob.Dao;

import Model.XuatXu;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import quanlypolybob.Hepper.JDBCHeper;
/**
 *
 * @author Windows
 */
public class XuatXuDao implements InterfaceXuatXu{
        String selectAll = "select *from XuatXu";
    String update = "update XuatXu set TenThuongHieu =? , TrangThai = ? where Ma_XuatXu =?";
    String selectById = "select * from XuatXu where IDThuongHieu = ?";
    String selectById1 = "select * from XuatXu where Ma_ThuongHieu = ?";
    String insert = "insert into XuatXu (Ma_ThuongHieu , TenThuongHieu, TrangThai) values (?,?,?)";

 

    @Override
    public void insert(XuatXu sp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(XuatXu sp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<XuatXu> selectAll() {
  throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public XuatXu selectID(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<XuatXu> selectBySQL(String sql, Object... args) {
              List<XuatXu> list =new ArrayList<>();
        try {
            ResultSet rs = JDBCHeper.query(sql, args);
            while (rs.next()) {                
                XuatXu xx = new XuatXu();
                xx.setIdXuatXu(rs.getInt("idXuatXu"));
                xx.setMa_XuatXu(rs.getString("Ma_XuatXu"));
                xx.setTenXuatXu(rs.getString("tenXuatXu"));
                xx.setTrangThai(rs.getBoolean("trangThai"));
                list.add(xx);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
//        public String selectNameByID(int id) {
//        return selectBySQL(selectById, id).get(0).getTenThuongHieu();
//    }
//
//    public int selectIdByName(String name) {
//        String sql = "select * from ThuongHieu where TenThuongHieu =?";
//        return selectBySQL(sql, name).get(0).getIdThuongHieu();
//    }

    public XuatXu selectID1(String id) {
        List<XuatXu> list = selectBySQL(selectById1, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public int selectMaLOAISP() {
        try {
            String sql = "select max(cast(substring(Ma_ThuongHieu,4,LEN(IDThuongHieu))as int)) from  ThuongHieu ";
            ResultSet rs = JDBCHeper.query(sql);
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
