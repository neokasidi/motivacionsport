/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.services;

import duoc.dao.ComunaDao;
import duoc.entidades.GclassComunas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service("ComunaService")
public class ComunaService {
    
    @Autowired
    ComunaDao comunaDao;
    
      public List<GclassComunas> getListadoComuna(){
        return comunaDao.getListadoComuna();
    }
    
}
