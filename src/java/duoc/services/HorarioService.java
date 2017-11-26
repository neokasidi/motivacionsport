/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.services;

import duoc.dao.HorarioDao;
import duoc.entidades.GclassHorarios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service("HorarioService")
public class HorarioService {
    
        
    @Autowired
    HorarioDao horarioDao;
    
    public void grabar(GclassHorarios horario){
        
        horarioDao.agregar(horario);
    }
    
    public void modificar(GclassHorarios horario){
        
        horarioDao.modificar(horario);
    }

    public List<GclassHorarios> getListadoHorario(){
        return horarioDao.getListadoHorario();
    }
    
}
