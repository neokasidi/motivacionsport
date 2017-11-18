package cl.duoc.motivacionSport.Entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

@Entity
@Table(name = "gclass_local")
public class GclassLocal implements Serializable {    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "name_local")
    private String nameLocal;
    @Size(max = 250)
    @Column(name = "direccion_local")
    private String direccionLocal;
    @Column(name = "fono")
    private Integer fono;
    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;
    @Column(name = "update_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;
    @Column(name = "active")
    private Short active;
    @OneToMany(mappedBy = "localId")
    private List<GclassClass> gclassClassList;
    @JoinColumn(name = "comuna_id", referencedColumnName = "id")
    @ManyToOne
    private GclassComunas comunaId;

    public GclassLocal() {
    }

    public GclassLocal(Integer id, String nameLocal, String direccionLocal, Integer fono, Date createAt, Date updateAt, Short active, List<GclassClass> gclassClassList, GclassComunas comunaId) {
        this.id = id;
        this.nameLocal = nameLocal;
        this.direccionLocal = direccionLocal;
        this.fono = fono;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.active = active;
        this.gclassClassList = gclassClassList;
        this.comunaId = comunaId;
    }   

    public GclassLocal(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameLocal() {
        return nameLocal;
    }

    public void setNameLocal(String nameLocal) {
        this.nameLocal = nameLocal;
    }

    public String getDireccionLocal() {
        return direccionLocal;
    }

    public void setDireccionLocal(String direccionLocal) {
        this.direccionLocal = direccionLocal;
    }

    public Integer getFono() {
        return fono;
    }

    public void setFono(Integer fono) {
        this.fono = fono;
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
        return "GclassLocal{" + "id=" + id + ", nameLocal=" + nameLocal + ", direccionLocal=" + direccionLocal + ", fono=" + fono + ", createAt=" + createAt + ", updateAt=" + updateAt + ", active=" + active + ", gclassClassList=" + gclassClassList + ", comunaId=" + comunaId + '}';
    }   
}
