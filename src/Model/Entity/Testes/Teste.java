/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entity.Testes;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Matheus
 */
@Entity
@Table(name = "teste")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Teste.findAll", query = "SELECT t FROM Teste t")
    , @NamedQuery(name = "Teste.findById", query = "SELECT t FROM Teste t WHERE t.id = :id")
    , @NamedQuery(name = "Teste.findByIdSqlInject", query = "SELECT t FROM Teste t WHERE t.idSqlInject = :idSqlInject")

    , @NamedQuery(name = "Teste.findCrawler", query = "SELECT t FROM Teste t JOIN t.idCrawler c WHERE c.idUsuario = :user")

    , @NamedQuery(name = "Teste.findByIdScanPortas", query = "SELECT t FROM Teste t WHERE t.idScanPortas = :idScanPortas")})
public class Teste implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "id_sql_inject")
    private Integer idSqlInject;
    @Column(name = "id_scan_portas")
    private Integer idScanPortas;
    @JoinColumn(name = "id_crawler", referencedColumnName = "id")
    @ManyToOne(cascade = CascadeType.REMOVE)
    private Crawler idCrawler;

    public Teste() {
    }

    public Teste(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdSqlInject() {
        return idSqlInject;
    }

    public void setIdSqlInject(Integer idSqlInject) {
        this.idSqlInject = idSqlInject;
    }

    public Integer getIdScanPortas() {
        return idScanPortas;
    }

    public void setIdScanPortas(Integer idScanPortas) {
        this.idScanPortas = idScanPortas;
    }

    public Crawler getIdCrawler() {
        return idCrawler;
    }

    public void setIdCrawler(Crawler idCrawler) {
        this.idCrawler = idCrawler;
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
        if (!(object instanceof Teste)) {
            return false;
        }
        Teste other = (Teste) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Entity.Teste[ id=" + id + " ]";
    }

}
