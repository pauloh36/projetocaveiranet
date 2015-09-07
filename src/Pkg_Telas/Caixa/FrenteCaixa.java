package Pkg_Telas.Caixa;

import Pkg_Telas.principal;
import Pkg_banco.BancoFuncoes;
import Pkg_banco.conectaBanco;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrenteCaixa extends javax.swing.JFrame {

    String codigo, barras, dataHoje, codProduto, formaPagamento;
    String codCliente, cliente, dataVencimento;
    int quantidade, codCompra=1, flagCompra, flagVenda, quantidadeParcelas;
    double venda, valor, valorTotal, valorPago, desconto, troco, valorParcela;

    BancoFuncoes bf = new BancoFuncoes();

    public List<Integer> vetorVendaQuantidade = new ArrayList<Integer>();
    public List<String> vetorCodigoProduto = new ArrayList<String>();
    public List<Integer> vetorQuantidadeEstoque = new ArrayList<Integer>();

    private DefaultTableModel tab1, tab2;

    public FrenteCaixa() {

        initComponents();

        dataHoje();
        carregaNumeroCompra();
        carregaCliente();

        txCodigo.setVisible(false);
        txDataHoje.setEnabled(false);
        aErro.setVisible(false);
        painelPrestacoes.setVisible(false);
        aFormaPagamento.setVisible(false);
  //      btnFinalizaPagamento.setEnabled(false);

        txBarras.requestFocus();
        txBarras.grabFocus();
    }

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

    public void setFormaPagamento(String d){
        formaPagamento = d;
    }
    public String getFormaPagamento(){
        return formaPagamento = (String) jcbFormaPagamento.getSelectedItem();
    }

    public void setCodigoProduto(String d){
        codProduto = d;
    }
    public String getCodigoProduto(){
        return codProduto;
    }

    public void setCliente(String d){
        cliente = d;
    }
    public String getCliente(){
        return cliente = (String) jcbCliente.getSelectedItem();
    }

    public void setCodCliente(String d){
        codCliente = d;
    }
    public String getCodCliente(){
        return codCliente;
    }

    public void setQuantidade(int d){
        quantidade = d;
    }
    public int getQuantidade(){
        return quantidade = Integer.parseInt(txQuantidade.getText());
    }

    public void setQuantidadeParcelas(int d){
        quantidadeParcelas = d;
    }
    public int getQuantidadeParcelas(){
        return quantidadeParcelas = Integer.parseInt(txParcelas.getText());
    }

    public void setCodigoCompra(int d){
        codCompra = d;
    }
    public int getCodigoCompra(){
        return codCompra = Integer.parseInt(lbCompra.getText());
    }

    public void setFlagCompra(int d){
        flagCompra = d;
    }
    public int getFlagCompra(){
        return flagCompra;
    }

    public void setFlagVenda(int d){
        flagVenda = d;
    }
    public int getFlagVenda(){
        return flagVenda;
    }

    public void setVenda(double d){
        venda = d;
    }
    public double getVenda(){
        return venda;
    }   

    public void setTotal(double d){
        venda = d;
    }
    public double getTotal(){
        return venda = Double.parseDouble(txTotal.getText().replace(',', '.'));
    }   

    public void setValor(double d){
        valor = d;
    }
    public double getValor(){
        return valor = Double.parseDouble(txValor.getText().replace(',', '.'));
    }  

    public void setValorTotal(double d){
        valorTotal = d;
    }
    public double getValorTotal(){
        return valorTotal = Double.parseDouble(txValorCompra.getText().replace(',', '.'));
    } 

    public void setValorRecebido(double d){
        valorPago = d;
    }
    public double getValorRecebido(){
        return valorPago = Double.parseDouble(txValorRecebido.getText().replace(',', '.'));
    } 

    public void setDesconto(double d){
        desconto = d;
    }
    public double getDesconto(){
        return desconto = Double.parseDouble(txDesconto.getText().replace(',', '.'));
    } 

    public void setTroco(double d){
        troco = d;
    }
    public double getTroco(){
        return troco = Double.parseDouble(txTroco.getText().replace(',', '.'));
    } 

    public void setValorParcela(double d){
        valorParcela = d;
    }
    public double getValorParcela(){
        return valorParcela = Double.parseDouble(txValorParcelas.getText().replace(',', '.'));
    } 

    public void setDataHoje(String n){
        dataHoje = n;
    }
    public String getDataHoje(){
        if (txDataHoje.getDate()!=null){
          return dataHoje = new SimpleDateFormat("yyyy-MM-dd").format(txDataHoje.getDate());
        }else{
          return null;
        }
    }

    public void setDataVencimento(String n){
        dataVencimento = n;
    }
    public String getDataVencimento(){
        if (txDataVencimento.getDate()!=null){
          return dataVencimento = new SimpleDateFormat("yyyy-MM-dd").format(txDataVencimento.getDate());
        }else{
          return null;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        codbar = new javax.swing.ButtonGroup();
        dialogFinalizarCompra = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jcbFormaPagamento = new javax.swing.JComboBox();
        txValorCompra = new javax.swing.JFormattedTextField();
        lbTroco = new javax.swing.JLabel();
        txTroco = new javax.swing.JFormattedTextField();
        txValorRecebido = new javax.swing.JFormattedTextField();
        lbValorRecebido = new javax.swing.JLabel();
        lbValorCompra = new javax.swing.JLabel();
        txDesconto = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPagamento = new javax.swing.JTable();
        painelPrestacoes = new javax.swing.JPanel();
        jcbCliente = new javax.swing.JComboBox();
        txParcelas = new javax.swing.JFormattedTextField();
        lbValorCompra1 = new javax.swing.JLabel();
        lbValorCompra3 = new javax.swing.JLabel();
        lbValorCompra4 = new javax.swing.JLabel();
        txValorParcelas = new javax.swing.JFormattedTextField();
        txDataVencimento = new com.toedter.calendar.JDateChooser();
        lbValorCompra6 = new javax.swing.JLabel();
        lbDesc = new javax.swing.JLabel();
        btnFinalizaPagamento = new javax.swing.JButton();
        lbValorCompra5 = new javax.swing.JLabel();
        btnIncluirPagamento = new javax.swing.JButton();
        aFormaPagamento = new javax.swing.JLabel();
        vistparc = new javax.swing.ButtonGroup();
        internalFrenteCaixa = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        radCodigo = new javax.swing.JRadioButton();
        radBarras = new javax.swing.JRadioButton();
        txCodigo = new javax.swing.JTextField();
        txBarras = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txProduto = new javax.swing.JTextField();
        txQuantidade = new javax.swing.JFormattedTextField();
        txTotal = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txValor = new javax.swing.JFormattedTextField();
        btnSair = new javax.swing.JButton();
        btnImprimirCupom = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbCompra = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txDataHoje = new com.toedter.calendar.JDateChooser();
        imagemProduto = new javax.swing.JLabel();
        btnIncluir = new javax.swing.JButton();
        btnFinalizarCompra = new javax.swing.JButton();
        aErro = new javax.swing.JLabel();
        tabela12 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        dialogFinalizarCompra.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        dialogFinalizarCompra.setTitle("Pagamento");
        dialogFinalizarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dialogFinalizarCompra.setMinimumSize(new java.awt.Dimension(553, 471));
        dialogFinalizarCompra.setResizable(false);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(null);

        jcbFormaPagamento.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jcbFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "DINHEIRO", "A VISTA", "CHEQUE", "PARCELADO" }));
        jcbFormaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbFormaPagamentoActionPerformed(evt);
            }
        });
        jPanel3.add(jcbFormaPagamento);
        jcbFormaPagamento.setBounds(150, 10, 290, 40);

        txValorCompra.setEditable(false);
        txValorCompra.setBackground(new java.awt.Color(226, 234, 220));
        txValorCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txValorCompra.setText("0,00");
        txValorCompra.setToolTipText("");
        txValorCompra.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txValorCompra.setEnabled(false);
        txValorCompra.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jPanel3.add(txValorCompra);
        txValorCompra.setBounds(340, 80, 190, 50);

        lbTroco.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel3.add(lbTroco);
        lbTroco.setBounds(340, 300, 140, 20);

        txTroco.setEditable(false);
        txTroco.setBackground(new java.awt.Color(226, 234, 220));
        txTroco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txTroco.setText("0,00");
        txTroco.setToolTipText("");
        txTroco.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txTroco.setEnabled(false);
        txTroco.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jPanel3.add(txTroco);
        txTroco.setBounds(340, 320, 190, 50);

        txValorRecebido.setBackground(new java.awt.Color(226, 234, 220));
        txValorRecebido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txValorRecebido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txValorRecebido.setText("0,00");
        txValorRecebido.setToolTipText("");
        txValorRecebido.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txValorRecebido.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        txValorRecebido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txValorRecebidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txValorRecebidoFocusLost(evt);
            }
        });
        jPanel3.add(txValorRecebido);
        txValorRecebido.setBounds(340, 240, 190, 50);

        lbValorRecebido.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbValorRecebido.setText("Valor Recebido:");
        jPanel3.add(lbValorRecebido);
        lbValorRecebido.setBounds(340, 220, 100, 20);

        lbValorCompra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbValorCompra.setText("Forma de Pagamento:");
        jPanel3.add(lbValorCompra);
        lbValorCompra.setBounds(20, 10, 160, 40);

        txDesconto.setBackground(new java.awt.Color(226, 234, 220));
        txDesconto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txDesconto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txDesconto.setText("0,00");
        txDesconto.setToolTipText("");
        txDesconto.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txDesconto.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        txDesconto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txDescontoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txDescontoFocusLost(evt);
            }
        });
        jPanel3.add(txDesconto);
        txDesconto.setBounds(340, 160, 190, 50);

        tabelaPagamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod Pag", "Cod Compra", "Forma Pagamento", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaPagamento.setColumnSelectionAllowed(true);
        tabelaPagamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPagamentoMouseClicked(evt);
            }
        });
        tabelaPagamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaPagamentoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaPagamento);
        tabelaPagamento.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tabelaPagamento.getColumnModel().getColumn(0).setMinWidth(0);
        tabelaPagamento.getColumnModel().getColumn(0).setPreferredWidth(0);
        tabelaPagamento.getColumnModel().getColumn(0).setMaxWidth(0);
        tabelaPagamento.getColumnModel().getColumn(1).setMinWidth(0);
        tabelaPagamento.getColumnModel().getColumn(1).setPreferredWidth(0);
        tabelaPagamento.getColumnModel().getColumn(1).setMaxWidth(0);
        tabelaPagamento.getColumnModel().getColumn(2).setMinWidth(190);
        tabelaPagamento.getColumnModel().getColumn(2).setPreferredWidth(190);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 300, 300, 160);

        painelPrestacoes.setBackground(new java.awt.Color(204, 204, 204));
        painelPrestacoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Prestações"));
        painelPrestacoes.setLayout(null);

        jcbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbClienteActionPerformed(evt);
            }
        });
        painelPrestacoes.add(jcbCliente);
        jcbCliente.setBounds(10, 40, 280, 40);

        txParcelas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txParcelas.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        txParcelas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txParcelasFocusLost(evt);
            }
        });
        painelPrestacoes.add(txParcelas);
        txParcelas.setBounds(10, 110, 70, 50);

        lbValorCompra1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbValorCompra1.setText("1º Vencimento:");
        painelPrestacoes.add(lbValorCompra1);
        lbValorCompra1.setBounds(10, 170, 110, 40);

        lbValorCompra3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbValorCompra3.setText("Cliente:");
        painelPrestacoes.add(lbValorCompra3);
        lbValorCompra3.setBounds(10, 20, 100, 20);

        lbValorCompra4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbValorCompra4.setText("Parcelas:");
        painelPrestacoes.add(lbValorCompra4);
        lbValorCompra4.setBounds(10, 90, 80, 20);

        txValorParcelas.setBackground(new java.awt.Color(226, 234, 220));
        txValorParcelas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txValorParcelas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txValorParcelas.setText("0,00");
        txValorParcelas.setToolTipText("");
        txValorParcelas.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txValorParcelas.setEnabled(false);
        txValorParcelas.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        painelPrestacoes.add(txValorParcelas);
        txValorParcelas.setBounds(90, 110, 190, 50);
        painelPrestacoes.add(txDataVencimento);
        txDataVencimento.setBounds(100, 170, 180, 40);

        lbValorCompra6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbValorCompra6.setText("Valor Parcelas:");
        painelPrestacoes.add(lbValorCompra6);
        lbValorCompra6.setBounds(90, 90, 110, 20);

        jPanel3.add(painelPrestacoes);
        painelPrestacoes.setBounds(10, 60, 300, 220);

        lbDesc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbDesc.setText("Desconto:");
        jPanel3.add(lbDesc);
        lbDesc.setBounds(340, 140, 100, 20);

        btnFinalizaPagamento.setText("Sair");
        btnFinalizaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizaPagamentoActionPerformed(evt);
            }
        });
        jPanel3.add(btnFinalizaPagamento);
        btnFinalizaPagamento.setBounds(430, 400, 100, 30);

        lbValorCompra5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbValorCompra5.setText("Valor da Compra:");
        jPanel3.add(lbValorCompra5);
        lbValorCompra5.setBounds(340, 60, 100, 20);

        btnIncluirPagamento.setText("Incluir");
        btnIncluirPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirPagamentoActionPerformed(evt);
            }
        });
        jPanel3.add(btnIncluirPagamento);
        btnIncluirPagamento.setBounds(340, 400, 61, 30);

        aFormaPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pkg_Imagens/erro.png"))); // NOI18N
        jPanel3.add(aFormaPagamento);
        aFormaPagamento.setBounds(450, 20, 16, 30);

        javax.swing.GroupLayout dialogFinalizarCompraLayout = new javax.swing.GroupLayout(dialogFinalizarCompra.getContentPane());
        dialogFinalizarCompra.getContentPane().setLayout(dialogFinalizarCompraLayout);
        dialogFinalizarCompraLayout.setHorizontalGroup(
            dialogFinalizarCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dialogFinalizarCompraLayout.setVerticalGroup(
            dialogFinalizarCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        internalFrenteCaixa.setTitle("Frente de Caixa");
        internalFrenteCaixa.setName(""); // NOI18N
        internalFrenteCaixa.setNextFocusableComponent(txBarras);
        try {
            internalFrenteCaixa.setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        internalFrenteCaixa.setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        codbar.add(radCodigo);
        radCodigo.setText("Código");
        radCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(radCodigo);
        radCodigo.setBounds(10, 40, 120, 23);

        codbar.add(radBarras);
        radBarras.setSelected(true);
        radBarras.setText("Código Barras");
        radBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBarrasActionPerformed(evt);
            }
        });
        jPanel1.add(radBarras);
        radBarras.setBounds(10, 10, 130, 23);

        txCodigo.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        txCodigo.setFocusCycleRoot(true);
        txCodigo.setNextFocusableComponent(txQuantidade);
        txCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txCodigoFocusLost(evt);
            }
        });
        jPanel1.add(txCodigo);
        txCodigo.setBounds(150, 10, 300, 50);

        txBarras.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txBarras.setFocusTraversalPolicyProvider(true);
        txBarras.setNextFocusableComponent(txQuantidade);
        txBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txBarrasActionPerformed(evt);
            }
        });
        txBarras.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txBarrasFocusLost(evt);
            }
        });
        jPanel1.add(txBarras);
        txBarras.setBounds(150, 10, 300, 50);

        jLabel11.setText("Descrição do Produto:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 80, 130, 60);

        txProduto.setEditable(false);
        txProduto.setBackground(new java.awt.Color(226, 234, 220));
        txProduto.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txProduto.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jPanel1.add(txProduto);
        txProduto.setBounds(150, 80, 340, 60);

        txQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txQuantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txQuantidade.setText("0");
        txQuantidade.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txQuantidade.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        txQuantidade.setNextFocusableComponent(btnIncluir);
        txQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txQuantidadeFocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                txQuantidadeFocusGained(evt);
            }
        });
        jPanel1.add(txQuantidade);
        txQuantidade.setBounds(150, 290, 90, 50);

        txTotal.setEditable(false);
        txTotal.setBackground(new java.awt.Color(226, 234, 220));
        txTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        txTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txTotal.setText("0,00");
        txTotal.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txTotal.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jPanel1.add(txTotal);
        txTotal.setBounds(770, 450, 200, 50);

        jLabel9.setText("Total dos Produtos:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(660, 450, 110, 50);

        jLabel10.setText("Quantidade:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(50, 290, 90, 50);

        jLabel12.setText(" Unitário:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(250, 290, 80, 50);

        txValor.setEditable(false);
        txValor.setBackground(new java.awt.Color(226, 234, 220));
        txValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txValor.setText("0,00");
        txValor.setToolTipText("");
        txValor.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txValor.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jPanel1.add(txValor);
        txValor.setBounds(300, 290, 190, 50);

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel1.add(btnSair);
        btnSair.setBounds(550, 460, 100, 30);

        btnImprimirCupom.setText("Imprimir Cupom");
        btnImprimirCupom.setEnabled(false);
        btnImprimirCupom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirCupomActionPerformed(evt);
            }
        });
        jPanel1.add(btnImprimirCupom);
        btnImprimirCupom.setBounds(420, 460, 120, 30);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(null);

        lbCompra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCompra.setText("1");
        jPanel2.add(lbCompra);
        lbCompra.setBounds(140, 10, 100, 30);

        jLabel3.setText("Número da Compra:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 10, 120, 30);

        jLabel4.setText("Data da Compra:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 40, 120, 30);

        txDataHoje.setEnabled(false);
        jPanel2.add(txDataHoje);
        txDataHoje.setBounds(110, 40, 130, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 430, 250, 80);

        imagemProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagemProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        imagemProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imagemProduto.setMaximumSize(new java.awt.Dimension(100, 100));
        imagemProduto.setMinimumSize(new java.awt.Dimension(100, 100));
        imagemProduto.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(imagemProduto);
        imagemProduto.setBounds(150, 150, 150, 130);

        btnIncluir.setText("Incluir");
        btnIncluir.setNextFocusableComponent(txBarras);
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });
        btnIncluir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnIncluirKeyPressed(evt);
            }
        });
        jPanel1.add(btnIncluir);
        btnIncluir.setBounds(370, 350, 120, 30);

        btnFinalizarCompra.setText("Finaliza Compra");
        btnFinalizarCompra.setEnabled(false);
        btnFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarCompraActionPerformed(evt);
            }
        });
        jPanel1.add(btnFinalizarCompra);
        btnFinalizarCompra.setBounds(290, 460, 120, 30);

        aErro.setBackground(new java.awt.Color(255, 102, 102));
        aErro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        aErro.setText("      *   Nenhum Produto Selecionado");
        aErro.setOpaque(true);
        jPanel1.add(aErro);
        aErro.setBounds(0, 350, 500, 30);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código venda", "Codigo Produto", "Qntd.", "Produto", "Valor Unitário", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        tabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaKeyPressed(evt);
            }
        });
        tabela12.setViewportView(tabela);
        tabela.getColumnModel().getColumn(0).setMinWidth(0);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(0);
        tabela.getColumnModel().getColumn(0).setMaxWidth(0);
        tabela.getColumnModel().getColumn(1).setMinWidth(0);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(0);
        tabela.getColumnModel().getColumn(1).setMaxWidth(0);
        tabela.getColumnModel().getColumn(2).setMinWidth(60);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(60);
        tabela.getColumnModel().getColumn(2).setMaxWidth(60);
        tabela.getColumnModel().getColumn(3).setMinWidth(250);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(250);
        tabela.getColumnModel().getColumn(3).setMaxWidth(200);
        tabela.getColumnModel().getColumn(4).setMinWidth(105);
        tabela.getColumnModel().getColumn(4).setPreferredWidth(105);
        tabela.getColumnModel().getColumn(4).setMaxWidth(105);
        tabela.getColumnModel().getColumn(5).setMinWidth(105);
        tabela.getColumnModel().getColumn(5).setPreferredWidth(105);
        tabela.getColumnModel().getColumn(5).setMaxWidth(105);

        jPanel1.add(tabela12);
        tabela12.setBounds(500, 0, 510, 440);

        javax.swing.GroupLayout internalFrenteCaixaLayout = new javax.swing.GroupLayout(internalFrenteCaixa.getContentPane());
        internalFrenteCaixa.getContentPane().setLayout(internalFrenteCaixaLayout);
        internalFrenteCaixaLayout.setHorizontalGroup(
            internalFrenteCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1009, Short.MAX_VALUE)
        );
        internalFrenteCaixaLayout.setVerticalGroup(
            internalFrenteCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(internalFrenteCaixa)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(internalFrenteCaixa)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBarrasActionPerformed
        if(radBarras.isSelected()){
            txBarras.setVisible(true);
            txCodigo.setText("");
            txCodigo.setVisible(false);
        }
    }//GEN-LAST:event_radBarrasActionPerformed

    private void radCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radCodigoActionPerformed
        if(radCodigo.isSelected()){
            txCodigo.setVisible(true);
            txBarras.setText("");
            txBarras.setVisible(false);
        }
    }//GEN-LAST:event_radCodigoActionPerformed

    private void txCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txCodigoFocusLost
        precoDinamico("prod_codigo",getCodigo());
        aErro.setVisible(false);
    }//GEN-LAST:event_txCodigoFocusLost

    private void txBarrasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txBarrasFocusLost
        precoDinamico("prod_barras",getBarras());
        aErro.setVisible(false);
    }//GEN-LAST:event_txBarrasFocusLost

    private void txQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txQuantidadeFocusLost
        calculaQuantidade(getQuantidade(), getVenda());
    }//GEN-LAST:event_txQuantidadeFocusLost

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        calculaQuantidade(getQuantidade(), getVenda());        
        valida();
        btnFinalizarCompra.setEnabled(true);
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void txQuantidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txQuantidadeFocusGained
        txQuantidade.selectAll();
    }//GEN-LAST:event_txQuantidadeFocusGained

    private void btnFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarCompraActionPerformed
    Object[] options = { "Sim", "Não" };
    int opcao = JOptionPane.showOptionDialog(null, "Deseja finalizar esta compra ?", "AVISO",
    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

     if(opcao == 0){

           dialogFinalizarCompra.setVisible(true);
           dialogFinalizarCompra.setSize(560, 511);
           dialogFinalizarCompra.setLocation(300, 100);
           dialogFinalizarCompra.setAlwaysOnTop(true);

           String venda = String.valueOf(getTotal());
           setVenda(Double.parseDouble(venda));
           int ponto = venda.indexOf(".");
           int tamanho = venda.length();
           int total = tamanho-(ponto+1);
           String vendaEditada = venda.replace('.', ',');

//                        System.out.println(total);

           if(ponto == -1){
              vendaEditada = vendaEditada+",00";
           }else{
                if(total==2)
                   vendaEditada = vendaEditada;
                if(total==1)
                   vendaEditada = vendaEditada+"0";
                if(total>2)
                   vendaEditada = vendaEditada.substring(0, ponto+3);
           }

        txValorCompra.setText(vendaEditada);
    }
    }//GEN-LAST:event_btnFinalizarCompraActionPerformed

    private void btnIncluirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIncluirKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) { 
            valida();
            btnFinalizarCompra.setEnabled(true);
       }
    }//GEN-LAST:event_btnIncluirKeyPressed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        tabela.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e){
                 try{
                     
                             conectaBanco cb = new conectaBanco();  
                     
                     if(e.getClickCount() == 2){
                       int    col = tabela.getSelectedColumn();
                       int    lin = tabela.getSelectedRow();
                    String result =(String) tabela.getValueAt(lin, 0);
                    
                         com.mysql.jdbc.Connection connection = null;
                         Class.forName(cb.JDBC_DRIVER()).newInstance();
                         connection =    (com.mysql.jdbc.Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());
                         com.mysql.jdbc.Statement s = (com.mysql.jdbc.Statement) connection.createStatement();
                         
                    Object[] options = { "Sim", "Não" };
                        int opcao = JOptionPane.showOptionDialog(null, "Deseja Excluir Esta Venda ?", "AVISO",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

                        if(opcao == 0){
                                    String msg1 = "Venda Excluída";
                                    String msg2 = "Erro ao Excluir Venda";
                                    String sql = "delete from tb_venda WHERE vend_cod='"+result+"'";

                                    System.out.println(sql);
                                    s.execute(sql);  
                        }
                                        
                         carregaTabelaVendas();
                         somaVendas();
                     }                    
                     
                    }catch (Exception ex) {
                       ex.printStackTrace(System.out);
   //                    JOptionPane.showMessageDialog(null, "Não Foi Possível Abrir Serviços");
                    }
                }   
          });
    }//GEN-LAST:event_tabelaMouseClicked

    private void tabelaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_DELETE) {  
        try{
                     
                             conectaBanco cb = new conectaBanco();  
                     
                       int    col = tabela.getSelectedColumn();
                       int    lin = tabela.getSelectedRow();
                    String result =(String) tabela.getValueAt(lin, 0);
                    
                         com.mysql.jdbc.Connection connection = null;
                         Class.forName(cb.JDBC_DRIVER()).newInstance();
                         connection =    (com.mysql.jdbc.Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());
                         com.mysql.jdbc.Statement s = (com.mysql.jdbc.Statement) connection.createStatement();
                         
                    Object[] options = { "Sim", "Não" };
                        int opcao = JOptionPane.showOptionDialog(null, "Deseja Excluir Esta Venda ?", "AVISO",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

                        if(opcao == 0){
                                    String msg1 = "Venda Excluída";
                                    String msg2 = "Erro ao Excluir Venda";
                                    String sql = "delete from tb_venda WHERE vend_cod='"+result+"'";

                                    System.out.println(sql);
                                    s.execute(sql);  
                        }
                                        
                         carregaTabelaVendas();
                         somaVendas();
                                   
                     
                    }catch (Exception ex) {
                       ex.printStackTrace(System.out);
   //                    JOptionPane.showMessageDialog(null, "Não Foi Possível Abrir Serviços");
                    }
    }  
    }//GEN-LAST:event_tabelaKeyPressed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        Object[] options = { "Sim", "Não" };
                        int opcao = JOptionPane.showOptionDialog(null,"Ao sair se houver vendas, elas serão excluídas\n\nDeseja continuar ?", "AVISO",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

                        if(opcao == 0){
                            
                              String msg1a = "Vendas Excluídas";
                              String msg2a = "Erro ao Excluir Vendas";
                              String sqla = "delete from tb_venda WHERE vend_tb_compra='"+getCodigoCompra()+"'";
                              
                              bf.salvar(sqla, msg1a, msg2a);
                            
                              String msg1 = "Compra Excluída";
                              String msg2 = "Erro ao Excluir Compra";
                              String sql = "delete from tb_compra WHERE compra_cod='"+getCodigoCompra()+"'";
                              
                              bf.salvar(sql, msg1, msg2);
                              
                            this.internalFrenteCaixa.dispose();
                            btnFinalizaPagamento.setText("Sair");
                        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnImprimirCupomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirCupomActionPerformed
        JOptionPane.showMessageDialog(null, "Testar e aprender a imprimir direto para uma impressora sem selecionar");
    }//GEN-LAST:event_btnImprimirCupomActionPerformed

    private void jcbFormaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbFormaPagamentoActionPerformed
        if(getFormaPagamento().equals("DINHEIRO") || getFormaPagamento().equals("A VISTA") || getFormaPagamento().equals("")){
            painelPrestacoes.setVisible(false);
            lbDesc.setVisible(true);lbValorRecebido.setVisible(true);
            txDesconto.setVisible(true);txValorRecebido.setVisible(true);
        }
        if(getFormaPagamento().equals("CHEQUE") || getFormaPagamento().equals("PARCELADO")){
            painelPrestacoes.setVisible(true);
            lbDesc.setVisible(false);lbValorRecebido.setVisible(false);
            txDesconto.setVisible(false);txValorRecebido.setVisible(false);
        }
    }//GEN-LAST:event_jcbFormaPagamentoActionPerformed

    private void txValorRecebidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txValorRecebidoFocusLost
        calculaPagamento(getValorTotal(), getValorRecebido(), getDesconto());
    }//GEN-LAST:event_txValorRecebidoFocusLost

    private void txDescontoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txDescontoFocusGained
        txDesconto.selectAll();
    }//GEN-LAST:event_txDescontoFocusGained

    private void txValorRecebidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txValorRecebidoFocusGained
        txValorRecebido.selectAll();
    }//GEN-LAST:event_txValorRecebidoFocusGained

    private void btnFinalizaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizaPagamentoActionPerformed
       if(getTroco() == 0.0 || getTroco() < 0.0){
           
           atualizaEstoque();
           alteraTotalCompra();
           
           dialogFinalizarCompra.setVisible(false);
           txTotal.setText("0,00");
           lbCompra.setText(String.valueOf(getCodigoCompra()+1));
           btnIncluirPagamento.setEnabled(true);
           setCodigoCompra(+1);
           
           tab1 = (DefaultTableModel)tabela.getModel();  
           tab1.setNumRows(0);  
           
           tab2 = (DefaultTableModel)tabelaPagamento.getModel();  
           tab2.setNumRows(0); 

       }
        
       if(getTroco()>0.0){
        try{
                         conectaBanco cb = new conectaBanco();  
                     
                         com.mysql.jdbc.Connection connection = null;
                         Class.forName(cb.JDBC_DRIVER()).newInstance();
                         connection =    (com.mysql.jdbc.Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());
                         com.mysql.jdbc.Statement s = (com.mysql.jdbc.Statement) connection.createStatement();

                    Object[] options = { "Sim", "Não" };
                        int opcao = JOptionPane.showOptionDialog(null, "Ao sair você excluirá todos os pagamentos. \n\n Deseja realmente sair?", "AVISO",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

                        if(opcao == 0){
                            
                                    String msg1 = "Pagamento Excluído";
                                    
                                    String sql = "Delete From tb_comprasprestacoes WHERE prest_tb_compra ='"+getCodigoCompra()+"'";
                                    
                                    System.out.println(sql +"\n"+ msg1);
                                    s.execute(sql);
                             
                                    String sql1 = "Delete From tb_comprasrecebidas WHERE pag_tb_compra ='"+getCodigoCompra()+"'";
                                     
                                    System.out.println(sql1 +"\n"+ msg1);
                                    s.execute(sql1);  
   
                        }
                         carregaTabelaFinalizarCompra();
                        dialogFinalizarCompra.setVisible(false);
                        
                    }catch (Exception ex) {
                       ex.printStackTrace(System.out);
                       JOptionPane.showMessageDialog(null, "Erro ao Excluir Pagamento");
                    }
       }
        
        
    }//GEN-LAST:event_btnFinalizaPagamentoActionPerformed

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

    private void txDescontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txDescontoFocusLost
        calculaPagamento(getValorTotal(), getValorRecebido(), getDesconto());
    }//GEN-LAST:event_txDescontoFocusLost

    private void txParcelasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txParcelasFocusLost
        calculaParcelas(getQuantidadeParcelas(), getValorTotal());

    }//GEN-LAST:event_txParcelasFocusLost

    private void btnIncluirPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirPagamentoActionPerformed
//    if(!txValorRecebido.getText().equals("0,00")){
        if(jcbFormaPagamento.getSelectedItem().equals("")){
            aFormaPagamento.setVisible(true);
            btnIncluirPagamento.setEnabled(true);
            btnFinalizaPagamento.setEnabled(false);
        }
        else{
            aFormaPagamento.setVisible(false);
        
        
            if(!getFormaPagamento().equals("") && getFormaPagamento().equals("DINHEIRO") || 
                getFormaPagamento().equals("A VISTA")){
               if(getTroco()<0 || getTroco()==0){
                   salvaPagamento();
                   carregaTabelaFinalizarCompra();
                   limpaPagamento();
                   txDesconto.setText("0,00");
                   txValorRecebido.setText("0,00");
                   btnFinalizaPagamento.setText("Finalizar");
                   btnFinalizaPagamento.setEnabled(true);
                   btnIncluirPagamento.setEnabled(false);
                   txValorCompra.setText("0,00");
               }
               if(getTroco()>0){
                   txValorCompra.setText(String.valueOf((getValorTotal()-getDesconto())-getValorRecebido()));
                   salvaPagamento();
                   carregaTabelaFinalizarCompra();
                   limpaPagamento();
                   txDesconto.setText("0,00");
                   txValorRecebido.setText("0,00");
                   btnFinalizaPagamento.setEnabled(false);
                   btnIncluirPagamento.setEnabled(true);
               }
            }
            if(getFormaPagamento().equals("CHEQUE") || getFormaPagamento().equals("PARCELADO")){
                if(getQuantidadeParcelas()>0 && !getCliente().equals("") && getDataVencimento()!=null){
                    salvaPagamento();
                    carregaTabelaFinalizarCompra();
                    limpaPagamento();
                    txValorCompra.setText("0,00");
                    txDesconto.setEnabled(false);
                    txValorRecebido.setEnabled(false);
                    txTroco.setText("0,00");
                }
            }
            
               if(getTroco()<0 || getTroco()==0){
                   btnFinalizaPagamento.setEnabled(true);
                   btnIncluirPagamento.setEnabled(false);
               }
               if(getTroco()>0){
                   btnFinalizaPagamento.setEnabled(false);
                   btnIncluirPagamento.setEnabled(true);
               }
           }        
     
    }//GEN-LAST:event_btnIncluirPagamentoActionPerformed

    private void tabelaPagamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPagamentoMouseClicked
        tabelaPagamento.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e){
                 try{
                     
                             conectaBanco cb = new conectaBanco();  
                     
                     if(e.getClickCount() == 2){
                       int    col = tabelaPagamento.getSelectedColumn();
                       int    lin = tabelaPagamento.getSelectedRow();
                    String result  =(String) tabelaPagamento.getValueAt(lin, 0);
                    String codcomp =(String) tabelaPagamento.getValueAt(lin, 1);
                    String formpag =(String) tabelaPagamento.getValueAt(lin, 2);

                         com.mysql.jdbc.Connection connection = null;
                         Class.forName(cb.JDBC_DRIVER()).newInstance();
                         connection =    (com.mysql.jdbc.Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());
                         com.mysql.jdbc.Statement s = (com.mysql.jdbc.Statement) connection.createStatement();

                    Object[] options = { "Sim", "Não" };
                        int opcao = JOptionPane.showOptionDialog(null, "Deseja Excluir Este Pagamento ?", "AVISO",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

                        if(opcao == 0){
                            
                            if(formpag.equals("CHEQUE") || formpag.equals("PARCELADO")){
                                    String msg1 = "Pagamento Excluído";
                                    String msg2 = "Erro ao Excluir Pagamento";
                                    String sql = "Delete From tb_comprasprestacoes WHERE prest_tb_compra='"+codcomp+"'";
                                    
                                    somaPagamentos("select prest_tb_compra, SUM(prest_valor)soma from tb_comprasprestacoes where prest_tb_compra = "+codcomp);
                                    
                                    System.out.println(sql);
                                    s.execute(sql);
                                    
                            }
                        
                            if(formpag.equals("A VISTA") || formpag.equals("DINHEIRO")){
                                    String msg1 = "Pagamento Excluído";
                                    String msg2 = "Erro ao Excluir Pagamento";
                                    String sql = "Delete From tb_comprasrecebidas WHERE pag_cod='"+result+"'";
                                    
                                    somaPagamentos("select pag_cod, pag_valor AS soma from tb_comprasrecebidas where pag_cod = "+result);
                                    
                                    System.out.println(sql);
                                    s.execute(sql);  
                                    
                            }
                        }
                         carregaTabelaFinalizarCompra();
                         btnFinalizaPagamento.setEnabled(false);
                         btnIncluirPagamento.setEnabled(true);
                         
                     }                    

                    }catch (Exception ex) {
                       ex.printStackTrace(System.out);
   //                    JOptionPane.showMessageDialog(null, "Não Foi Possível Abrir Serviços");
                    }
                }   
          });
    }//GEN-LAST:event_tabelaPagamentoMouseClicked

    private void tabelaPagamentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaPagamentoKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_DELETE) {  
                 try{
                     
                             conectaBanco cb = new conectaBanco();  
                     
                       int     col = tabelaPagamento.getSelectedColumn();
                       int     lin = tabelaPagamento.getSelectedRow();
                    String result  =(String) tabelaPagamento.getValueAt(lin, 0);
                    String codcomp =(String) tabelaPagamento.getValueAt(lin, 1);
                    String formpag =(String) tabelaPagamento.getValueAt(lin, 2);

                         com.mysql.jdbc.Connection connection = null;
                         Class.forName(cb.JDBC_DRIVER()).newInstance();
                         connection =    (com.mysql.jdbc.Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());
                         com.mysql.jdbc.Statement s = (com.mysql.jdbc.Statement) connection.createStatement();

                    Object[] options = { "Sim", "Não" };
                        int opcao = JOptionPane.showOptionDialog(null, "Deseja Excluir Este Pagamento ?", "AVISO",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

                        if(opcao == 0){
                            
                            if(formpag.equals("CHEQUE") || formpag.equals("PARCELADO")){
                                    String msg1 = "Pagamento Excluído";
                                    String msg2 = "Erro ao Excluir Pagamento";
                                    String sql = "Delete From tb_comprasprestacoes WHERE prest_tb_compra='"+codcomp+"'";
                                    
                                    somaPagamentos("select prest_tb_compra, SUM(prest_valor)soma from tb_comprasprestacoes where prest_tb_compra = "+codcomp);
                                    
                                    System.out.println(sql);
                                    s.execute(sql);
                                    
                            }
                        
                            if(formpag.equals("A VISTA") || formpag.equals("DINHEIRO")){
                                    String msg1 = "Pagamento Excluído";
                                    String msg2 = "Erro ao Excluir Pagamento";
                                    String sql = "Delete From tb_comprasrecebidas WHERE pag_cod='"+result+"'";
                                    
                                    somaPagamentos("select pag_cod, pag_valor AS soma from tb_comprasrecebidas where pag_cod = "+result);
                                    
                                    System.out.println(sql);
                                    s.execute(sql);  
                                    
                            }
                        }
                         carregaTabelaFinalizarCompra();
                         btnFinalizaPagamento.setEnabled(false);
                         btnIncluirPagamento.setEnabled(true);
                         
                    }catch (Exception ex) {
                       ex.printStackTrace(System.out);
   //                    JOptionPane.showMessageDialog(null, "Não Foi Possível Abrir Serviços");
                    }
    }  

    }//GEN-LAST:event_tabelaPagamentoKeyPressed

    private void txBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txBarrasActionPerformed
//        txQuantidade.requestFocus();
//        txQuantidade.transferFocus();
//        txQuantidade.setFocusable(true);
        JOptionPane.showMessageDialog(null, "ola");
    }//GEN-LAST:event_txBarrasActionPerformed

    public void salvaPagamento(){
        
        Double val = 0.0;
               
        if(getFormaPagamento().equals("DINHEIRO") || getFormaPagamento().equals("A VISTA")){
          
           if(getValorRecebido() > getValorTotal()){
                val = getValorTotal();
           }
           if(getValorRecebido() < getValorTotal() || getValorRecebido() == getValorTotal()){
                val = getValorRecebido();
           }
            
            String msg1 = "Pagamento Efetuado";
            String msg2 = "Erro ao Efetuar Pagamento";
            String sql = "INSERT INTO tb_comprasrecebidas" +
                         " VALUES  (null,'"+getCodigoCompra()+"', 0, '"+getDataHoje()+
                         "', '"+getDataHoje()+"', '"+val+"', '"+getDesconto()+"', '"+getFormaPagamento()+"')";
            System.out.println("Din a Vista: "+sql);
            bf.salvar(sql, msg1, msg2);
            carregaTabelaFinalizarCompra();
        }

        if(getFormaPagamento().equals("CHEQUE") || getFormaPagamento().equals("PARCELADO")){
            for(int i=1; i<=getQuantidadeParcelas(); i++){
                String msg1 = "Prestação cadastrada";
                String msg2 = "Erro ao Cadastrar Prestação";
                String sql = "INSERT INTO tb_comprasprestacoes" +
                             " VALUES  (null,'"+getCodigoCompra()+"', '"+getCodCliente()+"', '"+i+
                                        "', '"+getDataVencimento()+"', '"+getDesconto()/getQuantidadeParcelas()+"', '"+
                                               getValorParcela()+"', '"+getFormaPagamento()+"', '')";
                System.out.println("testando FOR: "+sql);
                bf.salvar(sql, msg1, msg2);
            }
        }
        
    }

    public void precoDinamico(String campo, String result){
        conectaBanco cb = new conectaBanco();
        
              try{

            Connection connection = null;
            Class.forName(cb.JDBC_DRIVER()).newInstance();
            connection =    (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());
            Statement s = (Statement) connection.createStatement();

            String pega = "SELECT prod_cod, prod_codigo, prod_barras, prod_produto, prod_observacoes, prod_caminhoimagem, " +
                          "prod_referencia, prod_minimo, prod_quantidade, prod_custo, prod_ganho, "+
                          "prod_venda " +
                          "FROM tb_produtos "+
                          "WHERE "+campo+" = '"+result+"'";

            System.out.println(pega);

            ResultSet r = s.executeQuery(pega);
                 while(r.next()) {
                        String caminho = r.getString("prod_caminhoimagem");
                        
                        ImageIcon icone = new ImageIcon(System.getProperty("user.dir")+caminho);
                        ImageIcon iconeRedimensionado = new ImageIcon(icone.getImage().getScaledInstance(140, 120, Image.SCALE_DEFAULT));
                        imagemProduto.setIcon(iconeRedimensionado);
                        
                        setCodigoProduto(r.getString("prod_cod"));
                        txBarras.setText(r.getString("prod_barras"));
                        txCodigo.setText(r.getString("prod_codigo"));
                        txProduto.setText(r.getString("prod_produto"));
                        txQuantidade.setText("1");
                        
                        String venda = r.getString("prod_venda");
                        setVenda(Double.parseDouble(venda));
                        int ponto = venda.indexOf(".");
                        int tamanho = venda.length();
                        int total = tamanho-(ponto+1);
                        String vendaEditada = venda.replace('.', ',');

//                        System.out.println(total);

                        if(ponto == -1){
                           vendaEditada = vendaEditada+",00";
                        }else{
                            if(total==2)
                                vendaEditada = vendaEditada;
                            if(total==1)
                                vendaEditada = vendaEditada+"0";
                            if(total>2)
                                vendaEditada = vendaEditada.substring(0, ponto+3);
                        }
                        
                        txValor.setText(vendaEditada);
                      
                      }


         }catch (Exception ex) {
                    ex.printStackTrace(System.out);
                    JOptionPane.showMessageDialog(null, "Não Foi Possível Carregar o produto");
                }
    }

    public void calculaQuantidade(int qnt, double vend){
    //    System.out.println("Quantidade: "+getQuantidade()+" Venda: "+ getVenda());
        double v = vend * qnt;
        
                        String venda = String.valueOf(v);
                        int ponto = venda.indexOf(".");
                        int tamanho = venda.length();
                        int total = tamanho-(ponto+1);
                        String vendaEditada = venda.replace('.', ',');

                        System.out.println(total);

                        if(ponto == -1){
                           vendaEditada = vendaEditada+",00";
                        }else{
                            if(total==2)
                                vendaEditada = vendaEditada;
                            if(total==1)
                                vendaEditada = vendaEditada+"0";
                            if(total>2)
                                vendaEditada = vendaEditada.substring(0, ponto+3);
                        }
                        
                        txValor.setText(vendaEditada);        
        
    }

    public void calculaParcelas(int qnt, double pag){
       double v = pag/qnt;
        
                        String venda = String.valueOf(v);
                        int ponto = venda.indexOf(".");
                        int tamanho = venda.length();
                        int total = tamanho-(ponto+1);
                        String vendaEditada = venda.replace('.', ',');

                        System.out.println(total);

                        if(ponto == -1){
                           vendaEditada = vendaEditada+",00";
                        }else{
                            if(total==2)
                                vendaEditada = vendaEditada;
                            if(total==1)
                                vendaEditada = vendaEditada+"0";
                            if(total>2)
                                vendaEditada = vendaEditada.substring(0, ponto+3);
                        }
                        
                        txValorParcelas.setText(vendaEditada);           
                        
   }

    public void calculaPagamento(double vl, double pag, double desc){
       double v = (vl-desc) - pag;
        
                        String venda = String.valueOf(v);
                        int ponto = venda.indexOf(".");
                        int tamanho = venda.length();
                        int total = tamanho-(ponto+1);
                        String vendaEditada = venda.replace('.', ',');

                        System.out.println(total);

                        if(ponto == -1){
                           vendaEditada = vendaEditada+",00";
                        }else{
                            if(total==2)
                                vendaEditada = vendaEditada;
                            if(total==1)
                                vendaEditada = vendaEditada+"0";
                            if(total>2)
                                vendaEditada = vendaEditada.substring(0, ponto+3);
                        }
                        
                        txTroco.setText(vendaEditada);        
                        
                        if(v==0){
                            btnFinalizaPagamento.setEnabled(true);
                            lbTroco.setText("");
                        }
                        if(v<0){
                            btnFinalizaPagamento.setEnabled(true);
                            lbTroco.setText("Troco: ");
                        }
                        if(v>0){
                            lbTroco.setText("Valor Restante:");
                            btnFinalizaPagamento.setEnabled(false);
                        }
                        
   }

    public void salvaCompra(){
          
        String msg1 = "Compra Cadastrada";
        String msg2 = "Compra Não Cadastrada";
        String sql = "INSERT INTO tb_compra" +
                     " VALUES  ('"+getCodigoCompra()+"', '"+getDataHoje()+"', "+getTotal()+")";
        
        bf.salvar(sql, msg1, msg2);
    }

     public void alteraTotalCompra(){

        String msg1 = "Total da compra alterada com sucesso";
        String msg2 = "Total da compra Não Alterada";
        String sql  = "UPDATE tb_compra SET" +
                      " compra_valor='"+getTotal()+"'" +
                      " WHERE compra_cod='"+getCodigoCompra()+"'";

        bf.salvar(sql, msg1, msg2);
        
    }
    
    public void carregaNumeroCompra(){
                
             conectaBanco cb = new conectaBanco();
         
        String msg1 = "Código compra recuperado";
        String msg2 = "Erro ao Recuperar código compra";
        String vsql = "select max(compra_cod)ultimo from tb_compra";
                
        com.mysql.jdbc.Connection connection = null;

       try {
        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (com.mysql.jdbc.Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

            com.mysql.jdbc.Statement s = (com.mysql.jdbc.Statement) connection.createStatement();

              ResultSet rs = s.executeQuery(vsql);

                    while (rs.next()){
                       
                       int ultimo = Integer.parseInt(rs.getString("ultimo"));
    
                                  lbCompra.setText(String.valueOf(ultimo+1));
                                  setCodigoCompra(ultimo+1);
                       
                   }
                  
            System.out.println("Conectado ao banco com sucesso");

             s.close();
             connection.close();

             System.out.println(msg1);
             System.out.println(vsql);
             return;

       }catch(SQLException ex){
          JOptionPane.showMessageDialog(null, msg2);
          System.out.println("SQLException: " + ex.getMessage());
          System.out.println("SQLState: " + ex.getSQLState());
          System.out.println("Error: " + ex.getErrorCode());
          System.out.println(vsql);
          return;
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, msg2);
          System.out.println(vsql);
          System.out.println("Dados não filtrados" + e);
          return;
        }
     }

    public void dataHoje(){
        Date now = new Date();
        DateFormat df = DateFormat.getDateInstance();
        txDataHoje.setDate(now);
   }

    public void limpaCampos(){
       txBarras.setText("");
       txCodigo.setText("");
       txProduto.setText("");
       imagemProduto.setText("");
       txQuantidade.setText("0");
       txValor.setText("0,00");
       setCodigoProduto("");
       
       ImageIcon icone = new ImageIcon(System.getProperty("user.dir")+"/src/Fotos_Produtos/quadrado branco.jpg");
       ImageIcon iconeRedimensionado = new ImageIcon(icone.getImage().getScaledInstance(140, 120, Image.SCALE_DEFAULT));
       imagemProduto.setIcon(iconeRedimensionado);
       
   }

    public void limpaPagamento(){
       txParcelas.setText(""); txDataVencimento.setDate(null);
       jcbCliente.setSelectedItem(""); jcbFormaPagamento.setSelectedItem("");
       txValorRecebido.setText("");txDesconto.setText("");
   }

    public void salvaVenda(){
        
        String msg1 = "Venda Cadastrada";
        String msg2 = "Venda Não Cadastrada / Nenhum Produto Selecionado";
        String sql  = "INSERT INTO tb_venda" + 
                     " VALUES  (null, '"+getCodigoCompra()+"', '"+getCodigoProduto()+"',"+"'"+getQuantidade()+"',"+
                               "'"+getValor()+"')";
               
        System.out.println(sql);
        
        bf.salvar(sql, msg1, msg2);
        
       
        
   }

    public void carregaTabelaVendas(){
       
        String msg1 = "tabela de compras recuperada";
        String msg2 = "Erro ao Recuperar Tabela de Compras";
        String vsql = "SELECT vend_cod, vend_tb_compra, vend_tb_produto, vend_quantidade, vend_total, prod_cod "+
                      "prod_cod, prod_produto, prod_venda, compra_cod " +
                      "FROM tb_venda " +
                      "INNER JOIN tb_produtos ON prod_cod = vend_tb_produto " +
                      "INNER JOIN tb_compra ON vend_tb_compra = compra_cod " +
                      "WHERE compra_cod = "+getCodigoCompra()+"";

        bf.tabelaVendas(vsql, msg1, msg2, tabela);
       
   }

    public void carregaTabelaFinalizarCompra(){
        String msg1 = "tabela de pagamento recuperada";
        String msg2 = "Erro ao Recuperar Tabela de pagamento";
        String vsql = "SELECT prest_cod, prest_tb_compra, prest_valor, prest_formapagamento " +
                      "FROM tb_comprasprestacoes " +
                      "WHERE prest_tb_compra = "+getCodigoCompra()+"";
        String vsql2 = "SELECT pag_cod, pag_tb_compra, pag_valor, pag_formapagamento " +
                      "FROM tb_comprasrecebidas " +
                      "WHERE pag_tb_compra = "+getCodigoCompra()+"";
        
        bf.tabelaFinalizarCompra(vsql, vsql2, msg1, msg2, tabelaPagamento);
   }

    public void somaVendas(){
               conectaBanco cb = new conectaBanco();
        
              try{

            Connection connection = null;
            Class.forName(cb.JDBC_DRIVER()).newInstance();
            connection =    (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());
            Statement s = (Statement) connection.createStatement();

            String pega = "SELECT SUM(vend_total)soma " +
                          "FROM tb_venda " +
                          "INNER JOIN tb_produtos ON prod_cod = vend_tb_produto " +
                          "INNER JOIN tb_compra ON vend_tb_compra = compra_cod " +
                          "WHERE compra_cod = "+getCodigoCompra()+"";

            System.out.println(pega);

            ResultSet r = s.executeQuery(pega);
                 while(r.next()) {
                        
                        String soma = r.getString("soma");
                        setVenda(Double.parseDouble(soma));
                        int ponto = soma.indexOf(".");
                        int tamanho = soma.length();
                        int total = tamanho-(ponto+1);
                        String somaEditada = soma.replace('.', ',');

//                        System.out.println(total);

                        if(ponto == -1){
                           somaEditada = somaEditada+",00";
                        }else{
                            if(total==2)
                                somaEditada = somaEditada;
                            if(total==1)
                                somaEditada = somaEditada+"0";
                            if(total>2)
                                somaEditada = somaEditada.substring(0, ponto+3);
                        }
                        
                        txTotal.setText(somaEditada);
                      
                      }


         }catch (Exception ex) {
                    ex.printStackTrace(System.out);
                    JOptionPane.showMessageDialog(null, "Não Foi Possível Somar as vendas");
                }
   }

    public void somaPagamentos(String sql){
               conectaBanco cb = new conectaBanco();
        
              try{

            Connection connection = null;
            Class.forName(cb.JDBC_DRIVER()).newInstance();
            connection =    (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());
            Statement s = (Statement) connection.createStatement();

            String pega = sql;

            System.out.println(pega);

            ResultSet r = s.executeQuery(pega);
                 while(r.next()) {
                        
                        String soma = r.getString("soma");
                        setVenda(Double.parseDouble(soma));
                        int ponto = soma.indexOf(".");
                        int tamanho = soma.length();
                        int total = tamanho-(ponto+1);
                        String somaEditada = soma.replace('.', ',');

//                        System.out.println(total);

                        if(ponto == -1){
                           somaEditada = somaEditada+",00";
                        }else{
                            if(total==2)
                                somaEditada = somaEditada;
                            if(total==1)
                                somaEditada = somaEditada+"0";
                            if(total>2)
                                somaEditada = somaEditada.substring(0, ponto+3);
                        }
                        
                        txValorCompra.setText(String.valueOf(Double.parseDouble(txValorCompra.getText().replace(',', '.'))+Double.parseDouble(somaEditada.replace(',', '.'))));
                      
                      }


         }catch (Exception ex) {
                    ex.printStackTrace(System.out);
                    JOptionPane.showMessageDialog(null, "Não Foi Possível Somar os Pagamentos");
                }
   }

    public void valida(){
    if(txBarras.getText().equals("") && txCodigo.getText().equals("")){
        aErro.setVisible(true);
    }else{
        aErro.setVisible(false);
            conectaBanco cb = new conectaBanco();

           String msg1 = "Serviço recuperado";
           String msg2 = "Erro ao Recuperar Serviço";
           String vsql = "select count(*)total from tb_compra where compra_cod = '"+getCodigoCompra()+"'";

           com.mysql.jdbc.Connection connection = null;

          try {
           Class.forName(cb.JDBC_DRIVER()).newInstance();
           connection = (com.mysql.jdbc.Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

               com.mysql.jdbc.Statement s = (com.mysql.jdbc.Statement) connection.createStatement();

                 ResultSet rs = s.executeQuery(vsql);

                       while (rs.next()){

                         setFlagCompra(Integer.parseInt(rs.getString("total")));

                      }

   //--------compara para ver se existe essa Compra no banco se não existir cadastra a Compra,
    //-------caso exista adiciona somente venda a compra cadastrada
               //     JOptionPane.showMessageDialog(null,"getFlagCompra:"+ getFlagCompra());

                               if(getFlagCompra()==0){                               
                                     salvaCompra();
                                     salvaVenda();
                                     carregaTabelaVendas();
                                     somaVendas();
                                     limpaCampos();
                                }
                                if(getFlagCompra()==1){
                                    salvaVenda();
                                    carregaTabelaVendas();
                                    somaVendas();
                                    limpaCampos();
                                }

               System.out.println("Conectado ao banco com sucesso");

                s.close();
                connection.close();

                System.out.println(msg1);
                System.out.println(vsql);
                return;

          }catch(SQLException ex){
             JOptionPane.showMessageDialog(null, msg2);
             System.out.println("SQLException: " + ex.getMessage());
             System.out.println("SQLState: " + ex.getSQLState());
             System.out.println("Error: " + ex.getErrorCode());
             System.out.println(vsql);
             return;
           }
           catch(Exception e){
             JOptionPane.showMessageDialog(null, msg2);
             System.out.println(vsql);
             System.out.println("Dados não filtrados" + e);
             return;
           }
       }
    }

    public void atualizaEstoque(){
        conectaBanco cb = new conectaBanco();
       com.mysql.jdbc.Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (com.mysql.jdbc.Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        com.mysql.jdbc.Statement s = (com.mysql.jdbc.Statement) connection.createStatement();

ResultSet rs = s.executeQuery("SELECT vend_cod, vend_tb_compra, vend_tb_produto, vend_quantidade, vend_total, prod_cod "+
                      "prod_cod, prod_produto, prod_venda, compra_cod, prod_quantidade " +
                      "FROM tb_venda " +
                      "INNER JOIN tb_produtos ON prod_cod = vend_tb_produto " +
                      "INNER JOIN tb_compra ON vend_tb_compra = compra_cod " +
                      "WHERE compra_cod = "+getCodigoCompra()+"");

                   while (rs.next()){
                        int quantidade = rs.getInt("vend_quantidade");
                        String codProd = rs.getString("prod_cod");
                        int prodQuantidade = rs.getInt("prod_quantidade");
                        
                        
                         vetorCodigoProduto.add(codProd);
                         vetorVendaQuantidade.add(quantidade);
                         vetorQuantidadeEstoque.add(prodQuantidade);
                   }
                   
                   for(int i=0; i<vetorCodigoProduto.size(); i++){
                       System.out.println("UPDATE tb_produtos SET "+
                                          "prod_quantidade='"+(vetorQuantidadeEstoque.get(i)-vetorVendaQuantidade.get(i))+"' " +
                                          "WHERE prod_cod='"+vetorCodigoProduto.get(i)+"' ");
                       s.execute("UPDATE tb_produtos SET "+
                                          "prod_quantidade='"+(vetorQuantidadeEstoque.get(i)-vetorVendaQuantidade.get(i))+"' " +
                                          "WHERE prod_cod='"+vetorCodigoProduto.get(i)+"' "); 
                   }                              
                    
                   
        System.out.println("   vetorCodigoProduto: "+vetorCodigoProduto+
                           "__ vetorVendaQuantidade: "+vetorVendaQuantidade+
                           "__ vetorQuantidadeEstoque: "+vetorQuantidadeEstoque+
                           "\n Estoque atualizado");
                 
            //Limpando Array de código de produto para atualizar estoque
                vetorCodigoProduto.clear();
                vetorQuantidadeEstoque.clear();
                vetorVendaQuantidade.clear();
         System.out.println("Array Limpos: "+vetorCodigoProduto+" - "+vetorQuantidadeEstoque+" - "+vetorVendaQuantidade);
        
        System.out.println("Serviços Recuperados com sucesso");

         s.close();
         connection.close();

        
   }catch(SQLException ex){
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      
    }
    catch(Exception e){
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      
    }   
   
   }

    public void carregaCliente(){
        String msg1 = "Clientes recuperados";
        String msg2 = "Erro ao Recuperar Clientes";
        String vsql = "SELECT concat( cli_cod, ' - ', cli_cliente)cliente FROM tb_clientes order by cli_cliente";
        String campoSql = "cliente";

        bf.carregaDadoUnico(vsql, msg1, msg2, jcbCliente, campoSql);
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
            java.util.logging.Logger.getLogger(FrenteCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrenteCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrenteCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrenteCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrenteCaixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aErro;
    private javax.swing.JLabel aFormaPagamento;
    private javax.swing.JButton btnFinalizaPagamento;
    private javax.swing.JButton btnFinalizarCompra;
    private javax.swing.JButton btnImprimirCupom;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnIncluirPagamento;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup codbar;
    public javax.swing.JDialog dialogFinalizarCompra;
    public javax.swing.JLabel imagemProduto;
    public javax.swing.JInternalFrame internalFrenteCaixa;
    private javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JComboBox jcbCliente;
    private javax.swing.JComboBox jcbFormaPagamento;
    private javax.swing.JLabel lbCompra;
    private javax.swing.JLabel lbDesc;
    private javax.swing.JLabel lbTroco;
    private javax.swing.JLabel lbValorCompra;
    private javax.swing.JLabel lbValorCompra1;
    private javax.swing.JLabel lbValorCompra3;
    private javax.swing.JLabel lbValorCompra4;
    private javax.swing.JLabel lbValorCompra5;
    private javax.swing.JLabel lbValorCompra6;
    private javax.swing.JLabel lbValorRecebido;
    private javax.swing.JPanel painelPrestacoes;
    private javax.swing.JRadioButton radBarras;
    private javax.swing.JRadioButton radCodigo;
    public javax.swing.JTable tabela;
    public javax.swing.JScrollPane tabela12;
    public javax.swing.JTable tabelaPagamento;
    private javax.swing.JTextField txBarras;
    private javax.swing.JTextField txCodigo;
    private com.toedter.calendar.JDateChooser txDataHoje;
    public com.toedter.calendar.JDateChooser txDataVencimento;
    public javax.swing.JFormattedTextField txDesconto;
    private javax.swing.JFormattedTextField txParcelas;
    public javax.swing.JTextField txProduto;
    public javax.swing.JFormattedTextField txQuantidade;
    public javax.swing.JFormattedTextField txTotal;
    public javax.swing.JFormattedTextField txTroco;
    public javax.swing.JFormattedTextField txValor;
    public javax.swing.JFormattedTextField txValorCompra;
    public javax.swing.JFormattedTextField txValorParcelas;
    public javax.swing.JFormattedTextField txValorRecebido;
    private javax.swing.ButtonGroup vistparc;
    // End of variables declaration//GEN-END:variables
}
