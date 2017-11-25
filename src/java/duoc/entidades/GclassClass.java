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
@Table(name = "gclass_class")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GclassClass.findAll", query = "SELECT g FROM GclassClass g"),
    @NamedQuery(name = "GclassClass.findById", query = "SELECT g FROM GclassClass g WHERE g.id = :id"),
    @NamedQuery(name = "GclassClass.findByNameClass", query = "SELECT g FROM GclassClass g WHERE g.nameClass = :nameClass"),
    @NamedQuery(name = "GclassClass.findByCreateAt", query = "SELECT g FROM GclassClass g WHERE g.createAt = :createAt"),
    @NamedQuery(name = "GclassClass.findByUpdateAt", query = "SELECT g FROM GclassClass g WHERE g.updateAt = :updateAt"),
    @NamedQuery(name = "GclassClass.findByActive", query = "SELECT g FROM GclassClass g WHERE g.active = :active")})
public class GclassClass implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "name_class")
    private String nameClass;
    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;
    @Column(name = "update_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;
    @Column(name = "active")
    private Short active;
    @JoinColumn(name = "horario_id_in", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private GclassHorarios horarioIdIn;
    @JoinColumn(name = "horario_id_out", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private GclassHorarios horarioIdOut;
    @JoinColumn(name = "local_id", referencedColumnName = "id")
    @ManyToOne
    private GclassLocal localId;
    @OneToMany(mappedBy = "classId")
    private List<GclassUserClass> gclassUserClassList;

    public GclassClass() {
    }

    public GclassClass(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
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

    public GclassHorarios getHorarioIdIn() {
        return horarioIdIn;
    }

    public void setHorarioIdIn(GclassHorarios horarioIdIn) {
        this.horarioIdIn = horarioIdIn;
    }

    public GclassHorarios getHorarioIdOut() {
        return horarioIdOut;
    }

    public void setHorarioIdOut(GclassHorarios horarioIdOut) {
        this.horarioIdOut = horarioIdOut;
    }

    public GclassLocal getLocalId() {
        return localId;
    }

    public void setLocalId(GclassLocal localId) {
        this.localId = localId;
    }

    @XmlTransient
    public List<GclassUserClass> getGclassUserClassList() {
        return gclassUserClassList;
    }

    public void setGclassUserClassList(List<GclassUserClass> gclassUserClassList) {
        this.gclassUserClassList = gclassUserClassList;
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
        if (!(object instanceof GclassClass)) {
            return false;
        }
        GclassClass other = (GclassClass) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl.duoc.motivacionSport.Entidades.GclassClass[ id=" + id + " ]";
    }
    
}
