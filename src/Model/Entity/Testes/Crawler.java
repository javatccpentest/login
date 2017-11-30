/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entity.Testes;

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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import Crawler.Model.Dominio;
import Model.Entity.SubUsuario;
import Model.Entity.Usuario;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Matheus
 */
@Entity
@Table(name = "crawler")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Crawler.findAll", query = "SELECT c FROM Crawler c")
    , @NamedQuery(name = "Crawler.findAllUser", query = "SELECT c FROM Crawler c WHERE c.idUsuario = :user")
    , @NamedQuery(name = "Crawler.findAllSub", query = "SELECT c FROM Crawler c WHERE c.idSubUsuario = :sub")
    , @NamedQuery(name = "Crawler.findById", query = "SELECT c FROM Crawler c WHERE c.id = :id")
    , @NamedQuery(name = "Crawler.findByHoraInicio", query = "SELECT c FROM Crawler c WHERE c.horaInicio = :horaInicio")
    , @NamedQuery(name = "Crawler.findByHoraFim", query = "SELECT c FROM Crawler c WHERE c.horaFim = :horaFim")})
public class Crawler implements Serializable {

    @OneToMany(mappedBy = "idCrawler",cascade = CascadeType.REMOVE)
    private Collection<Teste> testeCollection;

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    @Column(name = "wordlist")
    private String wordlist;

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @Column(name = "hora_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaInicio;
    @Column(name = "hora_fim")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaFim;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Usuario idUsuario;
    @JoinColumn(name = "id_sub_usuario", referencedColumnName = "id")
    @ManyToOne
    private SubUsuario idSubUsuario;

    @JoinColumn(name = "id_dominio", referencedColumnName = "id")
    @ManyToOne(cascade = CascadeType.REMOVE)
    private Dominio idDominio;

    public Dominio getIdDominio() {
        return idDominio;
    }

    public void setIdDominio(Dominio idDominio) {
        Dominio oldIdDominio = this.idDominio;

        this.idDominio = idDominio;
        changeSupport.firePropertyChange("idDominio", oldIdDominio, idDominio);
    }

    public Crawler() {
    }

    public Crawler(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);

    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        Date oldHoraInicio = this.horaInicio;

        this.horaInicio = horaInicio;
        changeSupport.firePropertyChange("horaInicio", oldHoraInicio, horaInicio);

    }

    public Date getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(Date horaFim) {
        Date oldHoraFim = this.horaFim;

        this.horaFim = horaFim;
        changeSupport.firePropertyChange("horaFim", oldHoraFim, horaFim);

    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        Usuario oldIdUsuario = this.idUsuario;

        this.idUsuario = idUsuario;
        changeSupport.firePropertyChange("idUsuario", oldIdUsuario, idUsuario);

    }

    public SubUsuario getIdSubUsuario() {
        return idSubUsuario;
    }

    public void setIdSubUsuario(SubUsuario idSubUsuario) {
        SubUsuario oldIdSubUsuario = this.idSubUsuario;

        this.idSubUsuario = idSubUsuario;
        changeSupport.firePropertyChange("idSubUsuario", oldIdSubUsuario, idSubUsuario);

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
        if (!(object instanceof Crawler)) {
            return false;
        }
        Crawler other = (Crawler) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return idDominio.getDominio();
    }

    public String getWordlist() {
        return wordlist;
    }

    public void setWordlist(String wordlist) {
        String oldWordlist = this.wordlist;
        this.wordlist = wordlist;
        changeSupport.firePropertyChange("wordlist", oldWordlist, wordlist);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

    @XmlTransient
    public Collection<Teste> getTesteCollection() {
        return testeCollection;
    }

    public void setTesteCollection(Collection<Teste> testeCollection) {
        this.testeCollection = testeCollection;
    }

}
