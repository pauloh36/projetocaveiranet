package Pkg_Telas.Fornecedores;

import Pkg_banco.BancoFuncoes;
import javax.swing.JOptionPane;

public class AlterarFornecedores extends javax.swing.JDialog {
    
     private      int flagValida=0;
                  
     private   String pessoa, fornecedor, cnpj, cpf, nomeFantasia, inscEstadual;
     private   String cep, endereco, telefone, telefone2, celular, email, webSite;
     private   String numero, cidade, bairro, estado, contato, forCod;

     
    public AlterarFornecedores(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        lbCPF.setVisible(false);
        lbnomeFornecedor.setVisible(false);
        txCPF.setVisible(false);
        
        alFornecedor.setVisible(false);
        alAvisoErro.setVisible(false);
        
    }


    
    public void setForCod(String n){
        forCod = n;
    }
    public String getForCod(){
        return forCod;
    }

    public void setFlagValida(int n){
        flagValida = n;
    }
    public int getFlagValida(){
        return flagValida;
    }
    
    public void setPessoa(String n){
        pessoa = n;
    }
    public String getPessoa(){
        return pessoa;
    }
    
    public void setFornecedor(String n){
        fornecedor = n;
    }
    public String getFornecedor(){
        return fornecedor = txFornecedor.getText().toUpperCase();
    }
    
    public void setNomeFantasia(String n){
        nomeFantasia = n;
    }
    public String getNomeFantasia(){
        return nomeFantasia = txNomeFantasia.getText().toUpperCase();
    }
    
    public void setEndereco(String n){
        endereco = n;
    }
    public String getEndereco(){
        return endereco = txEndereco.getText().toUpperCase();
    }
    
    public void setNumero(String n){
        numero = n;
    }
    public String getNumero(){
        return numero = txNumero.getText().toUpperCase();
    }
    
    public void setCNPJ(String n){
        cnpj = n;
    }
    public String getCNPJ(){
        return cnpj = txCNPJ.getText();
    }
    
    public void setEstado(String n){
        estado = n;
    }
    public String getEstado(){
        return estado =(String) jcbUf.getSelectedItem();
    }
    
    public void setCidade(String n){
        cidade = n;
    }
    public String getCidade(){
        return cidade = txCidade.getText().toUpperCase();
    }
    
    public void setBairro(String n){
        bairro = n;
    }
    public String getBairro(){
        return bairro = txBairro.getText().toUpperCase();
    }
    
    public void setCep(String n){
        cep = n;
    }
    public String getCep(){
        return cep = txCep.getText().toUpperCase();
    }
    
    public void setContato(String n){
        contato = n;
    }
    public String getContato(){
        return contato = txContato.getText().toUpperCase();
    }
    
    public void setTelefone(String n){
        telefone = n;
    }
    public String getTelefone(){
      return telefone = txTelefone.getText();
    }  
    
    public void setTelefone2(String n){
        telefone2 = n;
    }
    public String getTelefone2(){
      return telefone2 = txTelefone2.getText();
    }  
    
    public void setCelular(String n){
        celular = n;
    }
    public String getCelular(){
        return celular = txCelular.getText().toUpperCase();
    }
    
    public void setEmail(String n){
        email = n;
    }
    public String getEmail(){
        return email = txEmail.getText().toUpperCase();
    }
    
    public void setWebSite(String n){
        webSite = n;
    }
    public String getWebSite(){
        return webSite = txWebSite.getText().toUpperCase();
    }
    
    public void setCPF(String n){
        cpf = n;
    }
    public String getCPF(){
        return cpf = txCPF.getText().toUpperCase();
    }
    
    public void setInscEstadual(String n){
        inscEstadual = n;
    }
    public String getInscEstadual(){
        return inscEstadual = txInscEstadual.getText().toUpperCase();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        lbRazaoSocial = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbinscEstadual = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbNomeFantasia = new javax.swing.JLabel();
        lbnomeFornecedor = new javax.swing.JLabel();
        lbCNPJ = new javax.swing.JLabel();
        lbCPF = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        radJuridico = new javax.swing.JRadioButton();
        radFisico = new javax.swing.JRadioButton();
        txNumero = new javax.swing.JTextField();
        btnImprimir = new javax.swing.JButton();
        txCNPJ = new javax.swing.JFormattedTextField();
        txCPF = new javax.swing.JFormattedTextField();
        txFornecedor = new javax.swing.JTextField();
        txInscEstadual = new javax.swing.JTextField();
        txCelular = new javax.swing.JTextField();
        jcbUf = new javax.swing.JComboBox();
        txCep = new javax.swing.JFormattedTextField();
        txWebSite = new javax.swing.JTextField();
        txCidade = new javax.swing.JTextField();
        txEndereco = new javax.swing.JTextField();
        txEmail = new javax.swing.JTextField();
        txContato = new javax.swing.JTextField();
        txBairro = new javax.swing.JTextField();
        txTelefone = new javax.swing.JTextField();
        txTelefone2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        txNomeFantasia = new javax.swing.JTextField();
        alFornecedor = new javax.swing.JLabel();
        btnExclui = new javax.swing.JButton();
        alAvisoErro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Anterar Fornecedores");
        setMinimumSize(new java.awt.Dimension(680, 470));
        getContentPane().setLayout(null);

        jLabel1.setText("Web Site:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 220, 130, 20);

        lbRazaoSocial.setText("Razão Social:");
        getContentPane().add(lbRazaoSocial);
        lbRazaoSocial.setBounds(130, 10, 130, 20);

        jLabel3.setText("Celular:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(340, 320, 60, 20);

        jLabel5.setText("Bairro:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(260, 170, 70, 20);

        jLabel6.setText("C.E.P.:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(370, 120, 130, 20);

        jLabel8.setText("Endereço:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 120, 130, 20);

        jLabel7.setText("Cidade:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(100, 170, 130, 20);

        lbinscEstadual.setText("Inscr. Estadual:");
        getContentPane().add(lbinscEstadual);
        lbinscEstadual.setBounds(490, 60, 130, 20);

        jLabel10.setText("Telefone:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 320, 130, 20);

        jLabel11.setText("E-mail:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(300, 270, 70, 20);

        lbNomeFantasia.setText("Nome Fantasia:");
        getContentPane().add(lbNomeFantasia);
        lbNomeFantasia.setBounds(130, 60, 130, 20);

        lbnomeFornecedor.setText("Nome Fornecedor:");
        getContentPane().add(lbnomeFornecedor);
        lbnomeFornecedor.setBounds(130, 10, 130, 20);

        lbCNPJ.setText("C.N.P.J.:");
        getContentPane().add(lbCNPJ);
        lbCNPJ.setBounds(490, 10, 130, 20);

        lbCPF.setText("C.P.F.:");
        getContentPane().add(lbCPF);
        lbCPF.setBounds(490, 10, 130, 20);

        jLabel18.setText("Contato:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(20, 270, 80, 20);

        jLabel19.setText("Número:");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(290, 120, 100, 20);

        jLabel20.setText("Estado:");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(20, 170, 70, 20);

        buttonGroup1.add(radJuridico);
        radJuridico.setSelected(true);
        radJuridico.setText("Jurídico");
        radJuridico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radJuridicoActionPerformed(evt);
            }
        });
        getContentPane().add(radJuridico);
        radJuridico.setBounds(20, 30, 93, 23);

        buttonGroup1.add(radFisico);
        radFisico.setText("Fisico");
        radFisico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radFisicoActionPerformed(evt);
            }
        });
        getContentPane().add(radFisico);
        radFisico.setBounds(20, 60, 90, 23);
        getContentPane().add(txNumero);
        txNumero.setBounds(290, 140, 50, 30);

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btnImprimir);
        btnImprimir.setBounds(330, 380, 90, 30);

        try {
            txCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txCNPJ);
        txCNPJ.setBounds(490, 30, 120, 30);

        try {
            txCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txCPF);
        txCPF.setBounds(490, 30, 120, 30);
        getContentPane().add(txFornecedor);
        txFornecedor.setBounds(130, 30, 330, 30);
        getContentPane().add(txInscEstadual);
        txInscEstadual.setBounds(490, 80, 120, 30);
        getContentPane().add(txCelular);
        txCelular.setBounds(340, 340, 130, 30);

        jcbUf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RR", "RO", "RJ", "RN", "RS", "SC", "SP", "SE", "TO" }));
        getContentPane().add(jcbUf);
        jcbUf.setBounds(20, 190, 50, 30);

        try {
            txCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txCep);
        txCep.setBounds(370, 140, 110, 30);
        getContentPane().add(txWebSite);
        txWebSite.setBounds(20, 240, 320, 30);
        getContentPane().add(txCidade);
        txCidade.setBounds(100, 190, 130, 30);
        getContentPane().add(txEndereco);
        txEndereco.setBounds(20, 140, 250, 30);
        getContentPane().add(txEmail);
        txEmail.setBounds(300, 290, 250, 30);
        getContentPane().add(txContato);
        txContato.setBounds(20, 290, 250, 30);
        getContentPane().add(txBairro);
        txBairro.setBounds(260, 190, 130, 30);
        getContentPane().add(txTelefone);
        txTelefone.setBounds(20, 340, 130, 30);
        getContentPane().add(txTelefone2);
        txTelefone2.setBounds(180, 340, 130, 30);

        jLabel12.setText("Telefone 2:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(180, 320, 60, 20);

        btnSalvar.setText("Alterar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(560, 380, 90, 30);
        getContentPane().add(txNomeFantasia);
        txNomeFantasia.setBounds(130, 80, 330, 30);

        alFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pkg_Imagens/erro.png"))); // NOI18N
        getContentPane().add(alFornecedor);
        alFornecedor.setBounds(460, 40, 20, 20);

        btnExclui.setText("Excluir");
        btnExclui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluiActionPerformed(evt);
            }
        });
        getContentPane().add(btnExclui);
        btnExclui.setBounds(450, 380, 80, 30);

        alAvisoErro.setBackground(new java.awt.Color(255, 51, 51));
        alAvisoErro.setText("                           *Preencher Os campos Obrigatórios");
        alAvisoErro.setOpaque(true);
        getContentPane().add(alAvisoErro);
        alAvisoErro.setBounds(-10, 380, 730, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radFisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radFisicoActionPerformed
     
        lbCNPJ.setVisible(false);
        lbNomeFantasia.setVisible(false);
        lbinscEstadual.setVisible(false);
        lbRazaoSocial.setVisible(false);
        
        txCNPJ.setVisible(false);
        txNomeFantasia.setVisible(false);
        txInscEstadual.setVisible(false);
        
        lbCPF.setVisible(true);
        lbnomeFornecedor.setVisible(true);
        txCPF.setVisible(true);
        
        if(radFisico.isSelected()){
            setPessoa("FISICO");
        }
        
    }//GEN-LAST:event_radFisicoActionPerformed

    private void radJuridicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radJuridicoActionPerformed
       
        lbCPF.setVisible(false);
        lbnomeFornecedor.setVisible(false);
        txCPF.setVisible(false);
        
        lbCNPJ.setVisible(true);
        lbNomeFantasia.setVisible(true);
        lbinscEstadual.setVisible(true);
        lbRazaoSocial.setVisible(true);
        
        txCNPJ.setVisible(true);
        txNomeFantasia.setVisible(true);
        txInscEstadual.setVisible(true);
        
        if(radFisico.isSelected()){
            setPessoa("JURIDICO");
        }
        
    }//GEN-LAST:event_radJuridicoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
    valida();
//-----    Se componentes estão invisiveis salva no banco--------------------------
    if(getFlagValida()==0){
        if(radFisico.isSelected()){
            bancoAtualizaFisico();
            setVisible(false);
        }
        if(radJuridico.isSelected()){
            bancoAtualizaJuridico();
            setVisible(false);
        }
    }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluiActionPerformed
        exclui();
        setVisible(false);
    }//GEN-LAST:event_btnExcluiActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        geraRelatorio();
    }//GEN-LAST:event_btnImprimirActionPerformed

    public void exclui(){
                    Object[] options = { "Sim", "Não" };
                        int opcao = JOptionPane.showOptionDialog(null, "Deseja Excluir Fornecedor ?", "AVISO",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

                        if(opcao == 0){
                                    String msg1 = "Fornecedor Excluido";
                                    String msg2 = "Erro Ao Excluir Fornecedor";
                                    String sql = "delete from tb_fornecedores WHERE for_cod='"+getForCod()+"'";

                                    BancoFuncoes f = new BancoFuncoes();
                                    f.salvar(sql, msg1, msg2);

                                   JOptionPane.showMessageDialog(null, "Fornecedor Excluído");
                        }
    }

    public void bancoAtualizaFisico(){

        String msg1 = "Fornecedor Alterado com sucesso";
        String msg2 = "Fornecedor Não Alterado";
        String sql  = "UPDATE tb_Fornecedores SET" +
                      " for_cod="+getForCod()+"," +
                      " for_fornecedor='"+getFornecedor()+"'," +
                      " for_cnpj=' '," +
                      " for_cpf='"+getCPF()+"'," +
                      " for_nomefantasia=' '," +
                      " for_inscestadual=' '," +
                      " for_endereco='"+getEndereco()+"'," +
                      " for_numero='"+getNumero()+"'," +
                      " for_cep='"+getCep()+"'," +
                      " for_estado='"+getEstado()+"'," +
                      " for_bairro='"+getBairro()+"'," +
                      " for_cidade='"+getCidade()+"'," +
                      " for_website='"+getWebSite()+"'," +
                      " for_contato='"+getContato()+"'," +
                      " for_email='"+getEmail()+"'," +
                      " for_telefone='"+getTelefone()+"'," +
                      " for_telefone2='"+getTelefone2()+"'," +
                      " for_celular='"+getCelular()+"'," +
                      " for_pessoa='FISICO'" +
                      " WHERE for_cod='"+getForCod()+"'";
        BancoFuncoes bf = new BancoFuncoes();
        bf.salvar(sql, msg1, msg2);

        setVisible(false);
    }

    public void bancoAtualizaJuridico(){

        String msg1 = "Fornecedor Alterado com sucesso";
        String msg2 = "Fornecedor Não Alterado";
        String sql  = "UPDATE tb_Fornecedores SET" +
                      " for_cod="+getForCod()+"," +
                      " for_fornecedor='"+getFornecedor()+"'," +
                      " for_cnpj='"+getCNPJ()+"'," +
                      " for_cpf=' '," +
                      " for_nomefantasia='"+getNomeFantasia()+"'," +
                      " for_inscestadual='"+getInscEstadual()+"'," +
                      " for_endereco='"+getEndereco()+"'," +
                      " for_numero='"+getNumero()+"'," +
                      " for_cep='"+getCep()+"'," +
                      " for_estado='"+getEstado()+"'," +
                      " for_bairro='"+getBairro()+"'," +
                      " for_cidade='"+getCidade()+"'," +
                      " for_website='"+getWebSite()+"'," +
                      " for_contato='"+getContato()+"'," +
                      " for_email='"+getEmail()+"'," +
                      " for_telefone='"+getTelefone()+"'," +
                      " for_telefone2='"+getTelefone2()+"'," +
                      " for_celular='"+getCelular()+"'," +
                      " for_pessoa='JURIDICO'" +
                      " WHERE for_cod='"+getForCod()+"'";
        BancoFuncoes bf = new BancoFuncoes();
        bf.salvar(sql, msg1, msg2);
        
        setVisible(false);
    }
   
    public void valida(){

        if(getFornecedor().equals("")){
            alFornecedor.setVisible(true);
        }
        else{
            alFornecedor.setVisible(false);
        }

//usa isVisible() para saber se o objeto está visivel-------------------------------
//-------se estiver invisivel altera FLAG ------------
        if(alFornecedor.isVisible()){
            alAvisoErro.setVisible(true);
            setFlagValida(1);        
        }else{
            alAvisoErro.setVisible(false);
            setFlagValida(0);
        }
    }
    
    public void geraRelatorio(){

            String msg1="Ficha de Fornecedor gerada";
            String msg2="Erro ao Gerar Ficha de Fornecedor";
            String sql = "SELECT " +
                         "tb_fornecedores.`for_cod` AS tb_fornecedores_for_cod, "+
                         "tb_fornecedores.`for_fornecedor` AS tb_fornecedores_for_fornecedor, "+
                         "tb_fornecedores.`for_cnpj` AS tb_fornecedores_for_cnpj, "+
                         "tb_fornecedores.`for_cpf` AS tb_fornecedores_for_cpf, "+
                         "tb_fornecedores.`for_nomefantasia` AS tb_fornecedores_for_nomefantasia, "+
                         "tb_fornecedores.`for_inscestadual` AS tb_fornecedores_for_inscestadual, "+
                         "tb_fornecedores.`for_endereco` AS tb_fornecedores_for_endereco, "+
                         "tb_fornecedores.`for_numero` AS tb_fornecedores_for_numero, "+
                         "tb_fornecedores.`for_cep` AS tb_fornecedores_for_cep, "+
                         "tb_fornecedores.`for_bairro` AS tb_fornecedores_for_bairro, "+
                         "tb_fornecedores.`for_cidade` AS tb_fornecedores_for_cidade, "+
                         "tb_fornecedores.`for_estado` AS tb_fornecedores_for_estado, "+
                         "tb_fornecedores.`for_website` AS tb_fornecedores_for_website, "+
                         "tb_fornecedores.`for_contato` AS tb_fornecedores_for_contato, "+
                         "tb_fornecedores.`for_email` AS tb_fornecedores_for_email, "+
                         "tb_fornecedores.`for_telefone` AS tb_fornecedores_for_telefone, "+
                         "tb_fornecedores.`for_telefone2` AS tb_fornecedores_for_telefone2, "+
                         "tb_fornecedores.`for_celular` AS tb_fornecedores_for_celular, "+
                         "tb_fornecedores.`for_pessoa` AS tb_fornecedores_for_pessoa, "+
                         "tb_fornecedores.`for_comissao` AS tb_fornecedores_for_comissao "+
                         "FROM "+
                         "`tb_fornecedores` tb_fornecedores "+
                         "Where for_cod = '"+getForCod()+"'";
        
            String localRelatorio = System.getProperty("user.dir", "") + "/src/Relatorios/fichaFornecedor.jasper";
        
            BancoFuncoes bf = new BancoFuncoes();
            bf.relatorio(sql, localRelatorio, msg1, msg2);
            
            setVisible(false);
            
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
            java.util.logging.Logger.getLogger(AlterarFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                AlterarFornecedores dialog = new AlterarFornecedores(new javax.swing.JFrame(), true);
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
    public javax.swing.JLabel alAvisoErro;
    public javax.swing.JLabel alFornecedor;
    private javax.swing.JButton btnExclui;
    private javax.swing.JButton btnImprimir;
    public javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JComboBox jcbUf;
    public javax.swing.JLabel lbCNPJ;
    public javax.swing.JLabel lbCPF;
    public javax.swing.JLabel lbNomeFantasia;
    public javax.swing.JLabel lbRazaoSocial;
    public javax.swing.JLabel lbinscEstadual;
    public javax.swing.JLabel lbnomeFornecedor;
    public javax.swing.JRadioButton radFisico;
    public javax.swing.JRadioButton radJuridico;
    public javax.swing.JTextField txBairro;
    public javax.swing.JFormattedTextField txCNPJ;
    public javax.swing.JFormattedTextField txCPF;
    public javax.swing.JTextField txCelular;
    public javax.swing.JFormattedTextField txCep;
    public javax.swing.JTextField txCidade;
    public javax.swing.JTextField txContato;
    public javax.swing.JTextField txEmail;
    public javax.swing.JTextField txEndereco;
    public javax.swing.JTextField txFornecedor;
    public javax.swing.JTextField txInscEstadual;
    public javax.swing.JTextField txNomeFantasia;
    public javax.swing.JTextField txNumero;
    public javax.swing.JTextField txTelefone;
    public javax.swing.JTextField txTelefone2;
    public javax.swing.JTextField txWebSite;
    // End of variables declaration//GEN-END:variables
}
