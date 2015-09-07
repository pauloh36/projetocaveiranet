package Pkg_Telas.Cadastros;

import Pkg_banco.BancoFuncoes;
import Pkg_Utilitarios.TamanhoTextField;
import java.awt.event.KeyEvent;

public class TipoProduto extends javax.swing.JFrame {

    String tipoProduto, codDepartamento, departamento;

        BancoFuncoes bf = new BancoFuncoes();
                
    public TipoProduto() {
        initComponents();
        
        recupera();
        carregaDepartamento();
        
        aAvisoErro.setVisible(false);
        txTipoProduto.setDocument(new TamanhoTextField(0));
    }

    public void setTipoProduto(String m){
        tipoProduto = m;
    }
    public String getTipoProduto(){
        return tipoProduto = txTipoProduto.getText().toUpperCase();
    }
    
    public void setCodDepartamento(String m){
        codDepartamento = m;
    }
    public String getCodDepartamento(){
        return codDepartamento;
    }    
    
    public void setDepartamento(String m){
        departamento = m;
    }
    public String getDepartamento(){
        return departamento =(String) jcbDepartamento.getSelectedItem();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        internalCadastraTipoProduto = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnIncluir = new javax.swing.JButton();
        txTipoProduto = new javax.swing.JTextField();
        aAvisoErro = new javax.swing.JLabel();
        jcbDepartamento = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        internalCadastraTipoProduto.setClosable(true);
        internalCadastraTipoProduto.setIconifiable(true);
        internalCadastraTipoProduto.setTitle("Cadastra Tipo do Produto");
        internalCadastraTipoProduto.setEnabled(false);
        internalCadastraTipoProduto.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Pkg_Imagens/tipodeproduto.png"))); // NOI18N
        internalCadastraTipoProduto.setVisible(true);

        jPanel3.setLayout(null);

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Cadastrar Tipo do Produto");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(60, 10, 230, 30);

        tabela.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "cod", "Tipo do Produto", "Departamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setColumnSelectionAllowed(true);
        jScrollPane3.setViewportView(tabela);
        tabela.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tabela.getColumnModel().getColumn(0).setMinWidth(0);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(0);
        tabela.getColumnModel().getColumn(0).setMaxWidth(0);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(40, 190, 260, 191);

        btnIncluir.setText("Incluir");
        btnIncluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncluirMouseClicked(evt);
            }
        });
        btnIncluir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnIncluirKeyPressed(evt);
            }
        });
        jPanel3.add(btnIncluir);
        btnIncluir.setBounds(241, 70, 90, 30);
        jPanel3.add(txTipoProduto);
        txTipoProduto.setBounds(20, 70, 200, 30);

        aAvisoErro.setBackground(new java.awt.Color(255, 102, 102));
        aAvisoErro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        aAvisoErro.setText("        ...");
        aAvisoErro.setOpaque(true);
        jPanel3.add(aAvisoErro);
        aAvisoErro.setBounds(-10, 160, 450, 20);

        jcbDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDepartamentoActionPerformed(evt);
            }
        });
        jPanel3.add(jcbDepartamento);
        jcbDepartamento.setBounds(120, 120, 240, 30);

        jLabel14.setText("Tipo do Produto:");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(20, 120, 90, 30);

        javax.swing.GroupLayout internalCadastraTipoProdutoLayout = new javax.swing.GroupLayout(internalCadastraTipoProduto.getContentPane());
        internalCadastraTipoProduto.getContentPane().setLayout(internalCadastraTipoProdutoLayout);
        internalCadastraTipoProdutoLayout.setHorizontalGroup(
            internalCadastraTipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
        );
        internalCadastraTipoProdutoLayout.setVerticalGroup(
            internalCadastraTipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(internalCadastraTipoProduto);
        internalCadastraTipoProduto.setBounds(0, 0, 385, 431);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btnIncluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncluirMouseClicked
    valida();
}//GEN-LAST:event_btnIncluirMouseClicked

private void btnIncluirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIncluirKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
              valida();
        }
}//GEN-LAST:event_btnIncluirKeyPressed

    private void jcbDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDepartamentoActionPerformed
      if(!getDepartamento().equals("")){

        String codigo;

        String texto = getDepartamento();

            int dois;  
            dois = texto.indexOf(" -");  
            codigo = texto.substring(0 , dois ); 

                    setCodDepartamento(codigo);
                    
                    System.out.println("imprimindo aqui...."+codigo);
                    System.out.println("imprimindo aqui...."+getCodDepartamento());

      } 
    }//GEN-LAST:event_jcbDepartamentoActionPerformed

    public void bancoSalva(){
        String msg1 = "Tipo do Produto Cadastrado com sucesso";
        String msg2 = "Tipo do Produto Não Cadastrado";
        String sql = "INSERT INTO tb_tipoproduto VALUES (null, '"+getTipoProduto()+"', "+getCodDepartamento()+")";
          bf.salvar(sql, msg1, msg2);
    }

    public void recupera(){
        String sql  = "SELECT * FROM tb_tipoproduto " +
                      "INNER JOIN tb_departamento ON dep_cod = tipprod_tb_departamento";
        String msg1 = "Tipo do Produto recuperado com sucesso";
        String msg2 = "Tipo do Produto Não recuperado";
        bf.tabelaTipoProduto(sql, "tipprod_cod", "tipprod_tipoproduto", "dep_departamento", "tb_tipoproduto", msg1, msg2, tabela);
    }

    public void carregaDepartamento(){
        String msg1 = "Categoria recuperadas";
        String msg2 = "Erro ao Recuperar Categorias";
        String vsql = "SELECT concat( dep_cod, ' - ', dep_departamento)departamento FROM tb_departamento order by dep_cod";
        String campoSql = "departamento";

        bf.carregaDadoUnico(vsql, msg1, msg2, jcbDepartamento, campoSql);
    }

    public void valida(){
// Vê se ambos os campos estão vazios...
        if(txTipoProduto.getText().equals("") && getDepartamento().equals("")){
             aAvisoErro.setVisible(true);
             aAvisoErro.setText("     *   Preencha os campos");
        }else{
            aAvisoErro.setVisible(false);
        }
        if(!aAvisoErro.isVisible()){
            bancoSalva();
            recupera();
            txTipoProduto.setText("");
            jcbDepartamento.setSelectedItem("");
        }
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
            java.util.logging.Logger.getLogger(TipoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TipoProduto().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aAvisoErro;
    private javax.swing.JButton btnIncluir;
    public javax.swing.JInternalFrame internalCadastraTipoProduto;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JComboBox jcbDepartamento;
    public javax.swing.JTable tabela;
    private javax.swing.JTextField txTipoProduto;
    // End of variables declaration//GEN-END:variables
}
