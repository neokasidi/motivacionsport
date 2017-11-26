/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.services;

import duoc.dao.UsuarioDao;
import duoc.entidades.GclassUsuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service("UsuarioService")
public class UsuarioService {
    
    @Autowired
    UsuarioDao usuarioDao;
    
    public void grabar(GclassUsuario usuario){
        
        usuarioDao.agregar(usuario);
    }
    
    public void modificar(GclassUsuario usuario){
        
        usuarioDao.modificar(usuario);
    }

    public List<GclassUsuario> getListadoUsuario(){
        return usuarioDao.getListadoUsuario();
    }
}
