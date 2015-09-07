package Pkg_Telas.Estoque;

import Pkg_Telas.Produtos.*;
import Pkg_Telas.Clientes.*;
import Pkg_banco.BancoFuncoes;
import java.awt.Image;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class AlteraEstoque extends javax.swing.JDialog {

        String caminho, codigo, barras, produto, referencia, prodCod;
        int flagCopiaCola = 0, minimo, quantidade, qntAnterior, totalEntrada;

            BancoFuncoes bf = new BancoFuncoes();

    public AlteraEstoque(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        alAvisoErro.setVisible(false);

        aEstoque.setVisible(false);

        setSize(796, 298);
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
        return quantidade = Integer.parseInt(txNovaEntrada.getText());
    }

    public void setProdCod(String d){
        prodCod = d;
    }
    public String getProdCod(){
        return prodCod;
    }

    public void setQntAnterior(int d){
        qntAnterior = d;
    }
    public int getQntAnterior(){
        return qntAnterior;
    }

    public void setTotalEntrada(int d){
        totalEntrada = d;
    }
    public int getTotalEntrada(){
        return totalEntrada;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnSalvar = new javax.swing.JButton();
        imagemProduto = new javax.swing.JLabel();
        txCaminho = new javax.swing.JTextField();
        txBarras = new javax.swing.JTextField();
        txProduto = new javax.swing.JTextField();
        txCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txNovaEntrada = new javax.swing.JFormattedTextField();
        txMinimo = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txReferencia = new javax.swing.JTextField();
        aEstoque = new javax.swing.JLabel();
        alAvisoErro = new javax.swing.JLabel();
        lbAnterior = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Estoque");
        setMinimumSize(new java.awt.Dimension(796, 350));
        getContentPane().setLayout(null);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(680, 220, 90, 30);

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
        txCaminho.setBounds(20, 220, 260, 34);

        txBarras.setEditable(false);
        getContentPane().add(txBarras);
        txBarras.setBounds(460, 30, 290, 30);

        txProduto.setEditable(false);
        txProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(txProduto);
        txProduto.setBounds(290, 90, 460, 30);

        txCodigo.setEditable(false);
        getContentPane().add(txCodigo);
        txCodigo.setBounds(290, 30, 130, 30);

        jLabel2.setText("Código:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 10, 110, 14);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Estoque"));
        jPanel2.setLayout(null);

        jLabel9.setText("Nova Entrada:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 60, 120, 30);

        txNovaEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txNovaEntrada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txNovaEntradaFocusLost(evt);
            }
        });
        jPanel2.add(txNovaEntrada);
        txNovaEntrada.setBounds(90, 60, 90, 30);

        txMinimo.setEditable(false);
        txMinimo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jPanel2.add(txMinimo);
        txMinimo.setBounds(90, 20, 90, 30);

        jLabel7.setText("Mínimo:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 20, 70, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(290, 180, 190, 110);

        jLabel10.setText("Código de Barras:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(460, 10, 150, 14);

        jLabel11.setText("Descrição do Produto:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(290, 70, 150, 14);

        jLabel12.setText("Referência do Produto:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(290, 120, 150, 20);

        txReferencia.setEditable(false);
        txReferencia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(txReferencia);
        txReferencia.setBounds(290, 140, 460, 30);

        aEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pkg_Imagens/erro.png"))); // NOI18N
        getContentPane().add(aEstoque);
        aEstoque.setBounds(490, 200, 20, 30);

        alAvisoErro.setBackground(new java.awt.Color(255, 51, 51));
        alAvisoErro.setText("                           *Preencher Os campos Obrigatórios");
        alAvisoErro.setOpaque(true);
        getContentPane().add(alAvisoErro);
        alAvisoErro.setBounds(-10, 270, 830, 30);

        lbAnterior.setText("-");
        getContentPane().add(lbAnterior);
        lbAnterior.setBounds(490, 240, 180, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        valida();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txNovaEntradaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txNovaEntradaFocusLost
        setTotalEntrada(getQuantidade() + getQntAnterior());
        System.out.println("Total da nova entrada: " +getTotalEntrada());
    }//GEN-LAST:event_txNovaEntradaFocusLost

    public void bancoAtualiza(){

        String msg1 = "Estoque atualizado com sucesso";
        String msg2 = "Estoque Não Atualizadoo";
        String sql  = "UPDATE tb_produtos SET" +
                      " prod_minimo='"+getMinimo()+"'," +
                      " prod_quantidade='"+getTotalEntrada()+"'" +
                      " WHERE prod_cod='"+getProdCod()+"'";
        BancoFuncoes bf = new BancoFuncoes();
        bf.salvar(sql, msg1, msg2);

        setVisible(false);
    }

    public void valida(){

        if(txCaminho.getText().equals("")){
            txCaminho.setText("/src/FotosProdutos/quadrado branco.jpg");
        }
        if(txBarras.getText().equals("")){
            txBarras.setText("S/ NUMERO");
        }

        if(txMinimo.getText().equals("") || txNovaEntrada.getText().equals("")){
            aEstoque.setVisible(true);
        }else{
            aEstoque.setVisible(false);
        }

        if(aEstoque.isVisible()){
            alAvisoErro.setVisible(true);
        }
        if(!aEstoque.isVisible()){
            alAvisoErro.setVisible(false);
            bancoAtualiza();
        }

    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AlteraEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlteraEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlteraEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlteraEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                AlteraEstoque dialog = new AlteraEstoque(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel aEstoque;
    private javax.swing.JLabel alAvisoErro;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JLabel imagemProduto;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lbAnterior;
    public javax.swing.JTextField txBarras;
    public javax.swing.JTextField txCaminho;
    public javax.swing.JTextField txCodigo;
    public javax.swing.JFormattedTextField txMinimo;
    public javax.swing.JFormattedTextField txNovaEntrada;
    public javax.swing.JTextField txProduto;
    public javax.swing.JTextField txReferencia;
    // End of variables declaration//GEN-END:variables
}