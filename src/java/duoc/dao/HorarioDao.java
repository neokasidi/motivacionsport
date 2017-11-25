/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.dao;

import duoc.entidades.GclassHorarios;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Usuario
 */
@Repository("HorarioDao")
public class HorarioDao {
    
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void agregar(GclassHorarios horario) {
        em.persist(horario);
    }

    @Transactional
    public void modificar(GclassHorarios horario) {
        em.merge(horario);
    }

    public List<GclassHorarios> getListadoHorario() {

        String jpql = "select u from GclassUsuario u order by u.name";
        return em.createQuery(jpql, GclassHorarios.class).getResultList();
    }
    
}
