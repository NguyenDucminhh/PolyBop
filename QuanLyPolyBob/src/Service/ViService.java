/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Vi;
import quanlypolybob.Dao.ViDao;

/**
 *
 * @author Windows
 */
public class ViService {
        ViDao dao = new ViDao();

    public void insert(Vi sp) {
        dao.insert(sp);
    }

    public void update(Vi sp) {
        dao.update(sp);
    }

    public void delete(Vi sp) {
        dao.delete(sp.getIDVi());
    }
}
