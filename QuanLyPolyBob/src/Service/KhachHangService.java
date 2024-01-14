/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.KhachHang;
import Repository.KhachHangRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class KhachHangService {
    KhachHangRepository khachHangRepository = new KhachHangRepository();
    List<KhachHang> list;
    
    public void insert(KhachHang kh) {
        khachHangRepository.insert(kh);//thằng này thao tác với SQL
    }
    
     public void update(KhachHang kh) {
        khachHangRepository.updateKH(kh);
    }

    public void delete(KhachHang kh) {
        khachHangRepository.delKH(String.valueOf(kh.getIdKhachHang()));
    }
    
    public List<KhachHang> Search(String key){
        List<KhachHang> lst_view = new ArrayList<>();
        list = khachHangRepository.searchKH(key);
        for(KhachHang s : list){
            lst_view.add(new KhachHang(s.getIdKhachHang(), s.getTenKhachHang(), s.getSdt(), s.getNgaySinh(), s.getEmail(), s.getDiaChi(), s.isTrangThai()));
        }
        return lst_view;
    }
}
