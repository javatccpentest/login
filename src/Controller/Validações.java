/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Entity.SubUsuario;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import Model.Entity.Usuario;
import java.util.List;

/**
 *
 * @author Matheus
 */
public abstract class Validações {

    public /*abstract*/ EntityManager getEntityManager(){
        return java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("persistencePU").createEntityManager();
    };

    public boolean validarEmail(String email) {
        String s = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        Pattern emailPattern = Pattern.compile(s);
        Matcher m = emailPattern.matcher(email);
        return m.matches();
    }

    public boolean validarCpf(String cpf) {
        return cpf.contains(" ") ? false : getEntityManager().createNamedQuery("Usuario.findByCpf")
                .setParameter("cpf", cpf)
                .getResultList()
                .isEmpty();
    }

    //para sub-usuarios
    public boolean validarCpf(Usuario user, String cpf) {
        return cpf.contains(" ") ? false : getEntityManager().createNamedQuery("SubUsuario.findByUserCpf")
                .setParameter("user", user)
                .setParameter("cpf", cpf)
                .getResultList()
                .isEmpty();
    }

    public boolean validarLogin(String login) {
        return getEntityManager().createNamedQuery("Usuario.findByLogin")
                .setParameter("login", login)
                .getResultList()
                .isEmpty();
    }

    public boolean validarCpf(Usuario user, String cpf, SubUsuario sub) {
        List get = getEntityManager().createNamedQuery("SubUsuario.findByUserCpf")
                .setParameter("user", user)
                .setParameter("cpf", cpf)
                .getResultList();

        return cpf.contains(" ") ? false : get.isEmpty() ? true : ((SubUsuario) get.get(0)).getCpf().equals(sub.getCpf());
    }
}
