/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Entity.Testes.Teste;
import javax.swing.ImageIcon;

/**
 *
 * @author q216-12
 */
public class testes_lista {

    private ImageIcon imagem;
    private String info;
    private String sub_user;
    private Teste teste;

    public testes_lista(ImageIcon imagem, Teste teste) {
        this.imagem = imagem;
        this.teste = teste;
        
        
        this.info = teste.getIdCrawler() != null
                ? teste.getIdCrawler().getIdDominio().getDominio()
                : teste.getIdScanPortas() != null
                ? null/*faz algo*/
                : teste.getIdSqlInject() != null ? null/*faz algo*/ : null;

        this.sub_user = teste.getIdCrawler() != null
                ? teste.getIdCrawler().getIdSubUsuario() == null ? "Voce" : teste.getIdCrawler().getIdSubUsuario().getNome()
                : teste.getIdScanPortas() != null
                ? null/*faz algo*/
                : teste.getIdSqlInject() != null ? null/*faz algo*/ : null;
    }

    public ImageIcon getImagem() {
        return imagem;
    }

    public void setImagem(ImageIcon imagem) {
        this.imagem = imagem;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getSub_user() {
        return sub_user;
    }

    public void setSub_user(String sub_user) {
        this.sub_user = sub_user;
    }

    public Teste getTeste() {
        return teste;
    }

    public void setTeste(Teste teste) {
        this.teste = teste;
    }

}
