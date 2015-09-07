package Pkg_banco;

import Pkg_Telas.Clientes.AlterarClientes;
import Pkg_Telas.Estoque.AlteraEstoque;
import Pkg_Telas.Estoque.pintaTabelaEstoque;
import Pkg_Telas.Financeiro.DemonstrativoVenda;
import Pkg_Telas.Financeiro.Recebidos;
import Pkg_Telas.Financeiro.pintaDemonstrativoVenda;
import Pkg_Telas.Fornecedores.AlterarFornecedores;
import Pkg_Telas.Produtos.AlterarProduto;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.*;
import javax.swing.table.TableColumn;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class BancoFuncoes {

    String somaRecebidos, somaAReceber;
    
    BancoFuncoes banco;
    
    conectaBanco cb = new conectaBanco();

    public void setSomaRecebidos(String d){
        somaRecebidos = d;
    }
    public String getSomaRecebidos(){
        return somaRecebidos;
    }

    public void setSomaAReceber(String n){
        somaAReceber = n;
    }
    public String getSomaAReceber(){
        return somaAReceber;
    }

//-------------------------------------------------Função Universal---------------------------------------------

    public BancoFuncoes
           salvar(String sql, String msg1, String msg2){

          com.mysql.jdbc.Connection connection = null;

   try {
        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (com.mysql.jdbc.Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        com.mysql.jdbc.Statement s = (com.mysql.jdbc.Statement) connection.createStatement();

        s.execute(sql);

        System.out.println("Conectado ao banco com sucesso");

         s.close();
         connection.close();

//         JOptionPane.showMessageDialog(null, msg1);
         System.out.println(sql);

         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }
  }

    public BancoFuncoes
           carregaDadoUnico(String vsql, String msg1, String msg2, final JComboBox caixaTexto, String campoSql){

            Connection connection = null;

       try {
            Class.forName(cb.JDBC_DRIVER()).newInstance();
            connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

            Statement s = (Statement) connection.createStatement();

              ResultSet rs = s.executeQuery(vsql);

                   caixaTexto.removeAllItems();

                   caixaTexto.addItem("");

                while (rs.next()){
                    caixaTexto.addItem(rs.getString(campoSql));
                   }

            System.out.println("Conectado ao banco com sucesso");

             s.close();
             connection.close();

             System.out.println(msg1);
             System.out.println(vsql);
             return banco;

       }catch(SQLException ex){
          JOptionPane.showMessageDialog(null, msg2);
          System.out.println("SQLException: " + ex.getMessage());
          System.out.println("SQLState: " + ex.getSQLState());
          System.out.println("Error: " + ex.getErrorCode());
          System.out.println(vsql);
          return null;
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, msg2);
          System.out.println(vsql);
          System.out.println("Dados não filtrados" + e);
          return null;
        }

   }

//--------------------------------------------Fim Função Universal-----------------------------------------------


//-----------------------------------Relatórios----------------------------------

     public BancoFuncoes
           relatorio(String vsql, String localRelatorio, String msg1, String msg2){

                   Connection connection = null;

      try
      {

            Class.forName(cb.JDBC_DRIVER()).newInstance();
            connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());
            Statement s = (Statement) connection.createStatement();

    //       InputStream relatorio = getClass().getResourceAsStream(localRelatorio);

           JRResultSetDataSource jrRS = new JRResultSetDataSource(s.executeQuery(vsql));

           JasperPrint jasperPrint = JasperFillManager.fillReport(localRelatorio, new HashMap(), jrRS);

           JasperViewer.viewReport(jasperPrint, false);

           
           
     //       JasperExportManager.exportReportToPdfFile(jasperPrint, "D:/Meus documentos/NetBeansProjects/arquivo.pdf");
     //       Runtime.getRuntime().exec("cmd /c start D:/Meus documentos/NetBeansProjects/arquivo.pdf");

     //       File file = new File("D:/Meus documentos/NetBeansProjects/arquivo.pdf");
     //       file.deleteOnExit();

           System.out.println(msg1);
           System.out.println(vsql);
           s.close();

            connection.close();

        return banco;

      } catch (Exception erro){
                 JOptionPane.showMessageDialog(null,msg2);
                 System.out.println(vsql);
                 JOptionPane.showMessageDialog(null,"Erro: "+erro);
                 return null;
       }


   }

     public BancoFuncoes
           relatorioSub(String vsql, String localRelatorio, String subLocalRelatorio,
                     String parametro, String msg1, String msg2){

                   Connection connection = null;

      try
      {

            Class.forName(cb.JDBC_DRIVER()).newInstance();
            connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());
            Statement s = (Statement) connection.createStatement();

            JRResultSetDataSource jrRS = new JRResultSetDataSource(s.executeQuery(vsql));
         
//            System.out.println("parametro: "+parametro);
            
         HashMap parametros = new HashMap();
         parametros.put("subcod" , parametro) ;
         parametros.put("REPORT_CONNECTION", connection ) ;

            JasperPrint jasperPrint = JasperFillManager.fillReport(localRelatorio, parametros, jrRS);

            JasperViewer.viewReport(jasperPrint, false);

//            System.out.println(msg1);
//            System.out.println(vsql);
            s.close();

            connection.close();

        return banco;

      } catch (Exception erro){
                 JOptionPane.showMessageDialog(null,msg2);
                 System.out.println(vsql);
                 JOptionPane.showMessageDialog(null,"Erro: "+erro);
                 return null;
       }

   }
//---------------------------------Fim Relatórios----------------------------------


//------------------------------------------Clientes----------------------------------------

    public BancoFuncoes 
           tabelaClientes(String sql, String msg1, String msg2, final JTable tabela){

          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);

          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)tabela.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }

                   while (rs.next()){
                        String cod = rs.getString("cli_cod");
                        String forn = rs.getString("cli_cliente");
                        String cnpj = rs.getString("cli_cnpj");
                        String cpf = rs.getString("cli_cpf");
                        dtm.addRow(new Object[]{cod, forn, cnpj, cpf});
                   }

//-----------------------------------------inicio do mouse listener------------------------------------

         tabela.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e){
            try{

                AlterarClientes af = new AlterarClientes(null, true);
                if(e.getClickCount() == 2){
                       int    col = tabela.getSelectedColumn();
                       int    lin = tabela.getSelectedRow();
                    String result =(String) tabela.getValueAt(lin, 0);
                    af.setForCod(result);

            Connection connection = null;
            Class.forName(cb.JDBC_DRIVER()).newInstance();
            connection =    (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());
            Statement s = (Statement) connection.createStatement();

            String pega = " SELECT * FROM tb_clientes "+
                          "where cli_cod = '"+result+"'";

            System.out.println(pega);

            ResultSet r = s.executeQuery(pega);
                 while(r.next()) {
                            af.txFornecedor.setText(r.getString("cli_cliente"));
                            af.txCNPJ.setText(r.getString("cli_cnpj"));
                            af.txCPF.setText(r.getString("cli_cpf"));
                            af.txNomeFantasia.setText(r.getString("cli_nomefantasia"));
                            af.txInscEstadual.setText(r.getString("cli_inscestadual"));
                            af.txEndereco.setText(r.getString("cli_endereco"));
                            af.txNumero.setText(r.getString("cli_numero"));
                            af.txCep.setText(r.getString("cli_cep"));
                            af.jcbUf.setSelectedItem(r.getString("cli_estado"));
                            af.txBairro.setText(r.getString("cli_bairro"));
                            af.txCidade.setText(r.getString("cli_cidade"));
                            af.txWebSite.setText(r.getString("cli_website"));
                            af.txContato.setText(r.getString("cli_contato"));
                            af.txEmail.setText(r.getString("cli_email"));
                            af.txTelefone.setText(r.getString("cli_telefone"));
                            af.txTelefone2.setText(r.getString("cli_telefone2"));
                            af.txCelular.setText(r.getString("cli_celular"));

                            String pessoa = r.getString("cli_pessoa");
                            af.setPessoa(pessoa);

                            if(pessoa.equals("FISICO")){
                                af.radFisico.setSelected(true);
                                af.radJuridico.setSelected(false);
                                
                                af.lbCNPJ.setVisible(false);
                                af.lbNomeFantasia.setVisible(false);
                                af.lbinscEstadual.setVisible(false);
                                af.lbRazaoSocial.setVisible(false);

                                af.txCNPJ.setVisible(false);
                                af.txNomeFantasia.setVisible(false);
                                af.txInscEstadual.setVisible(false);

                                af.lbCPF.setVisible(true);
                                af.lbnomeFornecedor.setVisible(true);
                                af.txCPF.setVisible(true);
                            }
                            
                            if(pessoa.equals("JURIDICO")){
                                af.radFisico.setSelected(false);
                                af.radJuridico.setSelected(true);
                                
                                af.lbCPF.setVisible(false);
                                af.lbnomeFornecedor.setVisible(false);
                                af.txCPF.setVisible(false);

                                af.lbCNPJ.setVisible(true);
                                af.lbNomeFantasia.setVisible(true);
                                af.lbinscEstadual.setVisible(true);
                                af.lbRazaoSocial.setVisible(true);

                                af.txCNPJ.setVisible(true);
                                af.txNomeFantasia.setVisible(true);
                                af.txInscEstadual.setVisible(true);
                            }

                      }
            af.setVisible(true);
                }

         }catch (Exception ex) {
                    ex.printStackTrace(System.out);
                    JOptionPane.showMessageDialog(null, "Não Foi Possível Abrir Cliente");
                }
                        }
         });
//---------------------Fim mouse listener-------------------------------------------------------------

//        System.out.println("Fornecedores Recuperados com sucesso");

         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }

    public BancoFuncoes
           tabelaAtualizaClientes(String sql, String msg1, String msg2, final JTable tabela){

          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);

          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)tabela.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }

                   while (rs.next()){
                        String cod = rs.getString("cli_cod");
                        String forn = rs.getString("cli_cliente");
                        String cnpj = rs.getString("cli_cnpj");
                        String cpf = rs.getString("cli_cpf");
                        dtm.addRow(new Object[]{cod, forn, cnpj, cpf});
                   }


//        System.out.println("Fornecedores Recuperados com sucesso");

         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }

    public BancoFuncoes
           filtrarClientes(String vsql, String msg1, String msg2, final JTable tabela){

            Connection connection = null;

       try {
        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

            Statement s = (Statement) connection.createStatement();

              ResultSet rs = s.executeQuery(vsql);

              javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)tabela.getModel();
                       int i = dtm.getRowCount();
                       for(int a = 0; a < i; a++)
                       {
                       dtm.removeRow(0);
                       }

                   while (rs.next()){
                        String cod = rs.getString("cli_cod");
                        String forn = rs.getString("cli_cliente");
                        String cnpj = rs.getString("cli_cnpj");
                        String cpf = rs.getString("cli_cpf");
                        
                        dtm.addRow(new Object[]{cod, forn, cnpj, cpf});
                   }

            System.out.println("Conectado ao banco com sucesso");

             s.close();
             connection.close();

             System.out.println(msg1);
             System.out.println(vsql);
             return banco;

       }catch(SQLException ex){
          JOptionPane.showMessageDialog(null, msg2);
          System.out.println("SQLException: " + ex.getMessage());
          System.out.println("SQLState: " + ex.getSQLState());
          System.out.println("Error: " + ex.getErrorCode());
          System.out.println(vsql);
          return null;
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, msg2);
          System.out.println(vsql);
          System.out.println("Dados não filtrados" + e);
          return null;
        }

   }

//---------------------------------------fim Clientes---------------------------


//------------------------------------------Produtos----------------------------------------

    public BancoFuncoes
           tabelaProdutos(String sql, String msg1, String msg2, final JTable tabela){

          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);

          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)tabela.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }

                   while (rs.next()){
                        String cod = rs.getString("prod_cod");
                        String codigo = rs.getString("prod_codigo");
                        String prod = rs.getString("prod_produto");
                        String ref = rs.getString("prod_referencia");
                        
                        String dep = rs.getString("dep_departamento");
                        String tipprod = rs.getString("tipprod_tipoproduto");
                        String qnt = rs.getString("prod_quantidade");
                        String forn = rs.getString("for_fornecedor");
                        
                        String venda = rs.getString("prod_venda");
                        int ponto = venda.indexOf(".");
                        int tamanho = venda.length();
                        int total = tamanho-(ponto+1);
                        String vendaEditada = venda.replace('.', ',');

//                        System.out.println(total);

                        if(ponto == -1){
                           vendaEditada = "R$ "+vendaEditada+",00";
                        }else{
                            if(total==2)
                                vendaEditada = "R$ "+vendaEditada;
                            if(total==1)
                                vendaEditada = "R$ "+vendaEditada+"0";
                            if(total>2)
                                vendaEditada = "RS "+vendaEditada.substring(0, ponto+3);
                        }
                        
                        dtm.addRow(new Object[]{cod, codigo, prod, ref, dep,tipprod, vendaEditada, qnt, forn});
                   }

//-----------------------------------------inicio do mouse listener------------------------------------

         tabela.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e){
            try{

                AlterarProduto ap = new AlterarProduto(null, true);
                if(e.getClickCount() == 2){
                       int    col = tabela.getSelectedColumn();
                       int    lin = tabela.getSelectedRow();
                    String result =(String) tabela.getValueAt(lin, 0);
                    ap.setProdCod(result);

            Connection connection = null;
            Class.forName(cb.JDBC_DRIVER()).newInstance();
            connection =    (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());
            Statement s = (Statement) connection.createStatement();

            String pega = "SELECT prod_cod, prod_codigo, prod_barras, prod_produto, prod_observacoes, prod_caminhoimagem, " +
                          "prod_referencia, prod_minimo, prod_quantidade, prod_custo, prod_ganho, prod_porcentagem, "+
                          "prod_venda, concat( dep_cod, ' - ', dep_departamento)departamento, concat( for_cod, ' - ', for_fornecedor)fornecedor, " +
                          "concat(tam_cod, ' - ', tam_tamanho)tamanho, concat( cor_cod, ' - ', cor_cor)cor, concat(mat_cod, ' - ', mat_material)material, "+
                          "concat( tipprod_cod, ' - ', tipprod_tipoproduto)tipoproduto "+
                          "FROM tb_produtos "+
                          "INNER JOIN tb_fornecedores ON prod_tb_fornecedor = for_cod "+
                          "INNER JOIN tb_departamento ON prod_tb_departamento = dep_cod "+
                          "INNER JOIN tb_cor ON prod_tb_cor = cor_cod "+
                          "INNER JOIN tb_tamanho ON prod_tb_tamanho = tam_cod "+
                          "INNER JOIN tb_material ON prod_tb_material = mat_cod "+
                          "INNER JOIN tb_tipoproduto ON prod_tb_tipoproduto = tipprod_cod "+
                          "WHERE prod_cod = '"+result+"'";

            System.out.println(pega);

            ResultSet r = s.executeQuery(pega);
                 while(r.next()) {
                        
                        String caminho = r.getString("prod_caminhoimagem");
                        ap.txCaminho.setText(caminho);
                        
                        ImageIcon icone = new ImageIcon(System.getProperty("user.dir")+caminho);
                        ImageIcon iconeRedimensionado = new ImageIcon(icone.getImage().getScaledInstance(260, 210, Image.SCALE_DEFAULT));
                        ap.imagemProduto.setIcon(iconeRedimensionado);

                        ap.txBarras.setText(r.getString("prod_barras"));
                        ap.txCodigo.setText(r.getString("prod_codigo"));
                        ap.txCusto.setText(r.getString("prod_custo"));
                        ap.txGanho.setText(r.getString("prod_ganho"));
                        ap.txPorcentagem.setText(r.getString("prod_porcentagem"));
                        ap.txMinimo.setText(r.getString("prod_minimo"));
                        ap.txObservacoes.setText(r.getString("prod_observacoes"));
                        ap.txProduto.setText(r.getString("prod_produto"));
                        ap.txQuantidade.setText(r.getString("prod_quantidade"));
                        ap.txReferencia.setText(r.getString("prod_referencia"));
                        ap.txVenda.setText(r.getString("prod_venda"));

                        ap.jcbFornecedor.setSelectedItem(r.getString("fornecedor"));
                        ap.jcbDepartamento.setSelectedItem(r.getString("departamento"));
                        ap.jcbCor.setSelectedItem(r.getString("cor"));
                        ap.jcbMaterial.setSelectedItem(r.getString("material"));
                        ap.jcbTamanho.setSelectedItem(r.getString("tamanho"));
                        ap.jcbTipoProduto.setSelectedItem(r.getString("tipoproduto"));

                      }
            ap.setVisible(true);
                }

         }catch (Exception ex) {
                    ex.printStackTrace(System.out);
                    JOptionPane.showMessageDialog(null, "Não Foi Possível Abrir Produto");
                }
                        }
         });
//---------------------Fim mouse listener-------------------------------------------------------------


//        System.out.println("Fornecedores Recuperados com sucesso");

         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }

    public BancoFuncoes
           tabelaAtualizaProdutos(String sql, String msg1, String msg2, final JTable tabela){

          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);

          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)tabela.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }

                   while (rs.next()){
                        String cod = rs.getString("prod_cod");
                        String codigo = rs.getString("prod_codigo");
                        String prod = rs.getString("prod_produto");
                        String ref = rs.getString("prod_referencia");
                        String dep = rs.getString("dep_departamento");
                        String tipprod = rs.getString("tipprod_tipoproduto");
                        String qnt = rs.getString("prod_quantidade");
                        String forn = rs.getString("for_fornecedor");
                        
                        String venda = rs.getString("prod_venda");
                        int ponto = venda.indexOf(".");
                        int tamanho = venda.length();
                        int total = tamanho-(ponto+1);
                        String vendaEditada = venda.replace('.', ',');

//                        System.out.println(total);

                        if(ponto == -1){
                           vendaEditada = "R$ "+vendaEditada+",00";
                        }else{
                            if(total==2)
                                vendaEditada = "R$ "+vendaEditada;
                            if(total==1)
                                vendaEditada = "R$ "+vendaEditada+"0";
                            if(total>2)
                                vendaEditada = "RS "+vendaEditada.substring(0, ponto+3);
                        }
                        
                        dtm.addRow(new Object[]{cod, codigo, prod, ref, dep, tipprod, vendaEditada, qnt, forn});
                   }


//        System.out.println("Fornecedores Recuperados com sucesso");

         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }

    public BancoFuncoes
           filtrarProdutos(String vsql, String msg1, String msg2, final JTable tabela){

            Connection connection = null;

       try {
        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

            Statement s = (Statement) connection.createStatement();

              ResultSet rs = s.executeQuery(vsql);

              javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)tabela.getModel();
                       int i = dtm.getRowCount();
                       for(int a = 0; a < i; a++)
                       {
                       dtm.removeRow(0);
                       }

                   while (rs.next()){
                        String cod = rs.getString("prod_cod");
                        String codigo = rs.getString("prod_codigo");
                        String prod = rs.getString("prod_produto");
                        String ref = rs.getString("prod_referencia");
                        String cate = rs.getString("dep_departamento");
                        String tipprod = rs.getString("tipprod_tipoproduto");
                        String qnt = rs.getString("prod_quantidade");
                        String forn = rs.getString("for_fornecedor");
                        
                        String venda = rs.getString("prod_venda");
                        int ponto = venda.indexOf(".");
                        int tamanho = venda.length();
                        int total = tamanho-(ponto+1);
                        String vendaEditada = venda.replace('.', ',');

//                        System.out.println(total);

                        if(ponto == -1){
                           vendaEditada = "R$ "+vendaEditada+",00";
                        }else{
                            if(total==2)
                                vendaEditada = "R$ "+vendaEditada;
                            if(total==1)
                                vendaEditada = "R$ "+vendaEditada+"0";
                            if(total>2)
                                vendaEditada = "RS "+vendaEditada.substring(0, ponto+3);
                        }
                        
                        
                        dtm.addRow(new Object[]{cod, codigo, prod, ref, cate, tipprod, vendaEditada, qnt, forn});
                   }

            System.out.println("Conectado ao banco com sucesso");

             s.close();
             connection.close();

             System.out.println(msg1);
             System.out.println(vsql);
             return banco;

       }catch(SQLException ex){
          JOptionPane.showMessageDialog(null, msg2);
          System.out.println("SQLException: " + ex.getMessage());
          System.out.println("SQLState: " + ex.getSQLState());
          System.out.println("Error: " + ex.getErrorCode());
          System.out.println(vsql);
          return null;
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, msg2);
          System.out.println(vsql);
          System.out.println("Dados não filtrados" + e);
          return null;
        }

   }

//---------------------------------------fim Produtos---------------------------


//------------------------------------------Fornecedores----------------------------------------

    public BancoFuncoes tabelaFornecedores(String sql, String msg1, String msg2, final JTable tabela){

          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);

          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)tabela.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }

                   while (rs.next()){
                        String cod = rs.getString("for_cod");
                        String forn = rs.getString("for_fornecedor");
                        String cnpj = rs.getString("for_cnpj");
                        String cpf = rs.getString("for_cpf");
                        dtm.addRow(new Object[]{cod, forn, cnpj, cpf});
                   }

//-----------------------------------------inicio do mouse listener------------------------------------

         tabela.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e){
            try{

                AlterarFornecedores af = new AlterarFornecedores(null, true);
                if(e.getClickCount() == 2){
                       int    col = tabela.getSelectedColumn();
                       int    lin = tabela.getSelectedRow();
                    String result =(String) tabela.getValueAt(lin, 0);
                    af.setForCod(result);

            Connection connection = null;
            Class.forName(cb.JDBC_DRIVER()).newInstance();
            connection =    (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());
            Statement s = (Statement) connection.createStatement();

            String pega = " SELECT * FROM tb_fornecedores "+
                          "where for_cod = '"+result+"'";

            System.out.println(pega);

            ResultSet r = s.executeQuery(pega);
                 while(r.next()) {
                            af.txFornecedor.setText(r.getString("for_fornecedor"));
                            af.txCNPJ.setText(r.getString("for_cnpj"));
                            af.txCPF.setText(r.getString("for_cpf"));
                            af.txNomeFantasia.setText(r.getString("for_nomefantasia"));
                            af.txInscEstadual.setText(r.getString("for_inscestadual"));
                            af.txEndereco.setText(r.getString("for_endereco"));
                            af.txNumero.setText(r.getString("for_numero"));
                            af.txCep.setText(r.getString("for_cep"));
                            af.jcbUf.setSelectedItem(r.getString("for_estado"));
                            af.txBairro.setText(r.getString("for_bairro"));
                            af.txCidade.setText(r.getString("for_cidade"));
                            af.txWebSite.setText(r.getString("for_website"));
                            af.txContato.setText(r.getString("for_contato"));
                            af.txEmail.setText(r.getString("for_email"));
                            af.txTelefone.setText(r.getString("for_telefone"));
                            af.txTelefone2.setText(r.getString("for_telefone2"));
                            af.txCelular.setText(r.getString("for_celular"));

                            String pessoa = r.getString("for_pessoa");
                            af.setPessoa(pessoa);

                            if(pessoa.equals("FISICO")){
                                af.radFisico.setSelected(true);
                                af.radJuridico.setSelected(false);
                                
                                af.lbCNPJ.setVisible(false);
                                af.lbNomeFantasia.setVisible(false);
                                af.lbinscEstadual.setVisible(false);
                                af.lbRazaoSocial.setVisible(false);

                                af.txCNPJ.setVisible(false);
                                af.txNomeFantasia.setVisible(false);
                                af.txInscEstadual.setVisible(false);

                                af.lbCPF.setVisible(true);
                                af.lbnomeFornecedor.setVisible(true);
                                af.txCPF.setVisible(true);
                            }
                            
                            if(pessoa.equals("JURIDICO")){
                                af.radFisico.setSelected(false);
                                af.radJuridico.setSelected(true);
                                
                                af.lbCPF.setVisible(false);
                                af.lbnomeFornecedor.setVisible(false);
                                af.txCPF.setVisible(false);

                                af.lbCNPJ.setVisible(true);
                                af.lbNomeFantasia.setVisible(true);
                                af.lbinscEstadual.setVisible(true);
                                af.lbRazaoSocial.setVisible(true);

                                af.txCNPJ.setVisible(true);
                                af.txNomeFantasia.setVisible(true);
                                af.txInscEstadual.setVisible(true);
                            }

                      }
            af.setVisible(true);
                }

         }catch (Exception ex) {
                    ex.printStackTrace(System.out);
                    JOptionPane.showMessageDialog(null, "Não Foi Possível Abrir Fornecedor");
                }
                        }
         });
//---------------------Fim mouse listener-------------------------------------------------------------

//        System.out.println("Fornecedores Recuperados com sucesso");

         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }

    public BancoFuncoes
           tabelaAtualizaFornecedores(String sql, String msg1, String msg2, final JTable tabela){

               
               
          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);

          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)tabela.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }

                   while (rs.next()){
                        String cod = rs.getString("for_cod");
                        String forn = rs.getString("for_fornecedor");
                        String cnpj = rs.getString("for_cnpj");
                        String cpf = rs.getString("for_cpf");
                        dtm.addRow(new Object[]{cod, forn, cnpj, cpf});
                   }


//        System.out.println("Fornecedores Recuperados com sucesso");

         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }

    public BancoFuncoes
           filtrarFornecedores(String vsql, String msg1, String msg2, final JTable tabela){

            Connection connection = null;

       try {
        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

            Statement s = (Statement) connection.createStatement();

              ResultSet rs = s.executeQuery(vsql);

              javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)tabela.getModel();
                       int i = dtm.getRowCount();
                       for(int a = 0; a < i; a++)
                       {
                       dtm.removeRow(0);
                       }

                   while (rs.next()){
                        String cod = rs.getString("for_cod");
                        String forn = rs.getString("for_fornecedor");
                        String cnpj = rs.getString("for_cnpj");
                        String cpf = rs.getString("for_cpf");
                        
                        dtm.addRow(new Object[]{cod, forn, cnpj, cpf});
                   }

            System.out.println("Conectado ao banco com sucesso");

             s.close();
             connection.close();

             System.out.println(msg1);
             System.out.println(vsql);
             return banco;

       }catch(SQLException ex){
          JOptionPane.showMessageDialog(null, msg2);
          System.out.println("SQLException: " + ex.getMessage());
          System.out.println("SQLState: " + ex.getSQLState());
          System.out.println("Error: " + ex.getErrorCode());
          System.out.println(vsql);
          return null;
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, msg2);
          System.out.println(vsql);
          System.out.println("Dados não filtrados" + e);
          return null;
        }

   }


//---------------------------------------fim fornecedores---------------------------

//--------------------------------------- Cadastros ---------------------------
        public BancoFuncoes
           tabelaCadastros(String sql,final String campo1, final String campo2,final String nomeTabela,
                           String msg1, String msg2, final JTable tabela){

          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);

          final String campoSql = sql;

          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)tabela.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }

                   while (rs.next()){
                        String cod = rs.getString(campo1);
                        String cadastrado = rs.getString(campo2);
                        dtm.addRow(new Object[]{cod,cadastrado});
                   }

//-----------------------------------------inicio do mouse listener------------------------------------


         tabela.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e){
            try{

//-------seta flag para atualizar assim que atualizar cadastro
                if(e.getClickCount() == 2){
                       int    col = tabela.getSelectedColumn();
                       int    lin = tabela.getSelectedRow();
                    String result =(String) tabela.getValueAt(lin, 0);

            Connection connection = null;
            Class.forName(cb.JDBC_DRIVER()).newInstance();
            connection =    (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());
            Statement s = (Statement) connection.createStatement();

            String alteracao = JOptionPane.showInputDialog("Realize a Alteração Desejada").toUpperCase();


                                    String pega = "UPDATE "+nomeTabela+" SET " +
                                                           campo2+" = '"+alteracao+"'" +
                                                  "WHERE "+campo1+" = '"+result+"'";
//                                    System.out.println("PEGA: "+pega);
                  s.execute(pega);

                                   JOptionPane.showMessageDialog(null, "Alterado Para "+alteracao);


            ResultSet rs = s.executeQuery(campoSql);

                      javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)tabela.getModel();
                               int i = dtm.getRowCount();
                               for(int a = 0; a < i; a++)
                               {
                               dtm.removeRow(0);
                               }

                   while (rs.next()){
                        String cod = rs.getString(campo1);
                        String cadastrado = rs.getString(campo2);
                        dtm.addRow(new Object[]{cod,cadastrado});
                   }

//                    System.out.println("Tabela Recuperada");

                             s.close();
                     connection.close();



                }

         }catch (Exception ex) {
                    ex.printStackTrace(System.out);
                    JOptionPane.showMessageDialog(null, "Alteração Não Realizada");
                }
                        }
         });

 

//---------------------Fim mouse listener-------------------------------------------------------------

        System.out.println("Tabela Recuperada Com Sucesso");

         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }

        public BancoFuncoes
           tabelaTipoProduto(String sql,final String campo1, final String campo2, final String campo3, final String nomeTabela,
                           String msg1, String msg2, final JTable tabela){

          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);

          final String campoSql = sql;

          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)tabela.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }

                   while (rs.next()){
                        String cod = rs.getString(campo1);
                        String cadastrado = rs.getString(campo2);
                        String departamento = rs.getString(campo3);
                        dtm.addRow(new Object[]{cod,cadastrado, departamento});
                   }

//-----------------------------------------inicio do mouse listener------------------------------------


         tabela.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e){
            try{

//-------seta flag para atualizar assim que atualizar cadastro
                if(e.getClickCount() == 2){
                       int    col = tabela.getSelectedColumn();
                       int    lin = tabela.getSelectedRow();
                    String result =(String) tabela.getValueAt(lin, 0);

            Connection connection = null;
            Class.forName(cb.JDBC_DRIVER()).newInstance();
            connection =    (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());
            Statement s = (Statement) connection.createStatement();

            String alteracao = JOptionPane.showInputDialog("Realize a Alteração Desejada").toUpperCase();


                                    String pega = "UPDATE "+nomeTabela+" SET " +
                                                           campo2+" = '"+alteracao+"'" +
                                                  "WHERE "+campo1+" = '"+result+"'";
//                                    System.out.println("PEGA: "+pega);
                  s.execute(pega);

                                   JOptionPane.showMessageDialog(null, "Alterado Para "+alteracao);


            ResultSet rs = s.executeQuery(campoSql);

                      javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)tabela.getModel();
                               int i = dtm.getRowCount();
                               for(int a = 0; a < i; a++)
                               {
                               dtm.removeRow(0);
                               }

                   while (rs.next()){
                        String cod = rs.getString(campo1);
                        String cadastrado = rs.getString(campo2);
                        dtm.addRow(new Object[]{cod,cadastrado});
                   }

//                    System.out.println("Tabela Recuperada");

                             s.close();
                     connection.close();



                }

         }catch (Exception ex) {
                    ex.printStackTrace(System.out);
                    JOptionPane.showMessageDialog(null, "Alteração Não Realizada");
                }
                        }
         });

 

//---------------------Fim mouse listener-------------------------------------------------------------

        System.out.println("Tabela Recuperada Com Sucesso");

         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }
//---------------------------------------fim Cadastros---------------------------        

//------------------------------------------Compras/Vendas----------------------------------------

        public BancoFuncoes
           tabelaVendas(final String sql, String msg1, String msg2, final JTable tabela){

          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);

          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)tabela.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }
                   while (rs.next()){
                        String cod = rs.getString("vend_cod");
                        String codProd = rs.getString("prod_cod");
                        String quantidade = rs.getString("vend_quantidade");
                        String produto = rs.getString("prod_produto");
//                        String venda = rs.getString("prod_venda");
//                        String VLtotal = rs.getString("vend_total");
                        
                    //Editando valor da venda
                        String venda = rs.getString("prod_venda");
                        int ponto = venda.indexOf(".");
                        int tamanho = venda.length();
                        int total = tamanho-(ponto+1);
                        String vendaEditada = venda.replace('.', ',');
                        if(ponto == -1){
                           vendaEditada = "R$ "+vendaEditada+",00";
                        }else{
                            if(total==2)
                                vendaEditada = "R$ "+vendaEditada;
                            if(total==1)
                                vendaEditada = "R$ "+vendaEditada+"0";
                            if(total>2)
                                vendaEditada = "RS "+vendaEditada.substring(0, ponto+3);
                        }
                        
                    //Editando valor Total
                        String VLtotal = rs.getString("vend_total");
                        int pontos = VLtotal.indexOf(".");
                        int tamanhos = VLtotal.length();
                        int totals = tamanhos-(pontos+1);
                        String VLtotalEditada = VLtotal.replace('.', ',');
                        if(pontos == -1){
                           VLtotalEditada = "R$ "+VLtotalEditada+",00";
                        }else{
                            if(totals==2)
                                VLtotalEditada = "R$ "+VLtotalEditada;
                            if(totals==1)
                                VLtotalEditada = "R$ "+VLtotalEditada+"0";
                            if(totals>2)
                                VLtotalEditada = "RS "+VLtotalEditada.substring(0, pontos+3);
                        }

                        dtm.addRow(new Object[]{cod, codProd, quantidade, produto, vendaEditada, VLtotalEditada});
                   }

        System.out.println("Serviços Recuperados com sucesso");

         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }

        public BancoFuncoes
           tabelaFinalizarCompra(final String sql, final String sql2, String msg1, String msg2, final JTable tabela){

          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);

          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)tabela.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }
                   
                   while (rs.next()){
                        String cod = rs.getString("prest_cod");
                        String codtb = rs.getString("prest_tb_compra");
                        String forma = rs.getString("prest_formapagamento");
                    //Editando valor da venda
                        String venda = rs.getString("prest_valor");
                        int ponto = venda.indexOf(".");
                        int tamanho = venda.length();
                        int total = tamanho-(ponto+1);
                        String vendaEditada = venda.replace('.', ',');
                        if(ponto == -1){
                           vendaEditada = "R$ "+vendaEditada+",00";
                        }else{
                            if(total==2)
                                vendaEditada = "R$ "+vendaEditada;
                            if(total==1)
                                vendaEditada = "R$ "+vendaEditada+"0";
                            if(total>2)
                                vendaEditada = "RS "+vendaEditada.substring(0, ponto+3);
                        }
                        
                        dtm.addRow(new Object[]{cod, codtb, forma, vendaEditada});
                   }
                   
           ResultSet r = s.executeQuery(sql2);        
                   
                   while (r.next()){
                        String cod = r.getString("pag_cod");
                        String codtb = r.getString("pag_tb_compra");
                        String forma = r.getString("pag_formapagamento");
                    //Editando valor da venda
                        String venda = r.getString("pag_valor");
                        int ponto = venda.indexOf(".");
                        int tamanho = venda.length();
                        int total = tamanho-(ponto+1);
                        String vendaEditada = venda.replace('.', ',');
                        if(ponto == -1){
                           vendaEditada = "R$ "+vendaEditada+",00";
                        }else{
                            if(total==2)
                                vendaEditada = "R$ "+vendaEditada;
                            if(total==1)
                                vendaEditada = "R$ "+vendaEditada+"0";
                            if(total>2)
                                vendaEditada = "RS "+vendaEditada.substring(0, ponto+3);
                        }
                        
                        dtm.addRow(new Object[]{cod, codtb, forma, vendaEditada});
                   }
                   

        System.out.println("Serviços Recuperados com sucesso");

         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }

//------------------------------------------Fim Compras/Vendas----------------------------------------

//------------------------------------------Estoque----------------------------------------

    public BancoFuncoes
           tabelaEstoque(String sql, String msg1, String msg2, final JTable tabela){

          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);

          JTable tb = new JTable();
          tb = tabela;
          
          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)tabela.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }
                   
                   TableColumn column = tb.getColumn("Qnt. Em Estoque");
                   column.setCellRenderer(new pintaTabelaEstoque());
                   
                   while (rs.next()){
                        String cod = rs.getString("prod_cod");
                        String codigo = rs.getString("prod_codigo");
                        String prod = rs.getString("prod_produto");
                        String ref = rs.getString("prod_referencia");
                        String cate = rs.getString("dep_departamento");
                        String qnt = rs.getString("prod_quantidade");
                        String min = rs.getString("prod_minimo");
                        
                        
                        dtm.addRow(new Object[]{cod, codigo, prod, ref, cate, qnt, min});
                   }

//-----------------------------------------inicio do mouse listener------------------------------------

         tabela.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e){
            try{

                AlteraEstoque ae = new AlteraEstoque(null, true);
                if(e.getClickCount() == 2){
                       int    col = tabela.getSelectedColumn();
                       int    lin = tabela.getSelectedRow();
                    String result =(String) tabela.getValueAt(lin, 0);
                    ae.setProdCod(result);

            Connection connection = null;
            Class.forName(cb.JDBC_DRIVER()).newInstance();
            connection =    (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());
            Statement s = (Statement) connection.createStatement();

            String pega = "SELECT prod_cod, prod_codigo, prod_barras, prod_produto, prod_observacoes, prod_caminhoimagem, " +
                          "prod_referencia, prod_minimo, prod_quantidade, prod_custo, prod_ganho, prod_porcentagem, "+
                          "prod_venda, concat( dep_cod, ' - ', dep_departamento)departamento, concat( for_cod, ' - ', for_fornecedor)fornecedor " +
                          "FROM tb_produtos "+
                          "INNER JOIN tb_fornecedores ON prod_tb_fornecedor = for_cod "+
                          "INNER JOIN tb_departamento ON prod_tb_departamento = dep_cod "+
                          "WHERE prod_cod = '"+result+"'";

            System.out.println(pega);

            ResultSet r = s.executeQuery(pega);
                 while(r.next()) {
                        
                        String caminho = r.getString("prod_caminhoimagem");
                        ae.txCaminho.setText(caminho);
                        
                        ImageIcon icone = new ImageIcon(System.getProperty("user.dir")+caminho);
                        ImageIcon iconeRedimensionado = new ImageIcon(icone.getImage().getScaledInstance(260, 210, Image.SCALE_DEFAULT));
                        ae.imagemProduto.setIcon(iconeRedimensionado);
                        
                        ae.txBarras.setText(r.getString("prod_barras"));
                        ae.txCodigo.setText(r.getString("prod_codigo"));
                        ae.txProduto.setText(r.getString("prod_produto"));
                        ae.lbAnterior.setText("Quantidade Anterior:  " + r.getString("prod_quantidade"));
                        ae.txMinimo.setText(r.getString("prod_minimo"));
                        ae.txReferencia.setText(r.getString("prod_referencia"));
                        ae.setQntAnterior(r.getInt("prod_quantidade"));
                        
                      }
            ae.setVisible(true);
                }

         }catch (Exception ex) {
                    ex.printStackTrace(System.out);
                    JOptionPane.showMessageDialog(null, "Não Foi Possível Abrir o Produto");
                }
                        }
         });

//---------------------Fim mouse listener-------------------------------------------------------------

         
        System.out.println("Estoques Recuperados com sucesso");

         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }

    public BancoFuncoes
           tabelaAtualizaEstoque(String sql, String msg1, String msg2, final JTable tabela){

          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);
          
          JTable tb = new JTable();
          tb = tabela;
                   
          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)tabela.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }

                   TableColumn column = tb.getColumn("Qnt. Em Estoque");
                   column.setCellRenderer(new pintaTabelaEstoque());
                   
                   while (rs.next()){
                        String cod = rs.getString("prod_cod");
                        String codigo = rs.getString("prod_codigo");
                        String prod = rs.getString("prod_produto");
                        String ref = rs.getString("prod_referencia");
                        String cate = rs.getString("dep_departamento");
                        String qnt = rs.getString("prod_quantidade");
                        String min = rs.getString("prod_minimo");
                        
                        
                        dtm.addRow(new Object[]{cod, codigo, prod, ref, cate, qnt, min});
                   }


//        System.out.println("Fornecedores Recuperados com sucesso");

         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }

    public BancoFuncoes
           filtrarEstoque(String vsql, String msg1, String msg2, final JTable tabela){

            Connection connection = null;

       try {
        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

            Statement s = (Statement) connection.createStatement();

              ResultSet rs = s.executeQuery(vsql);

          JTable tb = new JTable();
          tb = tabela;

              javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)tabela.getModel();
                       int i = dtm.getRowCount();
                       for(int a = 0; a < i; a++)
                       {
                       dtm.removeRow(0);
                       }

                   TableColumn column = tb.getColumn("Qnt. Em Estoque");
                   column.setCellRenderer(new pintaTabelaEstoque());                       

                   while (rs.next()){
                        String cod = rs.getString("prod_cod");
                        String codigo = rs.getString("prod_codigo");
                        String prod = rs.getString("prod_produto");
                        String ref = rs.getString("prod_referencia");
                        String cate = rs.getString("dep_departamento");
                        String qnt = rs.getString("prod_quantidade");
                        String min = rs.getString("prod_minimo");

                        dtm.addRow(new Object[]{cod, codigo, prod, ref, cate, qnt, min});
                   }

            System.out.println("Conectado ao banco com sucesso");

             s.close();
             connection.close();

             System.out.println(msg1);
             System.out.println(vsql);
             return banco;

       }catch(SQLException ex){
          JOptionPane.showMessageDialog(null, msg2);
          System.out.println("SQLException: " + ex.getMessage());
          System.out.println("SQLState: " + ex.getSQLState());
          System.out.println("Error: " + ex.getErrorCode());
          System.out.println(vsql);
          return null;
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, msg2);
          System.out.println(vsql);
          System.out.println("Dados não filtrados" + e);
          return null;
        }

   }

//------------------------------------------Fim Estoque----------------------------------------

//------------------------------------------Vendas----------------------------------------

    public BancoFuncoes
           tabelaVendasEfetuadas(String sql, String msg1, String msg2, final JTable tabela){

          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);

          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)tabela.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }

                   while (rs.next()){
                        String cod = rs.getString("compra_cod");
                        String data = rs.getString("compra_data");                      
                        
                        String valor = rs.getString("compra_valor");
                        int ponto = valor.indexOf(".");
                        int tamanho = valor.length();
                        int total = tamanho-(ponto+1);
                        String vendaEditada = valor.replace('.', ',');

//                        System.out.println(total);

                        if(ponto == -1){
                           vendaEditada = "R$ "+vendaEditada+",00";
                        }else{
                            if(total==2)
                                vendaEditada = "R$ "+vendaEditada;
                            if(total==1)
                                vendaEditada = "R$ "+vendaEditada+"0";
                            if(total>2)
                                vendaEditada = "RS "+vendaEditada.substring(0, ponto+3);
                        }
                        
                        dtm.addRow(new Object[]{cod, data, vendaEditada});
                   }

//-----------------------------------------inicio do mouse listener------------------------------------

         tabela.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e){
            try{

                DemonstrativoVenda dv = new DemonstrativoVenda(null, true);
                
                if(e.getClickCount() == 2){
                       int    col = tabela.getSelectedColumn();
                       int    lin = tabela.getSelectedRow();
                    String result =(String) tabela.getValueAt(lin, 0);
  //                  ae.setProdCod(result);

            Connection connection = null;
            Class.forName(cb.JDBC_DRIVER()).newInstance();
            connection =    (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());
            Statement s = (Statement) connection.createStatement();

//-------------------------------------------------Popular tabela Produto
            
            String pega = "SELECT compra_cod, DATE_FORMAT(compra_data, '%d/%m/%Y')compra_data, vend_cod, " +
                          "compra_valor, vend_tb_compra, vend_tb_produto, prod_produto, vend_total, vend_quantidade " +
                          "FROM tb_compra " +
                          "INNER JOIN tb_venda ON compra_cod = vend_tb_compra " +
                          "INNER JOIN tb_produtos ON vend_tb_produto = prod_cod "+
                          "WHERE compra_cod = '"+result+"'";

            System.out.println(pega);

                   javax.swing.table.DefaultTableModel dtm1 = (javax.swing.table.DefaultTableModel)dv.tabelaProdutos.getModel();
                   int i = dtm1.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm1.removeRow(0);
                   }

            ResultSet rs = s.executeQuery(pega);

                 while(rs.next()) {
                            String cod = rs.getString("vend_cod");
                            String prod = rs.getString("prod_produto");    
                            String qnt = rs.getString("vend_quantidade");  

                            dv.lbData.setText(rs.getString("compra_data"));

                            String valor = rs.getString("vend_total");
                            int ponto = valor.indexOf(".");
                            int tamanho = valor.length();
                            int total = tamanho-(ponto+1);
                            String vendaEditada = valor.replace('.', ',');

    //                        System.out.println(total);

                            if(ponto == -1){
                               vendaEditada = "R$ "+vendaEditada+",00";
                            }else{
                                if(total==2)
                                    vendaEditada = "R$ "+vendaEditada;
                                if(total==1)
                                    vendaEditada = "R$ "+vendaEditada+"0";
                                if(total>2)
                                    vendaEditada = "RS "+vendaEditada.substring(0, ponto+3);
                            }

                            String compra = rs.getString("compra_valor");
                            int ponto1 = compra.indexOf(".");
                            int tamanho1 = compra.length();
                            int total1 = tamanho1-(ponto1+1);
                            String compraEditada = compra.replace('.', ',');

    //                        System.out.println(total);

                            if(ponto1 == -1){
                               compraEditada = "R$ "+compraEditada+",00";
                            }else{
                                if(total1==2)
                                    compraEditada = "R$ "+compraEditada;
                                if(total1==1)
                                    compraEditada = "R$ "+compraEditada+"0";
                                if(total1>2)
                                    compraEditada = "RS "+compraEditada.substring(0, ponto1+3);
                            }
                            dv.lbValor.setText(compraEditada);

                        dtm1.addRow(new Object[]{cod, prod, qnt, vendaEditada});

                      }

//-------------------------------------------------Popular Tabela Pagamento

            String pegasql = "SELECT compra_cod, prest_cod, prest_tb_compra, prest_formapagamento, " +
                             "prest_valor, pag_tb_compra, pag_formapagamento, pag_valor, pag_tb_clientes, prest_tb_clientes, cli_cliente " +
                             "FROM tb_compra " +
                             "LEFT JOIN tb_comprasprestacoes ON compra_cod = prest_tb_compra " +
                             "LEFT JOIN tb_comprasrecebidas ON compra_cod = pag_tb_compra "+
                             "LEFT JOIN tb_clientes ON pag_tb_clientes = cli_cod OR prest_tb_clientes = cli_cod "+
                             "WHERE compra_cod = '"+result+"'";

            System.out.println(pegasql);

                   javax.swing.table.DefaultTableModel dtm2 = (javax.swing.table.DefaultTableModel)dv.tabelaPagamento.getModel();
                   int ii = dtm2.getRowCount();
                   for(int a = 0; a < ii; a++)
                   {
                   dtm2.removeRow(0);
                   }

                   TableColumn row = dv.tabelaPagamento.getColumn("#");
                   row.setCellRenderer(new pintaDemonstrativoVenda());
            
                   String pagEditada=null, prestEditada=null;

            ResultSet r = s.executeQuery(pegasql);

                 while(r.next()) {
                            String cod = r.getString("compra_cod");
                            String formapag = r.getString("pag_formapagamento");    
                            String formaprest = r.getString("prest_formapagamento");  
                            dv.lbCliente.setText(r.getString("cli_cliente"));
                            
                            String pag = r.getString("pag_valor");
                            if(formapag!=null){
                                int ponto = pag.indexOf(".");
                                int tamanho = pag.length();
                                int total = tamanho-(ponto+1);
                                pagEditada = pag.replace('.', ',');

                                if(ponto == -1){
                                   pagEditada = "R$ "+pagEditada+",00";
                                }else{
                                    if(total==2)
                                        pagEditada = "R$ "+pagEditada;
                                    if(total==1)
                                        pagEditada = "R$ "+pagEditada+"0";
                                    if(total>2)
                                        pagEditada = "RS "+pagEditada.substring(0, ponto+3);
                                }
                            }

                            String prest = r.getString("prest_valor");
                            if(formaprest!=null){
                                int ponto1 = prest.indexOf(".");
                                int tamanho1 = prest.length();
                                int total1 = tamanho1-(ponto1+1);
                                prestEditada = prest.replace('.', ',');

                                if(ponto1 == -1){
                                   prestEditada = "R$ "+prestEditada+",00";
                                }else{
                                    if(total1==2)
                                        prestEditada = "R$ "+prestEditada;
                                    if(total1==1)
                                        prestEditada = "R$ "+prestEditada+"0";
                                    if(total1>2)
                                        prestEditada = "RS "+prestEditada.substring(0, ponto1+3);
                                }
                            }

                            

                            if(formaprest!=null)
                                dtm2.addRow(new Object[]{cod, "PREST", formaprest, prestEditada, ""});
                            if(formapag!=null)
                                dtm2.addRow(new Object[]{cod, "PAG", formapag, pagEditada, ""});
                 }

                 
            dv.setVisible(true);
                }

         }catch (Exception ex) {
                    ex.printStackTrace(System.out);
                    JOptionPane.showMessageDialog(null, "Não Foi Possível Abrir o Produto");
                }
                        }
         });

//---------------------Fim mouse listener-------------------------------------------------------------

        System.out.println("Estoques Recuperados com sucesso");

         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }

    public BancoFuncoes
           tabelaAtualizaVendasEfetuadas(String sql, String msg1, String msg2, final JTable tabela){

          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);

          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)tabela.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }

                   while (rs.next()){
                        String cod = rs.getString("compra_cod");
                        String data = rs.getString("compra_data");                      
                        
                        String valor = rs.getString("compra_valor");
                        int ponto = valor.indexOf(".");
                        int tamanho = valor.length();
                        int total = tamanho-(ponto+1);
                        String vendaEditada = valor.replace('.', ',');

//                        System.out.println(total);

                        if(ponto == -1){
                           vendaEditada = "R$ "+vendaEditada+",00";
                        }else{
                            if(total==2)
                                vendaEditada = "R$ "+vendaEditada;
                            if(total==1)
                                vendaEditada = "R$ "+vendaEditada+"0";
                            if(total>2)
                                vendaEditada = "RS "+vendaEditada.substring(0, ponto+3);
                        }
                        
                        dtm.addRow(new Object[]{cod, data, vendaEditada});
                   }

         
        System.out.println("Estoques Recuperados com sucesso");

         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }

//------------------------------------------Fim Vendas----------------------------------------

//------------------------------------------Financeiro----------------------------------------

    public BancoFuncoes
           tabelaRecebidos(String sql, String msg1, String msg2, final JTable tabela){

          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);
          
          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)tabela.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }

                   while (rs.next()){
                        String cod = rs.getString("pag_cod");
                        String codcompra = rs.getString("pag_tb_compra");                      
                        String codcliente = rs.getString("pag_tb_clientes");   
                        String datavenc = rs.getString("pag_datavencimento");   
                        String datapag = rs.getString("pag_datapagamento");   
                        String formapag = rs.getString("pag_formapagamento"); 
                        String cliente = rs.getString("cli_cliente");
                        
                        String valor = rs.getString("pag_valor");
                        int ponto = valor.indexOf(".");
                        int tamanho = valor.length();
                        int total = tamanho-(ponto+1);
                        String vendaEditada = valor.replace('.', ',');

//                        System.out.println(total);

                        if(ponto == -1){
                           vendaEditada = "R$ "+vendaEditada+",00";
                        }else{
                            if(total==2)
                                vendaEditada = "R$ "+vendaEditada;
                            if(total==1)
                                vendaEditada = "R$ "+vendaEditada+"0";
                            if(total>2)
                                vendaEditada = "RS "+vendaEditada.substring(0, ponto+3);
                        }
                        
                        String desconto = rs.getString("pag_desconto");
                        int ponto1 = desconto.indexOf(".");
                        int tamanho1 = desconto.length();
                        int total1 = tamanho1-(ponto1+1);
                        String descontoEditado = desconto.replace('.', ',');

//                        System.out.println(total);

                        if(ponto1 == -1){
                           descontoEditado = "R$ "+descontoEditado+",00";
                        }else{
                            if(total1==2)
                                descontoEditado = "R$ "+descontoEditado;
                            if(total1==1)
                                descontoEditado = "R$ "+descontoEditado+"0";
                            if(total1>2)
                                descontoEditado = "RS "+descontoEditado.substring(0, ponto1+3);
                        }

                        dtm.addRow(new Object[]{cod, codcompra, codcliente, cliente, datavenc, datapag, vendaEditada, descontoEditado, formapag});
                   }
                   


//-----------------------------------------inicio do mouse listener------------------------------------
/*
         tabela.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e){
            try{

                DemonstrativoVenda dv = new DemonstrativoVenda(null, true);
                
                if(e.getClickCount() == 2){
                       int    col = tabela.getSelectedColumn();
                       int    lin = tabela.getSelectedRow();
                    String result =(String) tabela.getValueAt(lin, 0);
  //                  ae.setProdCod(result);

            Connection connection = null;
            Class.forName(cb.JDBC_DRIVER()).newInstance();
            connection =    (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());
            Statement s = (Statement) connection.createStatement();

//-------------------------------------------------Popular tabela Produto
            
            String pega = "SELECT compra_cod, DATE_FORMAT(compra_data, '%d/%m/%Y')compra_data, vend_cod, " +
                          "compra_valor, vend_tb_compra, vend_tb_produto, prod_produto, vend_total, vend_quantidade " +
                          "FROM tb_compra " +
                          "INNER JOIN tb_venda ON compra_cod = vend_tb_compra " +
                          "INNER JOIN tb_produtos ON vend_tb_produto = prod_cod "+
                          "WHERE compra_cod = '"+result+"'";

            System.out.println(pega);

                   javax.swing.table.DefaultTableModel dtm1 = (javax.swing.table.DefaultTableModel)dv.tabelaProdutos.getModel();
                   int i = dtm1.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm1.removeRow(0);
                   }

            ResultSet rs = s.executeQuery(pega);

                 while(rs.next()) {
                            String cod = rs.getString("vend_cod");
                            String prod = rs.getString("prod_produto");    
                            String qnt = rs.getString("vend_quantidade");  

                            dv.lbData.setText(rs.getString("compra_data"));

                            String valor = rs.getString("vend_total");
                            int ponto = valor.indexOf(".");
                            int tamanho = valor.length();
                            int total = tamanho-(ponto+1);
                            String vendaEditada = valor.replace('.', ',');

    //                        System.out.println(total);

                            if(ponto == -1){
                               vendaEditada = "R$ "+vendaEditada+",00";
                            }else{
                                if(total==2)
                                    vendaEditada = "R$ "+vendaEditada;
                                if(total==1)
                                    vendaEditada = "R$ "+vendaEditada+"0";
                                if(total>2)
                                    vendaEditada = "RS "+vendaEditada.substring(0, ponto+3);
                            }

                            String compra = rs.getString("compra_valor");
                            int ponto1 = compra.indexOf(".");
                            int tamanho1 = compra.length();
                            int total1 = tamanho1-(ponto1+1);
                            String compraEditada = compra.replace('.', ',');

    //                        System.out.println(total);

                            if(ponto1 == -1){
                               compraEditada = "R$ "+compraEditada+",00";
                            }else{
                                if(total1==2)
                                    compraEditada = "R$ "+compraEditada;
                                if(total1==1)
                                    compraEditada = "R$ "+compraEditada+"0";
                                if(total1>2)
                                    compraEditada = "RS "+compraEditada.substring(0, ponto1+3);
                            }
                            dv.lbValor.setText(compraEditada);

                        dtm1.addRow(new Object[]{cod, prod, qnt, vendaEditada});

                      }

//-------------------------------------------------Popular Tabela Pagamento

            String pegasql = "SELECT compra_cod, prest_cod, prest_tb_compra, prest_formapagamento, " +
                             "prest_valor, pag_tb_compra, pag_formapagamento, pag_valor, pag_tb_clientes, prest_tb_clientes, cli_cliente " +
                             "FROM tb_compra " +
                             "LEFT JOIN tb_comprasprestacoes ON compra_cod = prest_tb_compra " +
                             "LEFT JOIN tb_comprasrecebidas ON compra_cod = pag_tb_compra "+
                             "LEFT JOIN tb_clientes ON pag_tb_clientes = cli_cod OR prest_tb_clientes = cli_cod "+
                             "WHERE compra_cod = '"+result+"'";

            System.out.println(pegasql);

                   javax.swing.table.DefaultTableModel dtm2 = (javax.swing.table.DefaultTableModel)dv.tabelaPagamento.getModel();
                   int ii = dtm2.getRowCount();
                   for(int a = 0; a < ii; a++)
                   {
                   dtm2.removeRow(0);
                   }

                   TableColumn row = dv.tabelaPagamento.getColumn("#");
                   row.setCellRenderer(new pintaDemonstrativoVenda());
            
                   String pagEditada=null, prestEditada=null;

            ResultSet r = s.executeQuery(pegasql);

                 while(r.next()) {
                            String cod = r.getString("compra_cod");
                            String formapag = r.getString("pag_formapagamento");    
                            String formaprest = r.getString("prest_formapagamento");  
                            dv.lbCliente.setText(r.getString("cli_cliente"));
                            
                            String pag = r.getString("pag_valor");
                            if(formapag!=null){
                                int ponto = pag.indexOf(".");
                                int tamanho = pag.length();
                                int total = tamanho-(ponto+1);
                                pagEditada = pag.replace('.', ',');

                                if(ponto == -1){
                                   pagEditada = "R$ "+pagEditada+",00";
                                }else{
                                    if(total==2)
                                        pagEditada = "R$ "+pagEditada;
                                    if(total==1)
                                        pagEditada = "R$ "+pagEditada+"0";
                                    if(total>2)
                                        pagEditada = "RS "+pagEditada.substring(0, ponto+3);
                                }
                            }

                            String prest = r.getString("prest_valor");
                            if(formaprest!=null){
                                int ponto1 = prest.indexOf(".");
                                int tamanho1 = prest.length();
                                int total1 = tamanho1-(ponto1+1);
                                prestEditada = prest.replace('.', ',');

                                if(ponto1 == -1){
                                   prestEditada = "R$ "+prestEditada+",00";
                                }else{
                                    if(total1==2)
                                        prestEditada = "R$ "+prestEditada;
                                    if(total1==1)
                                        prestEditada = "R$ "+prestEditada+"0";
                                    if(total1>2)
                                        prestEditada = "RS "+prestEditada.substring(0, ponto1+3);
                                }
                            }

                            

                            if(formaprest!=null)
                                dtm2.addRow(new Object[]{cod, "PREST", formaprest, prestEditada, ""});
                            if(formapag!=null)
                                dtm2.addRow(new Object[]{cod, "PAG", formapag, pagEditada, ""});
                 }

                 
            dv.setVisible(true);
                }

         }catch (Exception ex) {
                    ex.printStackTrace(System.out);
                    JOptionPane.showMessageDialog(null, "Não Foi Possível Abrir o Produto");
                }
                        }
         });
*/
//---------------------Fim mouse listener-------------------------------------------------------------

        System.out.println("Estoques Recuperados com sucesso");

         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }

    public BancoFuncoes
           tabelaAtualizaRecebidos(String sql, String msg1, String msg2, final JTable tabela){

          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);

          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)tabela.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }

                   while (rs.next()){
                        String cod = rs.getString("pag_cod");
                        String codcompra = rs.getString("pag_tb_compra");                      
                        String codcliente = rs.getString("pag_tb_clientes");   
                        String datavenc = rs.getString("pag_datavencimento");   
                        String datapag = rs.getString("pag_datapagamento");   
                        String formapag = rs.getString("pag_formapagamento"); 
                        String cliente = rs.getString("cli_cliente");
                        
                        String valor = rs.getString("pag_valor");
                        int ponto = valor.indexOf(".");
                        int tamanho = valor.length();
                        int total = tamanho-(ponto+1);
                        String vendaEditada = valor.replace('.', ',');

//                        System.out.println(total);

                        if(ponto == -1){
                           vendaEditada = "R$ "+vendaEditada+",00";
                        }else{
                            if(total==2)
                                vendaEditada = "R$ "+vendaEditada;
                            if(total==1)
                                vendaEditada = "R$ "+vendaEditada+"0";
                            if(total>2)
                                vendaEditada = "RS "+vendaEditada.substring(0, ponto+3);
                        }
                        
                        String desconto = rs.getString("pag_desconto");
                        int ponto1 = desconto.indexOf(".");
                        int tamanho1 = desconto.length();
                        int total1 = tamanho1-(ponto1+1);
                        String descontoEditado = desconto.replace('.', ',');

//                        System.out.println(total);

                        if(ponto1 == -1){
                           descontoEditado = "R$ "+descontoEditado+",00";
                        }else{
                            if(total1==2)
                                descontoEditado = "R$ "+descontoEditado;
                            if(total1==1)
                                descontoEditado = "R$ "+descontoEditado+"0";
                            if(total1>2)
                                descontoEditado = "RS "+descontoEditado.substring(0, ponto1+3);
                        }
                        
                        dtm.addRow(new Object[]{cod, codcompra, codcliente, cliente, datavenc, datapag, vendaEditada, descontoEditado, formapag});
                   }

        System.out.println("Estoques Recuperados com sucesso");

         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }
    
    public BancoFuncoes
           somaRecebidos(String sql, String msg1, String msg2){

          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);

          Recebidos re = new Recebidos();
          
                   while (rs.next()){
                        String valor = rs.getString("total");
                        int ponto = valor.indexOf(".");
                        int tamanho = valor.length();
                        int total = tamanho-(ponto+1);
                        String vendaEditada = valor.replace('.', ',');

//                        System.out.println(total);

                        if(ponto == -1){
                           vendaEditada = "R$ "+vendaEditada+",00";
                        }else{
                            if(total==2)
                                vendaEditada = "R$ "+vendaEditada;
                            if(total==1)
                                vendaEditada = "R$ "+vendaEditada+"0";
                            if(total>2)
                                vendaEditada = "RS "+vendaEditada.substring(0, ponto+3);
                        }
                        setSomaRecebidos(vendaEditada);
                  }

        System.out.println("Estoques Recuperados com sucesso");

         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }
    
    public BancoFuncoes 
           tabelaAReceber(String sql1, String sql2, String msg1, String msg2, final JTable tabela){

          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql1);

          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)tabela.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }

                   Double valorTotal=0.0;
                   
                   while (rs.next()){

                        valorTotal = rs.getDouble("prest_valor");
                        String comissao = rs.getString("prest_valor");
                        int ponto = comissao.indexOf(".");
                        int tamanho = comissao.length();
                        int total = tamanho-(ponto+1);
                        String comissaoEditada = comissao.replace('.', ',');

                        if(ponto == -1){
                           comissaoEditada = "R$ "+comissaoEditada+",00";
                        }else{
                            if(total==2)
                                comissaoEditada = "R$ "+comissaoEditada;
                            if(total==1)
                                comissaoEditada = "R$ "+comissaoEditada+"0";
                            if(total>2)
                                comissaoEditada = "RS "+comissaoEditada.substring(0, ponto+3);
                        }

                        String compra = rs.getString("prest_desconto");
                        int pontocompra = compra.indexOf(".");
                        int tamanhocompra = compra.length();
                        int totalcompra = tamanhocompra-(pontocompra+1);
                        String compraEditada = compra.replace('.', ',');

                        if(pontocompra == -1){
                           compraEditada = "R$ "+compraEditada+",00";
                        }else{
                            if(totalcompra==2)
                                compraEditada = "R$ "+compraEditada;
                            if(totalcompra==1)
                                compraEditada = "R$ "+compraEditada+"0";
                            if(totalcompra>2)
                                compraEditada = "RS "+compraEditada.substring(0, pontocompra+3);
                        }

                        valorTotal += valorTotal;

                        dtm.addRow(new Object[]{rs.getString("prest_cod"), rs.getString("prest_tb_compra"), rs.getString("compra_data"),
                            rs.getString("prest_parcela"), rs.getString("cli_cliente"), rs.getString("prest_datavencimento"), 
                            rs.getString("prest_formapagamento"), compraEditada, comissaoEditada, new Boolean(false)});

                   }

                   Statement ss = (Statement) connection.createStatement();
                   ResultSet rr = ss.executeQuery(sql2);
                   
//                   buscaComissoes bC = new buscaComissoes();
                   
                   while (rr.next()){
                       String total = rr.getString("total");
                        int ponto = total.indexOf(".");
                        int tamanho = total.length();
                        int tamanhoTotal = tamanho-(ponto+1);
                        String comissaoEditada = total.replace('.', ',');
                        
//                        System.out.println(total);
                        
                        if(ponto == -1){
                           setSomaAReceber("R$ "+comissaoEditada+",00");
                        }else{
                            if(tamanhoTotal==2)
                                setSomaAReceber("R$ "+comissaoEditada);
                            if(tamanhoTotal==1)
                                setSomaAReceber("R$ "+comissaoEditada+"0");
                            if(tamanhoTotal>2)
                                setSomaAReceber("RS "+comissaoEditada.substring(0, ponto+3));
                        }
                   }
                   
                   System.out.println(valorTotal);
                  

         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql1);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql1);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql1);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }
        
//------------------------------------------Fim Financeiro----------------------------------------
    
}