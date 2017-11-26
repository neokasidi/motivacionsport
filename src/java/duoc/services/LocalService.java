/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.services;

import duoc.dao.LocalDao;
import duoc.entidades.GclassLocal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */

@Service("LocalService")
public class LocalService {
    
    @Autowired
    LocalDao localDao;
    
    public void grabar(GclassLocal local){
        
        localDao.agregar(local);
    }
    
    public void modificar(GclassLocal local){
        
        localDao.modificar(local);
    }

    public List<GclassLocal> getListadoLocal(){
        return localDao.getListadoLocal();
    }
    
}
