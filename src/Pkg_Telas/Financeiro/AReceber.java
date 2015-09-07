package Pkg_Telas.Financeiro;

import Pkg_banco.BancoFuncoes;
import Pkg_banco.conectaBanco;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AReceber extends javax.swing.JFrame {

    public ArrayList<Object> cod = new ArrayList<Object>();
    String cliente, codCompra, compraInicial, compraFinal;
    String codCliente, dataPagamento, vencimentoInicial, vencimentoFinal;

    BancoFuncoes bf = new BancoFuncoes();

    public AReceber() {
        initComponents();
        
        carregaTabelaAReceber();
        carregaCliente();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        internalAReceber = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jcbCliente = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txCompraInicial = new com.toedter.calendar.JDateChooser();
        txCompraFinal = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnFiltrar = new javax.swing.JButton();
        txCompra = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txVencimentoInicial = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        txVencimentoFinal = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        txDataPagamento = new com.toedter.calendar.JDateChooser();
        btnEfetuarBaixa = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txTotalSelecionado = new javax.swing.JTextField();
        txTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        internalAReceber.setClosable(true);
        internalAReceber.setIconifiable(true);
        internalAReceber.setTitle("Comissões - À Receber");
        internalAReceber.setEnabled(false);
        internalAReceber.setVisible(true);
        internalAReceber.getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        tabela.setAutoCreateRowSorter(true);
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "prest_cod", "Compra", "Data Compra", "Parcela", "Cliente", "Data Vencimento", "Valor Compra", "Desconto", "Forma Pagamento", "#"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);
        tabela.getColumnModel().getColumn(0).setMinWidth(0);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(0);
        tabela.getColumnModel().getColumn(0).setMaxWidth(0);
        tabela.getColumnModel().getColumn(1).setMinWidth(60);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(60);
        tabela.getColumnModel().getColumn(1).setMaxWidth(60);
        tabela.getColumnModel().getColumn(3).setMinWidth(50);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(50);
        tabela.getColumnModel().getColumn(3).setMaxWidth(50);
        tabela.getColumnModel().getColumn(4).setMinWidth(180);
        tabela.getColumnModel().getColumn(4).setPreferredWidth(180);
        tabela.getColumnModel().getColumn(4).setMaxWidth(180);
        tabela.getColumnModel().getColumn(6).setMinWidth(90);
        tabela.getColumnModel().getColumn(6).setPreferredWidth(90);
        tabela.getColumnModel().getColumn(6).setMaxWidth(90);
        tabela.getColumnModel().getColumn(7).setMinWidth(90);
        tabela.getColumnModel().getColumn(7).setPreferredWidth(90);
        tabela.getColumnModel().getColumn(7).setMaxWidth(90);
        tabela.getColumnModel().getColumn(8).setMinWidth(120);
        tabela.getColumnModel().getColumn(8).setPreferredWidth(120);
        tabela.getColumnModel().getColumn(8).setMaxWidth(120);
        tabela.getColumnModel().getColumn(9).setMinWidth(40);
        tabela.getColumnModel().getColumn(9).setPreferredWidth(40);
        tabela.getColumnModel().getColumn(9).setMaxWidth(40);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 210, 830, 310);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtra"));
        jPanel2.setLayout(null);

        jcbCliente.setToolTipText("");
        jcbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbClienteActionPerformed(evt);
            }
        });
        jPanel2.add(jcbCliente);
        jcbCliente.setBounds(120, 60, 270, 31);

        jLabel4.setText("Cliente:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(60, 60, 60, 30);

        jLabel1.setText("à");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(260, 100, 20, 30);
        jPanel2.add(txCompraInicial);
        txCompraInicial.setBounds(140, 100, 110, 30);
        jPanel2.add(txCompraFinal);
        txCompraFinal.setBounds(280, 100, 110, 30);

        jLabel2.setText("Período da Compra:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 100, 130, 30);

        jLabel6.setText("Número da Compra:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 20, 120, 30);

        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnFiltrar);
        btnFiltrar.setBounds(280, 20, 110, 30);
        jPanel2.add(txCompra);
        txCompra.setBounds(120, 20, 110, 30);

        jLabel8.setText("Período do Vencimento:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 140, 130, 30);
        jPanel2.add(txVencimentoInicial);
        txVencimentoInicial.setBounds(140, 140, 110, 30);

        jLabel9.setText("à");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(260, 140, 20, 30);
        jPanel2.add(txVencimentoFinal);
        txVencimentoFinal.setBounds(280, 140, 110, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 10, 430, 190);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Data do Pagamento"));
        jPanel3.setLayout(null);
        jPanel3.add(txDataPagamento);
        txDataPagamento.setBounds(20, 20, 130, 30);

        btnEfetuarBaixa.setText("Efetuar Baixa");
        btnEfetuarBaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEfetuarBaixaActionPerformed(evt);
            }
        });
        jPanel3.add(btnEfetuarBaixa);
        btnEfetuarBaixa.setBounds(180, 20, 100, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(450, 10, 300, 70);

        btnImprimir.setText("Imprimir com Filtro");
        btnImprimir.setEnabled(false);
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        jPanel1.add(btnImprimir);
        btnImprimir.setBounds(610, 150, 140, 30);

        internalAReceber.getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 850, 530);

        jLabel5.setBackground(new java.awt.Color(0, 51, 51));
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Total à Receber:");
        internalAReceber.getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 540, 110, 30);

        txTotalSelecionado.setEditable(false);
        txTotalSelecionado.setBackground(new java.awt.Color(204, 204, 204));
        internalAReceber.getContentPane().add(txTotalSelecionado);
        txTotalSelecionado.setBounds(650, 540, 150, 30);

        txTotal.setEditable(false);
        txTotal.setBackground(new java.awt.Color(204, 204, 204));
        internalAReceber.getContentPane().add(txTotal);
        txTotal.setBounds(290, 540, 140, 30);

        jLabel7.setBackground(new java.awt.Color(0, 51, 51));
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Valor Selecionado:");
        internalAReceber.getContentPane().add(jLabel7);
        jLabel7.setBounds(540, 540, 110, 30);

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setOpaque(true);
        internalAReceber.getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 540, 860, 30);

        getContentPane().add(internalAReceber);
        internalAReceber.setBounds(0, 0, 860, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setCodigo(String n){
        cod.add(n);
    }
    public ArrayList getCodigo(){
        return cod;
    }
    public void removeCodigo(){
        cod.removeAll(cod);
    }

    public void setCliente(String m){
        cliente = m;
    }
    public String getCliente(){
        return cliente = (String) jcbCliente.getSelectedItem();
    }
       
    public void setCodCliente(String m){
        codCliente = m;
    }
    public String getCodCliente(){
        return codCliente;
    }
    
    public void setCodCompra(String m){
        codCompra = m;
    }
    public String getCodCompra(){
        return codCompra = txCompra.getText();
    }  
    
    public String getCompraInicial(){
        if (txCompraInicial.getDate()!=null){
          return compraInicial = new SimpleDateFormat("yyyy-MM-dd").format(txCompraInicial.getDate());
        }else{
          return null;
        }
    }
    public void seCompraInicial(String n){
        compraInicial = n;
    }
    
    public String getCompraFinal(){
        if (txCompraFinal.getDate()!=null){
          return compraFinal = new SimpleDateFormat("yyyy-MM-dd").format(txCompraFinal.getDate());
        }else{
          return null;
        }
    }
    public void setCompraFinal(String n){
        compraFinal = n;
    }
    
    public String getVencimentoInicial(){
        if (txVencimentoInicial.getDate()!=null){
          return vencimentoInicial = new SimpleDateFormat("yyyy-MM-dd").format(txVencimentoInicial.getDate());
        }else{
          return null;
        }
    }
    public void setVencimentoInicial(String n){
        vencimentoInicial = n;
    }
    
    public String getVencimentoFinal(){
        if (txVencimentoFinal.getDate()!=null){
          return vencimentoFinal = new SimpleDateFormat("yyyy-MM-dd").format(txVencimentoFinal.getDate());
        }else{
          return null;
        }
    }
    public void setVencimentoFinal(String n){
        vencimentoFinal = n;
    }
    
    public String getDataPagamento(){
        if (txDataPagamento.getDate()!=null){
          return dataPagamento = new SimpleDateFormat("yyyy-MM-dd").format(txDataPagamento.getDate());
        }else{
          return null;
        }
    }
    public void setDataPagamento(String n){
        dataPagamento = n;
    }

    private void jcbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbClienteActionPerformed
        if(!getCliente().equals("")){

            String codigo;

            String texto = getCliente();

            int dois;
            dois = texto.indexOf(" -");
            codigo = texto.substring(0 , dois );

            setCodCliente(codigo);

        }
    }//GEN-LAST:event_jcbClienteActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        filtraConsulta();
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnEfetuarBaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEfetuarBaixaActionPerformed
        if(txDataPagamento.getDate()==null)
         JOptionPane.showMessageDialog(null, "Preencha a data de Pagamento");
        else
            salvaDatas();
    }//GEN-LAST:event_btnEfetuarBaixaActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked

        Object resultFlag="";
        String codigo="";
        int totalDeLinhas = tabela.getRowCount();
        removeCodigo();
        
        for(int i=0; i<totalDeLinhas; i++){
            
 // ---- Pega o campo 'boleano' da tabela
             resultFlag = tabela.getValueAt(i, 9);
 // ---- Pega o código do registro
             codigo = (String) tabela.getValueAt(i, 0);

//             System.out.println("codigo: "+ codigo +"\n resltuFlag "+ resultFlag);
             
 // ---- confere >>> se o campo for 'True' pega o código e joga no vetor.
            if(resultFlag.equals(true)){
                setCodigo(codigo);
//                System.out.println("linha: "+ (i+1) + " é " + resultFlag);
             resultFlag = "";
            }
 
        }

        
        String msg1 = "Valor caulculado";
        String msg2 = "Nenhum valor selecionado";
        String vsql = "SELECT SUM(prest_valor)total FROM tb_comprasprestacoes WHERE prest_cod = "+getCodigo();
        
        vsql = vsql.replace("[", " ");
        vsql = vsql.replace("]", " ");
        vsql = vsql.replace(",", " or prest_cod = ");
        
        System.out.println(vsql);
        
        conectaBanco cb = new conectaBanco();
                
            Connection connection = null;

           try {
            Class.forName(cb.JDBC_DRIVER()).newInstance();
            connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

                Statement s = (Statement) connection.createStatement();

                  ResultSet rs = s.executeQuery(vsql);

                        while (rs.next()){
                            
                            String total = rs.getString("total");
                            int ponto = total.indexOf(".");
                            int tamanho = total.length();
                            int tamanhoTotal = tamanho-(ponto+1);
                            String comissaoEditada = total.replace('.', ',');
                        
//                        System.out.println(total);
                        
                            if(ponto == -1){
                               txTotalSelecionado.setText("R$ "+comissaoEditada+",00");
                            }else{
                                if(tamanhoTotal==2)
                                    txTotalSelecionado.setText("R$ "+comissaoEditada);
                                if(tamanhoTotal==1)
                                    txTotalSelecionado.setText("R$ "+comissaoEditada+"0");
                                if(tamanhoTotal>2)
                                    txTotalSelecionado.setText("RS "+comissaoEditada.substring(0, ponto+3));
                            }
                       }

//                System.out.println("Conectado ao banco com sucesso");

                 s.close();
                 connection.close();

//                 System.out.println(msg1);
//                 System.out.println(vsql);
                 return;

           }catch(SQLException ex){
              JOptionPane.showMessageDialog(null, msg2);
//              System.out.println("SQLException: " + ex.getMessage());
//              System.out.println("SQLState: " + ex.getSQLState());
//              System.out.println("Error: " + ex.getErrorCode());
//              System.out.println(vsql);
              return;
            }
            catch(Exception e){
              JOptionPane.showMessageDialog(null, msg2);
//              System.out.println(vsql);
//              System.out.println("Dados não filtrados" + e);
              return;
            }

    }//GEN-LAST:event_tabelaMouseClicked

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
 //       geraRelatorio();
    }//GEN-LAST:event_btnImprimirActionPerformed

    public void carregaTabelaAReceber(){
        
        String msg1 = "tabela de comissões recuperada";
        String msg2 = "Erro ao Recuperar Tabela de Comissões";
        String vsql = "SELECT prest_cod, prest_tb_compra, prest_tb_clientes, prest_parcela, "+
                      "DATE_FORMAT(prest_datavencimento, '%d/%m/%Y')prest_datavencimento, prest_desconto, prest_valor, "+
                      "DATE_FORMAT(compra_data, '%d/%m/%y')compra_data, prest_formapagamento, cli_cliente "+
                      "FROM tb_comprasprestacoes "+
                      "INNER JOIN tb_clientes ON prest_tb_clientes = cli_cod "+
                      "INNER JOIN tb_compra ON prest_tb_compra = compra_cod ";
        String vsql2 ="SELECT SUM(prest_valor)total FROM tb_comprasprestacoes";
        
        bf.tabelaAReceber(vsql, vsql2, msg1, msg2, tabela);
        txTotal.setText(bf.getSomaAReceber());
    }

    public void carregaCliente(){
        String msg1 = "Clientes recuperados";
        String msg2 = "Erro ao Recuperar Clientes";
        String vsql = "SELECT concat( cli_cod, ' - ', cli_cliente)cliente FROM tb_clientes";
        String campoSql = "cliente";

        bf.carregaDadoUnico(vsql, msg1, msg2, jcbCliente, campoSql);
    }

    public void salvaDatas(){
//------------detecta as linhas selecionadas--------------------
        Object resultFlag="";
        String codigo;
        int totalDeLinhas = tabela.getRowCount();
        String conc="";

        int    col = tabela.getSelectedColumn();
        int    lin = tabela.getSelectedRow();

        System.out.println("totalDeLinhas: "+totalDeLinhas);
        

        for(int i=0; i<totalDeLinhas; i++){

 // ---- Pega o campo 'boleano' da tabela
             resultFlag = tabela.getValueAt(i, 5);
 // ---- Pega o código do registro
             codigo = (String) tabela.getValueAt(i, 0);

//             System.out.println("codigo: "+ codigo +"\n resltuFlag "+ resultFlag);
             
 // ---- confere >>> se o campo for 'True' pega o código e joga no vetor.
            if(resultFlag.equals(true)){
                setCodigo(codigo);
//                System.out.println("linha: "+ (i+1) + " é " + resultFlag);
             resultFlag = "";
            }
        }

        System.out.println("Vetor código:"+ getCodigo());

//----------fim do detecta linhas selecionadas--------------------

//---------salva no banco devido seleções---------------------

        String msg1 = "Baixas Efetudas";
        String msg2 = "Erro ao efetuar baixas";
        String sql  = "", sql2 = "";

        for(int i=0; i<getCodigo().size(); i++){
            sql = "INSERT INTO tb_comprasrecebidas (pag_cod, pag_tb_compra, pag_tb_clientes, pag_datavencimento, pag_datapagamento, "+
                                                    "pag_valor, pag_desconto, pag_formapagamento) "+
                  "SELECT null, prest_tb_compra, prest_tb_clientes, prest_datavencimento, '"+getDataPagamento()+"', "+
                          "prest_valor, prest_desconto,  prest_formapagamento "+
                  "FROM tb_comprasprestacoes WHERE prest_cod ='"+getCodigo().get(i)+"'";
            
            System.out.println("Insere: "+sql);
            bf.salvar(sql, msg1, msg2);
            
            sql2 = "DELETE FROM tb_comprasprestacoes WHERE prest_cod='"+getCodigo().get(i)+"'";
            
            System.out.println("Deleta: "+sql2);
            bf.salvar(sql2, msg1, msg2);
        }
//        System.out.println("Vetor com Codigo primários: "+ getCodigo());

        filtraConsulta();
        
//------------------terminad de salvar no banco--------------------
//        removeCodigo();
    }

    public void filtraConsulta(){

            String msg1="Filtro de Pedidos OK";
            String msg2="Erro ao Executar Filtro de Pedidos";
            String vsql_1 = "SELECT prest_cod, prest_tb_compra, prest_tb_clientes, prest_parcela, "+
                            "DATE_FORMAT(prest_datavencimento, '%d/%m/%Y')prest_datavencimento, prest_desconto, prest_valor, "+
                            "DATE_FORMAT(compra_data, '%d/%m/%y')compra_data, prest_formapagamento, cli_cliente "+
                            "FROM tb_comprasprestacoes "+
                            "INNER JOIN tb_clientes ON prest_tb_clientes = cli_cod "+
                            "INNER JOIN tb_compra ON prest_tb_compra = compra_cod "+
                            "WHERE";
            String sql1 = "SELECT prest_cod, prest_tb_compra, prest_tb_clientes, prest_parcela, "+
                          "DATE_FORMAT(prest_datavencimento, '%d/%m/%Y')prest_datavencimento, prest_desconto, SUM(prest_valor)total, "+
                          "DATE_FORMAT(compra_data, '%d/%m/%y')compra_data, prest_formapagamento, cli_cliente "+
                          "FROM tb_comprasprestacoes "+
                          "INNER JOIN tb_clientes ON prest_tb_clientes = cli_cod "+
                          "INNER JOIN tb_compra ON prest_tb_compra = compra_cod "+
                          "WHERE";
            
            String vsql_2 = "";
            String sql2 = "";

//----------pesquisa por Cliente
            if(!getCliente().equals("")){
                       vsql_2 +=" prest_tb_clientes = "+getCodCliente()+" ";
            }
//----------pesquisa por Cliente
            if(!getCliente().equals("")){
                       sql2 +=" prest_tb_clientes = "+getCodCliente()+" ";
            }
            
 //----------pesquisa por Numero de Pedido
            if(!getCodCompra().equals("")){
                       vsql_2 +=" prest_cod = '"+getCodCompra()+"' ";
            }
 //----------pesquisa por Numero de Pedido
            if(!getCodCompra().equals("")){
                       sql2 +=" prest_cod = '"+getCodCompra()+"' ";
            }

            
//----------pesquisa entre data de nascimentos
            if( txCompraInicial.getDate() != null && txCompraFinal.getDate() != null){
                       vsql_2 += " compra_data" +
                                 " between '"+getCompraInicial()+"'" +
                                 " and '"+getCompraFinal()+"' ";
            }
//----------pesquisa entre data de nascimentos
            if( txCompraInicial.getDate() != null && txCompraFinal.getDate() != null){
                       sql2 += " compra_data" +
                               " between '"+getCompraInicial()+"'" +
                               " and '"+getCompraFinal()+"' ";
            }
            
            
//----------pesquisa entre data de nascimentos
            if( txVencimentoInicial.getDate() != null && txVencimentoFinal.getDate() != null){
                       vsql_2 += " prest_datavencimento" +
                                 " between '"+getVencimentoInicial()+"'" +
                                 " and '"+getVencimentoFinal()+"' ";
            }
//----------pesquisa entre data de nascimentos
            if( txVencimentoInicial.getDate() != null && txVencimentoFinal.getDate() != null){
                       sql2 += " prest_datavencimento" +
                               " between '"+getVencimentoInicial()+"'" +
                               " and '"+getVencimentoFinal()+"' ";
            }

//----------Se nenhum campo estiver preenchido, traz tudo q estiver no banco
            if(txCompraInicial.getDate() == null && txCompraFinal.getDate() == null && txVencimentoInicial.getDate() == null && 
                    txVencimentoFinal.getDate() == null && getCodCompra().equals("") &&  getCliente().equals("")){
                vsql_1 = "SELECT prest_cod, prest_tb_compra, prest_tb_clientes, prest_parcela, "+
                         "DATE_FORMAT(prest_datavencimento, '%d/%m/%Y')prest_datavencimento, prest_desconto, prest_valor, "+
                         "DATE_FORMAT(compra_data, '%d/%m/%y')compra_data, prest_formapagamento, cli_cliente "+
                         "FROM tb_comprasprestacoes "+
                         "INNER JOIN tb_clientes ON prest_tb_clientes = cli_cod "+
                         "INNER JOIN tb_compra ON prest_tb_compra = compra_cod ";
                sql1 = "SELECT prest_cod, prest_tb_compra, prest_tb_clientes, prest_parcela, "+
                       "DATE_FORMAT(prest_datavencimento, '%d/%m/%Y')prest_datavencimento, prest_desconto, SUM(prest_valor)total, "+
                       "DATE_FORMAT(compra_data, '%d/%m/%y')compra_data, prest_formapagamento, cli_cliente "+
                       "FROM tb_comprasprestacoes "+
                       "INNER JOIN tb_clientes ON prest_tb_clientes = cli_cod "+
                       "INNER JOIN tb_compra ON prest_tb_compra = compra_cod ";
            }

            vsql_1 += vsql_2;
            vsql_1 = vsql_1.replace( "  ", " AND " );
            vsql_1 += "ORDER BY prest_parcela, cli_cliente ";

            sql1 += sql2;
            sql1 = sql1.replace( "  ", " AND " );
            sql1 += "ORDER BY prest_parcela, cli_cliente ";

            
            bf.tabelaAReceber(vsql_1, sql1, msg1, msg2, tabela);
            txTotal.setText(bf.getSomaAReceber());
                      
    }

/*
    public void geraRelatorio(){

            String msg1="Relatorio com filtro gerado";
            String msg2="Erro ao Executar relatorio com filtro";
            String vsql_1 = "SELECT " +
                            "tb_compra.`com_valor` AS tb_compra_com_valor, " +
                            "tb_ordemservico.`os_cod` AS tb_ordemservico_os_cod, " +
                            "tb_ordemservico.`os_dataOS` AS tb_ordemservico_os_dataOS, " +
                            "tb_compra.`com_OS` AS tb_compra_com_OS, " +
                            "tb_compra.`com_comissao` AS tb_compra_com_comissao, " +
                            "tb_compra.`com_comissaoRecebimento` AS tb_compra_com_comissaoRecebimento, " +
                            "tb_fornecedores.`for_cod` AS tb_fornecedores_for_cod, " +
                            "tb_fornecedores.`for_fornecedor` AS tb_fornecedores_for_fornecedor, " +
                            "tb_clientes.`cli_cod` AS tb_clientes_cli_cod, "+
                            "tb_clientes.`cli_cliente` AS tb_clientes_cli_cliente "+
                            "FROM `tb_ordemservico` tb_ordemservico " +
                            "INNER JOIN `tb_compra` tb_compra ON tb_ordemservico.`os_cod` = tb_compra.`com_OS` " +
                            "INNER JOIN `tb_fornecedores` tb_fornecedores ON tb_compra.`com_fornecedor` = tb_fornecedores.`for_cod` " +
                            "INNER JOIN `tb_clientes` tb_clientes ON tb_ordemservico.`os_cliente` = tb_clientes.`cli_cod` "+
                            "WHERE";
            
            String vsql_2 = "";

//----------pesquisa por Cliente
            if(!getFornecedor().equals("")){
                       vsql_2 +=" for_cod = "+getCodFornecedor()+" ";
            }
 
 //----------pesquisa por Numero de Pedido
            if(!getPedido().equals("")){
                       vsql_2 +=" os_cod = '"+getPedido()+"' ";
            }

//----------pesquisa entre data de nascimentos
            if( txCompraInicial.getDate() != null && txCompraFinal.getDate() != null){
                       vsql_2 += " os_dataos" +
                                 " between '"+getDataInicial()+"'" +
                                 " and '"+getDataFinal()+"' ";
            }
            
//----------Se nenhum campo estiver preenchido, traz tudo q estiver no banco
             if(txCompraInicial.getDate() == null && txCompraFinal.getDate() == null && 
                getPedido().equals("") &&  getFornecedor().equals("")){
              
                 vsql_1 = "SELECT " +
                            "tb_compra.`com_valor` AS tb_compra_com_valor, " +
                            "tb_ordemservico.`os_cod` AS tb_ordemservico_os_cod, " +
                            "tb_ordemservico.`os_dataOS` AS tb_ordemservico_os_dataOS, " +
                            "tb_compra.`com_OS` AS tb_compra_com_OS, " +
                            "tb_compra.`com_comissao` AS tb_compra_com_comissao, " +
                            "tb_compra.`com_comissaoRecebimento` AS tb_compra_com_comissaoRecebimento, " +
                            "tb_fornecedores.`for_cod` AS tb_fornecedores_for_cod, " +
                            "tb_fornecedores.`for_fornecedor` AS tb_fornecedores_for_fornecedor, " +
                            "tb_clientes.`cli_cod` AS tb_clientes_cli_cod, "+
                            "tb_clientes.`cli_cliente` AS tb_clientes_cli_cliente "+
                            "FROM `tb_ordemservico` tb_ordemservico " +
                            "INNER JOIN `tb_compra` tb_compra ON tb_ordemservico.`os_cod` = tb_compra.`com_OS` " +
                            "INNER JOIN `tb_fornecedores` tb_fornecedores ON tb_compra.`com_fornecedor` = tb_fornecedores.`for_cod` " +
                            "INNER JOIN `tb_clientes` tb_clientes ON tb_ordemservico.`os_cliente` = tb_clientes.`cli_cod` WHERE";
            }

            vsql_1 += vsql_2;

            vsql_1 += " com_comissaorecebimento != 'RECEBIDO' ORDER BY for_fornecedor ";

            vsql_1 = vsql_1.replace( "  ", " AND " );        
        
            String localRelatorio = System.getProperty("user.dir", "") + "/src/Relatorios/comissaoReceber.jasper";

                bf.relatorio(vsql_1, localRelatorio, msg1, msg2);
    }
*/
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AReceber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AReceber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AReceber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AReceber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AReceber().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEfetuarBaixa;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnImprimir;
    public javax.swing.JInternalFrame internalAReceber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JComboBox jcbCliente;
    public javax.swing.JTable tabela;
    private javax.swing.JTextField txCompra;
    public com.toedter.calendar.JDateChooser txCompraFinal;
    public com.toedter.calendar.JDateChooser txCompraInicial;
    private com.toedter.calendar.JDateChooser txDataPagamento;
    public javax.swing.JTextField txTotal;
    public javax.swing.JTextField txTotalSelecionado;
    public com.toedter.calendar.JDateChooser txVencimentoFinal;
    public com.toedter.calendar.JDateChooser txVencimentoInicial;
    // End of variables declaration//GEN-END:variables
}