package Pkg_Telas.Estoque;

import Pkg_Telas.Produtos.*;
import Pkg_Telas.Clientes.*;
import Pkg_banco.BancoFuncoes;

public class Estoque extends javax.swing.JFrame {

    public Estoque() {
        initComponents();

        carregaFornecedor();
        carregaDepartamento();
        carregaTabela();
    }

    String codigo, barras, produto, departamento, fornecedor, referencia;

        BancoFuncoes bf = new BancoFuncoes();

    public void setCodigo(String d){
        codigo = d;
    }
    public String getCodigo(){
        return codigo = txCodigo.getText();
    }

    public void setBarras(String d){
        barras = d;
    }
    public String getBarras(){
        return barras = txBarras.getText();
    }
  
    public void setProduto(String d){
        produto = d;
    }
    public String getProduto(){
        return produto = txProduto.getText().toUpperCase();
    }

    public void setReferencia(String d){
        referencia = d;
    }
    public String getReferencia(){
        return referencia = txReferencia.getText().toUpperCase();
    }
    
    public void setDepartamento(String m){
        departamento = m;
    }
    public String getDepartamento(){
        return departamento = (String) jcbDepartameto.getSelectedItem();
    }
    
    public void setFornecedor(String m){
        fornecedor = m;
    }
    public String getFornecedor(){
        return fornecedor = (String) jcbFornecedor.getSelectedItem();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        internalEstoque = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        bnPesquisa = new javax.swing.JButton();
        txProduto = new javax.swing.JTextField();
        lbRazaoSocial = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txCodigo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txBarras = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txReferencia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jcbDepartameto = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jcbFornecedor = new javax.swing.JComboBox();
        jcbQuantidadeMinima = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        internalEstoque.setClosable(true);
        internalEstoque.setIconifiable(true);
        internalEstoque.setTitle("Estoque");
        internalEstoque.setVisible(true);
        internalEstoque.getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));
        jPanel1.setLayout(null);

        bnPesquisa.setText("Pesquisar");
        bnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnPesquisaActionPerformed(evt);
            }
        });
        jPanel1.add(bnPesquisa);
        bnPesquisa.setBounds(760, 90, 110, 30);
        jPanel1.add(txProduto);
        txProduto.setBounds(20, 40, 230, 30);

        lbRazaoSocial.setText("Descrição do Produto:");
        jPanel1.add(lbRazaoSocial);
        lbRazaoSocial.setBounds(20, 20, 160, 20);

        jLabel2.setText("Código:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(280, 20, 110, 20);
        jPanel1.add(txCodigo);
        txCodigo.setBounds(280, 40, 110, 30);

        jLabel10.setText("Código de Barras:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(430, 20, 150, 20);
        jPanel1.add(txBarras);
        txBarras.setBounds(430, 40, 250, 30);

        jLabel12.setText("Referência do Produto:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(20, 70, 150, 20);

        txReferencia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(txReferencia);
        txReferencia.setBounds(20, 90, 230, 30);

        jLabel3.setText("Departamento:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(280, 70, 150, 20);

        jPanel1.add(jcbDepartameto);
        jcbDepartameto.setBounds(280, 90, 200, 30);

        jLabel5.setText("Fornecedor:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(520, 70, 150, 20);

        jcbFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbFornecedorActionPerformed(evt);
            }
        });
        jPanel1.add(jcbFornecedor);
        jcbFornecedor.setBounds(520, 90, 220, 30);

        jcbQuantidadeMinima.setText("Quantidade Mínima");
        jPanel1.add(jcbQuantidadeMinima);
        jcbQuantidadeMinima.setBounds(710, 40, 140, 30);

        internalEstoque.getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 10, 890, 130);

        tabela.setAutoCreateRowSorter(true);
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod. Produto", "Código", "Descriçao do Produto", "Referência", "Departamento", "Qnt. Em Estoque", "Qnt. Mínima"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setToolTipText("Duplo Click para atualizar quantidade de estoque");
        tabela.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tabela);
        tabela.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setMinWidth(0);
            tabela.getColumnModel().getColumn(0).setPreferredWidth(0);
            tabela.getColumnModel().getColumn(0).setMaxWidth(0);
            tabela.getColumnModel().getColumn(1).setMinWidth(100);
            tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
            tabela.getColumnModel().getColumn(1).setMaxWidth(100);
            tabela.getColumnModel().getColumn(2).setMinWidth(250);
            tabela.getColumnModel().getColumn(2).setPreferredWidth(250);
            tabela.getColumnModel().getColumn(2).setMaxWidth(200);
            tabela.getColumnModel().getColumn(3).setMinWidth(100);
            tabela.getColumnModel().getColumn(3).setPreferredWidth(100);
            tabela.getColumnModel().getColumn(3).setMaxWidth(180);
            tabela.getColumnModel().getColumn(4).setMinWidth(140);
            tabela.getColumnModel().getColumn(4).setPreferredWidth(140);
            tabela.getColumnModel().getColumn(4).setMaxWidth(140);
            tabela.getColumnModel().getColumn(5).setMinWidth(110);
            tabela.getColumnModel().getColumn(5).setPreferredWidth(110);
            tabela.getColumnModel().getColumn(5).setMaxWidth(110);
            tabela.getColumnModel().getColumn(6).setMinWidth(110);
            tabela.getColumnModel().getColumn(6).setPreferredWidth(110);
            tabela.getColumnModel().getColumn(6).setMaxWidth(110);
        }

        internalEstoque.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 150, 890, 340);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(internalEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(internalEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnPesquisaActionPerformed
            filtraConsulta();
    }//GEN-LAST:event_bnPesquisaActionPerformed

    private void jcbFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbFornecedorActionPerformed

    public void carregaFornecedor(){
        String msg1 = "Fornecedores recuperados";
        String msg2 = "Erro ao Recuperar Fornecedores";
        String vsql = "SELECT for_fornecedor FROM tb_fornecedores order by for_fornecedor";
        String campoSql = "for_fornecedor";

        bf.carregaDadoUnico(vsql, msg1, msg2, jcbFornecedor, campoSql);
    }

    public void carregaDepartamento(){
        String msg1 = "Departamento recuperados";
        String msg2 = "Erro ao Recuperar Departamento";
        String vsql = "SELECT dep_departamento FROM tb_departamento order by dep_departamento";
        String campoSql = "dep_departamento";

        bf.carregaDadoUnico(vsql, msg1, msg2, jcbDepartameto, campoSql);
    }

    public void carregaTabela(){
        String msg1 = "Estoque recuperados com sucesso";
        String msg2 = "Erro ao Recuperar Estoque";
        String vsql = "SELECT prod_cod, prod_codigo, prod_produto, prod_referencia, dep_departamento, "+
                      "prod_quantidade, for_fornecedor, prod_minimo " +
                      "FROM tb_produtos " +
                      "INNER JOIN tb_fornecedores ON prod_tb_fornecedor = for_cod " +
                      "INNER JOIN tb_departamento ON prod_tb_departamento = dep_cod";

        bf.tabelaEstoque(vsql, msg1, msg2, tabela);
    }

    public void filtraConsulta(){

            String msg1="Filtro OK";
            String msg2="Erro ao Execultar Filtro";
            String vsql_1 = "SELECT prod_cod, prod_codigo, prod_produto, prod_referencia, dep_departamento, "+
                            "prod_quantidade, for_fornecedor, prod_minimo " +
                            "FROM tb_produtos " +
                            "INNER JOIN tb_fornecedores ON prod_tb_fornecedor = for_cod " +
                            "INNER JOIN tb_departamento ON prod_tb_departamento = dep_cod"+
                            " WHERE";
            String vsql_2 = "";

//----------pesquisa por Produto
            if(!getProduto().equals("")){
                       vsql_2 +=" prod_produto like '%"+getProduto()+"%' ";
            }
  
 //----------pesquisa por Codigo
            if(!getCodigo().equals("")){
                       vsql_2 +=" prod_codigo like '%"+getCodigo()+"%' ";
            }

 //----------pesquisa por Referencia
            if(!getReferencia().equals("")){
                       vsql_2 +=" prod_referencia like '%"+getReferencia()+"%' ";
            }

 //----------pesquisa por Codigo de Barras
            if(!getBarras().equals("")){
                       vsql_2 +=" prod_barras like '%"+getBarras()+"%' ";
            }            

 //----------pesquisa por Codigo de Barras
            if(!getDepartamento().equals("")){
                       vsql_2 +=" dep_departamento like '%"+getDepartamento()+"%' ";
            }
            
 //----------pesquisa por Codigo de Barras
            if(!getFornecedor().equals("")){
                       vsql_2 +=" for_fornecedor like '%"+getFornecedor()+"%' ";
            }            
            
            if(jcbQuantidadeMinima.isSelected()){
                       vsql_2 +=" prod_quantidade <= prod_minimo ";
            }
            
//----------Se nenhum campo estiver preenchido, traz tudo q estiver no banco
            if(getCodigo().equals("") && getProduto().equals("")&& getBarras().equals("") && 
               getReferencia().equals("") && getDepartamento().equals("")&& getFornecedor().equals("") &&
               !jcbQuantidadeMinima.isSelected()){
                vsql_1 = "SELECT prod_cod, prod_codigo, prod_produto, prod_referencia, dep_departamento, "+
                         "prod_quantidade, for_fornecedor, prod_minimo " +
                         "FROM tb_produtos " +
                         "INNER JOIN tb_fornecedores ON prod_tb_fornecedor = for_cod " +
                         "INNER JOIN tb_departamento ON prod_tb_departamento = dep_cod";
            }

            vsql_1 += vsql_2;

            vsql_1 = vsql_1.replace( "  ", " AND " );

         
   bf.filtrarEstoque(vsql_1, msg1, msg2, tabela);

   }

    public void carregaAtualizaTabela(){
        String msg1 = "Estoque recuperados com sucesso";
        String msg2 = "Erro ao Estoque Produtos";
        String vsql = "SELECT prod_cod, prod_codigo, prod_produto, prod_referencia, dep_departamento, "+
                      "prod_quantidade, for_fornecedor, prod_minimo " +
                      "FROM tb_produtos " +
                      "INNER JOIN tb_fornecedores ON prod_tb_fornecedor = for_cod " +
                      "INNER JOIN tb_departamento ON prod_tb_departamento = dep_cod";

        bf.tabelaAtualizaEstoque(vsql, msg1, msg2, tabela);
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
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Estoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnPesquisa;
    public javax.swing.JInternalFrame internalEstoque;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JComboBox jcbDepartameto;
    public javax.swing.JComboBox jcbFornecedor;
    private javax.swing.JCheckBox jcbQuantidadeMinima;
    private javax.swing.JLabel lbRazaoSocial;
    public javax.swing.JTable tabela;
    private javax.swing.JTextField txBarras;
    private javax.swing.JTextField txCodigo;
    private javax.swing.JTextField txProduto;
    private javax.swing.JTextField txReferencia;
    // End of variables declaration//GEN-END:variables
}
