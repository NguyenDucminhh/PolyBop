/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlypolybob.Dao;

import Model.LoaiVi;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;
import quanlypolybob.Hepper.JDBCHeper;

/**
 *
 * @author Admin
 */
public class LoaiVIDao implements InterfaceLoaiVi {

    public LoaiVIDao() {
    }

    @Override
    public void insert(LoaiVi sp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(LoaiVi sp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LoaiVi selectID(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<LoaiVi> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<LoaiVi> selectBySQL(String sql, Object... args) {
        List<LoaiVi> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHeper.query(sql, args);
            while (rs.next()) {
                LoaiVi lv = new LoaiVi();
                lv.setIdLoaiVi(rs.getInt("idLoaiVi"));
                lv.setMa_LoaiVi(rs.getString("Ma_LoaiVi"));
                lv.setTenLoaiVi(rs.getString("tenLoaiVi"));
                lv.setTrangThai(rs.getBoolean("trangThai"));
                list.add(lv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
