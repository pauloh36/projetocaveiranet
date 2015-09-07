package Pkg_Telas.Financeiro;

import Pkg_banco.BancoFuncoes;
import java.text.SimpleDateFormat;

public class Recebidos extends javax.swing.JFrame {

    public Recebidos() {
        initComponents();

        carregaTabela();

    }
    String formaPagamento, recebidoInicial, recebidoFinal, codigo;
    BancoFuncoes bf = new BancoFuncoes();

    public void setFormaPagamento(String d) {
        formaPagamento = d;
    }

    public String getFormaPagamento() {
        return formaPagamento = (String) jcbFormaPagamento.getSelectedItem();
    }

    public void setRecebidoInicial(String n) {
        recebidoInicial = n;
    }

    public String getRecebidoInicial() {
        if (jdcRecebidoIncial.getDate() != null) {
            return recebidoInicial = new SimpleDateFormat("yyyy-MM-dd").format(jdcRecebidoIncial.getDate());
        } else {
            return null;
        }
    }

    public void setRecebidoFinal(String n) {
        recebidoFinal = n;
    }

    public String getRecebidoFinal() {
        if (jdcRecebidoFinal.getDate() != null) {
            return recebidoFinal = new SimpleDateFormat("yyyy-MM-dd").format(jdcRecebidoFinal.getDate());
        } else {
            return null;
        }
    }

    public void setCodigo(String d) {
        codigo = d;
    }

    public String getCodigo() {
        return codigo = txCodigo.getText();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        internalRecebidos = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jdcRecebidoIncial = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jdcRecebidoFinal = new com.toedter.calendar.JDateChooser();
        jcbFormaPagamento = new javax.swing.JComboBox();
        lbValorCompra = new javax.swing.JLabel();
        btnFiltrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txTotalFiltrado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        internalRecebidos.setClosable(true);
        internalRecebidos.setTitle("Recebidos");
        internalRecebidos.setVisible(true);
        internalRecebidos.getContentPane().setLayout(null);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "pag_cod", "Compra", "cod_cliente", "Cliente", "Data Vencimento", "Data Pagamento", "Valor", "Desconto", "Forma Pagamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);
        tabela.getColumnModel().getColumn(0).setMinWidth(0);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(0);
        tabela.getColumnModel().getColumn(0).setMaxWidth(0);
        tabela.getColumnModel().getColumn(1).setMinWidth(50);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(50);
        tabela.getColumnModel().getColumn(1).setMaxWidth(50);
        tabela.getColumnModel().getColumn(2).setMinWidth(0);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(0);
        tabela.getColumnModel().getColumn(2).setMaxWidth(0);
        tabela.getColumnModel().getColumn(3).setMinWidth(200);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(200);
        tabela.getColumnModel().getColumn(3).setMaxWidth(200);

        internalRecebidos.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 120, 790, 280);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));
        jPanel1.setLayout(null);

        jLabel3.setText("Nº Compra:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 20, 110, 30);
        jPanel1.add(txCodigo);
        txCodigo.setBounds(90, 20, 110, 30);

        jLabel4.setText("Período do Recebimento:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(210, 20, 160, 30);
        jPanel1.add(jdcRecebidoIncial);
        jdcRecebidoIncial.setBounds(370, 20, 110, 30);

        jLabel2.setText("À:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(490, 20, 30, 30);
        jPanel1.add(jdcRecebidoFinal);
        jdcRecebidoFinal.setBounds(510, 20, 110, 30);

        jcbFormaPagamento.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jcbFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "DINHEIRO", "A VISTA", "CHEQUE", "PARCELADO" }));
        jPanel1.add(jcbFormaPagamento);
        jcbFormaPagamento.setBounds(140, 70, 290, 30);

        lbValorCompra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbValorCompra.setText("Forma de Pagamento:");
        jPanel1.add(lbValorCompra);
        lbValorCompra.setBounds(20, 70, 160, 30);

        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnFiltrar);
        btnFiltrar.setBounds(660, 70, 110, 30);

        internalRecebidos.getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 790, 120);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("     Total Filtrado:");
        internalRecebidos.getContentPane().add(jLabel5);
        jLabel5.setBounds(504, 410, 140, 30);

        txTotalFiltrado.setEditable(false);
        internalRecebidos.getContentPane().add(txTotalFiltrado);
        txTotalFiltrado.setBounds(640, 410, 130, 30);

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setOpaque(true);
        internalRecebidos.getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, 410, 820, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(internalRecebidos, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(internalRecebidos, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
            filtraConsulta();
    }//GEN-LAST:event_btnFiltrarActionPerformed

    public void carregaTabela() {

        String msg1 = "Compras Recebidas recuperadas com sucesso";
        String msg2 = "Erro ao Recuperar Compras Recebidas";
        String vsql = "SELECT "
                + "pag_cod, pag_tb_compra, pag_tb_clientes, DATE_FORMAT(pag_datavencimento, '%d/%m/%Y')pag_datavencimento, "
                + "DATE_FORMAT(pag_datapagamento, '%d/%m/%Y')pag_datapagamento, pag_valor, pag_desconto, pag_formapagamento, cli_cliente "
                + "FROM "
                + "tb_comprasrecebidas "
                + "INNER JOIN tb_clientes ON pag_tb_clientes = cli_cod";

        bf.tabelaRecebidos(vsql, msg1, msg2, tabela);

    }

    public void filtraConsulta() {

        String msg1 = "Filtro OK";
        String msg2 = "Erro ao Execultar Filtro";
        String vsql_1 = "SELECT "
                + "pag_cod, pag_tb_compra, pag_tb_clientes, DATE_FORMAT(pag_datavencimento, '%d/%m/%Y')pag_datavencimento, "
                + "DATE_FORMAT(pag_datapagamento, '%d/%m/%Y')pag_datapagamento, pag_valor, pag_desconto, pag_formapagamento, cli_cliente "
                + "FROM "
                + "tb_comprasrecebidas "
                + "INNER JOIN tb_clientes ON pag_tb_clientes = cli_cod"
                + " WHERE";
        String vsql_2 = "";

        //----------pesquisa por Codigo
        if (!getCodigo().equals("")) {
            vsql_2 += " pag_tb_compra like '%" + getCodigo() + "%' ";
        }


        //----------pesquisa Entre Datas
        if (jdcRecebidoIncial.getDate() != null && jdcRecebidoFinal.getDate() != null) {
            vsql_2 += " pag_datapagamento"
                    + " between '" + getRecebidoInicial() + "'"
                    + " and '" + getRecebidoFinal() + "' ";
        }


        //----------pesquisa Forma de Pagamento
        if (!getFormaPagamento().equals("")) {
            vsql_2 += " pag_formapagamento like '%" + getFormaPagamento() + "%' ";
        }


//----------Se nenhum campo estiver preenchido, traz tudo q estiver no banco
        if (getCodigo().equals("") && getRecebidoFinal() == null
                && getRecebidoInicial() == null && getFormaPagamento().equals("")) {
            vsql_1 = "SELECT "
                    + "pag_cod, pag_tb_compra, pag_tb_clientes, DATE_FORMAT(pag_datavencimento, '%d/%m/%Y')pag_datavencimento, "
                    + "DATE_FORMAT(pag_datapagamento, '%d/%m/%Y')pag_datapagamento, pag_valor, pag_desconto, pag_formapagamento, cli_cliente "
                    + "FROM "
                    + "tb_comprasrecebidas "
                    + "INNER JOIN tb_clientes ON pag_tb_clientes = cli_cod";
        }

        vsql_1 += vsql_2;

        vsql_1 = vsql_1.replace("  ", " AND ");

        bf.tabelaAtualizaRecebidos(vsql_1, msg1, msg2, tabela);


        String sql1 = "SELECT "
                + "pag_cod, pag_tb_compra, pag_tb_clientes, DATE_FORMAT(pag_datavencimento, '%d/%m/%Y')pag_datavencimento, "
                + "DATE_FORMAT(pag_datapagamento, '%d/%m/%Y')pag_datapagamento, SUM(pag_valor)total, pag_desconto, pag_formapagamento, cli_cliente "
                + "FROM "
                + "tb_comprasrecebidas "
                + "INNER JOIN tb_clientes ON pag_tb_clientes = cli_cod"
                + " WHERE";
        String sql2 = "";

        //----------pesquisa por Codigo
        if (!getCodigo().equals("")) {
            sql2 += " pag_tb_compra like '%" + getCodigo() + "%' ";
        }


        //----------pesquisa Entre Datas
        if (jdcRecebidoIncial.getDate() != null && jdcRecebidoFinal.getDate() != null) {
            sql2 += " pag_datapagamento"
                    + " between '" + getRecebidoInicial() + "'"
                    + " and '" + getRecebidoFinal() + "' ";
        }


        //----------pesquisa Forma de Pagamento
        if (!getFormaPagamento().equals("")) {
            sql2 += " pag_formapagamento like '%" + getFormaPagamento() + "%' ";
        }


//----------Se nenhum campo estiver preenchido, traz tudo q estiver no banco
        if (getCodigo().equals("") && getRecebidoFinal() == null
                && getRecebidoInicial() == null && getFormaPagamento().equals("")) {
            sql1 = "SELECT "
                    + "pag_cod, pag_tb_compra, pag_tb_clientes, DATE_FORMAT(pag_datavencimento, '%d/%m/%Y')pag_datavencimento, "
                    + "DATE_FORMAT(pag_datapagamento, '%d/%m/%Y')pag_datapagamento, SUM(pag_valor)total, pag_desconto, pag_formapagamento, cli_cliente "
                    + "FROM "
                    + "tb_comprasrecebidas "
                    + "INNER JOIN tb_clientes ON pag_tb_clientes = cli_cod";
        }

        sql1 += sql2;

        sql1 = sql1.replace("  ", " AND ");


        bf.somaRecebidos(sql1, msg1, msg2);
        txTotalFiltrado.setText(bf.getSomaRecebidos());
    }

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
            java.util.logging.Logger.getLogger(Recebidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recebidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recebidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recebidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recebidos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnFiltrar;
    public javax.swing.JInternalFrame internalRecebidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jcbFormaPagamento;
    public com.toedter.calendar.JDateChooser jdcRecebidoFinal;
    public com.toedter.calendar.JDateChooser jdcRecebidoIncial;
    private javax.swing.JLabel lbValorCompra;
    public javax.swing.JTable tabela;
    private javax.swing.JTextField txCodigo;
    public javax.swing.JTextField txTotalFiltrado;
    // End of variables declaration//GEN-END:variables
}
