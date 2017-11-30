/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.SubTelas;

import Model.sub_usuario_lista;
import Controller.DAO.*;
import View.Componentes.JTable.tabela_listagem_de_usuarios_com_check_box.ColumModel;
import View.Componentes.JTable.tabela_listagem_de_usuarios_com_check_box.TableModel_CheckBox;
import Model.Entity.SubUsuario;
import Model.Entity.Testes.Teste;
import Model.Entity.Usuario;
import Model.testes_lista;
import View.Componentes.JTable.tabela_listagem_de_testes.TableModel_Testes;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Matheus
 */
public abstract class tela_listagem extends javax.swing.JInternalFrame {

    private Usuario user = null;

    private List<sub_usuario_lista> lista_sub_usuarios;

    /**
     * Creates new form TelaPermissoes
     */
    public tela_listagem(Usuario user) {
        this.user = user;
        initComponents();
        //---------------------------------------------

        tabela_listagem.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent evt) {
                if (evt.getValueIsAdjusting()) {
                    return;
                }
                int selected = tabela_listagem.getSelectedRow();
                System.out.println(selected);
            }
        });

        //----------------------------------------------
//        tabela_sub_usuario.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
//            @Override
//            public void valueChanged(ListSelectionEvent evt) {
//                if (evt.getValueIsAdjusting()) {
//                    return;
//                }
//                int row = tabela_sub_usuario.getSelectedRow();
//
//                System.out.println(row);
//
//                sub_usuario_lista get = lista_sub_usuarios.get(row);
//                //JCheckBox getC = (JCheckBox) tabela_sub_usuario.getValueAt(i, 0);
//                if (get.getCheck().isSelected() == true) {
//                    get.getCheck().setSelected(false);
////            get.getCheck().updateUI();
////            get.getCheck().revalidate();
//                } else {
//                    get.getCheck().setSelected(true);
////            get.getCheck().updateUI();
////            get.getCheck().revalidate();
//                }
//            }
//        });
    }

    public abstract EntityManager getEntityManager();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EntityManager = getEntityManager();
        btmExcluir = new javax.swing.JButton();
        checkCrawler = new javax.swing.JCheckBox();
        checkScanPorta = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabela_sub_usuario = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela_listagem = new javax.swing.JTable();
        checkSQLI = new javax.swing.JCheckBox();
        checkEu = new javax.swing.JCheckBox();

        this.lista_sub_usuarios = getListaUsuarios();

        setClosable(true);
        setIconifiable(true);

        btmExcluir.setText("Excluir");
        btmExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmExcluirActionPerformed(evt);
            }
        });

        checkCrawler.setText("Crawler");
        checkCrawler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCrawlerActionPerformed(evt);
            }
        });

        checkScanPorta.setText("Scan de Portas");

        tabela_sub_usuario.setModel(new TableModel_CheckBox(lista_sub_usuarios));
        tabela_sub_usuario.setCellSelectionEnabled(true);
        tabela_sub_usuario.setOpaque(false);
        tabela_sub_usuario.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabela_sub_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_sub_usuarioMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabela_sub_usuario);
        tabela_sub_usuario.setColumnModel(new ColumModel(tabela_sub_usuario.getModel())
        );

        tabela_listagem.setRowHeight(40);
        tabela_listagem.setModel(new View.Componentes.JTable.tabela_listagem_de_testes.TableModel_Testes());
        tabela_listagem.setColumnModel(new View.Componentes.JTable.tabela_listagem_de_testes.ColumModel(tabela_listagem.getModel()));
        jScrollPane2.setViewportView(tabela_listagem);

        checkSQLI.setText("SQL Inject");

        checkEu.setText("Eu mesmo");
        checkEu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkEuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkSQLI)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkCrawler)
                                    .addComponent(checkScanPorta))
                                .addGap(87, 87, 87))
                            .addComponent(btmExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(checkEu)
                                    .addGap(81, 81, 81))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(6, 6, 6))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(checkEu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btmExcluir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkScanPorta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkSQLI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkCrawler)))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmExcluirActionPerformed
        try {

            TesteJpaController JPA = new TesteJpaController(EntityManager.getEntityManagerFactory());

            testes_lista dados = ((TableModel_Testes) tabela_listagem.getModel()).getDados(tabela_listagem.getSelectedRow());
            
            JPA.destroy(dados.getTeste().getId());
            
            int linhaSelecionada = tabela_listagem.getSelectedRow();
            ((TableModel_Testes) tabela_listagem.getModel()).removeDados(tabela_listagem.getSelectedRow());

            if (tabela_listagem.getRowCount() > 0) {
                if (linhaSelecionada > 0) {
                    linhaSelecionada--;
                }
                tabela_listagem.setRowSelectionInterval(linhaSelecionada, linhaSelecionada);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btmExcluirActionPerformed

    private void checkCrawlerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCrawlerActionPerformed
        addTable();
    }//GEN-LAST:event_checkCrawlerActionPerformed

    private void tabela_sub_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_sub_usuarioMouseClicked

        int row = tabela_sub_usuario.getSelectedRow();

//        System.out.println(row);
        sub_usuario_lista get = lista_sub_usuarios.get(row);
        //JCheckBox getC = (JCheckBox) tabela_sub_usuario.getValueAt(i, 0);
        if (get.getCheck().isSelected() == true) {
            get.getCheck().setSelected(false);
//            checkTodos.setSelected(false);
//            get.getCheck().updateUI();
//            get.getCheck().revalidate();
        } else {
            get.getCheck().setSelected(true);
//            get.getCheck().updateUI();
//            get.getCheck().revalidate();
        }
//        auxiliarTodos();
        tabela_sub_usuario.updateUI();
        tabela_sub_usuario.revalidate();


    }//GEN-LAST:event_tabela_sub_usuarioMouseClicked

    private void checkEuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkEuActionPerformed
        addTable();
    }//GEN-LAST:event_checkEuActionPerformed
//    private int auxiliarTodos() {
//        for (int i = 0; i < tabela_sub_usuario.getRowCount(); i++) {
//            sub_usuario_lista get = lista_sub_usuarios.get(i);
//            if (!get.getCheck().isSelected()) {
//                return 0;
//            }
//        }
////        checkTodos.setSelected(true);
//        return 0;
//    }

    private void addTable() {
        ((TableModel_Testes) tabela_listagem.getModel()).limpar();
        ((TableModel_Testes) tabela_listagem.getModel()).addListaDeDados(getListaTeste());
    }

    private List<testes_lista> getListaTeste() {
        List<testes_lista> lista = new ArrayList<>();
        List resultList = new ArrayList<>();

        if (checkCrawler.isSelected()) {
            String queryWhere = " where";

            if (checkEu.isSelected()) {
                queryWhere += " c.idUsuario = :user";
            }

            int not = 0;

            for (int i = 0; i < lista_sub_usuarios.size(); i++) {
                sub_usuario_lista get = lista_sub_usuarios.get(i);
                if (get.getCheck().isSelected()) {

                    if (not == 0 && !checkEu.isSelected()) {
                        queryWhere += " c.idSubUsuario = :p" + i;
                    } else {
                        queryWhere += " OR c.idSubUsuario = :p" + i;
                    }
                    not = 1;
                }
            }
            if (checkEu.isSelected() | not == 1) {

                Query createQuery = EntityManager.createQuery("SELECT t FROM Teste t JOIN t.idCrawler c" + queryWhere);

                if (checkEu.isSelected()) {
                    createQuery.setParameter("user", this.user);
                }
                for (int i = 0; i < lista_sub_usuarios.size(); i++) {
                    sub_usuario_lista get = lista_sub_usuarios.get(i);
                    if (get.getCheck().isSelected()) {
                        createQuery.setParameter("p" + i, get.getSub());
                    }
                }

                resultList.addAll(createQuery.getResultList());
//            resultList.addAll(EntityManager.createQuery("SELECT t FROM Teste t "+queryWhere)
////                    + " JOIN t.idCrawler c "
////                    + "WHERE c.idUsuario = :user")
//                    .setParameter("user", this.user)
//                    .getResultList());
            }
        }

        if (checkSQLI.isSelected()) {
            //resultList.addAll(EntityManager.createNamedQuery("Teste.findCrawler").setParameter("user", this.user).getResultList());
        }
        if (checkScanPorta.isSelected()) {
            //resultList.addAll(EntityManager.createNamedQuery("Teste.findCrawler").setParameter("user", this.user).getResultList());
        }

        for (Object object : resultList) {

            Teste teste = (Teste) object;
            //for (int i = 0; i < 10; i++) {
            testes_lista t = new testes_lista(
                    /*new ImageIcon("C:\\Users\\Matheus\\Desktop\\java\\NetBeans\\TCC\\login\\src\\View\\Imagens\\crawler.png"),
                    "Teste", "eu");*/
                    new ImageIcon("C:\\Users\\Limao\\Desktop\\Screenshot_1.png"),teste);
//                    teste.getIdCrawler().getIdDominio().getDominio(),
//                    teste.getIdCrawler().getIdSubUsuario() == null ? "Voce" : teste.getIdCrawler().getIdSubUsuario().getNome());
            lista.add(t);
        }
        return lista;
    }

    private List<sub_usuario_lista> getListaUsuarios() {
        List<sub_usuario_lista> lista = new ArrayList<>();
        List resultList = EntityManager.createNamedQuery("SubUsuario.findAllUser").setParameter("user", this.user).getResultList();

        for (Object sub : resultList) {

            SubUsuario subUsuario = (SubUsuario) sub;

            sub_usuario_lista sb = new sub_usuario_lista(subUsuario, subUsuario.getNome()); //{
//                @Override
//                public void getSelected(boolean s) {
//
//                    if (s == false) {
//                        if (checkTodos.isSelected()) {
//                            checkTodos.setSelected(false);
//                        }
//                    }
//
//                }
//
//            };
            sb.getCheck().addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    addTable();
                }
            });
            lista.add(sb);
        }
        return lista;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager EntityManager;
    private javax.swing.JButton btmExcluir;
    private javax.swing.JCheckBox checkCrawler;
    private javax.swing.JCheckBox checkEu;
    private javax.swing.JCheckBox checkSQLI;
    private javax.swing.JCheckBox checkScanPorta;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabela_listagem;
    private javax.swing.JTable tabela_sub_usuario;
    // End of variables declaration//GEN-END:variables
}