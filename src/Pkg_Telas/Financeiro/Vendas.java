package Pkg_Telas.Financeiro;

import Pkg_Telas.Produtos.*;
import Pkg_Telas.Clientes.*;
import Pkg_banco.BancoFuncoes;
import java.text.SimpleDateFormat;

public class Vendas extends javax.swing.JFrame {

    public Vendas() {
        initComponents();

        carregaTabela();
    }

    String codigo, barras, produto, categoria, fornecedor, referencia, vendaInicial, vendaFinal;

        BancoFuncoes bf = new BancoFuncoes();

    public void setCodigo(String d){
        codigo = d;
    }
    public String getCodigo(){
        return codigo = txCodigo.getText();
    }
    
    public void setVendaInicial(String n){
        vendaInicial = n;
    }
    public String getVendaInicial(){
        if (jdcVendaIncial.getDate()!=null){
          return vendaInicial = new SimpleDateFormat("yyyy-MM-dd").format(jdcVendaIncial.getDate());
        }else{
          return null;
        }
    }
    
    public void setVendaFinal(String n){
        vendaFinal = n;
    }
    public String getVendaFinal(){
        if (jdcVendaFinal.getDate()!=null){
          return vendaFinal = new SimpleDateFormat("yyyy-MM-dd").format(jdcVendaFinal.getDate());
        }else{
          return null;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        internalVendas = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        bnPesquisa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txCodigo = new javax.swing.JTextField();
        jdcVendaIncial = new com.toedter.calendar.JDateChooser();
        jdcVendaFinal = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        internalVendas.setClosable(true);
        internalVendas.setIconifiable(true);
        internalVendas.setTitle("Vendas Efetuadas");
        internalVendas.setToolTipText("");
        internalVendas.setVisible(true);
        internalVendas.getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));
        jPanel1.setLayout(null);

        bnPesquisa.setText("Pesquisar");
        bnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnPesquisaActionPerformed(evt);
            }
        });
        jPanel1.add(bnPesquisa);
        bnPesquisa.setBounds(40, 270, 110, 30);

        jLabel2.setText("À:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 180, 30, 30);
        jPanel1.add(txCodigo);
        txCodigo.setBounds(50, 60, 110, 30);
        jPanel1.add(jdcVendaIncial);
        jdcVendaIncial.setBounds(50, 130, 110, 30);
        jPanel1.add(jdcVendaFinal);
        jdcVendaFinal.setBounds(50, 180, 110, 30);

        jLabel3.setText("Nº Compra:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 30, 110, 30);

        jLabel4.setText("Período da Venda:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 100, 110, 30);

        jLabel5.setText("De:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 130, 30, 30);

        internalVendas.getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 200, 340);

        tabela.setAutoCreateRowSorter(true);
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Compra", "Data", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        tabela.getColumnModel().getColumn(0).setMinWidth(80);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(80);
        tabela.getColumnModel().getColumn(0).setMaxWidth(80);
        tabela.getColumnModel().getColumn(1).setMinWidth(100);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(1).setMaxWidth(100);
        tabela.getColumnModel().getColumn(2).setMinWidth(140);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(140);
        tabela.getColumnModel().getColumn(2).setMaxWidth(140);

        internalVendas.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(230, 0, 320, 380);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(internalVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(internalVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnPesquisaActionPerformed
            filtraConsulta();
    }//GEN-LAST:event_bnPesquisaActionPerformed

    public void carregaTabela(){
        String msg1 = "Vendas recuperadas com sucesso";
        String msg2 = "Erro ao Recuperar vendas";
        String vsql = "SELECT compra_cod, DATE_FORMAT(compra_data, '%d/%m/%Y')compra_data, compra_valor " +
                      "FROM tb_compra";

        bf.tabelaVendasEfetuadas(vsql, msg1, msg2, tabela);
    }
    
    public void filtraConsulta(){

            String msg1="Filtro OK";
            String msg2="Erro ao Execultar Filtro";
            String vsql_1 = "SELECT compra_cod, DATE_FORMAT(compra_data, '%d/%m/%Y')compra_data, compra_valor " +
                            "FROM tb_compra"+
                            " WHERE";
            String vsql_2 = "";
  
 //----------pesquisa por Codigo
            if(!getCodigo().equals("")){
                       vsql_2 +=" compra_cod like '%"+getCodigo()+"%' ";
            }

 //----------pesquisa Entre Datas
             if( jdcVendaIncial.getDate() != null && jdcVendaFinal.getDate() != null){
                       vsql_2 += " compra_data" +
                                 " between '"+getVendaInicial()+"'" +
                                 " and '"+getVendaFinal()+"' ";
            }  
            
//----------Se nenhum campo estiver preenchido, traz tudo q estiver no banco
            if(getCodigo().equals("") && getVendaFinal()==null && getVendaInicial()==null){
                vsql_1 = "SELECT compra_cod, DATE_FORMAT(compra_data, '%d/%m/%Y')compra_data, compra_valor " +
                         "FROM tb_compra";
            }

            vsql_1 += vsql_2;

            vsql_1 = vsql_1.replace( "  ", " AND " );

   bf.tabelaAtualizaVendasEfetuadas(vsql_1, msg1, msg2, tabela);

   }

    public void carregaAtualizaTabela(){
        String msg1 = "Produtos recuperados com sucesso";
        String msg2 = "Erro ao Recuperar Produtos";
        String vsql = "SELECT compra_cod, compra_data, compra_valor " +
                      "FROM tb_compra";

        bf.tabelaAtualizaVendasEfetuadas(vsql, msg1, msg2, tabela);
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
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Vendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnPesquisa;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JInternalFrame internalVendas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public com.toedter.calendar.JDateChooser jdcVendaFinal;
    public com.toedter.calendar.JDateChooser jdcVendaIncial;
    public javax.swing.JTable tabela;
    private javax.swing.JTextField txCodigo;
    // End of variables declaration//GEN-END:variables
}
