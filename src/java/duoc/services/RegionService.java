/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.services;

import duoc.dao.RegionDao;
import duoc.entidades.GclassRegion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service("RegionService")
public class RegionService {
    
      
    @Autowired
    RegionDao regionDao;
    
      public List<GclassRegion> getListadoRegion(){
        return regionDao.getListadoRegion();
    }
    
}
