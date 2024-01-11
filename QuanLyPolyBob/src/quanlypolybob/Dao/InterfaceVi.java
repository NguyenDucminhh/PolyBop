/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package quanlypolybob.Dao;

import java.util.List;
import quanlypolybob.Model.Vi;

/**
 *
 * @author Windows
 */
public interface InterfaceVi {
            abstract public void insert(Vi sp);
    
    abstract public void update(Vi sp);
    
    abstract public void delete(Integer id);
    
    abstract public List<Vi> selectAll();
    
    abstract public Vi selectID(Integer id);
    
    abstract public List<Vi> selectBySQL(String sql, Object...args);
}
