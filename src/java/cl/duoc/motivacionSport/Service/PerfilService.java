package cl.duoc.motivacionSport.Service;

import cl.duoc.motivacionSport.Dao.PerfilDao;
import cl.duoc.motivacionSport.Entidades.GclassPerfil;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("PerfilService")
public class PerfilService {
    
    @Autowired
    PerfilDao perfilDao;
    
    
    public boolean putUsuario(GclassPerfil perfil){    
        perfilDao.agregar(perfil);
        return true;       
    }
    public GclassPerfil getPerfil(int id){
        return perfilDao.findById(id);
    }
    public List<GclassPerfil> getAll(){
        return perfilDao.allEntries();
    }    
}
