/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.dao;

import duoc.entidades.GclassPerfil;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Usuario
 */
@Stateless
public class PerfilDao {
    
    @PersistenceContext
    private EntityManager em;

    public void agregar(GclassPerfil perfil) {
        em.persist(perfil);
    }

    public void modificar(GclassPerfil perfil) {
        em.merge(perfil);
    }
    
    public List<GclassPerfil> getListadoPerfil(){
        
        String jpql = "select p from GclassPerfil p order by p.name";
        return em.createQuery(jpql, GclassPerfil.class).getResultList();
    }
}
