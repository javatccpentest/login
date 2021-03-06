/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.Cadastro.TelaSubUsuario;
import View.Cadastro.TelaPermissoes;
import Model.Entity.Testes.Crawler;
import Controller.DAO.CrawlerJpaController;
import Crawler.Model.Dominio;
import Crawler.DAO.DominioJpaController;
import Crawler.DAO.WebpageJpaController;
import Crawler.Model.Webpage;
import View.SubTelas.*;
import View.SubTelas.Listagem.*;
import Model.Entity.*;
import ScanPortApi.Script.DAO.obj_ServiceData;
import ScanPortApi.View.CallScreen;
import ScanPortApi.View.Screen;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.util.Date;
import java.awt.*;
import java.awt.image.*;
//import Scan_portas.main.Principal_Tela;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public abstract class tela extends javax.swing.JFrame {

    private Usuario user = null;
    private SubUsuario sub = null;

    private final EntityManager em;

    public abstract EntityManager getEntityManager();

    /**
     * Creates new form tela
     */
    public tela(Usuario user) {
        this.user = user;
        this.em = getEntityManager();
        initComponents();
    }

    public tela(SubUsuario sub) {
        this.sub = sub;
        this.em = getEntityManager();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ImageIcon a = new ImageIcon("Z:\\TCC\\login\\2.jpg"/*getClass().getResource("/icones/39112175-java-wallpapers.png")*/);
        Image image = a.getImage();
        painelPrincipal = new javax.swing.JDesktopPane(){
            public void paintComponent (Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuSubUsuario = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        menuCrawler = new javax.swing.JMenu();
        menuListaCrawler = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuCrawlerGoogle = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuScanDiretorio = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        menuCrawlerWordlist = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        menuScanPorta = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        menuSqlInject = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        painelPrincipal.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(52, 152, 219));
        jMenuBar1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(108, 30));

        jMenu1.setText("Menu");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        menuSubUsuario.setText("Sub-Usuarios");
        if(sub!=null){
            menuSubUsuario.setVisible(false);
        }

        jMenuItem5.setText("Gerenciar Sub-Usuarios");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuSubUsuario.add(jMenuItem5);
        menuSubUsuario.add(jSeparator2);

        jMenuItem6.setText("Gerenciar Permissões");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menuSubUsuario.add(jMenuItem6);

        jMenu1.add(menuSubUsuario);
        jMenu1.add(jSeparator7);

        jMenu3.setText("WEB");

        menuCrawler.setText("Crawler");
        if(sub!=null && sub.getIdPermissao().getCrawler() == false){
            menuCrawler.setVisible(false);
        }

        menuListaCrawler.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuListaCrawler.setText("Lista");
        menuListaCrawler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListaCrawlerActionPerformed(evt);
            }
        });
        menuCrawler.add(menuListaCrawler);
        menuCrawler.add(jSeparator1);

        menuCrawlerGoogle.setText("Crawler por conteudo indexado");
        menuCrawlerGoogle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCrawlerGoogleActionPerformed(evt);
            }
        });
        menuCrawler.add(menuCrawlerGoogle);

        jMenu3.add(menuCrawler);
        jMenu3.add(jSeparator3);

        menuScanDiretorio.setText("Scan de diretorios");
        if(sub!=null && sub.getIdPermissao().getCrawler()== false){
            menuScanDiretorio.setVisible(false);
        }

        jMenuItem9.setText("Lista");
        menuScanDiretorio.add(jMenuItem9);
        menuScanDiretorio.add(jSeparator4);

        menuCrawlerWordlist.setText("Crawler por wordlist");
        menuCrawlerWordlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCrawlerWordlistActionPerformed(evt);
            }
        });
        menuScanDiretorio.add(menuCrawlerWordlist);

        jMenu3.add(menuScanDiretorio);
        jMenu3.add(jSeparator8);

        menuScanPorta.setText("Scan de portas");
        if(sub!=null && sub.getIdPermissao().getScanPortas() == false){
            menuScanPorta.setVisible(false);
        }

        jMenuItem7.setText("Lista");
        menuScanPorta.add(jMenuItem7);
        menuScanPorta.add(jSeparator9);

        jMenuItem1.setText("Scan de portas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuScanPorta.add(jMenuItem1);

        jMenu3.add(menuScanPorta);
        jMenu3.add(jSeparator5);

        menuSqlInject.setText("SQL Inject");
        if(sub!=null && sub.getIdPermissao().getSqlInject()== false){
            menuSqlInject.setVisible(false);
        }

        jMenuItem8.setText("Lista");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        menuSqlInject.add(jMenuItem8);
        menuSqlInject.add(jSeparator10);

        jMenuItem4.setText("SQL inject");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuSqlInject.add(jMenuItem4);

        jMenu3.add(menuSqlInject);

        jMenu1.add(jMenu3);
        jMenu1.add(jSeparator6);

        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Relatorio");
        jMenu4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItem10.setText("Testes");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuListaCrawlerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListaCrawlerActionPerformed
        TelaCrawler_listagem tela = new TelaCrawler_listagem() {
            @Override
            public EntityManager getEntityManager() {
                return em;
            }

            @Override
            public Query getQueryLista() {
                return sub == null ? em.createNamedQuery("Crawler.findAllUser").setParameter("user", user)
                        : em.createNamedQuery("Crawler.findAllSub").setParameter("sub", sub);
            }
        };

        tela.setVisible(true);
        painelPrincipal.add(tela);
    }//GEN-LAST:event_menuListaCrawlerActionPerformed

    private void menuCrawlerGoogleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCrawlerGoogleActionPerformed

        telaCrawler tela;

        if (sub != null) {
            tela = new telaCrawler(sub) {
                @Override
                public EntityManager getEntityManager() {
                    return em;
                }
            };
        } else {
            tela = new telaCrawler(user) {
                @Override
                public EntityManager getEntityManager() {
                    return em;
                }
            };
        }

        tela.setVisible(true);
        painelPrincipal.add(tela);

    }//GEN-LAST:event_menuCrawlerGoogleActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        obj_ServiceData data = new obj_ServiceData();
        ScanPortApi.View.Screen a = new Screen() {
            @Override
            public EntityManager getEntityManager() {
                return em;
            }

            @Override
            public int IdUser() {
                return user.getId();
            }

            @Override
            public int IdSubUser() {
                return sub == null ? 1 : sub.getId();
            }

            @Override
            public Query query() {
                return em.createNamedQuery("obj_ServiceData.findByPorta");
            }
        };
        a.setVisible(true);
        painelPrincipal.add(a);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuCrawlerWordlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCrawlerWordlistActionPerformed
        Date dt_inicio = new Date();

        CrawlerJpaController JPA = new CrawlerJpaController(getEntityManager().getEntityManagerFactory());

        DominioJpaController JPA_DOM = new DominioJpaController(getEntityManager().getEntityManagerFactory());

        WebpageJpaController webJpa = new WebpageJpaController(getEntityManager().getEntityManagerFactory());

        Dominio DOM = new Dominio();

        Crawler c = new Crawler();
        c.setHoraInicio(dt_inicio);
        c.setHoraFim(new Date());
        c.setIdDominio(DOM);

        if (sub != null) {
            c.setIdSubUsuario(sub);
            c.setIdUsuario(sub.getIdUsuario());
        } else {
            c.setIdUsuario(user);
        }

//        Scan_dir.tela.tela tela = new Scan_dir.tela.tela() {
//            @Override
//            public void inserir_url_banco_main_file(String url) {
//                Webpage PAGE = new Webpage();
//
//                PAGE.setDominioId(DOM);
//
//                //PAGE.setIsDirectory(false);
//                String[] split = url.split("\\.");
//                PAGE.setContentType(split[split.length - 1]);
//
//                PAGE.setUrl(url);
//
//                webJpa.create(PAGE);
//            }
//
//            @Override
//            public void inserir_url_banco_main_dir(String url) {
//                Webpage PAGE = new Webpage();
//
//                PAGE.setDominioId(DOM);
//
//                //PAGE.setIsDirectory(true);
//                String[] split = url.split("\\.");
//                PAGE.setContentType(split[split.length - 1]);
//
//                PAGE.setUrl(url);
//
//                webJpa.create(PAGE);
//            }
//
//            @Override
//            public void inserir_dominio(String url, String num) {
//                DOM.setDominio(url.split("/")[2].trim());
//                try {
//                    InetAddress address = InetAddress.getByName(new URL(url)
//                            .getHost());
//
//                    DOM.setRemoteAddress(address.getHostAddress());
//
//                    URL obj = new URL(url);
//                    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//                    DOM.setServer(con.getHeaderField("Server"));
//
//                } catch (IOException ex) {
//                    //ex.printStackTrace();
//                }
//
//                JPA_DOM.create(DOM);
//
//                c.setWordlist(num);
//                JPA.create(c);
//            }
//        };
//
//        tela.setVisible(true);
//        painelPrincipal.add(tela);

    }//GEN-LAST:event_menuCrawlerWordlistActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed
//    apisqlinjectionv2.views.ViewMain viewMainImplementacao;
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
//        viewMainImplementacao = new apisqlinjectionv2.views.ViewMain() {
//            @Override
//            public Query getQueryCrawler() {
//                return sub == null ? em.createNamedQuery("Crawler.findAllUser").setParameter("user", user)
//                        : em.createNamedQuery("Crawler.findAllSub").setParameter("sub", sub);
//            }
//
//            @Override
//            public int consultaIdUsuario() {
//                return user.getId();
//            }
//
//            @Override
//            public int consultaIdSubUsuario() {
//                return sub == null ? 1 : sub.getId();
//            }
//        };
//        viewMainImplementacao.setVisible(true);
//        painelPrincipal.add(viewMainImplementacao);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        TelaSubUsuario tela = new TelaSubUsuario(user) {
            @Override
            public EntityManager getEntityManager() {
                return em;
            }
        };

        tela.setVisible(true);
        painelPrincipal.add(tela);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        TelaPermissoes tela = new TelaPermissoes(user) {
            @Override
            public EntityManager getEntityManager() {
                return em;
            }
        };

        tela.setVisible(true);
        painelPrincipal.add(tela);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
//        telaSqli_listagem tela = new telaSqli_listagem() {
//            @Override
//            public EntityManager getEntityManager() {
//                return em;
//            }
//
//            @Override
//            public Query getQueryList() {
//                return sub == null ? em.createNamedQuery("SqliLista.findAllUser").setParameter("user", user)
//                        : em.createNamedQuery("SqliLista.findAllSub").setParameter("sub", sub);
//            }
//        };
//
//        tela.setVisible(true);
//        painelPrincipal.add(tela);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        tela_listagem tela = new tela_listagem(user) {
            @Override
            public EntityManager getEntityManager() {
                return em;
            }
        };

        tela.setVisible(true);
        painelPrincipal.add(tela);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenu menuCrawler;
    private javax.swing.JMenuItem menuCrawlerGoogle;
    private javax.swing.JMenuItem menuCrawlerWordlist;
    private javax.swing.JMenuItem menuListaCrawler;
    private javax.swing.JMenu menuScanDiretorio;
    private javax.swing.JMenu menuScanPorta;
    private javax.swing.JMenu menuSqlInject;
    private javax.swing.JMenu menuSubUsuario;
    private javax.swing.JDesktopPane painelPrincipal;
    // End of variables declaration//GEN-END:variables
}
