/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlypolybob.Dao;

import Model.ThuongHieu;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import quanlypolybob.Hepper.JDBCHeper;
/**
 *
 * @author Windows
 */
public class ThuongHieuDao implements InterfaceThuongHieu{
String selectAll = "select *from ThuongHieu";
String selectById ="select * from ThuongHieu where IDThuongHieu = ?";
    @Override
    public void insert(ThuongHieu sp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(ThuongHieu sp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ThuongHieu> selectAll() {
        return selectBySQL(selectAll);
    }

    @Override
    public ThuongHieu selectID(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ThuongHieu> selectBySQL(String sql, Object... args) {
        List<ThuongHieu> list_th = new ArrayList<>();
        
        try {
            ResultSet rs = JDBCHeper.query(sql, args);
            while (rs.next()) {                
                ThuongHieu th = new ThuongHieu();
                th.setIdThuongHieu(rs.getInt("idThuongHieu"));
                th.setTenThuongHieu(rs.getString("tenThuongHieu"));
                th.setTrangThai(rs.getBoolean("trangThai"));
                list_th.add(th);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list_th;
    }
    public String selectNameByID(int id){
        return selectBySQL(selectById, id).get(0).getTenThuongHieu();
    }
      public int selectIdByName(String name){
        String sql = "select * from ThuongHieu where TenThuongHieu =?";
        return selectBySQL(sql, name).get(0).getIdThuongHieu();
    }
}
