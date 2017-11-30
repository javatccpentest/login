/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entity;

import Model.Entity.Testes.Crawler;
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
@Table(name = "sub_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SubUsuario.findAll", query = "SELECT s FROM SubUsuario s")

    , @NamedQuery(name = "SubUsuario.findByNomeLikeUser", query = "SELECT s FROM SubUsuario s WHERE s.idUsuario = :user AND s.nome like :nome")
    , @NamedQuery(name = "SubUsuario.findByUserSenha", query = "SELECT s FROM SubUsuario s WHERE s.idUsuario = :user AND s.senha = :senha")
    , @NamedQuery(name = "SubUsuario.findByUserCpf", query = "SELECT s FROM SubUsuario s WHERE s.idUsuario = :user AND s.cpf = :cpf")
    , @NamedQuery(name = "SubUsuario.findAllUser", query = "SELECT s FROM SubUsuario s WHERE s.idUsuario = :user")

    , @NamedQuery(name = "SubUsuario.findById", query = "SELECT s FROM SubUsuario s WHERE s.id = :id")
    , @NamedQuery(name = "SubUsuario.findByNome", query = "SELECT s FROM SubUsuario s WHERE s.nome = :nome")
    , @NamedQuery(name = "SubUsuario.findByNomeCompleto", query = "SELECT s FROM SubUsuario s WHERE s.nomeCompleto = :nomeCompleto")
    , @NamedQuery(name = "SubUsuario.findByCpf", query = "SELECT s FROM SubUsuario s WHERE s.cpf = :cpf")
    , @NamedQuery(name = "SubUsuario.findByEmail", query = "SELECT s FROM SubUsuario s WHERE s.email = :email")
    , @NamedQuery(name = "SubUsuario.findBySenha", query = "SELECT s FROM SubUsuario s WHERE s.senha = :senha")})

public class SubUsuario implements Serializable {

    @Column(name = "Nome")
    private String nome;

    @OneToMany(mappedBy = "idSubUsuario")
    private Collection<Crawler> crawlerCollection;

    @Basic(optional = false)
    @Column(name = "senha")
    private String senha;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "cpf")
    private String cpf;
    @Basic(optional = false)
    @Column(name = "nome_completo")
    private String nomeCompleto;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @JoinColumn(name = "id_permissao", referencedColumnName = "id")
    @ManyToOne
    private Permissao idPermissao;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    @ManyToOne
    private Usuario idUsuario;

    public SubUsuario() {
    }

    public SubUsuario(Integer id) {
        this.id = id;
    }

    public SubUsuario(Integer id, String cpf, String nomeCompleto, String email) {
        this.id = id;
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Permissao getIdPermissao() {
        return idPermissao;
    }

    public void setIdPermissao(Permissao idPermissao) {
        this.idPermissao = idPermissao;
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
        if (!(object instanceof SubUsuario)) {
            return false;
        }
        SubUsuario other = (SubUsuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @XmlTransient
    public Collection<Crawler> getCrawlerCollection() {
        return crawlerCollection;
    }

    public void setCrawlerCollection(Collection<Crawler> crawlerCollection) {
        this.crawlerCollection = crawlerCollection;
    }
}
