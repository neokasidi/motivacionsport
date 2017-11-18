
package cl.duoc.motivacionSport.Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "gclass_class")
public class GclassClass implements Serializable {
    
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

    public GclassClass() {
    }

    public GclassClass(Integer id, String nameClass, Date createAt, Date updateAt, Short active, GclassHorarios horarioIdIn, GclassHorarios horarioIdOut, GclassLocal localId) {
        this.id = id;
        this.nameClass = nameClass;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.active = active;
        this.horarioIdIn = horarioIdIn;
        this.horarioIdOut = horarioIdOut;
        this.localId = localId;
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

    @Override
    public String toString() {
        return "GclassClass{" + "id=" + id + ", nameClass=" + nameClass + ", createAt=" + createAt + ", updateAt=" + updateAt + ", active=" + active + ", horarioIdIn=" + horarioIdIn + ", horarioIdOut=" + horarioIdOut + ", localId=" + localId + '}';
    }
}
