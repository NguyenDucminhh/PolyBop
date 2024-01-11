/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlypolybob.Model;

/**
 *
 * @author Windows
 */
public class MauSac {
    private int idMauSac;
    private String tenMauSac;
    private boolean trangThai;

    public MauSac() {
    }

    public MauSac(int idMauSac, String tenMauSac, boolean trangThai) {
        this.idMauSac = idMauSac;
        this.tenMauSac = tenMauSac;
        this.trangThai = trangThai;
    }

    public int getIdMauSac() {
        return idMauSac;
    }

    public void setIdMauSac(int idMauSac) {
        this.idMauSac = idMauSac;
    }

    public String getTenMauSac() {
        return tenMauSac;
    }

    public void setTenMauSac(String tenMauSac) {
        this.tenMauSac = tenMauSac;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

   
    
}
