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
@Table(name = "gclass_perfil")
public class GclassPerfil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 250)
    @Column(name = "name")
    private String name;
    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;
    @Column(name = "update_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;
    @Column(name = "active")
    private Short active;

    public GclassPerfil() {
    }

    public GclassPerfil(Integer id, String name, Date createAt, Date updateAt, Short active) {
        this.id = id;
        this.name = name;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.active = active;
    }    

    public GclassPerfil(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "GclassPerfil{" + "id=" + id + ", name=" + name + ", createAt=" + createAt + ", updateAt=" + updateAt + ", active=" + active + '}';
    }  
    
}
