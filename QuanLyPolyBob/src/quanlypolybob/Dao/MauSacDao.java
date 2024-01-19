/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlypolybob.Dao;

import Model.MauSac;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import quanlypolybob.Hepper.JDBCHeper;

/**
 *
 * @author Windows
 */
public class MauSacDao implements InterfaceMauSac {

    String selectAll = "select * from MauSac";
    String selectById = "select * from MauSac where IDMauSac =?";

    @Override
    public void insert(MauSac sp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(MauSac sp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public MauSac selectID(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<MauSac> selectAll() {
        return selectBySQL(selectAll);
    }

    @Override
    public List<MauSac> selectBySQL(String sql, Object... args) {
        List<MauSac> lisst = new ArrayList<>();
        try {
            ResultSet rs = JDBCHeper.query(sql, args);
            while (rs.next()) {
                MauSac ms = new MauSac();
                ms.setIdMauSac(rs.getInt("idMauSac"));
                ms.setMa_MauSac(rs.getString("Ma_MauSac"));
                ms.setTenMauSac(rs.getString("tenMauSac"));
                ms.setTrangThai(rs.getBoolean("trangThai"));
                lisst.add(ms);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return lisst;
    }

    public String selecNameById(int id) {
        return selectBySQL(selectById, id).get(0).getTenMauSac();
    }
        public int selectIdByName(String name){
        String sql = "select * from MauSac where TenMauSac =?";
        return selectBySQL(sql, name).get(0).getIdMauSac();
    }
}
