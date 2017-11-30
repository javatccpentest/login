/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Cadastro;

import Controller.DAO.PermissaoJpaController;
import Model.Entity.Permissao;
import Model.Entity.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public abstract class TelaPermissoes extends javax.swing.JInternalFrame {

    private Usuario user = null;

    /**
     * Creates new form TelaPermissoes
     */
    public TelaPermissoes(Usuario user) {
        initComponents();
        this.user = user;
        permissaoQuery = EntityManager.createNamedQuery("Permissao.findAllUser")
                .setParameter("user", this.user);
        permissaoList.clear();
        permissaoList.addAll(permissaoQuery.getResultList());
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        EntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("persistencePU").createEntityManager();
        permissaoQuery = java.beans.Beans.isDesignTime() ? null : EntityManager.createQuery("SELECT p FROM Permissao p");
        permissaoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(permissaoQuery.getResultList());
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        edtId = new javax.swing.JTextField();
        btnNovo = new javax.swing.JPanel();
        btmNovo = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JPanel();
        btmExcluir = new javax.swing.JLabel();
        btnEditar = new javax.swing.JPanel();
        btmEditar = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPermissao = new javax.swing.JTable();
        edtBusca = new javax.swing.JTextField();
        edtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        checkScanPorta = new javax.swing.JCheckBox();
        checkSQLI = new javax.swing.JCheckBox();
        checkCrawler = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JPanel();
        btmSalvar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JPanel();
        btmCancelar = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Gerenciar permissões");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(52, 152, 219));

        edtId.setEnabled(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblPermissao, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.id}"), edtId, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        edtId.setVisible(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(edtId, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(edtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        btnNovo.setBackground(new java.awt.Color(52, 152, 219));

        btmNovo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btmNovo.setForeground(new java.awt.Color(255, 255, 255));
        btmNovo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btmNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icones/cadastro/icons8-add-file.png"))); // NOI18N
        btmNovo.setText("Novo");
        btmNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btmNovoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btmNovoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btmNovoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnNovoLayout = new javax.swing.GroupLayout(btnNovo);
        btnNovo.setLayout(btnNovoLayout);
        btnNovoLayout.setHorizontalGroup(
            btnNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btmNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnNovoLayout.setVerticalGroup(
            btnNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btmNovo, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        btnExcluir.setBackground(new java.awt.Color(52, 152, 219));

        btmExcluir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btmExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btmExcluir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btmExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icones/cadastro/icons8-delete.png"))); // NOI18N
        btmExcluir.setText("Excluir");
        btmExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btmExcluirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btmExcluirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btmExcluirMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnExcluirLayout = new javax.swing.GroupLayout(btnExcluir);
        btnExcluir.setLayout(btnExcluirLayout);
        btnExcluirLayout.setHorizontalGroup(
            btnExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btmExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnExcluirLayout.setVerticalGroup(
            btnExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btmExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        btnEditar.setBackground(new java.awt.Color(52, 152, 219));

        btmEditar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btmEditar.setForeground(new java.awt.Color(255, 255, 255));
        btmEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btmEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icones/cadastro/icons8-edit.png"))); // NOI18N
        btmEditar.setText("Editar");
        btmEditar.setEnabled(false);
        btmEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btmEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btmEditarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btmEditarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnEditarLayout = new javax.swing.GroupLayout(btnEditar);
        btnEditar.setLayout(btnEditarLayout);
        btnEditarLayout.setHorizontalGroup(
            btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btmEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnEditarLayout.setVerticalGroup(
            btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btmEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 173, Short.MAX_VALUE)
        );

        tblPermissao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblPermissao.setForeground(new java.awt.Color(51, 51, 51));
        tblPermissao.setGridColor(new java.awt.Color(255, 255, 255));
        tblPermissao.setRowHeight(25);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, permissaoList, tblPermissao);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tblPermissao);

        edtBusca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        edtBusca.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(102, 102, 102)));
        edtBusca.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                edtBuscaCaretUpdate(evt);
            }
        });

        edtNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        edtNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(102, 102, 102)));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblPermissao, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nome}"), edtNome, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Pesquisar");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modulos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));

        checkScanPorta.setBackground(new java.awt.Color(255, 255, 255));
        checkScanPorta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        checkScanPorta.setText("Scan de Portas");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblPermissao, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.scanPortas}"), checkScanPorta, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        checkSQLI.setBackground(new java.awt.Color(255, 255, 255));
        checkSQLI.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        checkSQLI.setText("SQL Inject");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblPermissao, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.sqlInject}"), checkSQLI, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        checkSQLI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSQLIActionPerformed(evt);
            }
        });

        checkCrawler.setBackground(new java.awt.Color(255, 255, 255));
        checkCrawler.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        checkCrawler.setText("Crawler");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblPermissao, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.crawler}"), checkCrawler, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkScanPorta)
                    .addComponent(checkCrawler)
                    .addComponent(checkSQLI))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(checkScanPorta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkSQLI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkCrawler)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Digite o nome da permissão");

        btnSalvar.setBackground(new java.awt.Color(52, 152, 219));

        btmSalvar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btmSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btmSalvar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btmSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icones/cadastro/icons8-checkmark (2).png"))); // NOI18N
        btmSalvar.setText("Salvar");
        btmSalvar.setEnabled(false);
        btmSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btmSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btmSalvarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btmSalvarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnSalvarLayout = new javax.swing.GroupLayout(btnSalvar);
        btnSalvar.setLayout(btnSalvarLayout);
        btnSalvarLayout.setHorizontalGroup(
            btnSalvarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btmSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnSalvarLayout.setVerticalGroup(
            btnSalvarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btmSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        btnCancelar.setBackground(new java.awt.Color(52, 152, 219));

        btmCancelar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btmCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btmCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btmCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icones/cadastro/icons8-delete (1).png"))); // NOI18N
        btmCancelar.setText("Cancelar");
        btmCancelar.setEnabled(false);
        btmCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btmCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btmCancelarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btmCancelarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnCancelarLayout = new javax.swing.GroupLayout(btnCancelar);
        btnCancelar.setLayout(btnCancelarLayout);
        btnCancelarLayout.setHorizontalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btmCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnCancelarLayout.setVerticalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btmCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(edtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(47, 47, 47)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(edtNome)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtBuscaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_edtBuscaCaretUpdate
        if (!edtBusca.getText().isEmpty()) {
            permissaoQuery = EntityManager.createNamedQuery("Permissao.findByNomeLikeUser")
                    .setParameter("user", user)
                    .setParameter("nome", "%" + edtBusca.getText() + "%");
        } else {
            permissaoQuery = EntityManager.createNamedQuery("Permissao.findAllUser")
                    .setParameter("user", user);
        }
        permissaoList.clear();
        permissaoList.addAll(permissaoQuery.getResultList());
    }//GEN-LAST:event_edtBuscaCaretUpdate

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        configuraInicializacao();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btmNovoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmNovoMousePressed
        inserirPermissao();
    }//GEN-LAST:event_btmNovoMousePressed

    private void btmExcluirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmExcluirMousePressed
        try {
            PermissaoJpaController JPA = new PermissaoJpaController(EntityManager.getEntityManagerFactory());
            JPA.destroy(Integer.parseInt(edtId.getText()));

            int linhaSelecionada = tblPermissao.getSelectedRow();
            permissaoList.remove(tblPermissao.getSelectedRow());
            if (tblPermissao.getRowCount() > 0) {
                if (linhaSelecionada > 0) {
                    linhaSelecionada--;
                }
                tblPermissao.setRowSelectionInterval(linhaSelecionada, linhaSelecionada);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btmExcluirMousePressed

    private void btmEditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmEditarMousePressed
        configurarParaEdicao();
    }//GEN-LAST:event_btmEditarMousePressed

    private void btmSalvarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmSalvarMousePressed
        try {

            if (this.estadoPermissao == EstadoPermissao.INSERINDO_PERMISSAO) {
                salvarPermissao_Insersao();
            } else {
                salvarPermissao_Atualizacao();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btmSalvarMousePressed

    private void btmCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmCancelarMousePressed
        try {
            if (estadoPermissao == estadoPermissao.INSERINDO_PERMISSAO) {
                cancelarInsercaoPermissao();
            } else {
                cancelarAtualizacaoPermissao();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btmCancelarMousePressed

    private void btmSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmSalvarMouseExited
        btnSalvar.setBackground(new java.awt.Color(52, 152, 219));
    }//GEN-LAST:event_btmSalvarMouseExited

    private void btmSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmSalvarMouseEntered
        btnSalvar.setBackground(new java.awt.Color(41, 128, 185));
    }//GEN-LAST:event_btmSalvarMouseEntered

    private void checkSQLIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSQLIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkSQLIActionPerformed

    private void btmNovoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmNovoMouseExited
        btnNovo.setBackground(new java.awt.Color(52, 152, 219));
    }//GEN-LAST:event_btmNovoMouseExited

    private void btmNovoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmNovoMouseEntered
        btnNovo.setBackground(new java.awt.Color(41, 128, 185));
    }//GEN-LAST:event_btmNovoMouseEntered

    private void btmExcluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmExcluirMouseExited
        btnExcluir.setBackground(new java.awt.Color(52, 152, 219));
    }//GEN-LAST:event_btmExcluirMouseExited

    private void btmExcluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmExcluirMouseEntered
        btnExcluir.setBackground(new java.awt.Color(41, 128, 185));
    }//GEN-LAST:event_btmExcluirMouseEntered

    private void btmEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmEditarMouseExited
        btnEditar.setBackground(new java.awt.Color(52, 152, 219));
    }//GEN-LAST:event_btmEditarMouseExited

    private void btmEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmEditarMouseEntered
        btnEditar.setBackground(new java.awt.Color(41, 128, 185));
    }//GEN-LAST:event_btmEditarMouseEntered

    private void btmCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmCancelarMouseExited
        btnCancelar.setBackground(new java.awt.Color(52, 152, 219));
    }//GEN-LAST:event_btmCancelarMouseExited

    private void btmCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmCancelarMouseEntered
        btnCancelar.setBackground(new java.awt.Color(41, 128, 185));
    }//GEN-LAST:event_btmCancelarMouseEntered

    private enum EstadoPermissao {
        INSERINDO_PERMISSAO,
        EDITANDO_PERMISSAO,
        CONSULTANDO_PERMISSAO
    }

    private EstadoPermissao estadoPermissao = EstadoPermissao.CONSULTANDO_PERMISSAO;

    private void configuraInicializacao() {

        if (tblPermissao.getRowCount() > 0) {
            tblPermissao.setRowSelectionInterval(0, 0);
        }

        configurarParaConsulta();
    }

    private void configurarParaConsulta() {
        btmNovo.setEnabled(true);
        btmExcluir.setEnabled(tblPermissao.getRowCount() != 0);
        btmEditar.setEnabled(tblPermissao.getRowCount() != 0);
        btmCancelar.setEnabled(false);
        btmSalvar.setEnabled(false);

        estadoPermissao = EstadoPermissao.CONSULTANDO_PERMISSAO;
        estadoCampos(false);
    }

    private void configurarParaEdicao() {
        btmNovo.setEnabled(false);
        btmExcluir.setEnabled(false);
        btmEditar.setEnabled(false);
        btmCancelar.setEnabled(true);
        btmSalvar.setEnabled(true);

        if (estadoPermissao == EstadoPermissao.CONSULTANDO_PERMISSAO) {
            if (tblPermissao.getRowCount() != 0) {
                estadoPermissao = EstadoPermissao.EDITANDO_PERMISSAO;
                estadoCampos(true);
            }
        }
    }

    private void configurarParaInsersao() {
        btmNovo.setEnabled(false);
        btmExcluir.setEnabled(false);
        btmEditar.setEnabled(false);
        btmCancelar.setEnabled(true);
        btmSalvar.setEnabled(true);

        estadoPermissao = EstadoPermissao.INSERINDO_PERMISSAO;
        estadoCampos(true);
    }

    private void salvarPermissao_Insersao() {
        if (!edtNome.getText().equals("")) {
            PermissaoJpaController JPA = new PermissaoJpaController(EntityManager.getEntityManagerFactory());
            Permissao perm = new Permissao();

            try {

                perm = preencherPermissao(perm);
                JPA.create(perm);

                permissaoList.remove(tblPermissao.getSelectedRow());

                permissaoList.add(perm);
                tblPermissao.setRowSelectionInterval(tblPermissao.getRowCount() - 1,
                        tblPermissao.getRowCount() - 1);

                //this.estadoPermissao = EstadoPermissao.CONSULTANDO_PERMISSAO;
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                configurarParaConsulta();
            }
        } else {
            //JOptionPane.showMessageDialog(null, "o campo nome não foi preenchido");
        }
    }

    private Permissao preencherPermissao(Permissao perm) {
        perm.setNome(edtNome.getText());
        perm.setIdUsuario(user);
        perm.setCrawler(checkCrawler.isSelected());
        perm.setSqlInject(checkSQLI.isSelected());
        perm.setScanPortas(checkScanPorta.isSelected());

        return perm;
    }

    private void estadoCampos(boolean e) {
        edtNome.setEnabled(e);
        checkCrawler.setEnabled(e);
        checkScanPorta.setEnabled(e);
        checkSQLI.setEnabled(e);
    }

    private void salvarPermissao_Atualizacao() {
        if (!edtNome.getText().equals("")) {
            PermissaoJpaController JPA = new PermissaoJpaController(EntityManager.getEntityManagerFactory());
            Permissao perm = JPA.findPermissao(Integer.parseInt(edtId.getText()));

            try {

                perm = preencherPermissao(perm);
                JPA.edit(perm);

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                configurarParaConsulta();
            }
        } else {
            JOptionPane.showMessageDialog(null, "o campo nome não foi preenchido");
        }
    }

    private void inserirPermissao() {
        Permissao perm = new Permissao();
        this.permissaoList.add(perm);

        tblPermissao.setRowSelectionInterval(tblPermissao.getRowCount() - 1,
                tblPermissao.getRowCount() - 1);
        edtBusca.requestFocus();

        configurarParaInsersao();
    }

    private void cancelarInsercaoPermissao() {

        permissaoList.remove(tblPermissao.getSelectedRow());

        if (tblPermissao.getRowCount() > 0) {
            tblPermissao.setRowSelectionInterval(tblPermissao.getRowCount() - 1,
                    tblPermissao.getRowCount() - 1);
        }
        configurarParaConsulta();

    }

    private void cancelarAtualizacaoPermissao() {
        PermissaoJpaController JPA = new PermissaoJpaController(EntityManager.getEntityManagerFactory());
        Permissao perm = JPA.findPermissao(Integer.parseInt(edtId.getText()));

        edtNome.setText(perm.getNome());
        checkCrawler.setSelected(perm.getCrawler());
        checkSQLI.setSelected(perm.getSqlInject());
        checkScanPorta.setSelected(perm.getScanPortas());

        configurarParaConsulta();

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager EntityManager;
    private javax.swing.JLabel btmCancelar;
    private javax.swing.JLabel btmEditar;
    private javax.swing.JLabel btmExcluir;
    private javax.swing.JLabel btmNovo;
    private javax.swing.JLabel btmSalvar;
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JPanel btnEditar;
    private javax.swing.JPanel btnExcluir;
    private javax.swing.JPanel btnNovo;
    private javax.swing.JPanel btnSalvar;
    private javax.swing.JCheckBox checkCrawler;
    private javax.swing.JCheckBox checkSQLI;
    private javax.swing.JCheckBox checkScanPorta;
    private javax.swing.JTextField edtBusca;
    private javax.swing.JTextField edtId;
    private javax.swing.JTextField edtNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private java.util.List<Model.Entity.Permissao> permissaoList;
    private javax.persistence.Query permissaoQuery;
    private javax.swing.JTable tblPermissao;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
