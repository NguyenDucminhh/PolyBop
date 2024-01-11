/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlypolybob.Model;

/**
 *
 * @author Windows
 */
public class ThuongHieu {
    private int idThuongHieu;
    private String tenThuongHieu;
    private boolean trangThai;

    public ThuongHieu() {
    }

    public ThuongHieu(int idThuongHieu, String tenThuongHieu, boolean trangThai) {
        this.idThuongHieu = idThuongHieu;
        this.tenThuongHieu = tenThuongHieu;
        this.trangThai = trangThai;
    }

    public int getIdThuongHieu() {
        return idThuongHieu;
    }

    public void setIdThuongHieu(int idThuongHieu) {
        this.idThuongHieu = idThuongHieu;
    }

    public String getTenThuongHieu() {
        return tenThuongHieu;
    }

    public void setTenThuongHieu(String tenThuongHieu) {
        this.tenThuongHieu = tenThuongHieu;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    
}
