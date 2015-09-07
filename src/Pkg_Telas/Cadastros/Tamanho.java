package Pkg_Telas.Cadastros;

import Pkg_banco.BancoFuncoes;
import Pkg_Utilitarios.TamanhoTextField;
import java.awt.event.KeyEvent;

public class Tamanho extends javax.swing.JFrame {

    String tamanho;

        BancoFuncoes bf = new BancoFuncoes();
                
    public Tamanho() {
        initComponents();
        
        recupera();
        
        aAvisoErro.setVisible(false);
        txTamanho.setDocument(new TamanhoTextField(0));
    }

    public void setTamanho(String m){
        tamanho = m;
    }
    public String getTamanho(){
        return tamanho = txTamanho.getText().toUpperCase();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        internalCadastraTamanho = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnIncluir = new javax.swing.JButton();
        txTamanho = new javax.swing.JTextField();
        aAvisoErro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        internalCadastraTamanho.setClosable(true);
        internalCadastraTamanho.setIconifiable(true);
        internalCadastraTamanho.setTitle("Cadastra Tamanhos");
        internalCadastraTamanho.setEnabled(false);
        internalCadastraTamanho.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Pkg_Imagens/tamanho.png"))); // NOI18N
        internalCadastraTamanho.setVisible(true);

        jPanel3.setLayout(null);

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Cadastrar Tamanho");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(110, 10, 200, 30);

        tabela.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "cod", "Tamanhos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
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
        jScrollPane3.setBounds(40, 140, 260, 191);

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
        jPanel3.add(txTamanho);
        txTamanho.setBounds(20, 70, 200, 30);

        aAvisoErro.setBackground(new java.awt.Color(255, 102, 102));
        aAvisoErro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        aAvisoErro.setText("        ...");
        aAvisoErro.setOpaque(true);
        jPanel3.add(aAvisoErro);
        aAvisoErro.setBounds(-10, 110, 450, 20);

        javax.swing.GroupLayout internalCadastraTamanhoLayout = new javax.swing.GroupLayout(internalCadastraTamanho.getContentPane());
        internalCadastraTamanho.getContentPane().setLayout(internalCadastraTamanhoLayout);
        internalCadastraTamanhoLayout.setHorizontalGroup(
            internalCadastraTamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        internalCadastraTamanhoLayout.setVerticalGroup(
            internalCadastraTamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(internalCadastraTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(internalCadastraTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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

    public void bancoSalva(){
        String msg1 = "Tamanho Cadastrad com sucesso";
        String msg2 = "Tamanho Não Cadastrado";
        String sql = "INSERT INTO tb_tamanho VALUES (null, '"+getTamanho()+"')";
          bf.salvar(sql, msg1, msg2);
    }

    public void recupera(){
        String sql  = "SELECT * "+
                      "FROM tb_tamanho order by tam_tamanho";
        String msg1 = "Tamanho Recuperado com sucesso";
        String msg2 = "Tamanho Não recuperado";
        bf.tabelaCadastros(sql,"tam_cod","tam_tamanho","tb_tamanho", msg1, msg2, tabela);
    }

    public void valida(){
// Vê se ambos os campos estão vazios...
        if(txTamanho.getText().equals("")){
             aAvisoErro.setVisible(true);
             aAvisoErro.setText("     * Preencha o campo");
        }else{
            aAvisoErro.setVisible(false);
        }
        if(!aAvisoErro.isVisible()){
            bancoSalva();
            recupera();
            txTamanho.setText("");
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
            java.util.logging.Logger.getLogger(Tamanho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tamanho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tamanho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tamanho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Tamanho().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aAvisoErro;
    private javax.swing.JButton btnIncluir;
    public javax.swing.JInternalFrame internalCadastraTamanho;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTable tabela;
    private javax.swing.JTextField txTamanho;
    // End of variables declaration//GEN-END:variables
}
