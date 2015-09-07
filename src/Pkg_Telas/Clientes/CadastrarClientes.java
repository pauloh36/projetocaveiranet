package Pkg_Telas.Clientes;

import Pkg_banco.BancoFuncoes;

public class CadastrarClientes extends javax.swing.JDialog {
    
     private      int flagValida=0;
     private   String pessoa, fornecedor, cnpj, cpf, nomeFantasia, inscEstadual;
     private   String cep, endereco, telefone, telefone2, celular, email, webSite;
     private   String numero, cidade, bairro, estado, contato;

    public CadastrarClientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        lbCPF.setVisible(false);
        lbnomeFornecedor.setVisible(false);
        txCPF.setVisible(false);
        
        alFornecedor.setVisible(false);
        alAvisoErro.setVisible(false);
        
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
        alAvisoErro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Clientes");
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

        lbnomeFornecedor.setText("Nome Cliente:");
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
        radJuridico.setBounds(20, 30, 93, 25);

        buttonGroup1.add(radFisico);
        radFisico.setText("Fisico");
        radFisico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radFisicoActionPerformed(evt);
            }
        });
        getContentPane().add(radFisico);
        radFisico.setBounds(20, 60, 90, 25);
        getContentPane().add(txNumero);
        txNumero.setBounds(290, 140, 50, 30);

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

        btnSalvar.setText("Salvar");
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
        alFornecedor.setBounds(460, 40, 20, 16);

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
            bancoSalvaFisico();
        }
        if(radJuridico.isSelected()){
            bancoSalvaJuridico();
        }
    }
    }//GEN-LAST:event_btnSalvarActionPerformed

    public void bancoSalvaFisico(){
        String msg1 = "Clientes Cadastrado com sucesso";
        String msg2 = "Clientes Não Cadastrado";
        String sql = "INSERT INTO tb_clientes" +
                     " VALUES  (null, '"+getFornecedor()+"', ' ', "+
                     "'"+getCPF()+"', ' ', ' ', "+
                     "'"+getEndereco()+"', '"+getNumero()+"', '"+getCep()+"', "+
                     "'"+getEstado()+"', '"+getBairro()+"', "+
                     "'"+getCidade()+"', '"+getWebSite()+"', "+
                     "'"+getContato()+"', '"+getEmail()+"', '"+getTelefone()+"', "+
                     "'"+getTelefone2()+"', '"+getCelular()+"', 'FISICO')";
        BancoFuncoes f = new BancoFuncoes();
        f.salvar(sql, msg1, msg2);
        System.out.println(sql);
        setVisible(false);
    }
    
    public void bancoSalvaJuridico(){
        String msg1 = "Clientes Cadastrado com sucesso";
        String msg2 = "Clientes Não Cadastrado";
        String sql = "INSERT INTO tb_clientes" +
                     " VALUES  (null, '"+getFornecedor()+"', '"+getCNPJ()+"', "+
                     "' ', '"+getNomeFantasia()+"', '"+getInscEstadual()+"', "+
                     "'"+getEndereco()+"', '"+getNumero()+"', '"+getCep()+"', "+
                     "'"+getEstado()+"', '"+getBairro()+"', "+
                     "'"+getCidade()+"', '"+getWebSite()+"', "+
                     "'"+getContato()+"', '"+getEmail()+"', '"+getTelefone()+"', "+
                     "'"+getTelefone2()+"', '"+getCelular()+"', 'JURIDICO')";
        BancoFuncoes f = new BancoFuncoes();
        f.salvar(sql, msg1, msg2);
        System.out.println(sql);
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
        if(alFornecedor.
                isVisible()){
            alAvisoErro.setVisible(true);
            setFlagValida(1);
        }else{
            alAvisoErro.setVisible(false);
            setFlagValida(0);
        }
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
                CadastrarClientes dialog = new CadastrarClientes(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel alAvisoErro;
    private javax.swing.JLabel alFornecedor;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JComboBox jcbUf;
    private javax.swing.JLabel lbCNPJ;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbNomeFantasia;
    private javax.swing.JLabel lbRazaoSocial;
    private javax.swing.JLabel lbinscEstadual;
    private javax.swing.JLabel lbnomeFornecedor;
    private javax.swing.JRadioButton radFisico;
    private javax.swing.JRadioButton radJuridico;
    private javax.swing.JTextField txBairro;
    private javax.swing.JFormattedTextField txCNPJ;
    private javax.swing.JFormattedTextField txCPF;
    private javax.swing.JTextField txCelular;
    public javax.swing.JFormattedTextField txCep;
    private javax.swing.JTextField txCidade;
    private javax.swing.JTextField txContato;
    private javax.swing.JTextField txEmail;
    private javax.swing.JTextField txEndereco;
    private javax.swing.JTextField txFornecedor;
    private javax.swing.JTextField txInscEstadual;
    private javax.swing.JTextField txNomeFantasia;
    private javax.swing.JTextField txNumero;
    private javax.swing.JTextField txTelefone;
    private javax.swing.JTextField txTelefone2;
    private javax.swing.JTextField txWebSite;
    // End of variables declaration//GEN-END:variables
}
