package Pkg_Telas.Produtos;

import Pkg_Telas.Clientes.*;
import Pkg_banco.BancoFuncoes;
import Pkg_banco.conectaBanco;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Produtos extends javax.swing.JFrame {

    public Produtos() {
        initComponents();

        carregaFornecedor();
        carregaDepartamento();
        carregaTabela();
        carregaCor();
        carregaTamanho();
        carregaMaterial();
        carregaTipoProduto();
        
    }

    String codigo, barras, produto, categoria, fornecedor, referencia;
    String tipoProduto=" ", codTipoProduto, codTipo, cor, tamanho, material;
    String codCor, codTamanho, codMaterial, codCategoria;

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
    
    public void setCategoria(String m){
        categoria = m;
    }
    public String getCategoria(){
        return categoria = (String) jcbDepartamento.getSelectedItem();
    }
    
    public void setFornecedor(String m){
        fornecedor = m;
    }
    public String getFornecedor(){
        return fornecedor = (String) jcbFornecedor.getSelectedItem();
    }

    public void setCor(String m){
        cor = m;
    }
    public String getCor(){
        return cor = (String) jcbCor.getSelectedItem();
    }
    
    public void setTamanho(String m){
        tamanho = m;
    }
    public String getTamanho(){
        return tamanho = (String) jcbTamanho.getSelectedItem();
    }
    
    public void setMaterial(String m){
        material = m;
    }
    public String getMaterial(){
        return material = (String) jcbMaterial.getSelectedItem();
    }
    
    public void setCodCor(String m){
        codCor = m;
    }
    public String getCodCor(){
        return codCor;
    }
    
    public void setCodTamanho(String m){
        codTamanho = m;
    }
    public String getCodTamanho(){
        return codTamanho;
    }
    
    public void setCodMaterial(String m){
        codMaterial = m;
    }
    public String getCodMaterial(){
        return codMaterial;
    }

    public void setCodTipo(String d){
        codTipo = d;
    }
    public String getCodTipo(){
        return codTipo;
    }
    
    public void setTipoProduto(String m){
        tipoProduto = m;
    }
    public String getTipoProduto(){
        return tipoProduto = (String) jcbTipoProduto.getSelectedItem();
    }
    
    public void setCodTipoProduto(String m){
        codTipoProduto = m;
    }
    public String getCodTipoProduto(){
        return codTipoProduto;
    }
   
    public void setCodDepartamento(String m){
        codCategoria = m;
    }
    public String getCodDepartamento(){
        return codCategoria;
    }    

    public void setDepartamento(String m){
        categoria = m;
    }
    public String getDepartamento(){
        return categoria = (String) jcbDepartamento.getSelectedItem();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        internalProdutos = new javax.swing.JInternalFrame();
        btnInserirFornecedor = new javax.swing.JButton();
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
        jcbDepartamento = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jcbFornecedor = new javax.swing.JComboBox();
        jcbTamanho = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jcbCor = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jcbMaterial = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jcbTipoProduto = new javax.swing.JComboBox();
        btnImprimir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        internalProdutos.setClosable(true);
        internalProdutos.setIconifiable(true);
        internalProdutos.setTitle("Produtos");
        internalProdutos.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Pkg_Imagens/codigobarras.png"))); // NOI18N
        internalProdutos.setVisible(true);
        internalProdutos.getContentPane().setLayout(null);

        btnInserirFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pkg_Imagens/codigobarras.png"))); // NOI18N
        btnInserirFornecedor.setText("Inserir Produtos");
        btnInserirFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirFornecedorActionPerformed(evt);
            }
        });
        internalProdutos.getContentPane().add(btnInserirFornecedor);
        btnInserirFornecedor.setBounds(20, 40, 170, 60);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));
        jPanel1.setLayout(null);

        bnPesquisa.setText("Pesquisar");
        bnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnPesquisaActionPerformed(evt);
            }
        });
        jPanel1.add(bnPesquisa);
        bnPesquisa.setBounds(670, 190, 110, 30);
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
        jLabel10.setBounds(420, 20, 150, 20);
        jPanel1.add(txBarras);
        txBarras.setBounds(420, 40, 250, 30);

        jLabel12.setText("Referência do Produto:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(20, 70, 150, 20);

        txReferencia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(txReferencia);
        txReferencia.setBounds(20, 90, 230, 30);

        jLabel3.setText("Departamento:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(280, 70, 150, 20);

        jPanel1.add(jcbDepartamento);
        jcbDepartamento.setBounds(280, 90, 200, 30);

        jLabel5.setText("Fornecedor:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(500, 70, 150, 20);

        jPanel1.add(jcbFornecedor);
        jcbFornecedor.setBounds(500, 90, 220, 30);

        jcbTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTamanhoActionPerformed(evt);
            }
        });
        jPanel1.add(jcbTamanho);
        jcbTamanho.setBounds(190, 140, 160, 30);

        jLabel14.setText("Tamanho:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(190, 120, 90, 20);

        jcbCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCorActionPerformed(evt);
            }
        });
        jPanel1.add(jcbCor);
        jcbCor.setBounds(20, 140, 160, 30);

        jLabel16.setText("Cor:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(20, 120, 80, 20);

        jLabel17.setText("Material:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(370, 120, 70, 20);

        jcbMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMaterialActionPerformed(evt);
            }
        });
        jPanel1.add(jcbMaterial);
        jcbMaterial.setBounds(370, 140, 280, 30);

        jLabel15.setText("Tipo do Produto:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(20, 170, 150, 20);

        jcbTipoProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jcbTipoProdutoFocusLost(evt);
            }
        });
        jPanel1.add(jcbTipoProduto);
        jcbTipoProduto.setBounds(20, 190, 240, 30);

        btnImprimir.setText("Imprimir com Filtro");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        jPanel1.add(btnImprimir);
        btnImprimir.setBounds(523, 190, 140, 30);

        internalProdutos.getContentPane().add(jPanel1);
        jPanel1.setBounds(210, 0, 800, 240);

        tabela.setAutoCreateRowSorter(true);
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod. Produto", "Código", "Descriçao do Produto", "Referência", "Departamento", "Tipo do Produto", "Venda", "Quantidade", "Fornecedor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
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
            tabela.getColumnModel().getColumn(3).setMaxWidth(250);
            tabela.getColumnModel().getColumn(4).setMinWidth(80);
            tabela.getColumnModel().getColumn(4).setPreferredWidth(80);
            tabela.getColumnModel().getColumn(6).setMinWidth(90);
            tabela.getColumnModel().getColumn(6).setPreferredWidth(90);
            tabela.getColumnModel().getColumn(6).setMaxWidth(100);
            tabela.getColumnModel().getColumn(7).setMinWidth(80);
            tabela.getColumnModel().getColumn(7).setPreferredWidth(80);
            tabela.getColumnModel().getColumn(7).setMaxWidth(80);
            tabela.getColumnModel().getColumn(8).setMinWidth(160);
            tabela.getColumnModel().getColumn(8).setPreferredWidth(160);
            tabela.getColumnModel().getColumn(8).setMaxWidth(160);
        }

        internalProdutos.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 250, 1010, 350);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(internalProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 1026, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(internalProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirFornecedorActionPerformed
        CadastrarProduto cp = new CadastrarProduto(null, true);
        cp.setLocation(130, 15);
        cp.setVisible(true);
    }//GEN-LAST:event_btnInserirFornecedorActionPerformed

    private void bnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnPesquisaActionPerformed
            filtraConsulta();
    }//GEN-LAST:event_bnPesquisaActionPerformed

    private void jcbTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTamanhoActionPerformed
        if(!getTamanho().equals("")){

            String codigo;

            String texto = getCor();

            int dois;
            dois = texto.indexOf(" -");
            codigo = texto.substring(0 , dois );

            setCodTamanho(codigo);

        }else{
            setCodTamanho("0");
        }
    }//GEN-LAST:event_jcbTamanhoActionPerformed

    private void jcbCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCorActionPerformed
        if(!getCor().equals("")){

            String codigo;

            String texto = getCor();

            int dois;
            dois = texto.indexOf(" -");
            codigo = texto.substring(0 , dois );

            setCodCor(codigo);

        }else{
            setCodCor("0");
        }
    }//GEN-LAST:event_jcbCorActionPerformed

    private void jcbMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMaterialActionPerformed
        if(!getMaterial().equals("")){

            String codigo;

            String texto = getCor();

            int dois;
            dois = texto.indexOf(" -");
            codigo = texto.substring(0 , dois );

            setCodMaterial(codigo);

        }else{
            setCodMaterial("0");
        }
    }//GEN-LAST:event_jcbMaterialActionPerformed

    private void jcbTipoProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbTipoProdutoFocusLost
        if(!getTipoProduto().equals("")){

            String codigo;

            String texto = getTipoProduto();

            int dois;
            dois = texto.indexOf(" -");
            setCodTipo(texto.substring(0 , dois ));

            setCodTipoProduto(getCodTipo());

            String msg2 = "Número de código não recuperado";
            String msg1 = "Número de código recuperados";
            String sql  = "SELECT prod_codigo, prod_cod FROM tb_produtos ORDER BY prod_cod DESC LIMIT 1";

            conectaBanco cb = new conectaBanco();

            Connection connection = null;

            try {
                Class.forName(cb.JDBC_DRIVER()).newInstance();
                connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

                Statement s = (Statement) connection.createStatement();

                ResultSet rs = s.executeQuery(sql);

                while (rs.next()){

                    String cod = rs.getString("prod_cod");

                    int totalCod = Integer.parseInt(cod)+1;

                    System.out.println("cod: --"+cod+"--"+String.format("%07d", totalCod));
                    txCodigo.setText(getCodDepartamento()+" "+getCodTipoProduto()+" "+String.format("%07d", totalCod));
                    setCodigo(getCodDepartamento()+" "+getCodTipoProduto()+" "+cod);

                }

                System.out.println("Conectado ao banco com sucesso");

                s.close();
                connection.close();

            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, msg2);
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("Error: " + ex.getErrorCode());
                System.out.println(sql);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, msg2);
                System.out.println(sql);
                System.out.println("Dados não filtrados" + e);
            }

        }
    }//GEN-LAST:event_jcbTipoProdutoFocusLost

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        geraRelatorio();
    }//GEN-LAST:event_btnImprimirActionPerformed

    public void geraRelatorio(){

            String msg1="Filtro OK";
            String msg2="Erro ao Execultar Filtro";
            String vsql_1 = "SELECT prod_cod, prod_codigo, prod_barras, prod_produto, prod_observacoes, prod_caminhoimagem, " +
                            "prod_referencia, prod_minimo, prod_quantidade, prod_custo, prod_ganho, prod_porcentagem, prod_venda, "+
                            "prod_venda, dep_departamento, dep_cod, for_fornecedor, tam_tamanho, cor_cor, mat_material, tipprod_tipoproduto, prod_tb_departamento "+
                            "FROM tb_produtos "+
                            "INNER JOIN tb_fornecedores ON prod_tb_fornecedor = for_cod "+
                            "INNER JOIN tb_departamento ON prod_tb_departamento = dep_cod "+
                            "INNER JOIN tb_cor ON prod_tb_cor = cor_cod "+
                            "INNER JOIN tb_tamanho ON prod_tb_tamanho = tam_cod "+
                            "INNER JOIN tb_material ON prod_tb_material = mat_cod "+
                            "INNER JOIN tb_tipoproduto ON prod_tb_tipoproduto = tipprod_cod"+
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
            if(!getCategoria().equals("")){
                       vsql_2 +=" dep_departamento like '%"+getCategoria()+"%' ";
            }

 //----------pesquisa por Codigo de Barras
            if(!getFornecedor().equals("")){
                       vsql_2 +=" for_fornecedor like '%"+getFornecedor()+"%' ";
            }

 //----------pesquisa por Cor
            if(!getCor().equals("")){
                       vsql_2 +=" cor_cor like '%"+getCor()+"%' ";
            }
            
 //----------pesquisa por Tamanho
            if(!getTamanho().equals("")){
                       vsql_2 +=" tam_tamanho like '%"+getTamanho()+"%' ";
            }
            
 //----------pesquisa por Material
            if(!getMaterial().equals("")){
                       vsql_2 +=" mat_material like '%"+getMaterial()+"%' ";
            }

 //----------pesquisa por Tipo do Produto 
            if(!getTipoProduto().equals("")){
                       vsql_2 +=" tipprod_tipoproduto like '%"+getTipoProduto()+"%' ";
            }
            
//----------Se nenhum campo estiver preenchido, traz tudo q estiver no banco
            if(getCodigo().equals("") && getProduto().equals("")&& getBarras().equals("") && 
               getReferencia().equals("") && getCategoria().equals("")&& getFornecedor().equals("") &&
               getTamanho().equals("") && getCor().equals("") && getMaterial().equals("") && getTipoProduto().equals("")){
                vsql_1 = "SELECT prod_cod, prod_codigo, prod_barras, prod_produto, prod_observacoes, prod_caminhoimagem, " +
                         "prod_referencia, prod_minimo, prod_quantidade, prod_custo, prod_ganho, prod_porcentagem, prod_venda, "+
                         "prod_venda, dep_departamento, dep_cod, for_fornecedor, tam_tamanho, cor_cor, mat_material, tipprod_tipoproduto, prod_tb_departamento "+
                         "FROM tb_produtos "+
                         "INNER JOIN tb_fornecedores ON prod_tb_fornecedor = for_cod "+
                         "INNER JOIN tb_departamento ON prod_tb_departamento = dep_cod "+
                         "INNER JOIN tb_cor ON prod_tb_cor = cor_cod "+
                         "INNER JOIN tb_tamanho ON prod_tb_tamanho = tam_cod "+
                         "INNER JOIN tb_material ON prod_tb_material = mat_cod "+
                         "INNER JOIN tb_tipoproduto ON prod_tb_tipoproduto = tipprod_cod ";
            }

            vsql_1 += vsql_2;

            vsql_1 = vsql_1.replace( "  ", " AND " );
            
            vsql_1 += "ORDER BY dep_departamento";

            String localRelatorio = System.getProperty("user.dir", "") + "/src/Pkg_Relatorios/RelatorioProdutosFiltrados.jasper";

                bf.relatorio(vsql_1, localRelatorio, msg1, msg2);
    }
    
    public void carregaFornecedor(){
        String msg1 = "Fornecedores recuperados";
        String msg2 = "Erro ao Recuperar Fornecedores";
        String vsql = "SELECT for_fornecedor FROM tb_fornecedores order by for_fornecedor";
        String campoSql = "for_fornecedor";

        bf.carregaDadoUnico(vsql, msg1, msg2, jcbFornecedor, campoSql);
    }

    public void carregaDepartamento(){
        String msg1 = "Departamento recuperados";
        String msg2 = "Erro ao Recuperar Departamentos";
        String vsql = "SELECT dep_departamento FROM tb_departamento order by dep_departamento";
        String campoSql = "dep_departamento";

        bf.carregaDadoUnico(vsql, msg1, msg2, jcbDepartamento, campoSql);
    }

    public void carregaTabela(){
        String msg1 = "Produtos recuperados com sucesso";
        String msg2 = "Erro ao Recuperar produtos";
        String vsql = "SELECT prod_cod, prod_codigo, prod_barras, prod_produto, prod_observacoes, prod_caminhoimagem, " +
                      "prod_referencia, prod_minimo, prod_quantidade, prod_custo, prod_ganho, prod_porcentagem, prod_venda, "+
                      "prod_venda, dep_departamento, for_fornecedor, tam_tamanho, cor_cor, mat_material, tipprod_tipoproduto "+
                      "FROM tb_produtos "+
                      "INNER JOIN tb_fornecedores ON prod_tb_fornecedor = for_cod "+
                      "INNER JOIN tb_departamento ON prod_tb_departamento = dep_cod "+
                      "INNER JOIN tb_cor ON prod_tb_cor = cor_cod "+
                      "INNER JOIN tb_tamanho ON prod_tb_tamanho = tam_cod "+
                      "INNER JOIN tb_material ON prod_tb_material = mat_cod "+
                      "INNER JOIN tb_tipoproduto ON prod_tb_tipoproduto = tipprod_cod";

        bf.tabelaProdutos(vsql, msg1, msg2, tabela);
    }

    public void carregaCor(){
        String msg1 = "Cores recuperadas";
        String msg2 = "Erro ao Recuperar Cores";
        String vsql = "SELECT cor_cor FROM tb_cor order by cor_cor";
        String campoSql = "cor_cor";

        bf.carregaDadoUnico(vsql, msg1, msg2, jcbCor, campoSql);
    }

    public void carregaTamanho(){
        String msg1 = "Tamanhos recuperados";
        String msg2 = "Erro ao Recuperar Tamanhos";
        String vsql = "SELECT tam_tamanho FROM tb_tamanho order by tam_tamanho";
        String campoSql = "tam_tamanho";

        bf.carregaDadoUnico(vsql, msg1, msg2, jcbTamanho, campoSql);
    }

    public void carregaMaterial(){
        String msg1 = "Materiais recuperados";
        String msg2 = "Erro ao Recuperar Materiais";
        String vsql = "SELECT mat_material FROM tb_material order by mat_material";
        String campoSql = "mat_material";

        bf.carregaDadoUnico(vsql, msg1, msg2, jcbMaterial, campoSql);
    }

    public void carregaTipoProduto(){
        String msg1 = "Tipo dos produtos recuperados";
        String msg2 = "Erro ao Recuperar Tipo dos Produtos";
        String vsql = "SELECT tipprod_tipoproduto FROM tb_tipoproduto order by tipprod_tipoproduto";
        String campoSql = "tipprod_tipoproduto";

        bf.carregaDadoUnico(vsql, msg1, msg2, jcbTipoProduto, campoSql);
    }

    public void filtraConsulta(){

            String msg1="Filtro OK";
            String msg2="Erro ao Execultar Filtro";
            String vsql_1 = "SELECT prod_cod, prod_codigo, prod_barras, prod_produto, prod_observacoes, prod_caminhoimagem, " +
                            "prod_referencia, prod_minimo, prod_quantidade, prod_custo, prod_ganho, prod_porcentagem, prod_venda, "+
                            "prod_venda, dep_departamento, for_fornecedor, tam_tamanho, cor_cor, mat_material, tipprod_tipoproduto "+
                            "FROM tb_produtos "+
                            "INNER JOIN tb_fornecedores ON prod_tb_fornecedor = for_cod "+
                            "INNER JOIN tb_departamento ON prod_tb_departamento = dep_cod "+
                            "INNER JOIN tb_cor ON prod_tb_cor = cor_cod "+
                            "INNER JOIN tb_tamanho ON prod_tb_tamanho = tam_cod "+
                            "INNER JOIN tb_material ON prod_tb_material = mat_cod "+
                            "INNER JOIN tb_tipoproduto ON prod_tb_tipoproduto = tipprod_cod"+
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
            if(!getCategoria().equals("")){
                       vsql_2 +=" dep_departamento like '%"+getCategoria()+"%' ";
            }

 //----------pesquisa por Codigo de Barras
            if(!getFornecedor().equals("")){
                       vsql_2 +=" for_fornecedor like '%"+getFornecedor()+"%' ";
            }

 //----------pesquisa por Cor
            if(!getCor().equals("")){
                       vsql_2 +=" cor_cor like '%"+getCor()+"%' ";
            }
            
 //----------pesquisa por Tamanho
            if(!getTamanho().equals("")){
                       vsql_2 +=" tam_tamanho like '%"+getTamanho()+"%' ";
            }
            
 //----------pesquisa por Material
            if(!getMaterial().equals("")){
                       vsql_2 +=" mat_material like '%"+getMaterial()+"%' ";
            }

 //----------pesquisa por Tipo do Produto 
            if(!getTipoProduto().equals("")){
                       vsql_2 +=" tipprod_tipoproduto like '%"+getTipoProduto()+"%' ";
            }
            
//----------Se nenhum campo estiver preenchido, traz tudo q estiver no banco
            if(getCodigo().equals("") && getProduto().equals("")&& getBarras().equals("") && 
               getReferencia().equals("") && getCategoria().equals("")&& getFornecedor().equals("") &&
               getTamanho().equals("") && getCor().equals("") && getMaterial().equals("") && getTipoProduto().equals("")){
                vsql_1 = "SELECT prod_cod, prod_codigo, prod_barras, prod_produto, prod_observacoes, prod_caminhoimagem, " +
                         "prod_referencia, prod_minimo, prod_quantidade, prod_custo, prod_ganho, prod_porcentagem, prod_venda, "+
                         "prod_venda, dep_departamento, for_fornecedor, tam_tamanho, cor_cor, mat_material, tipprod_tipoproduto "+
                         "FROM tb_produtos "+
                         "INNER JOIN tb_fornecedores ON prod_tb_fornecedor = for_cod "+
                         "INNER JOIN tb_departamento ON prod_tb_departamento = dep_cod "+
                         "INNER JOIN tb_cor ON prod_tb_cor = cor_cod "+
                         "INNER JOIN tb_tamanho ON prod_tb_tamanho = tam_cod "+
                         "INNER JOIN tb_material ON prod_tb_material = mat_cod "+
                         "INNER JOIN tb_tipoproduto ON prod_tb_tipoproduto = tipprod_cod";
            }

            vsql_1 += vsql_2;

            vsql_1 = vsql_1.replace( "  ", " AND " );

   bf.filtrarProdutos(vsql_1, msg1, msg2, tabela);

   }

    public void carregaAtualizaTabela(){
        String msg1 = "Produtos recuperados com sucesso";
        String msg2 = "Erro ao Recuperar Produtos";
        String vsql = "SELECT prod_cod, prod_codigo, prod_barras, prod_produto, prod_observacoes, prod_caminhoimagem, " +
                      "prod_referencia, prod_minimo, prod_quantidade, prod_custo, prod_ganho, prod_porcentagem, prod_venda, "+
                      "prod_venda, dep_departamento, for_fornecedor, tam_tamanho, cor_cor, mat_material, tipprod_tipoproduto "+
                      "FROM tb_produtos "+
                      "INNER JOIN tb_fornecedores ON prod_tb_fornecedor = for_cod "+
                      "INNER JOIN tb_departamento ON prod_tb_departamento = dep_cod "+
                      "INNER JOIN tb_cor ON prod_tb_cor = cor_cod "+
                      "INNER JOIN tb_tamanho ON prod_tb_tamanho = tam_cod "+
                      "INNER JOIN tb_material ON prod_tb_material = mat_cod "+
                      "INNER JOIN tb_tipoproduto ON prod_tb_tipoproduto = tipprod_cod";

        bf.tabelaAtualizaProdutos(vsql, msg1, msg2, tabela);
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
                new Produtos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnPesquisa;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnInserirFornecedor;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JInternalFrame internalProdutos;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JComboBox jcbCor;
    public javax.swing.JComboBox jcbDepartamento;
    public javax.swing.JComboBox jcbFornecedor;
    public javax.swing.JComboBox jcbMaterial;
    public javax.swing.JComboBox jcbTamanho;
    public javax.swing.JComboBox jcbTipoProduto;
    private javax.swing.JLabel lbRazaoSocial;
    public javax.swing.JTable tabela;
    private javax.swing.JTextField txBarras;
    private javax.swing.JTextField txCodigo;
    private javax.swing.JTextField txProduto;
    private javax.swing.JTextField txReferencia;
    // End of variables declaration//GEN-END:variables
}
