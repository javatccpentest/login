/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Entity.SubUsuario;
import javax.swing.JCheckBox;

/**
 *
 * @author Matheus
 */
public class sub_usuario_lista {

    private JCheckBox check;
    private String nome;
    private SubUsuario sub;

    public sub_usuario_lista(SubUsuario sub, String nome) {
        this.sub = sub;
        this.nome = nome;
        this.check = new JCheckBox(nome, true);
//        this.check.addActionListener(new java.awt.event.ActionListener() {
//            @Override
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                JCheckBox jcb = (JCheckBox) evt.getSource();
//                System.out.println(jcb.isSelected());
//                getSelected(jcb.isSelected());
//            }
//        });
    }

    public JCheckBox getCheck() {
        return check;
    }

    public void setCheck(JCheckBox check) {
        this.check = check;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public SubUsuario getSub() {
        return sub;
    }

    public void setSub(SubUsuario sub) {
        this.sub = sub;
    }

}
