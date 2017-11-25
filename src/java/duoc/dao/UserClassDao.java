/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.dao;

import duoc.entidades.GclassUserClass;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Usuario
 */
@Stateless
public class UserClassDao {
    
    @PersistenceContext
    private EntityManager em;
    
    public void agregar(GclassUserClass userClass) {
        em.persist(userClass);
    }

    public void modificar(GclassUserClass userClass) {
        em.merge(userClass);
    }
    
    public List<GclassUserClass> getListadoUser(){
        
        String jpql = "select p from GclassPerfil p order by p.name";
        return em.createQuery(jpql, GclassUserClass.class).getResultList();
    }
    
    
}
