/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entity;

import java.io.Serializable;
import java.util.Collection;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author q216-12
 */
@Entity
@Table(name = "permissao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Permissao.findAll", query = "SELECT p FROM Permissao p")

    , @NamedQuery(name = "Permissao.findByNomeLikeUser", query = "SELECT p FROM Permissao p WHERE p.idUsuario = :user AND p.nome = :nome")
    , @NamedQuery(name = "Permissao.findAllUser", query = "SELECT p FROM Permissao p WHERE p.idUsuario = :user")

    , @NamedQuery(name = "Permissao.findById", query = "SELECT p FROM Permissao p WHERE p.id = :id")
    , @NamedQuery(name = "Permissao.findByNome", query = "SELECT p FROM Permissao p WHERE p.nome = :nome")})
public class Permissao implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPermissao")
    private Collection<SubUsuario> subUsuarioCollection;

    @Basic(optional = false)
    @Column(name = "sql_inject")
    private boolean sqlInject;
    @Basic(optional = false)
    @Column(name = "scan_portas")
    private boolean scanPortas;
    @Basic(optional = false)
    @Column(name = "crawler")
    private boolean crawler;

    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    @ManyToOne
    private Usuario idUsuario;

    public Permissao() {
    }

    public Permissao(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
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
        if (!(object instanceof Permissao)) {
            return false;
        }
        Permissao other = (Permissao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nome;
    }

    public boolean getSqlInject() {
        return sqlInject;
    }

    public void setSqlInject(boolean sqlInject) {
        this.sqlInject = sqlInject;
    }

    public boolean getScanPortas() {
        return scanPortas;
    }

    public void setScanPortas(boolean scanPortas) {
        this.scanPortas = scanPortas;
    }

    public boolean getCrawler() {
        return crawler;
    }

    public void setCrawler(boolean crawler) {
        this.crawler = crawler;
    }

    @XmlTransient
    public Collection<SubUsuario> getSubUsuarioCollection() {
        return subUsuarioCollection;
    }

    public void setSubUsuarioCollection(Collection<SubUsuario> subUsuarioCollection) {
        this.subUsuarioCollection = subUsuarioCollection;
    }
}
