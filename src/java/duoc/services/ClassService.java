/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.services;

import duoc.dao.ClassDao;
import duoc.entidades.GclassClass;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Usuario
 */
@Stateless
public class ClassService {
    
    @EJB
    private ClassDao claseDao;
    
    public List<GclassClass> getListadoClase(){
        return claseDao.getListadoClase();
    }
}
