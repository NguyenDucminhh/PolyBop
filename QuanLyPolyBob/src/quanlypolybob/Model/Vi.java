/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlypolybob.Model;

/**
 *
 * @author Windows
 */
public class Vi {

    private int idVi;
    private int idThuongHieu;
    private String kieuDang;
    private String tenVi;
    private String urlAnh;
    private boolean trangThai;

    public Vi() {
    }

    public Vi(int idVi, int idThuongHieu, String kieuDang, String tenVi, String urlAnh, boolean trangThai) {
        this.idVi = idVi;
        this.idThuongHieu = idThuongHieu;
        this.kieuDang = kieuDang;
        this.tenVi = tenVi;
        this.urlAnh = urlAnh;
        this.trangThai = trangThai;
    }

    public int getIdVi() {
        return idVi;
    }

    public void setIdVi(int idVi) {
        this.idVi = idVi;
    }

    public int getIdThuongHieu() {
        return idThuongHieu;
    }

    public void setIdThuongHieu(int idThuongHieu) {
        this.idThuongHieu = idThuongHieu;
    }

    public String getKieuDang() {
        return kieuDang;
    }

    public void setKieuDang(String kieuDang) {
        this.kieuDang = kieuDang;
    }

    public String getTenVi() {
        return tenVi;
    }

    public void setTenVi(String tenVi) {
        this.tenVi = tenVi;
    }

    public String getUrlAnh() {
        return urlAnh;
    }

    public void setUrlAnh(String urlAnh) {
        this.urlAnh = urlAnh;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    
    

}
