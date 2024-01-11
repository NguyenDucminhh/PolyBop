/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


/**
 *
 * @author Windows
 */
public class LoaiVi {
    private int idLoaiVi;
    private String tenLoaiVi;
    private boolean trangThai;

    public LoaiVi() {
    }

    public LoaiVi(int idLoaiVi, String tenLoaiVi, boolean trangThai) {
        this.idLoaiVi = idLoaiVi;
        this.tenLoaiVi = tenLoaiVi;
        this.trangThai = trangThai;
    }

    public int getIdLoaiVi() {
        return idLoaiVi;
    }

    public void setIdLoaiVi(int idLoaiVi) {
        this.idLoaiVi = idLoaiVi;
    }

    public String getTenLoaiVi() {
        return tenLoaiVi;
    }

    public void setTenLoaiVi(String tenLoaiVi) {
        this.tenLoaiVi = tenLoaiVi;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    
}
