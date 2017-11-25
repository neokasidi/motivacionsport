/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.services;

import duoc.dao.PerfilDao;
import duoc.entidades.GclassPerfil;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service("PerfilService")
public class PerfilService {
    
    @Autowired
    PerfilDao perfilDao;
    
    public void grabar(GclassPerfil perfil){
        
        perfilDao.agregar(perfil);
    }
    
    public void modificar(GclassPerfil perfil){
        
        perfilDao.modificar(perfil);
    }

    public List<GclassPerfil> getListadoPerfil(){
        return perfilDao.getListadoPerfil();
    }
    
}
