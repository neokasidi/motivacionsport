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
@Table(name = "gclass_comunas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GclassComunas.findAll", query = "SELECT g FROM GclassComunas g"),
    @NamedQuery(name = "GclassComunas.findById", query = "SELECT g FROM GclassComunas g WHERE g.id = :id"),
    @NamedQuery(name = "GclassComunas.findByName", query = "SELECT g FROM GclassComunas g WHERE g.name = :name"),
    @NamedQuery(name = "GclassComunas.findByCreateAt", query = "SELECT g FROM GclassComunas g WHERE g.createAt = :createAt"),
    @NamedQuery(name = "GclassComunas.findByUpdateAt", query = "SELECT g FROM GclassComunas g WHERE g.updateAt = :updateAt"),
    @NamedQuery(name = "GclassComunas.findByActive", query = "SELECT g FROM GclassComunas g WHERE g.active = :active")})
public class GclassComunas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
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
    @OneToMany(mappedBy = "comunaId")
    private List<GclassUsuario> gclassUsuarioList;
    @OneToMany(mappedBy = "comunaId")
    private List<GclassLocal> gclassLocalList;
    @JoinColumn(name = "region_id", referencedColumnName = "id")
    @ManyToOne
    private GclassRegion regionId;

    public GclassComunas() {
    }

    public GclassComunas(Integer id) {
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

    @XmlTransient
    public List<GclassUsuario> getGclassUsuarioList() {
        return gclassUsuarioList;
    }

    public void setGclassUsuarioList(List<GclassUsuario> gclassUsuarioList) {
        this.gclassUsuarioList = gclassUsuarioList;
    }

    @XmlTransient
    public List<GclassLocal> getGclassLocalList() {
        return gclassLocalList;
    }

    public void setGclassLocalList(List<GclassLocal> gclassLocalList) {
        this.gclassLocalList = gclassLocalList;
    }

    public GclassRegion getRegionId() {
        return regionId;
    }

    public void setRegionId(GclassRegion regionId) {
        this.regionId = regionId;
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
        if (!(object instanceof GclassComunas)) {
            return false;
        }
        GclassComunas other = (GclassComunas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl.duoc.motivacionSport.Entidades.GclassComunas[ id=" + id + " ]";
    }
    
}
