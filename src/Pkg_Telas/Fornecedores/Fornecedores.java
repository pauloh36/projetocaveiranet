package Pkg_Telas.Fornecedores;

import Pkg_banco.BancoFuncoes;

public class Fornecedores extends javax.swing.JFrame {

    public Fornecedores() {
        initComponents();
        
        carregaTabela();
    }
    
    String fornecedor;
    
        BancoFuncoes bf = new BancoFuncoes();

    public void setFornecedor(String n){
        fornecedor = n;
    }
    public String getFornecedor(){
        return fornecedor = txFornecedor.getText().toUpperCase();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        internalFornecedores = new javax.swing.JInternalFrame();
        btnInserirFornecedor = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        radFisico = new javax.swing.JRadioButton();
        radJuridico = new javax.swing.JRadioButton();
        bnPesquisa = new javax.swing.JButton();
        txFornecedor = new javax.swing.JTextField();
        lbRazaoSocial = new javax.swing.JLabel();
        radAmbos = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        internalFornecedores.setClosable(true);
        internalFornecedores.setIconifiable(true);
        internalFornecedores.setTitle("Fornecedores");
        internalFornecedores.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Pkg_Imagens/Frnecedores.png"))); // NOI18N
        internalFornecedores.setVisible(true);
        internalFornecedores.getContentPane().setLayout(null);

        btnInserirFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pkg_Imagens/Frnecedores.png"))); // NOI18N
        btnInserirFornecedor.setText("Inserir Fornecedor");
        btnInserirFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirFornecedorActionPerformed(evt);
            }
        });
        internalFornecedores.getContentPane().add(btnInserirFornecedor);
        btnInserirFornecedor.setBounds(10, 30, 160, 50);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));
        jPanel1.setLayout(null);

        buttonGroup1.add(radFisico);
        radFisico.setText("Fisico");
        jPanel1.add(radFisico);
        radFisico.setBounds(10, 20, 80, 23);

        buttonGroup1.add(radJuridico);
        radJuridico.setText("Jurídico");
        jPanel1.add(radJuridico);
        radJuridico.setBounds(10, 40, 90, 23);

        bnPesquisa.setText("Pesquisar");
        bnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnPesquisaActionPerformed(evt);
            }
        });
        jPanel1.add(bnPesquisa);
        bnPesquisa.setBounds(440, 40, 100, 23);
        jPanel1.add(txFornecedor);
        txFornecedor.setBounds(110, 40, 280, 30);

        lbRazaoSocial.setText("Razão Social / Fornecedor:");
        jPanel1.add(lbRazaoSocial);
        lbRazaoSocial.setBounds(110, 20, 160, 20);

        buttonGroup1.add(radAmbos);
        radAmbos.setSelected(true);
        radAmbos.setText("Ambos");
        jPanel1.add(radAmbos);
        radAmbos.setBounds(10, 60, 80, 23);

        internalFornecedores.getContentPane().add(jPanel1);
        jPanel1.setBounds(200, 0, 560, 100);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod. Fornecedor", "Fornecedor", "C.N.P.J.", "C.P.F."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setToolTipText("Duplo Click para Alterar Fornecedor");
        tabela.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tabela);
        tabela.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tabela.getColumnModel().getColumn(0).setMinWidth(110);
        tabela.getColumnModel().getColumn(0).setMaxWidth(200);
        tabela.getColumnModel().getColumn(2).setMinWidth(130);
        tabela.getColumnModel().getColumn(2).setMaxWidth(200);
        tabela.getColumnModel().getColumn(3).setMinWidth(130);
        tabela.getColumnModel().getColumn(3).setMaxWidth(200);

        internalFornecedores.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 110, 770, 310);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(internalFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(internalFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirFornecedorActionPerformed
        CadastrarFornecedores cf = new CadastrarFornecedores(null, true);
        cf.setLocation(130, 15);
        cf.setVisible(true);
    }//GEN-LAST:event_btnInserirFornecedorActionPerformed

    private void bnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnPesquisaActionPerformed
                filtraConsulta();
    }//GEN-LAST:event_bnPesquisaActionPerformed

    public void carregaTabela(){
        String msg1 = "Fornecedores recuperados com sucesso";
        String msg2 = "Erro ao Recuperar Fornecedores";
        String vsql = "SELECT " +
                        "for_cod, for_fornecedor, for_cnpj, for_cpf " +
                      "FROM " +
                        "tb_fornecedores";


        bf.tabelaFornecedores(vsql, msg1, msg2, tabela);
    }

    public void carregaAtualizaTabela(){
        String msg1 = "Fornecedores recuperados com sucesso";
        String msg2 = "Erro ao Recuperar Fornecedores";
        String vsql = "SELECT " +
                        "for_cod, for_fornecedor, for_cnpj, for_cpf " +
                      "FROM " +
                        "tb_fornecedores";


        bf.tabelaAtualizaFornecedores(vsql, msg1, msg2, tabela);
    }

    public void filtraConsulta(){

        String msg1 = "Fornecedores pesquisado com sucesso";
        String msg2 = "Erro ao pesquisar Fornecedores";

            String vsql_1 = "SELECT * " +
                              "FROM " +
                            "tb_fornecedores " +
                              "where";
            String vsql_2 = "";

//----------pesquisa por fornecedor
            if(!getFornecedor().equals("")){
                       vsql_2 +=" upper(for_fornecedor) like '%"+getFornecedor()+"%' ";
            }

//----------pesquisa por tipo de pessoa
            if( radFisico.isSelected()){
                       vsql_2 += " for_pessoa = 'FISICO' ";
            }
            if( radJuridico.isSelected()){
                       vsql_2 += " for_pessoa = 'JURIDICO' ";
            }

//----------Se nenhum campo estiver preenchido, traz tudo q estiver no banco
            if(getFornecedor().equals("") && radAmbos.isSelected()){
                vsql_1 = "SELECT " +
                            "* " +
                         "FROM tb_fornecedores ";
            }

            vsql_1 += vsql_2;

            vsql_1 += "order by for_fornecedor";
                        
            vsql_1 = vsql_1.replace( "  ", " AND " );


    bf.filtrarFornecedores(vsql_1, msg1, msg2, tabela);

   }
   
    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Fornecedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnPesquisa;
    private javax.swing.JButton btnInserirFornecedor;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JInternalFrame internalFornecedores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbRazaoSocial;
    private javax.swing.JRadioButton radAmbos;
    private javax.swing.JRadioButton radFisico;
    private javax.swing.JRadioButton radJuridico;
    public javax.swing.JTable tabela;
    private javax.swing.JTextField txFornecedor;
    // End of variables declaration//GEN-END:variables
}
