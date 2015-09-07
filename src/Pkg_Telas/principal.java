
package Pkg_Telas;

import Pkg_Telas.Cadastros.Cor;
import Pkg_Telas.Cadastros.Departamento;
import Pkg_Telas.Cadastros.Material;
import Pkg_Telas.Cadastros.Tamanho;
import Pkg_Telas.Cadastros.TipoProduto;
import Pkg_Telas.Caixa.FrenteCaixa;
import Pkg_Telas.Clientes.Clientes;
import Pkg_Telas.Estoque.Estoque;
import Pkg_Telas.Financeiro.AReceber;
import Pkg_Telas.Financeiro.Recebidos;
import Pkg_Telas.Financeiro.Vendas;
import Pkg_Telas.Fornecedores.Fornecedores;
import Pkg_Telas.Produtos.Produtos;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.skin.CremeCoffeeSkin;
import org.pushingpixels.substance.api.skin.CremeSkin;
import org.pushingpixels.substance.api.skin.MarinerSkin;
import org.pushingpixels.substance.api.skin.OfficeBlack2007Skin;
import org.pushingpixels.substance.api.skin.SubstanceBusinessLookAndFeel;

public class principal extends javax.swing.JFrame {

           JInternalFrame intClientes; 
           JInternalFrame intProdutos;
           JInternalFrame intFornecedores;
           JInternalFrame intDepartamento;
           JInternalFrame intFrenteCaixa;
           JInternalFrame intEstoque;
           JInternalFrame intVendas;
           JInternalFrame intRecebidos;
           JInternalFrame intAReceber;
           JInternalFrame intTipoProduto;
           JInternalFrame intCor;
           JInternalFrame intTamanho;
           JInternalFrame intMaterial;

    public principal() {
        initComponents();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        ItemClientes = new javax.swing.JMenuItem();
        ItemFornecedor = new javax.swing.JMenuItem();
        ItemProdutos = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        ItemTipoProduto = new javax.swing.JMenuItem();
        ItemCategoria = new javax.swing.JMenuItem();
        ItemCor = new javax.swing.JMenuItem();
        ItemTamanhos = new javax.swing.JMenuItem();
        ItemMateriais = new javax.swing.JMenuItem();
        menuCaixa = new javax.swing.JMenu();
        ItemFrenteCaixa = new javax.swing.JMenuItem();
        menuFinanceiro = new javax.swing.JMenu();
        ItemVenda = new javax.swing.JMenuItem();
        ItemRecebidos = new javax.swing.JMenuItem();
        ItemAReceber = new javax.swing.JMenuItem();
        menuEstoque = new javax.swing.JMenu();
        ItemControleEstoque = new javax.swing.JMenuItem();
        menuSistema = new javax.swing.JMenu();
        ItemFecharSistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("P D V");

        desktop.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pkg_Imagens/LogoCaveiraNet.png"))); // NOI18N
        desktop.add(jLabel1);
        jLabel1.setBounds(30, 10, 452, 380);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        desktop.add(jLayeredPane1);
        jLayeredPane1.setBounds(610, 80, 100, 100);

        jMenuBar1.setPreferredSize(new java.awt.Dimension(168, 31));

        menuCadastros.setText("    Cadastros     ");
        menuCadastros.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        menuCadastros.setPreferredSize(new java.awt.Dimension(115, 19));

        ItemClientes.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        ItemClientes.setText("    Clientes  ");
        ItemClientes.setPreferredSize(new java.awt.Dimension(161, 35));
        ItemClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ItemClientesMousePressed(evt);
            }
        });
        ItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemClientesActionPerformed(evt);
            }
        });
        menuCadastros.add(ItemClientes);

        ItemFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        ItemFornecedor.setText("    Fornecedores  ");
        ItemFornecedor.setPreferredSize(new java.awt.Dimension(161, 35));
        ItemFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ItemFornecedorMousePressed(evt);
            }
        });
        menuCadastros.add(ItemFornecedor);

        ItemProdutos.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        ItemProdutos.setText("    Produtos  ");
        ItemProdutos.setPreferredSize(new java.awt.Dimension(161, 35));
        ItemProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ItemProdutosMousePressed(evt);
            }
        });
        menuCadastros.add(ItemProdutos);

        jMenu1.setText("    Utilitários  ");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(133, 35));

        ItemTipoProduto.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        ItemTipoProduto.setText("    Tipo do Produto  ");
        ItemTipoProduto.setPreferredSize(new java.awt.Dimension(161, 35));
        ItemTipoProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ItemTipoProdutoMousePressed(evt);
            }
        });
        jMenu1.add(ItemTipoProduto);

        ItemCategoria.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        ItemCategoria.setText("    Departamento  ");
        ItemCategoria.setPreferredSize(new java.awt.Dimension(161, 35));
        ItemCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ItemCategoriaMousePressed(evt);
            }
        });
        jMenu1.add(ItemCategoria);

        ItemCor.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        ItemCor.setText("    Cores  ");
        ItemCor.setPreferredSize(new java.awt.Dimension(161, 35));
        ItemCor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ItemCorMousePressed(evt);
            }
        });
        jMenu1.add(ItemCor);

        ItemTamanhos.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        ItemTamanhos.setText("    Tamanhos  ");
        ItemTamanhos.setPreferredSize(new java.awt.Dimension(161, 35));
        ItemTamanhos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ItemTamanhosMousePressed(evt);
            }
        });
        jMenu1.add(ItemTamanhos);

        ItemMateriais.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        ItemMateriais.setText("    Materiais  ");
        ItemMateriais.setPreferredSize(new java.awt.Dimension(161, 35));
        ItemMateriais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ItemMateriaisMousePressed(evt);
            }
        });
        jMenu1.add(ItemMateriais);

        menuCadastros.add(jMenu1);

        jMenuBar1.add(menuCadastros);

        menuCaixa.setText("       Caixa ");
        menuCaixa.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        menuCaixa.setPreferredSize(new java.awt.Dimension(115, 19));

        ItemFrenteCaixa.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        ItemFrenteCaixa.setText("Frente de Caixa");
        ItemFrenteCaixa.setPreferredSize(new java.awt.Dimension(161, 35));
        ItemFrenteCaixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ItemFrenteCaixaMousePressed(evt);
            }
        });
        menuCaixa.add(ItemFrenteCaixa);

        jMenuBar1.add(menuCaixa);

        menuFinanceiro.setText("   Financeiro ");
        menuFinanceiro.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        menuFinanceiro.setPreferredSize(new java.awt.Dimension(115, 19));

        ItemVenda.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        ItemVenda.setText("    Vendas  ");
        ItemVenda.setPreferredSize(new java.awt.Dimension(161, 35));
        ItemVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ItemVendaMousePressed(evt);
            }
        });
        menuFinanceiro.add(ItemVenda);

        ItemRecebidos.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        ItemRecebidos.setText("    Recebidos  ");
        ItemRecebidos.setPreferredSize(new java.awt.Dimension(161, 35));
        ItemRecebidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ItemRecebidosMousePressed(evt);
            }
        });
        menuFinanceiro.add(ItemRecebidos);

        ItemAReceber.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        ItemAReceber.setText("    À Receber  ");
        ItemAReceber.setPreferredSize(new java.awt.Dimension(161, 35));
        ItemAReceber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ItemAReceberMousePressed(evt);
            }
        });
        menuFinanceiro.add(ItemAReceber);

        jMenuBar1.add(menuFinanceiro);

        menuEstoque.setText("     Estoque ");
        menuEstoque.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        menuEstoque.setPreferredSize(new java.awt.Dimension(115, 19));

        ItemControleEstoque.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        ItemControleEstoque.setText("    Controle  ");
        ItemControleEstoque.setPreferredSize(new java.awt.Dimension(161, 35));
        ItemControleEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ItemControleEstoqueMousePressed(evt);
            }
        });
        menuEstoque.add(ItemControleEstoque);

        jMenuBar1.add(menuEstoque);

        menuSistema.setText("     Sistema ");
        menuSistema.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        menuSistema.setPreferredSize(new java.awt.Dimension(115, 19));

        ItemFecharSistema.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        ItemFecharSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pkg_Imagens/botaoDesligar.png"))); // NOI18N
        ItemFecharSistema.setText("Fechar Sistema");
        ItemFecharSistema.setPreferredSize(new java.awt.Dimension(161, 35));
        ItemFecharSistema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ItemFecharSistemaMousePressed(evt);
            }
        });
        menuSistema.add(ItemFecharSistema);

        jMenuBar1.add(menuSistema);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItemClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemClientesMousePressed
         if(intClientes == null || intClientes.isClosed()){
             intClientes = new Clientes().internalClientes;
             getContentPane().add(intClientes);
             desktop.add(intClientes);
             intClientes.setLocation(130, 15);
             intClientes.moveToFront();
        }
    }//GEN-LAST:event_ItemClientesMousePressed

    private void ItemProdutosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemProdutosMousePressed
         if(intProdutos == null || intProdutos.isClosed()){
             intProdutos = new Produtos().internalProdutos;
             getContentPane().add(intProdutos);
             desktop.add(intProdutos);
             intProdutos.setLocation(150, 15);
             intProdutos.moveToFront();
        }
    }//GEN-LAST:event_ItemProdutosMousePressed

    private void ItemFornecedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemFornecedorMousePressed
         if(intFornecedores == null || intFornecedores.isClosed()){
             intFornecedores = new Fornecedores().internalFornecedores;
             getContentPane().add(intFornecedores);
             desktop.add(intFornecedores);
             intFornecedores.setLocation(160, 15);
             intFornecedores.moveToFront();
        }
    }//GEN-LAST:event_ItemFornecedorMousePressed

    private void ItemCategoriaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemCategoriaMousePressed
         if(intDepartamento == null || intDepartamento.isClosed()){
             intDepartamento = new Departamento().internalCadastraDepartamento;
             getContentPane().add(intDepartamento);
             desktop.add(intDepartamento);
             intDepartamento.setLocation(160, 15);
             intDepartamento.moveToFront();
        }
    }//GEN-LAST:event_ItemCategoriaMousePressed

    private void ItemFrenteCaixaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemFrenteCaixaMousePressed
         if(intFrenteCaixa == null || intFrenteCaixa.isClosed()){
             intFrenteCaixa = new FrenteCaixa().internalFrenteCaixa;
             getContentPane().add(intFrenteCaixa);
             desktop.add(intFrenteCaixa);
             intFrenteCaixa.setLocation(100, 10);
             intFrenteCaixa.moveToFront();
        }
    }//GEN-LAST:event_ItemFrenteCaixaMousePressed

    private void ItemFecharSistemaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemFecharSistemaMousePressed
     //implementavel
        if(intFrenteCaixa == null || intFrenteCaixa.isClosed()){

            Object[] options = { "Sim", "Não" };
            int opcao = JOptionPane.showOptionDialog(null,"Deseja fechar o sistema ?", "AVISO",
            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

               if(opcao == 0){

                   System.exit(0);
               }
        }else{
            JOptionPane pane = new JOptionPane("O programa não pode ser fechado enquanto o 'Frente de Caixa' estiver aberto\n\n"+
                                                 "Feche o 'Frente de caixa' para poder fechar o programa");  
            JDialog dialog = pane.createDialog("Aviso");  
            dialog.setAlwaysOnTop(true);
            dialog.show();
        }
            
    }//GEN-LAST:event_ItemFecharSistemaMousePressed

    private void ItemControleEstoqueMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemControleEstoqueMousePressed
         if(intEstoque == null || intEstoque.isClosed()){
             intEstoque = new Estoque().internalEstoque;
             getContentPane().add(intEstoque);
             desktop.add(intEstoque);
             intEstoque.setLocation(100, 10);
             intEstoque.moveToFront();
        }
    }//GEN-LAST:event_ItemControleEstoqueMousePressed

    private void ItemRecebidosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemRecebidosMousePressed
        if(intRecebidos == null || intRecebidos.isClosed()){
             intRecebidos = new Recebidos().internalRecebidos;
             getContentPane().add(intRecebidos);
             desktop.add(intRecebidos);
             intRecebidos.setLocation(100, 10);
             intRecebidos.moveToFront();
        }
    }//GEN-LAST:event_ItemRecebidosMousePressed

    private void ItemAReceberMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemAReceberMousePressed
         if(intAReceber == null || intAReceber.isClosed()){
             intAReceber = new AReceber().internalAReceber;
             getContentPane().add(intAReceber);
             desktop.add(intAReceber);
             intAReceber.setLocation(100, 10);
             intAReceber.moveToFront();
        }
    }//GEN-LAST:event_ItemAReceberMousePressed

    private void ItemVendaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemVendaMousePressed
        if(intVendas == null || intVendas.isClosed()){
             intVendas = new Vendas().internalVendas;
             getContentPane().add(intVendas);
             desktop.add(intVendas);
             intVendas.setLocation(100, 10);
             intVendas.moveToFront();
        }
    }//GEN-LAST:event_ItemVendaMousePressed

    private void ItemTipoProdutoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemTipoProdutoMousePressed
        if(intTipoProduto == null || intTipoProduto.isClosed()){
             intTipoProduto = new TipoProduto().internalCadastraTipoProduto;
             getContentPane().add(intTipoProduto);
             desktop.add(intTipoProduto);
             intTipoProduto.setLocation(100, 10);
             intTipoProduto.moveToFront();
        }
    }//GEN-LAST:event_ItemTipoProdutoMousePressed

    private void ItemCorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemCorMousePressed
        if(intCor == null || intCor.isClosed()){
             intCor = new Cor().internalCadastraCores;
             getContentPane().add(intCor);
             desktop.add(intCor);
             intCor.setLocation(100, 10);
             intCor.moveToFront();
        }
    }//GEN-LAST:event_ItemCorMousePressed

    private void ItemTamanhosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemTamanhosMousePressed
        if(intTamanho == null || intTamanho.isClosed()){
             intTamanho = new Tamanho().internalCadastraTamanho;
             getContentPane().add(intTamanho);
             desktop.add(intTamanho);
             intTamanho.setLocation(100, 10);
             intTamanho.moveToFront();
        }
    }//GEN-LAST:event_ItemTamanhosMousePressed

    private void ItemMateriaisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemMateriaisMousePressed
        if(intMaterial == null || intMaterial.isClosed()){
             intMaterial = new Material().internalCadastraMaterial;
             getContentPane().add(intMaterial);
             desktop.add(intMaterial);
             intMaterial.setLocation(100, 10);
             intMaterial.moveToFront();
        }
    }//GEN-LAST:event_ItemMateriaisMousePressed

    private void ItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemClientesActionPerformed

    public static void main(String args[]) {
        
             java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                        UIManager.setLookAndFeel(new SubstanceBusinessLookAndFeel());
                 //--------------------------------------------------↓ escolher o visual--------------
                                SubstanceLookAndFeel.setSkin(new MarinerSkin());
                              
                    }catch (UnsupportedLookAndFeelException ex) {
                        Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                new principal().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemAReceber;
    private javax.swing.JMenuItem ItemCategoria;
    private javax.swing.JMenuItem ItemClientes;
    private javax.swing.JMenuItem ItemControleEstoque;
    private javax.swing.JMenuItem ItemCor;
    private javax.swing.JMenuItem ItemFecharSistema;
    private javax.swing.JMenuItem ItemFornecedor;
    private javax.swing.JMenuItem ItemFrenteCaixa;
    private javax.swing.JMenuItem ItemMateriais;
    private javax.swing.JMenuItem ItemProdutos;
    private javax.swing.JMenuItem ItemRecebidos;
    private javax.swing.JMenuItem ItemTamanhos;
    private javax.swing.JMenuItem ItemTipoProduto;
    private javax.swing.JMenuItem ItemVenda;
    public javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenu menuCaixa;
    private javax.swing.JMenu menuEstoque;
    private javax.swing.JMenu menuFinanceiro;
    private javax.swing.JMenu menuSistema;
    // End of variables declaration//GEN-END:variables
}
