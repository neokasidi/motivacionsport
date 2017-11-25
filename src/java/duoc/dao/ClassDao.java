/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.dao;

import duoc.entidades.GclassClass;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Usuario
 */
@Stateless
public class ClassDao {
    
    @PersistenceContext
    private EntityManager em;
    
    public void agregar(GclassClass clase) {
        em.persist(clase);
    }

    public void modificar(GclassClass clase) {
        em.merge(clase);
    }

    public List<GclassClass> getListadoClase() {

        String jpql = "select u from GclassUsuario u order by u.name";
        return em.createQuery(jpql, GclassClass.class).getResultList();
    }
    
}
