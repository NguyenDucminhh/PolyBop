/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import Model.Vi;
import java.util.ArrayList;
import java.util.List;
import quanlypolybob.Hepper.JDBCHeper;

/**
 *
 * @author Admin
 */
public class ViRepository implements ViRepositoryImp{
String SELECT_ALL_SQL = "select * from Vi ";
    @Override
    public void insert(Vi Entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Vi Entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public NhanVien selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public NhanVien selectByAccount(String account) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Vi> selectAll() {
         return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public List<Vi> selectBySql(String sql, Object... args) {
         List<Vi> listVi = new ArrayList<>();
        try {
            ResultSet rs = JDBCHeper.query(sql, args);
            while (rs.next()) {
                Vi Entity = new Vi(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getBoolean(6));
                Entity.setIDVi(rs.getInt("IDVi"));
                Entity.setID_ThuongHieu(rs.getInt("ID_ThuongHieu"));
                Entity.setMa_Vi(rs.getString("Ma_Vi"));
                Entity.setTenVi(rs.getString("TenVi"));
                Entity.setUrl_Anh(rs.getString("Url_Anh"));
                Entity.setTrangThai(rs.getBoolean("TrangThai"));     
                listVi.add(Entity);
            }
            rs.getStatement().getConnection().close();
            return listVi;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

   
    
}
