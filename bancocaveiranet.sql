-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           5.5.30 - MySQL Community Server (GPL)
-- OS do Servidor:               Win32
-- HeidiSQL Versão:              8.0.0.4396
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Copiando estrutura do banco de dados para bancocaveiranet
CREATE DATABASE IF NOT EXISTS `bancocaveiranet` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `bancocaveiranet`;


-- Copiando estrutura para tabela bancocaveiranet.tb_clientes
CREATE TABLE IF NOT EXISTS `tb_clientes` (
  `cli_cod` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cli_cliente` varchar(60) DEFAULT NULL,
  `cli_cnpj` varchar(60) DEFAULT NULL,
  `cli_cpf` varchar(60) DEFAULT NULL,
  `cli_nomefantasia` varchar(60) DEFAULT NULL,
  `cli_inscestadual` varchar(60) DEFAULT NULL,
  `cli_endereco` varchar(60) DEFAULT NULL,
  `cli_numero` varchar(60) DEFAULT NULL,
  `cli_cep` varchar(60) DEFAULT NULL,
  `cli_bairro` varchar(60) DEFAULT NULL,
  `cli_cidade` varchar(60) DEFAULT NULL,
  `cli_estado` varchar(60) DEFAULT NULL,
  `cli_website` varchar(60) DEFAULT NULL,
  `cli_contato` varchar(60) DEFAULT NULL,
  `cli_email` varchar(60) DEFAULT NULL,
  `cli_telefone` varchar(500) DEFAULT NULL,
  `cli_telefone2` varchar(500) DEFAULT NULL,
  `cli_celular` varchar(500) DEFAULT NULL,
  `cli_pessoa` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`cli_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela bancocaveiranet.tb_clientes: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_clientes` DISABLE KEYS */;
INSERT INTO `tb_clientes` (`cli_cod`, `cli_cliente`, `cli_cnpj`, `cli_cpf`, `cli_nomefantasia`, `cli_inscestadual`, `cli_endereco`, `cli_numero`, `cli_cep`, `cli_bairro`, `cli_cidade`, `cli_estado`, `cli_website`, `cli_contato`, `cli_email`, `cli_telefone`, `cli_telefone2`, `cli_celular`, `cli_pessoa`) VALUES
	(0, 'CLIENTE BALCÃO', '  .   .   /    -  ', ' ', '', '', '', '', '     -   ', '', '', '', '', '', '', '', '', '', 'JURIDICO');
/*!40000 ALTER TABLE `tb_clientes` ENABLE KEYS */;


-- Copiando estrutura para tabela bancocaveiranet.tb_compra
CREATE TABLE IF NOT EXISTS `tb_compra` (
  `compra_cod` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `compra_data` date NOT NULL,
  `compra_valor` double NOT NULL DEFAULT '0',
  PRIMARY KEY (`compra_cod`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela bancocaveiranet.tb_compra: ~16 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_compra` DISABLE KEYS */;
INSERT INTO `tb_compra` (`compra_cod`, `compra_data`, `compra_valor`) VALUES
	(1, '2013-12-22', 0),
	(2, '2013-12-22', 0),
	(3, '2013-12-22', 0),
	(4, '2013-12-22', 312.5),
	(5, '2013-12-22', 62.5),
	(6, '2013-12-22', 62.5),
	(7, '2013-12-22', 250),
	(8, '2013-12-22', 62.5),
	(9, '2013-12-22', 62.5),
	(10, '2013-12-22', 62.5),
	(11, '2014-02-03', 62.5),
	(12, '2014-03-02', 300),
	(13, '2014-04-13', 187.5),
	(14, '2014-05-01', 125),
	(15, '2014-06-26', 90),
	(16, '2014-06-26', 60);
/*!40000 ALTER TABLE `tb_compra` ENABLE KEYS */;


-- Copiando estrutura para tabela bancocaveiranet.tb_comprasprestacoes
CREATE TABLE IF NOT EXISTS `tb_comprasprestacoes` (
  `prest_cod` int(10) NOT NULL AUTO_INCREMENT,
  `prest_tb_compra` int(10) unsigned NOT NULL,
  `prest_tb_clientes` int(10) unsigned NOT NULL,
  `prest_parcela` varchar(50) NOT NULL,
  `prest_datavencimento` date NOT NULL,
  `prest_desconto` double NOT NULL,
  `prest_valor` double NOT NULL,
  `prest_formapagamento` varchar(50) NOT NULL,
  `prest_informacoes` varchar(50) NOT NULL,
  PRIMARY KEY (`prest_cod`),
  KEY `FK__tb_compra` (`prest_tb_compra`),
  KEY `FK__tb_clientes` (`prest_tb_clientes`),
  CONSTRAINT `FK__tb_clientes` FOREIGN KEY (`prest_tb_clientes`) REFERENCES `tb_clientes` (`cli_cod`),
  CONSTRAINT `FK__tb_compra` FOREIGN KEY (`prest_tb_compra`) REFERENCES `tb_compra` (`compra_cod`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela bancocaveiranet.tb_comprasprestacoes: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_comprasprestacoes` DISABLE KEYS */;
INSERT INTO `tb_comprasprestacoes` (`prest_cod`, `prest_tb_compra`, `prest_tb_clientes`, `prest_parcela`, `prest_datavencimento`, `prest_desconto`, `prest_valor`, `prest_formapagamento`, `prest_informacoes`) VALUES
	(2, 11, 0, '2', '2014-02-08', 0, 31.25, 'CHEQUE', ''),
	(3, 16, 0, '1', '2014-06-11', 0, 30, 'PARCELADO', ''),
	(4, 16, 0, '2', '2014-06-11', 0, 30, 'PARCELADO', '');
/*!40000 ALTER TABLE `tb_comprasprestacoes` ENABLE KEYS */;


-- Copiando estrutura para tabela bancocaveiranet.tb_comprasrecebidas
CREATE TABLE IF NOT EXISTS `tb_comprasrecebidas` (
  `pag_cod` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `pag_tb_compra` int(10) unsigned NOT NULL,
  `pag_tb_clientes` int(10) unsigned NOT NULL,
  `pag_datavencimento` date DEFAULT NULL,
  `pag_datapagamento` date DEFAULT NULL,
  `pag_valor` double DEFAULT NULL,
  `pag_desconto` double DEFAULT NULL,
  `pag_formapagamento` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`pag_cod`),
  KEY `FK_tb_contaspagas_tb_compra` (`pag_tb_compra`),
  KEY `FK_tb_contaspagas_tb_clientes` (`pag_tb_clientes`),
  CONSTRAINT `FK_tb_contaspagas_tb_clientes` FOREIGN KEY (`pag_tb_clientes`) REFERENCES `tb_clientes` (`cli_cod`),
  CONSTRAINT `FK_tb_contaspagas_tb_compra` FOREIGN KEY (`pag_tb_compra`) REFERENCES `tb_compra` (`compra_cod`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela bancocaveiranet.tb_comprasrecebidas: ~13 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_comprasrecebidas` DISABLE KEYS */;
INSERT INTO `tb_comprasrecebidas` (`pag_cod`, `pag_tb_compra`, `pag_tb_clientes`, `pag_datavencimento`, `pag_datapagamento`, `pag_valor`, `pag_desconto`, `pag_formapagamento`) VALUES
	(4, 5, 0, '2013-12-22', '2013-12-22', 62.5, 0, 'DINHEIRO'),
	(5, 6, 0, '2013-12-22', '2013-12-22', 2.5, 0, 'DINHEIRO'),
	(6, 6, 0, '2013-12-22', '2013-12-22', 2.5, 0, 'DINHEIRO'),
	(7, 7, 0, '2013-12-22', '2013-12-22', 50, 0, 'DINHEIRO'),
	(8, 7, 0, '2013-12-22', '2013-12-22', 50, 0, 'A VISTA'),
	(9, 8, 0, '2013-12-22', '2013-12-22', 62.5, 0, 'A VISTA'),
	(10, 9, 0, '2013-12-22', '2013-12-22', 12.5, 0, 'DINHEIRO'),
	(11, 9, 0, '2013-12-22', '2013-12-22', 12.5, 0, 'A VISTA'),
	(12, 12, 0, '2014-03-02', '2014-03-02', 290, 10, 'A VISTA'),
	(13, 13, 0, '2014-04-13', '2014-04-13', 187.5, 0, 'A VISTA'),
	(14, 14, 0, '2014-05-01', '2014-05-01', 125, 0, 'DINHEIRO'),
	(15, 15, 0, '2014-06-26', '2014-06-26', 90, 0, 'DINHEIRO'),
	(16, 11, 0, '2014-02-08', '2014-02-08', 31.25, 0, 'CHEQUE');
/*!40000 ALTER TABLE `tb_comprasrecebidas` ENABLE KEYS */;


-- Copiando estrutura para tabela bancocaveiranet.tb_cor
CREATE TABLE IF NOT EXISTS `tb_cor` (
  `cor_cod` int(10) NOT NULL AUTO_INCREMENT,
  `cor_cor` varchar(70) DEFAULT NULL,
  PRIMARY KEY (`cor_cod`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela bancocaveiranet.tb_cor: ~4 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_cor` DISABLE KEYS */;
INSERT INTO `tb_cor` (`cor_cod`, `cor_cor`) VALUES
	(0, 'S/ COR'),
	(1, 'AMARELO'),
	(2, 'PRETO'),
	(3, 'DOURADO');
/*!40000 ALTER TABLE `tb_cor` ENABLE KEYS */;


-- Copiando estrutura para tabela bancocaveiranet.tb_departamento
CREATE TABLE IF NOT EXISTS `tb_departamento` (
  `dep_cod` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `dep_departamento` varchar(50) NOT NULL,
  PRIMARY KEY (`dep_cod`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela bancocaveiranet.tb_departamento: ~13 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_departamento` DISABLE KEYS */;
INSERT INTO `tb_departamento` (`dep_cod`, `dep_departamento`) VALUES
	(2, 'MODA'),
	(3, 'CASA'),
	(4, 'ELETRÔNICOS'),
	(5, 'PERFUMARIA, BELEZA E SAÚDE'),
	(6, 'BRINQUEDOS'),
	(7, 'TABACARIA'),
	(8, 'PAPELARIA'),
	(9, 'ESPORTE E LAZER'),
	(10, 'PET'),
	(11, 'CHOCOLATE'),
	(12, 'BEBIDAS'),
	(13, 'AUTOMOTIVOS'),
	(14, 'GALERIA DE ARTES');
/*!40000 ALTER TABLE `tb_departamento` ENABLE KEYS */;


-- Copiando estrutura para tabela bancocaveiranet.tb_fornecedores
CREATE TABLE IF NOT EXISTS `tb_fornecedores` (
  `for_cod` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `for_fornecedor` varchar(60) DEFAULT NULL,
  `for_cnpj` varchar(60) DEFAULT NULL,
  `for_cpf` varchar(60) DEFAULT NULL,
  `for_nomefantasia` varchar(60) DEFAULT NULL,
  `for_inscestadual` varchar(60) DEFAULT NULL,
  `for_endereco` varchar(60) DEFAULT NULL,
  `for_numero` varchar(60) DEFAULT NULL,
  `for_cep` varchar(60) DEFAULT NULL,
  `for_bairro` varchar(60) DEFAULT NULL,
  `for_cidade` varchar(60) DEFAULT NULL,
  `for_estado` varchar(60) DEFAULT NULL,
  `for_website` varchar(60) DEFAULT NULL,
  `for_contato` varchar(60) DEFAULT NULL,
  `for_email` varchar(60) DEFAULT NULL,
  `for_telefone` varchar(60) DEFAULT NULL,
  `for_telefone2` varchar(60) DEFAULT NULL,
  `for_celular` varchar(60) DEFAULT NULL,
  `for_pessoa` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`for_cod`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela bancocaveiranet.tb_fornecedores: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_fornecedores` DISABLE KEYS */;
INSERT INTO `tb_fornecedores` (`for_cod`, `for_fornecedor`, `for_cnpj`, `for_cpf`, `for_nomefantasia`, `for_inscestadual`, `for_endereco`, `for_numero`, `for_cep`, `for_bairro`, `for_cidade`, `for_estado`, `for_website`, `for_contato`, `for_email`, `for_telefone`, `for_telefone2`, `for_celular`, `for_pessoa`) VALUES
	(2, 'CALTH EDITORA', '  .   .   /    -  ', ' ', '', '', '', '', '     -   ', '', '', '', '', '', '', '', '', '', 'JURIDICO'),
	(3, 'PALTERM COMPANY', '  .   .   /    -  ', ' ', '', '', '', '', '     -   ', '', '', '', '', '', '', '', '', '', 'JURIDICO');
/*!40000 ALTER TABLE `tb_fornecedores` ENABLE KEYS */;


-- Copiando estrutura para tabela bancocaveiranet.tb_material
CREATE TABLE IF NOT EXISTS `tb_material` (
  `mat_cod` int(10) NOT NULL AUTO_INCREMENT,
  `mat_material` varchar(70) DEFAULT '0',
  PRIMARY KEY (`mat_cod`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela bancocaveiranet.tb_material: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_material` DISABLE KEYS */;
INSERT INTO `tb_material` (`mat_cod`, `mat_material`) VALUES
	(0, 'INDEFINIDO'),
	(1, 'PORCELANA');
/*!40000 ALTER TABLE `tb_material` ENABLE KEYS */;


-- Copiando estrutura para tabela bancocaveiranet.tb_produtos
CREATE TABLE IF NOT EXISTS `tb_produtos` (
  `prod_cod` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `prod_codigo` varchar(50) NOT NULL,
  `prod_barras` varchar(50) NOT NULL,
  `prod_produto` varchar(50) NOT NULL,
  `prod_observacoes` varchar(50) NOT NULL,
  `prod_caminhoimagem` varchar(50) NOT NULL,
  `prod_referencia` varchar(50) NOT NULL,
  `prod_tb_tamanho` int(10) NOT NULL,
  `prod_tb_material` int(10) NOT NULL,
  `prod_tb_cor` int(10) NOT NULL,
  `prod_tb_departamento` int(10) unsigned NOT NULL DEFAULT '0',
  `prod_tb_tipoproduto` int(10) unsigned NOT NULL DEFAULT '0',
  `prod_tb_fornecedor` int(10) unsigned NOT NULL DEFAULT '0',
  `prod_minimo` int(11) NOT NULL,
  `prod_quantidade` int(11) NOT NULL,
  `prod_custo` double NOT NULL,
  `prod_ganho` double NOT NULL,
  `prod_porcentagem` double NOT NULL,
  `prod_venda` double NOT NULL,
  PRIMARY KEY (`prod_cod`,`prod_codigo`),
  KEY `FK_tb_produtos_tb_categoria` (`prod_tb_departamento`),
  KEY `FK_tb_produtos_tb_fornecedores` (`prod_tb_fornecedor`),
  KEY `prod_tb_tipoproduto` (`prod_tb_tipoproduto`),
  KEY `prod_cor` (`prod_tb_cor`),
  KEY `prod_material` (`prod_tb_material`),
  KEY `prod_tamanho` (`prod_tb_tamanho`),
  CONSTRAINT `FK_tb_produtos_tb_cor` FOREIGN KEY (`prod_tb_cor`) REFERENCES `tb_cor` (`cor_cod`),
  CONSTRAINT `FK_tb_produtos_tb_departamento` FOREIGN KEY (`prod_tb_departamento`) REFERENCES `tb_departamento` (`dep_cod`),
  CONSTRAINT `FK_tb_produtos_tb_fornecedores` FOREIGN KEY (`prod_tb_fornecedor`) REFERENCES `tb_fornecedores` (`for_cod`),
  CONSTRAINT `FK_tb_produtos_tb_material` FOREIGN KEY (`prod_tb_material`) REFERENCES `tb_material` (`mat_cod`),
  CONSTRAINT `FK_tb_produtos_tb_tamanho` FOREIGN KEY (`prod_tb_tamanho`) REFERENCES `tb_tamanho` (`tam_cod`),
  CONSTRAINT `FK_tb_produtos_tb_tipoproduto` FOREIGN KEY (`prod_tb_tipoproduto`) REFERENCES `tb_tipoproduto` (`tipprod_cod`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela bancocaveiranet.tb_produtos: ~11 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_produtos` DISABLE KEYS */;
INSERT INTO `tb_produtos` (`prod_cod`, `prod_codigo`, `prod_barras`, `prod_produto`, `prod_observacoes`, `prod_caminhoimagem`, `prod_referencia`, `prod_tb_tamanho`, `prod_tb_material`, `prod_tb_cor`, `prod_tb_departamento`, `prod_tb_tipoproduto`, `prod_tb_fornecedor`, `prod_minimo`, `prod_quantidade`, `prod_custo`, `prod_ganho`, `prod_porcentagem`, `prod_venda`) VALUES
	(3, '2 2 0000010', '123', 'CAMISA', '', '/src/Fotos_Produtos/WIN_20131107_210455.JPG', 'REF CAMISA', 0, 0, 0, 2, 2, 2, 3, 6, 50, 12.5, 25, 62.5),
	(4, '4 6 0000012', '1234', 'IMAGEM DESERTO', '', '/src/Fotos_Produtos/Desert.jpg', 'SA', 0, 0, 0, 4, 6, 2, 12, 32, 22, 2.2000000000000006, 10.000000000000002, 24.2),
	(5, '3 7 0000005', '123456789', 'DOCUMENTO DA ALINE', '', '/src/Fotos_Produtos/doc aline.png', '', 0, 0, 0, 3, 7, 2, 1, 2, 12, 0.2004, 1.67, 12.2004),
	(6, '4 11 0000009', 'S/ NUMERO', 'TESTE', '', '/src/FotosProdutos/quadrado branco.jpg', 'TESTE', 0, 0, 0, 4, 4, 2, 0, 1, 200, 20, 10, 220),
	(7, '8 13 0000009', '3221', 'HAAAA', '', '/src/Fotos_Produtos/doc aline.png', 'TESTANDO FOTO DA ALINE', 0, 0, 0, 8, 8, 2, 50, 1000, 1.99, 0.9950000000000002, 50.00000000000001, 2.9850000000000003),
	(9, '8 13 0000010', 'S/ NUMERO', 'MAPA DO GOOGLE COM ENDEREÇO TUCURUVI', '', '/src/Fotos_Produtos/Endereço Tucuruvi.png', '', 0, 0, 0, 8, 13, 2, 6, 6, 6, 6, 100, 12),
	(11, '3 15 0000010', 'S/ NUMERO', 'NUMERO 10', '', '/src/Fotos_Produtos/DSC03819.JPG', '', 0, 0, 0, 3, 15, 2, 10, 2, 40, 8.800000000000002, 22.000000000000004, 48.800000000000004),
	(12, '4 11 0000012', 'S/ NUMERO', 'CASA', '', '/src/Fotos_Produtos/Chrysanthemum.jpg', '', 0, 0, 0, 4, 11, 2, 1, 1, 500, 125, 25, 625),
	(13, '4 11 0000014', 'S/ NUMERO', 'TESTE DE NOVO', '', '/src/Fotos_Produtos/quadrado branco.jpg', '', 0, 0, 0, 4, 11, 2, 1, 1, 20, 3, 15, 23),
	(14, '6 18 0000014', 'S/ NUMERO', 'BONECOS', '', '/src/Fotos_Produtos/DSC03812.JPG', '', 0, 0, 0, 6, 18, 2, 5, 5, 55, 14.850000000000003, 27.000000000000004, 69.85000000000001),
	(15, '5 19 0000015', '7897247301181', 'PRODUTO PARA CALÇADOS', '', '/src/Fotos_Produtos/WIN_20140626_145103.JPG', '', 0, 0, 0, 5, 19, 3, 5, 16, 20, 10, 50, 30);
/*!40000 ALTER TABLE `tb_produtos` ENABLE KEYS */;


-- Copiando estrutura para tabela bancocaveiranet.tb_tamanho
CREATE TABLE IF NOT EXISTS `tb_tamanho` (
  `tam_cod` int(10) NOT NULL AUTO_INCREMENT,
  `tam_tamanho` varchar(100) NOT NULL,
  PRIMARY KEY (`tam_cod`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela bancocaveiranet.tb_tamanho: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_tamanho` DISABLE KEYS */;
INSERT INTO `tb_tamanho` (`tam_cod`, `tam_tamanho`) VALUES
	(0, 'INDEFINIDO'),
	(1, 'GG'),
	(2, 'P');
/*!40000 ALTER TABLE `tb_tamanho` ENABLE KEYS */;


-- Copiando estrutura para tabela bancocaveiranet.tb_tipoproduto
CREATE TABLE IF NOT EXISTS `tb_tipoproduto` (
  `tipprod_cod` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `tipprod_tipoproduto` varchar(50) DEFAULT NULL,
  `tipprod_tb_departamento` int(10) unsigned NOT NULL,
  PRIMARY KEY (`tipprod_cod`),
  KEY `tipprod_tb_departamento` (`tipprod_tb_departamento`),
  CONSTRAINT `FK_tb_tipoproduto_tb_departamento` FOREIGN KEY (`tipprod_tb_departamento`) REFERENCES `tb_departamento` (`dep_cod`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela bancocaveiranet.tb_tipoproduto: ~18 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_tipoproduto` DISABLE KEYS */;
INSERT INTO `tb_tipoproduto` (`tipprod_cod`, `tipprod_tipoproduto`, `tipprod_tb_departamento`) VALUES
	(2, 'CAMISA', 2),
	(3, 'BLAZERS', 2),
	(4, 'CASACOS', 2),
	(5, 'TOALHAS', 3),
	(6, 'MOUSE PAD', 4),
	(7, 'ABAJOUR', 3),
	(8, 'QUADROS', 3),
	(9, 'TAPETE', 3),
	(10, 'ESTETOCÓPIOS', 5),
	(11, 'CAPA PARA CELULAR', 4),
	(12, 'CADERNOS', 8),
	(13, 'BLOCO DE ANOTAÇÕES', 8),
	(14, 'AGENDAS', 8),
	(15, 'PUFF', 3),
	(16, 'ESTETOCÓPIOS', 5),
	(17, 'FONE DE OUVIDO', 4),
	(18, 'BONEQUINHOS', 6),
	(19, 'AMACIANTE PARA CALÇADOS', 5);
/*!40000 ALTER TABLE `tb_tipoproduto` ENABLE KEYS */;


-- Copiando estrutura para tabela bancocaveiranet.tb_venda
CREATE TABLE IF NOT EXISTS `tb_venda` (
  `vend_cod` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `vend_tb_compra` int(10) unsigned NOT NULL,
  `vend_tb_produto` int(10) unsigned NOT NULL DEFAULT '0',
  `vend_quantidade` int(10) unsigned NOT NULL DEFAULT '0',
  `vend_total` double unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`vend_cod`),
  KEY `FK_tb_venda_tb_produtos` (`vend_tb_produto`),
  KEY `FK_tb_venda_tb_compra` (`vend_tb_compra`),
  CONSTRAINT `FK_tb_venda_tb_compra` FOREIGN KEY (`vend_tb_compra`) REFERENCES `tb_compra` (`compra_cod`),
  CONSTRAINT `FK_tb_venda_tb_produtos` FOREIGN KEY (`vend_tb_produto`) REFERENCES `tb_produtos` (`prod_cod`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela bancocaveiranet.tb_venda: ~17 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_venda` DISABLE KEYS */;
INSERT INTO `tb_venda` (`vend_cod`, `vend_tb_compra`, `vend_tb_produto`, `vend_quantidade`, `vend_total`) VALUES
	(1, 1, 3, 1, 62.5),
	(2, 2, 3, 1, 62.5),
	(3, 3, 3, 1, 62.5),
	(4, 4, 3, 5, 312.5),
	(5, 5, 3, 1, 62.5),
	(6, 6, 3, 1, 62.5),
	(7, 7, 3, 4, 250),
	(8, 8, 3, 1, 62.5),
	(9, 9, 3, 1, 62.5),
	(10, 10, 3, 1, 62.5),
	(11, 11, 3, 1, 62.5),
	(12, 12, 3, 4, 300),
	(13, 13, 3, 3, 187.5),
	(14, 14, 3, 2, 125),
	(15, 15, 15, 3, 90),
	(16, 16, 15, 1, 30),
	(17, 16, 15, 1, 30);
/*!40000 ALTER TABLE `tb_venda` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
