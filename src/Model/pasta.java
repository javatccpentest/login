/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author q216-12
 */
public class pasta {

    private String nome;
    private DefaultMutableTreeNode no;

    public pasta(String nome, int i) {
        this.nome = nome;
        no = new DefaultMutableTreeNode(nome){
            @Override
            public boolean isLeaf() {
                return false;
            }
            
        }; 
    }

    public DefaultMutableTreeNode getNode() {
        return no;
    }

    private ArrayList<pasta> pastas = new ArrayList<>();

    public pasta(String nome) {
        this.nome = nome;
        no = new DefaultMutableTreeNode(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<pasta> getPastas() {
        return pastas;
    }

    public void addPastas(pasta pastas) {
        this.pastas.add(pastas);
    }

}
