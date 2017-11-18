package cl.duoc.motivacionSport.Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

@Entity
@Table(name = "gclass_horarios")
public class GclassHorarios implements Serializable {    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "name_horario")
    private String nameHorario;
    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;
    @Column(name = "update_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;
    @Column(name = "active")
    private Short active;

    public GclassHorarios() {
    }

    public GclassHorarios(Integer id, String nameHorario, Date createAt, Date updateAt, Short active) {
        this.id = id;
        this.nameHorario = nameHorario;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.active = active;
    }   

    public GclassHorarios(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameHorario() {
        return nameHorario;
    }

    public void setNameHorario(String nameHorario) {
        this.nameHorario = nameHorario;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Short getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
    } 

    @Override
    public String toString() {
        return "GclassHorarios{" + "id=" + id + ", nameHorario=" + nameHorario + ", createAt=" + createAt + ", updateAt=" + updateAt + ", active=" + active + '}';
    }    
}
