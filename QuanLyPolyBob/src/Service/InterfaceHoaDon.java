/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;
import Model.HoaDonCT; 
import Model.HoaDonCT1; 

import java.util.List;

/**
 *
 * @author Admin
 */
public interface InterfaceHoaDon {
    List<HoaDonCT> getAll(); 
    List<HoaDonCT1> getAllCTHD(String ma);
    // Tìm kiếm hóa đơn 
    List<HoaDonCT> timKiem(String seach); 
}
