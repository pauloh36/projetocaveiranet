package Pkg_Telas.Financeiro;

import Pkg_banco.BancoFuncoes;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DemonstrativoVenda extends javax.swing.JDialog {

    public DemonstrativoVenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

         setSize(750, 333);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogLegenda = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbCliente = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbValor = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaPagamento = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        dialogLegenda.getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(242, 145, 145));
        jLabel1.setOpaque(true);
        dialogLegenda.getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 100, 40, 30);

        jLabel3.setBackground(new java.awt.Color(175, 209, 209));
        jLabel3.setOpaque(true);
        dialogLegenda.getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 50, 40, 30);

        jLabel6.setText("Valor À Receber :");
        dialogLegenda.getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 100, 90, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Legenda");
        dialogLegenda.getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 0, 80, 30);

        jLabel8.setText("Valor Recebido :");
        dialogLegenda.getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 50, 90, 30);

        getContentPane().setLayout(null);

        lbCliente.setText("   -");
        getContentPane().add(lbCliente);
        lbCliente.setBounds(110, 10, 330, 30);

        jLabel4.setText("Cliente:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 10, 90, 30);

        jLabel5.setText("Valor da Venda:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 40, 90, 30);

        lbValor.setText("   -");
        getContentPane().add(lbValor);
        lbValor.setBounds(110, 40, 330, 30);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos"));
        jPanel2.setLayout(null);

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "cod", "Produto", "Quantidade", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaProdutos);
        tabelaProdutos.getColumnModel().getColumn(0).setMinWidth(0);
        tabelaProdutos.getColumnModel().getColumn(0).setPreferredWidth(0);
        tabelaProdutos.getColumnModel().getColumn(0).setMaxWidth(0);
        tabelaProdutos.getColumnModel().getColumn(2).setMinWidth(70);
        tabelaProdutos.getColumnModel().getColumn(2).setPreferredWidth(70);
        tabelaProdutos.getColumnModel().getColumn(2).setMaxWidth(70);
        tabelaProdutos.getColumnModel().getColumn(3).setMinWidth(100);
        tabelaProdutos.getColumnModel().getColumn(3).setPreferredWidth(100);
        tabelaProdutos.getColumnModel().getColumn(3).setMaxWidth(100);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 450, 170);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 90, 470, 200);

        jLabel2.setText("Data da Venda:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(520, 0, 90, 30);

        lbData.setText("    -");
        getContentPane().add(lbData);
        lbData.setBounds(610, 0, 90, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pagamento"));
        jPanel1.setLayout(null);

        tabelaPagamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "pag", "Tipo", "Valor", "#"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaPagamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPagamentoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaPagamento);
        tabelaPagamento.getColumnModel().getColumn(0).setMinWidth(0);
        tabelaPagamento.getColumnModel().getColumn(0).setPreferredWidth(0);
        tabelaPagamento.getColumnModel().getColumn(0).setMaxWidth(0);
        tabelaPagamento.getColumnModel().getColumn(1).setMinWidth(0);
        tabelaPagamento.getColumnModel().getColumn(1).setPreferredWidth(0);
        tabelaPagamento.getColumnModel().getColumn(1).setMaxWidth(0);
        tabelaPagamento.getColumnModel().getColumn(3).setMinWidth(80);
        tabelaPagamento.getColumnModel().getColumn(3).setPreferredWidth(80);
        tabelaPagamento.getColumnModel().getColumn(3).setMaxWidth(80);
        tabelaPagamento.getColumnModel().getColumn(4).setMinWidth(28);
        tabelaPagamento.getColumnModel().getColumn(4).setPreferredWidth(28);
        tabelaPagamento.getColumnModel().getColumn(4).setMaxWidth(28);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 20, 210, 210);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(490, 50, 230, 240);

        jButton1.setText("Imprimir Cupon");
        jButton1.setEnabled(false);
        getContentPane().add(jButton1);
        jButton1.setBounds(553, 300, 110, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaPagamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPagamentoMouseClicked
        tabelaPagamento.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e){

                     if(e.getClickCount() == 2){
                         
                       int    col = tabelaPagamento.getSelectedColumn();
                       int    lin = tabelaPagamento.getSelectedRow();
                    String result =(String) tabelaPagamento.getValueAt(lin, 4);

                    dialogLegenda.setSize(190,180);
                    dialogLegenda.setLocation(100, 150);
                    dialogLegenda.setVisible(true);
                    dialogLegenda.setAlwaysOnTop(true);
                     }                    

                }   
          });
    }//GEN-LAST:event_tabelaPagamentoMouseClicked

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
            java.util.logging.Logger.getLogger(DemonstrativoVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DemonstrativoVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DemonstrativoVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DemonstrativoVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DemonstrativoVenda dialog = new DemonstrativoVenda(new javax.swing.JFrame(), true);
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
    private javax.swing.JDialog dialogLegenda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel lbCliente;
    public javax.swing.JLabel lbData;
    public javax.swing.JLabel lbValor;
    public javax.swing.JTable tabelaPagamento;
    public javax.swing.JTable tabelaProdutos;
    // End of variables declaration//GEN-END:variables
}