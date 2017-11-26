/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.services;

import duoc.dao.UserClassDao;
import duoc.entidades.GclassUserClass;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service("UserClassService")
public class UserClassService {
    
    @Autowired
    UserClassDao userClassDao;
    
    public void grabar(GclassUserClass userClass){
        
        userClassDao.agregar(userClass);
    }
    
    public void modificar(GclassUserClass userClass){
        
        userClassDao.modificar(userClass);
    }

    public List<GclassUserClass> getListadoUser(){
        return userClassDao.getListadoUser();
    }
    
}
