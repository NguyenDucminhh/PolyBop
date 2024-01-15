/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Model.NhanVien;
import Model.Vi;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ViRepositoryImp {
  abstract public void insert(Vi Entity);

    abstract public void update(Vi Entity);

    abstract public void delete(String id);

    abstract public NhanVien selectById(String id);

    abstract public NhanVien selectByAccount(String account);

    abstract public List<Vi> selectAll();

    abstract public List<Vi> selectBySql(String sql, Object... args);
}
