/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.entidades;

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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author samm
 */
@Entity
@Table(name = "gclass_local")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GclassLocal.findAll", query = "SELECT g FROM GclassLocal g"),
    @NamedQuery(name = "GclassLocal.findById", query = "SELECT g FROM GclassLocal g WHERE g.id = :id"),
    @NamedQuery(name = "GclassLocal.findByNameLocal", query = "SELECT g FROM GclassLocal g WHERE g.nameLocal = :nameLocal"),
    @NamedQuery(name = "GclassLocal.findByDireccionLocal", query = "SELECT g FROM GclassLocal g WHERE g.direccionLocal = :direccionLocal"),
    @NamedQuery(name = "GclassLocal.findByFono", query = "SELECT g FROM GclassLocal g WHERE g.fono = :fono"),
    @NamedQuery(name = "GclassLocal.findByCreateAt", query = "SELECT g FROM GclassLocal g WHERE g.createAt = :createAt"),
    @NamedQuery(name = "GclassLocal.findByUpdateAt", query = "SELECT g FROM GclassLocal g WHERE g.updateAt = :updateAt"),
    @NamedQuery(name = "GclassLocal.findByActive", query = "SELECT g FROM GclassLocal g WHERE g.active = :active")})
public class GclassLocal implements Serializable {

    private static final long serialVersionUID = 1L;
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

    @XmlTransient
    public List<GclassClass> getGclassClassList() {
        return gclassClassList;
    }

    public void setGclassClassList(List<GclassClass> gclassClassList) {
        this.gclassClassList = gclassClassList;
    }

    public GclassComunas getComunaId() {
        return comunaId;
    }

    public void setComunaId(GclassComunas comunaId) {
        this.comunaId = comunaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GclassLocal)) {
            return false;
        }
        GclassLocal other = (GclassLocal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl.duoc.motivacionSport.Entidades.GclassLocal[ id=" + id + " ]";
    }
    
}
