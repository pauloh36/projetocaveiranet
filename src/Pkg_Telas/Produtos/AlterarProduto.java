package Pkg_Telas.Produtos;

import Pkg_Telas.Clientes.*;
import Pkg_banco.BancoFuncoes;
import Pkg_banco.conectaBanco;
import java.awt.Image;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class AlterarProduto extends javax.swing.JDialog {

        String caminho, codigo, barras, produto, observacoes, categoria, fornecedor, referencia;
        String codCategoria, codFornecedor, prodCod, tipoProduto=" ", codTipoProduto, codTipo, cor, tamanho, material;
        String codCor, codTamanho, codMaterial, codigoProduto;
        int flagCopiaCola = 0, minimo, quantidade;
        double custo, ganho, venda, porcentagem;
        private String teste;

            BancoFuncoes bf = new BancoFuncoes();

    public AlterarProduto(java.awt.Frame parent, boolean modal) {
        super(parent, false);
        
        initComponents();
        
        carregaCategoria();
        carregaFornecedor();
        carregaCor();
        carregaTamanho();
        carregaMaterial();
        carregaTipoProduto();
        
        alAvisoErro.setVisible(false);

        aCategoria.setVisible(false);
        aFornecedor.setVisible(false);
        aEstoque.setVisible(false);
        aValores.setVisible(false);
        aProduto.setVisible(false);
        aTipoProduto.setVisible(false);
        jcbTipoProduto.setEnabled(false);

        setSize(800, 600);
    }

    //--------SET's e GET's----------------------------------
    public void setFlagCopiaCola(int n){
        flagCopiaCola = n;
    }
    public int getFlagCopiaCola(){
        return flagCopiaCola;
    }

    public void setCaminho(String d){
        caminho = d;
    }
    public String getCaminho(){
        return caminho = txCaminho.getText();
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

    public void setObservacoes(String d){
        observacoes = d;
    }
    public String getObservacoes(){
        return observacoes = txObservacoes.getText().toUpperCase();
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

    public void setCodCategoria(String m){
        codCategoria = m;
    }
    public String getCodCategoria(){
        return codCategoria;
    }

    public void setCodFornecedor(String m){
        codFornecedor = m;
    }
    public String getCodFornecedor(){
        return codFornecedor;
    }

    public void setMinimo(int d){
        minimo = d;
    }
    public int getMinimo(){
        return minimo = Integer.parseInt(txMinimo.getText());
    }

    public void setQuantidade(int d){
        quantidade = d;
    }
    public int getQuantidade(){
        return quantidade = Integer.parseInt(txQuantidade.getText());
    }

    public void setProdCod(String d){
        prodCod = d;
    }
    public String getProdCod(){
        return prodCod;
    }

    public void setCusto(double d){
        custo = d;
    }
    public double getCusto(){
        return custo = Double.parseDouble(txCusto.getText().replace(",", "."));
    }    

    public void setGanho(double d){
        ganho = d;
    }
    public double getGanho(){
        return ganho = Double.parseDouble(txGanho.getText().replace(",", "."));
    }        

    public void setVenda(double d){
        venda = d;
    }
    public double getVenda(){
        return venda = Double.parseDouble(txVenda.getText().replace(",", "."));
    }    

    public void setPorcentagem(double d){
        porcentagem = d;
    }
    public double getPorcentagem(){
        return porcentagem = Double.parseDouble(txPorcentagem.getText().replace(",", "."));
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

    public void setCodigoProduto(String m){
        codigoProduto = m;
    }
    public String getCodigoProduto(){
        return codigoProduto;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        alAvisoErro = new javax.swing.JLabel();
        imagemProduto = new javax.swing.JLabel();
        txCaminho = new javax.swing.JTextField();
        btnPegaArquivo = new javax.swing.JButton();
        txBarras = new javax.swing.JTextField();
        txProduto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txObservacoes = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txQuantidade = new javax.swing.JFormattedTextField();
        txMinimo = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jcbDepartamento = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jcbFornecedor = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        txReferencia = new javax.swing.JTextField();
        aProduto = new javax.swing.JLabel();
        aEstoque = new javax.swing.JLabel();
        aValores = new javax.swing.JLabel();
        aFornecedor = new javax.swing.JLabel();
        aCategoria = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txVenda = new javax.swing.JFormattedTextField();
        txGanho = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txCusto = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        txPorcentagem = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jcbTamanho = new javax.swing.JComboBox();
        jcbCor = new javax.swing.JComboBox();
        jcbMaterial = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jcbTipoProduto = new javax.swing.JComboBox();
        aTipoProduto = new javax.swing.JLabel();
        btnBarras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Produtos");
        setMinimumSize(new java.awt.Dimension(680, 470));
        getContentPane().setLayout(null);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(470, 520, 90, 30);

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar);
        btnAlterar.setBounds(590, 520, 90, 30);

        alAvisoErro.setBackground(new java.awt.Color(255, 51, 51));
        alAvisoErro.setText("                           *Preencher Os campos Obrigatórios");
        alAvisoErro.setOpaque(true);
        getContentPane().add(alAvisoErro);
        alAvisoErro.setBounds(0, 520, 850, 30);

        imagemProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagemProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pkg_Imagens/semfoto.png"))); // NOI18N
        imagemProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        imagemProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imagemProduto.setMaximumSize(new java.awt.Dimension(100, 100));
        imagemProduto.setMinimumSize(new java.awt.Dimension(100, 100));
        imagemProduto.setPreferredSize(new java.awt.Dimension(100, 100));
        getContentPane().add(imagemProduto);
        imagemProduto.setBounds(20, 5, 260, 210);

        txCaminho.setEditable(false);
        getContentPane().add(txCaminho);
        txCaminho.setBounds(20, 220, 210, 34);

        btnPegaArquivo.setText("...");
        btnPegaArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPegaArquivoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPegaArquivo);
        btnPegaArquivo.setBounds(230, 220, 50, 34);
        getContentPane().add(txBarras);
        txBarras.setBounds(450, 30, 300, 30);

        txProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(txProduto);
        txProduto.setBounds(290, 90, 460, 30);

        jLabel1.setText("Observações Gerais:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 390, 150, 14);

        txCodigo.setEnabled(false);
        getContentPane().add(txCodigo);
        txCodigo.setBounds(290, 30, 110, 30);

        jLabel2.setText("Código:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 10, 110, 14);

        jLabel3.setText("Departamento:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 270, 150, 14);

        txObservacoes.setColumns(20);
        txObservacoes.setRows(5);
        jScrollPane1.setViewportView(txObservacoes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(300, 410, 450, 96);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Estoque"));
        jPanel2.setLayout(null);

        jLabel6.setText("Mínimo:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 20, 70, 30);

        jLabel9.setText("Quantidade:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 60, 70, 30);

        txQuantidade.setEditable(false);
        txQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jPanel2.add(txQuantidade);
        txQuantidade.setBounds(80, 60, 90, 30);

        txMinimo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jPanel2.add(txMinimo);
        txMinimo.setBounds(80, 20, 90, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(300, 270, 180, 110);

        jLabel10.setText("Código de Barras:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(450, 10, 140, 14);

        jLabel11.setText("Descrição do Produto:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(290, 70, 150, 14);

        jcbDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDepartamentoActionPerformed(evt);
            }
        });
        jcbDepartamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jcbDepartamentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jcbDepartamentoFocusLost(evt);
            }
        });
        getContentPane().add(jcbDepartamento);
        jcbDepartamento.setBounds(20, 290, 240, 30);

        jLabel5.setText("Fornecedor:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 330, 150, 14);

        jcbFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(jcbFornecedor);
        jcbFornecedor.setBounds(20, 350, 240, 30);

        jLabel12.setText("Referência do Produto:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(290, 120, 150, 20);

        txReferencia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(txReferencia);
        txReferencia.setBounds(290, 140, 460, 30);

        aProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pkg_Imagens/erro.png"))); // NOI18N
        getContentPane().add(aProduto);
        aProduto.setBounds(750, 90, 30, 30);

        aEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pkg_Imagens/erro.png"))); // NOI18N
        getContentPane().add(aEstoque);
        aEstoque.setBounds(480, 350, 30, 30);

        aValores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pkg_Imagens/erro.png"))); // NOI18N
        getContentPane().add(aValores);
        aValores.setBounds(750, 360, 30, 30);

        aFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pkg_Imagens/erro.png"))); // NOI18N
        getContentPane().add(aFornecedor);
        aFornecedor.setBounds(260, 350, 30, 30);

        aCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pkg_Imagens/erro.png"))); // NOI18N
        getContentPane().add(aCategoria);
        aCategoria.setBounds(260, 290, 30, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores"));
        jPanel1.setLayout(null);

        txVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        txVenda.setEnabled(false);
        jPanel1.add(txVenda);
        txVenda.setBounds(90, 100, 120, 30);

        txGanho.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        txGanho.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txGanhoFocusLost(evt);
            }
        });
        jPanel1.add(txGanho);
        txGanho.setBounds(90, 60, 50, 30);

        jLabel4.setText("Venda:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 100, 110, 30);

        jLabel7.setText("  Ganho R$:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 60, 90, 30);

        jLabel8.setText("Custo:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 20, 110, 30);

        txCusto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        txCusto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txCustoFocusLost(evt);
            }
        });
        jPanel1.add(txCusto);
        txCusto.setBounds(90, 20, 120, 30);

        jLabel13.setText("  %");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(140, 60, 30, 30);

        txPorcentagem.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        txPorcentagem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txPorcentagemFocusLost(evt);
            }
        });
        jPanel1.add(txPorcentagem);
        txPorcentagem.setBounds(160, 60, 50, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(520, 260, 230, 140);

        jLabel14.setText("Tamanho:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(520, 180, 90, 30);

        jLabel16.setText("Cor:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(300, 180, 80, 30);

        jLabel17.setText("Material:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(290, 220, 70, 30);

        jcbTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTamanhoActionPerformed(evt);
            }
        });
        getContentPane().add(jcbTamanho);
        jcbTamanho.setBounds(590, 180, 160, 30);

        jcbCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCorActionPerformed(evt);
            }
        });
        getContentPane().add(jcbCor);
        jcbCor.setBounds(340, 180, 160, 30);

        jcbMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMaterialActionPerformed(evt);
            }
        });
        getContentPane().add(jcbMaterial);
        jcbMaterial.setBounds(340, 220, 410, 30);

        jLabel15.setText("Tipo do Produto:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(20, 400, 150, 14);

        jcbTipoProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jcbTipoProdutoFocusLost(evt);
            }
        });
        getContentPane().add(jcbTipoProduto);
        jcbTipoProduto.setBounds(20, 420, 240, 30);

        aTipoProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pkg_Imagens/erro.png"))); // NOI18N
        getContentPane().add(aTipoProduto);
        aTipoProduto.setBounds(260, 420, 30, 30);

        btnBarras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pkg_Imagens/codigobarras.png"))); // NOI18N
        btnBarras.setToolTipText("Gerar Código de Barras");
        btnBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnBarras);
        btnBarras.setBounds(400, 30, 40, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        valida();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnPegaArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPegaArquivoActionPerformed

            //Criação do FileChooser  
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Importar imagem");
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
         //   int a = fileChooser.showSaveDialog(null);  

            if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                
 // ----------Início do Copia e Cola                
                
                try {  
                
                    String origem = String.valueOf(fileChooser.getSelectedFile().getPath());
                    boolean vf = origem.contains("\\src\\Fotos_Produtos\\");
                    System.out.println(origem);
                
                    //se a origem e o caminho do arquivo forem o mesmo ele não copia
                    if(vf==false){
                
                        String destinoSalva = System.getProperty("user.dir") + "/src/Fotos_Produtos/" + fileChooser.getSelectedFile().getName();

                        // Canal de Origem do arquivo  
                        FileChannel srcChannel = new FileInputStream(fileChooser.getSelectedFile().getPath()).getChannel();  

                        System.out.println("arquivo.getPath(): "+fileChooser.getSelectedFile().getPath());

                        // Canal de Destino do arquivo  
                        FileChannel dstChannel = new FileOutputStream(destinoSalva).getChannel();  

                        System.out.println("destinoSalva: " + destinoSalva);                
                        
                        // Copia arquivo da origem para seu destino  
                        dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
                        
                        // fecha canais  
                        srcChannel.close();  
                        dstChannel.close();  

                        // Se copiar e colar o arquivo insere dados no banco         
                        setFlagCopiaCola(0);
                    }
                    
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Erro ao operar a cópia do Arquivo para o lugar de destino");
//          Se não copiar e colar o arquivo insere dados no banco                     
                    setFlagCopiaCola(1);
                }

    // ------------  Fim do Copia e Cola                        

                //aqui voce pega o arquivo que o usuario selecionou e joga dentro de uma variavel do tipo ImageIcon
                ImageIcon icone = new ImageIcon(fileChooser.getSelectedFile().getPath());
                //o proximo passo é redimensionar a imagem:
                ImageIcon iconeRedimensionado = new ImageIcon(icone.getImage().getScaledInstance(260, 210, Image.SCALE_DEFAULT));
                //agora voce seta o iconeRedimensionado
                imagemProduto.setIcon(iconeRedimensionado);

                String localFoto = "/src/Fotos_Produtos/"+fileChooser.getSelectedFile().getName();
                txCaminho.setText(localFoto);

            }

    }//GEN-LAST:event_btnPegaArquivoActionPerformed

    private void jcbDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDepartamentoActionPerformed
        if(!getDepartamento().equals("")){

        String codigo;

        String texto = getDepartamento();

            int dois;  
            dois = texto.indexOf(" -");  
            codigo = texto.substring(0 , dois ); 

                    setCodDepartamento(codigo);


      }

    }//GEN-LAST:event_jcbDepartamentoActionPerformed

    private void jcbFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbFornecedorActionPerformed
     if(!getFornecedor().equals("")){

        String codigo;

        String texto = getFornecedor();

            int dois;  
            dois = texto.indexOf(" -");  
            codigo = texto.substring(0 , dois ); 

                    setCodFornecedor(codigo);

      } 

    }//GEN-LAST:event_jcbFornecedorActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        exclui();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txGanhoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txGanhoFocusLost
        calculaVendaValor();
    }//GEN-LAST:event_txGanhoFocusLost

    private void txCustoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txCustoFocusLost
        calculaVendaValor();
        calculaVendaPorcentagem();
    }//GEN-LAST:event_txCustoFocusLost

    private void txPorcentagemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txPorcentagemFocusLost
        calculaVendaPorcentagem();
    }//GEN-LAST:event_txPorcentagemFocusLost

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

            setCodTipoProduto(texto.substring(0 , dois ));

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

                       setCodigoProduto(cod);
                       
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

    private void jcbDepartamentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbDepartamentoFocusGained
        jcbTipoProduto.setEnabled(false);
    }//GEN-LAST:event_jcbDepartamentoFocusGained

    private void jcbDepartamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbDepartamentoFocusLost
        carregaTipoProduto(getCodDepartamento());
        jcbTipoProduto.setEnabled(true);
    }//GEN-LAST:event_jcbDepartamentoFocusLost

    private void btnBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarrasActionPerformed
        geraRelatorio();
    }//GEN-LAST:event_btnBarrasActionPerformed

    public void calculaVendaValor(){
        if(!txCusto.getText().equals("") && !txGanho.getText().equals("")){
            txVenda.setText(String.valueOf(getCusto() + getGanho()).replace(".", ","));
            txPorcentagem.setText(String.valueOf(getGanho() * 100 / getCusto()).replace(".", ","));
            setVenda(getCusto() + getGanho());
        }
    }

    public void calculaVendaPorcentagem(){
        if(!txCusto.getText().equals("") && !txPorcentagem.getText().equals("")){
            txVenda.setText(String.valueOf((getCusto() / 100 * getPorcentagem())+getCusto()).replace(".", ","));
            txGanho.setText(String.valueOf(getCusto() / 100 * getPorcentagem()).replace(".", ","));
            setVenda((getCusto() / 100 * getPorcentagem()) + getCusto());
        }
    }

    public void bancoAtualiza(){

        if(getCodTipoProduto() == null){
            String texto = getTipoProduto();

            int dois;
            dois = texto.indexOf(" -");

            setCodTipoProduto(texto.substring(0 , dois ));
        }

        String msg1 = "Produto Alterado com sucesso";
        String msg2 = "Produto Não Alterado";
        String sql  = "UPDATE tb_produtos SET" +
                      " prod_cod="+getProdCod()+"," +
                      " prod_codigo='"+getCodigo()+"'," +
                      " prod_barras='"+getBarras()+"'," +
                      " prod_produto='"+getProduto()+"'," +
                      " prod_observacoes='"+getObservacoes()+"'," +
                      " prod_caminhoimagem='"+getCaminho()+"'," +
                      " prod_referencia='"+getReferencia()+"'," +
                      " prod_tb_tamanho='"+getCodTamanho()+"'," +
                      " prod_tb_material='"+getCodMaterial()+"'," +
                      " prod_tb_cor='"+getCodCor()+"'," +
                      " prod_tb_departamento='"+getCodCategoria()+"'," +
                      " prod_tb_tipoproduto='"+getCodTipoProduto()+"'," +
                      " prod_tb_fornecedor='"+getCodFornecedor()+"'," +
                      " prod_minimo='"+getMinimo()+"'," +
                      " prod_quantidade='"+getQuantidade()+"'," +
                      " prod_custo='"+getCusto()+"'," +
                      " prod_ganho='"+getGanho()+"'," +
                      " prod_venda='"+getVenda()+"'" +
                      " WHERE prod_cod='"+getProdCod()+"'";

        BancoFuncoes bf = new BancoFuncoes();

            bf.salvar(sql, msg1, msg2);

        setVisible(false);
    }

    public void exclui(){
                    Object[] options = { "Sim", "Não" };
                        int opcao = JOptionPane.showOptionDialog(null, "Deseja Excluir Este Produto ?", "AVISO",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

                        if(opcao == 0){
                                    String msg1 = "Produto Excluído";
                                    String msg2 = "Erro Ao Excluir Produto";
                                    String sql = "delete from tb_produtos WHERE prod_cod='"+getProdCod()+"'";

                                    BancoFuncoes f = new BancoFuncoes();
                                    f.salvar(sql, msg1, msg2);

                                   JOptionPane.showMessageDialog(null, "Produto Excluído");
                                   setVisible(false);
                        }
    }

    public void carregaFornecedor(){
        String msg1 = "Fornecedores recuperados";
        String msg2 = "Erro ao Recuperar Fornecedores";
        String vsql = "SELECT concat( for_cod, ' - ', for_fornecedor)fornecedor FROM tb_fornecedores order by for_fornecedor";
        String campoSql = "fornecedor";

        bf.carregaDadoUnico(vsql, msg1, msg2, jcbFornecedor, campoSql);
    }

    public void carregaCategoria(){
        String msg1 = "Categoria recuperadas";
        String msg2 = "Erro ao Recuperar Categorias";
        String vsql = "SELECT concat( dep_cod, ' - ', dep_departamento)departamento FROM tb_departamento order by dep_departamento";
        String campoSql = "departamento";

        bf.carregaDadoUnico(vsql, msg1, msg2, jcbDepartamento, campoSql);
    }

    public void carregaCor(){
        String msg1 = "Cores recuperadas";
        String msg2 = "Erro ao Recuperar Cores";
        String vsql = "SELECT concat( cor_cod, ' - ', cor_cor)cor FROM tb_cor order by cor_cor";
        String campoSql = "cor";

        bf.carregaDadoUnico(vsql, msg1, msg2, jcbCor, campoSql);
    }

    public void carregaTamanho(){
        String msg1 = "Tamanhos recuperados";
        String msg2 = "Erro ao Recuperar Tamanhos";
        String vsql = "SELECT concat( tam_cod, ' - ', tam_tamanho)tamanho FROM tb_tamanho order by tam_tamanho";
        String campoSql = "tamanho";

        bf.carregaDadoUnico(vsql, msg1, msg2, jcbTamanho, campoSql);
    }

    public void carregaMaterial(){
        String msg1 = "Materiais recuperados";
        String msg2 = "Erro ao Recuperar Materiais";
        String vsql = "SELECT concat( mat_cod, ' - ', mat_material)material FROM tb_material order by mat_material";
        String campoSql = "material";

        bf.carregaDadoUnico(vsql, msg1, msg2, jcbMaterial, campoSql);
    }
    
    public void carregaTipoProduto(){
        String msg1 = "Tipo dos produtos recuperados";
        String msg2 = "Erro ao Recuperar Tipo dos Produtos";
        String vsql = "SELECT concat( tipprod_cod, ' - ', tipprod_tipoproduto)tipoproduto FROM tb_tipoproduto order by tipprod_tipoproduto";
        String campoSql = "tipoproduto";

        bf.carregaDadoUnico(vsql, msg1, msg2, jcbTipoProduto, campoSql);
    }
    
    public void carregaTipoProduto(String cod){
        String msg1 = "Tipo dos Produtos recuperados";
        String msg2 = "Erro ao Recuperar tipo dos produtos";
        String vsql = "SELECT concat( tipprod_cod, ' - ', tipprod_tipoproduto)tipoproduto FROM tb_tipoproduto WHERE tipprod_tb_departamento = '"+cod+"' order by tipprod_tipoproduto";
        String campoSql = "tipoproduto";

        bf.carregaDadoUnico(vsql, msg1, msg2, jcbTipoProduto, campoSql);
    }

    public void valida(){
        if(txCaminho.getText().equals("")){
            txCaminho.setText("/src/FotosProdutos/quadrado branco.jpg");
        }
        if(txBarras.getText().equals("")){
            txBarras.setText("S/ NUMERO");
        }
        
        if(jcbFornecedor.getSelectedItem().equals("")){
            aFornecedor.setVisible(true);
        }else{
            aFornecedor.setVisible(false);
        }
        
        if(jcbDepartamento.getSelectedItem().equals("")){
            aCategoria.setVisible(true);
        }else{
            aCategoria.setVisible(false);
        }
        
        if(txProduto.getText().equals("")){
            aProduto.setVisible(true);
        }else{
            aProduto.setVisible(false);
        }
        
        if(txMinimo.getText().equals("") || txQuantidade.getText().equals("")){
            aEstoque.setVisible(true);
        }else{
            aEstoque.setVisible(false);
        }
        
        if(txCusto.getText().equals("") || txGanho.getText().equals("")){
            aValores.setVisible(true);
        }else{
            aValores.setVisible(false);
        }
        
        if(aCategoria.isVisible() || aFornecedor.isVisible() || aProduto.isVisible() ||
        aEstoque.isVisible() || aValores.isVisible()){
        
         alAvisoErro.setVisible(true);
     
        }
        if(!aCategoria.isVisible() && !aFornecedor.isVisible() && !aProduto.isVisible() &&
        !aEstoque.isVisible() && !aValores.isVisible()){
            calculaVendaPorcentagem();
            calculaVendaValor();
            alAvisoErro.setVisible(false);
            bancoAtualiza();
        }
        
    }

    public void geraRelatorio(){

            String msg1="Ficha de Fornecedor gerada";
            String msg2="Erro ao Gerar Ficha de Fornecedor";
            String sql = "SELECT prod_codigo, prod_produto, tipprod_tipoproduto\n" +
                         "FROM tb_produtos \n" +
                         "INNER JOIN tb_fornecedores ON prod_tb_fornecedor = for_cod \n" +
                         "INNER JOIN tb_departamento ON prod_tb_departamento = dep_cod \n" +
                         "INNER JOIN tb_cor ON prod_tb_cor = cor_cod \n" +
                         "INNER JOIN tb_tamanho ON prod_tb_tamanho = tam_cod \n" +
                         "INNER JOIN tb_material ON prod_tb_material = mat_cod \n" +
                         "INNER JOIN tb_tipoproduto ON prod_tb_tipoproduto = tipprod_cod\n" +
                         "WHERE prod_cod = '"+getProdCod()+"' ";

            String localRelatorio = System.getProperty("user.dir", "") + "/src/Pkg_Relatorios/CodigoBarra.jasper";

            BancoFuncoes bf = new BancoFuncoes();
            bf.relatorio(sql, localRelatorio, msg1, msg2);
            
            
    }
    
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
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
            java.util.logging.Logger.getLogger(CadastrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                AlterarProduto dialog = new AlterarProduto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel aCategoria;
    public javax.swing.JLabel aEstoque;
    public javax.swing.JLabel aFornecedor;
    public javax.swing.JLabel aProduto;
    private javax.swing.JLabel aTipoProduto;
    public javax.swing.JLabel aValores;
    public javax.swing.JLabel alAvisoErro;
    public javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBarras;
    public javax.swing.JButton btnExcluir;
    public javax.swing.JButton btnPegaArquivo;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JLabel imagemProduto;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JComboBox jcbCor;
    public javax.swing.JComboBox jcbDepartamento;
    public javax.swing.JComboBox jcbFornecedor;
    public javax.swing.JComboBox jcbMaterial;
    public javax.swing.JComboBox jcbTamanho;
    public javax.swing.JComboBox jcbTipoProduto;
    public javax.swing.JTextField txBarras;
    public javax.swing.JTextField txCaminho;
    public javax.swing.JTextField txCodigo;
    public javax.swing.JFormattedTextField txCusto;
    public javax.swing.JFormattedTextField txGanho;
    public javax.swing.JFormattedTextField txMinimo;
    public javax.swing.JTextArea txObservacoes;
    public javax.swing.JFormattedTextField txPorcentagem;
    public javax.swing.JTextField txProduto;
    public javax.swing.JFormattedTextField txQuantidade;
    public javax.swing.JTextField txReferencia;
    public javax.swing.JFormattedTextField txVenda;
    // End of variables declaration//GEN-END:variables

    
}
