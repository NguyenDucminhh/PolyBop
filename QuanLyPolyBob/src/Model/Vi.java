/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;



/**
 *
 * @author Windows
 */
public class Vi {

<<<<<<< HEAD
    private int idVi;
    private String maVi;
    private int idThuongHieu;
    private String kieuDang;
    private String tenVi;
    private String urlAnh;
    private boolean trangThai;
=======
    private int IDVi;
    private int ID_ThuongHieu;
    private String Ma_Vi;
    private String KieuDang;
    private String TenVi;
    private String Url_Anh;
    private boolean TrangThai;
>>>>>>> b2043a7f54899556a0d1efb01953773863924340

    public Vi() {
    }

<<<<<<< HEAD
    public Vi(int idVi, String maVi,int idThuongHieu, String kieuDang, String tenVi, String urlAnh, boolean trangThai) {
        this.idVi = idVi;
        this.maVi = maVi;
        this.idThuongHieu = idThuongHieu;
        this.kieuDang = kieuDang;
        this.tenVi = tenVi;
        this.urlAnh = urlAnh;
        this.trangThai = trangThai;
    }

    public String getMaVi() {
        return maVi;
    }

    public void setMaVi(String maVi) {
        this.maVi = maVi;
    }

    public int getIdVi() {
        return idVi;
=======
    public Vi(int IDVi, int ID_ThuongHieu, String Ma_Vi, String KieuDang, String TenVi, String Url_Anh, boolean TrangThai) {
        this.IDVi = IDVi;
        this.ID_ThuongHieu = ID_ThuongHieu;
        this.Ma_Vi = Ma_Vi;
        this.KieuDang = KieuDang;
        this.TenVi = TenVi;
        this.Url_Anh = Url_Anh;
        this.TrangThai = TrangThai;
    }

    public int getIDVi() {
        return IDVi;
>>>>>>> b2043a7f54899556a0d1efb01953773863924340
    }

    public void setIDVi(int IDVi) {
        this.IDVi = IDVi;
    }

    public int getID_ThuongHieu() {
        return ID_ThuongHieu;
    }

    public void setID_ThuongHieu(int ID_ThuongHieu) {
        this.ID_ThuongHieu = ID_ThuongHieu;
    }

    public String getMa_Vi() {
        return Ma_Vi;
    }

    public void setMa_Vi(String Ma_Vi) {
        this.Ma_Vi = Ma_Vi;
    }

    public String getKieuDang() {
        return KieuDang;
    }

    public void setKieuDang(String KieuDang) {
        this.KieuDang = KieuDang;
    }

    public String getTenVi() {
        return TenVi;
    }

    public void setTenVi(String TenVi) {
        this.TenVi = TenVi;
    }

    public String getUrl_Anh() {
        return Url_Anh;
    }

    public void setUrl_Anh(String Url_Anh) {
        this.Url_Anh = Url_Anh;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }


}
