package org.teste;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


// Código da Segunda Tela, com o uso do WindowBuilder, chamando o teste de conexão da aplicação com o
// banco de dados e executando o importador do PostGRE/PostGIS.

// Importante salientar que, nesse momento da Sprint 1, só há a importação e exportação de arquivos
// .shp conforme definido nos requisitos da entrega.

public class ViewSegundaTela extends JFrame {

	private JPanel SegundaTela;
	private JTextField Arquivo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewSegundaTela frame = new ViewSegundaTela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewSegundaTela() {
		setTitle("GeoGIS");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 413);
		SegundaTela = new JPanel();
		SegundaTela.setBackground(new Color(255, 140, 0));
		SegundaTela.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(SegundaTela);
		SegundaTela.setLayout(null);
		
		JLabel Icon = new JLabel("");
		Icon.setIcon(new ImageIcon("C:\\Users\\Alexandra\\eclipse-workspace\\PrimeiraTelaGUI\\src\\org\\teste\\0.png"));
		Icon.setBounds(62, 51, 50, 50);
		SegundaTela.add(Icon);
		
		JLabel lblGeoGIS = new JLabel("GeoGIS");
		lblGeoGIS.setForeground(new Color(255, 255, 255));
		lblGeoGIS.setFont(new Font("Century Gothic", Font.BOLD, 17));
		lblGeoGIS.setBounds(54, 11, 91, 29);
		SegundaTela.add(lblGeoGIS);
		
		JPanel Painel = new JPanel();
		Painel.setBackground(new Color(192, 192, 192));
		Painel.setBounds(162, 11, 427, 289);
		SegundaTela.add(Painel);
		Painel.setLayout(null);
		
		JLabel Escolha = new JLabel("ESCOLHA A OP\u00C7\u00C3O DE ROTINA DESEJADA:");
		Escolha.setBounds(0, 0, 427, 29);
		Painel.add(Escolha);
		Escolha.setFont(new Font("Century Gothic", Font.BOLD, 16));
		Escolha.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel Fonte = new JLabel("1) SELECIONE O MEIO FONTE:");
		Fonte.setBounds(10, 40, 217, 32);
		Painel.add(Fonte);
		Fonte.setBackground(new Color(255, 140, 0));
		Fonte.setFont(new Font("Century Gothic", Font.BOLD, 15));
		Fonte.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel Destino = new JLabel("2) SELECIONE O DESTINO:");
		Destino.setHorizontalAlignment(SwingConstants.LEFT);
		Destino.setFont(new Font("Century Gothic", Font.BOLD, 15));
		Destino.setBackground(new Color(255, 140, 0));
		Destino.setBounds(10, 101, 217, 32);
		Painel.add(Destino);
		
		JButton Conectar = new JButton("CONECTAR AO POSTGRE / POSTGIS");
		Conectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con = Conexao.criarConexao();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(Conectar, "Conexão efetuada com sucesso");
			}
		});
		Conectar.setFont(new Font("Century Gothic", Font.BOLD, 14));
		Conectar.setBounds(10, 161, 407, 38);
		Painel.add(Conectar);
		
		JRadioButton optShapefile1 = new JRadioButton("SHAPEFILE");
		optShapefile1.setFont(new Font("Century Gothic", Font.BOLD, 11));
		optShapefile1.setBounds(233, 36, 79, 47);
		Painel.add(optShapefile1);
		
		JRadioButton optPostgis1 = new JRadioButton("POSTGIS");
		optPostgis1.setFont(new Font("Century Gothic", Font.BOLD, 11));
		optPostgis1.setBounds(321, 36, 79, 47);
		Painel.add(optPostgis1);
		
		JRadioButton optShapefile2 = new JRadioButton("SHAPEFILE");
		optShapefile2.setFont(new Font("Century Gothic", Font.BOLD, 11));
		optShapefile2.setBounds(233, 95, 79, 47);
		Painel.add(optShapefile2);
		
		JRadioButton optPostgis2 = new JRadioButton("POSTGIS");
		optPostgis2.setFont(new Font("Century Gothic", Font.BOLD, 11));
		optPostgis2.setBounds(321, 95, 79, 47);
		Painel.add(optPostgis2);
		
		JButton Selecionar = new JButton("SELECIONE O ARQUIVO A SER ENVIADO");
		Selecionar.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
				fc.showOpenDialog(Selecionar);
				File f = fc.getSelectedFile();
				
				Arquivo.setText(f.getPath());
			}
		});
		Selecionar.setFont(new Font("Century Gothic", Font.BOLD, 14));
		Selecionar.setBounds(10, 210, 407, 38);
		Painel.add(Selecionar);
		
		Arquivo = new JTextField();
		Arquivo.setBounds(10, 259, 407, 19);
		Painel.add(Arquivo);
		Arquivo.setColumns(10);
		
		JButton Carregar = new JButton(">>");
		Carregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Runtime.getRuntime().exec("\"C:\\Program Files\\PostgreSQL\\12\\bin\\postgisgui\\shp2pgsql-gui.exe\"");
				} catch (Exception e){}
			}
		});
		Carregar.setFont(new Font("Century Gothic", Font.BOLD, 18));
		Carregar.setBounds(340, 311, 89, 43);
		SegundaTela.add(Carregar);
		
		JLabel Seja = new JLabel("SEJA BEM VINDO(A) ");
		Seja.setFont(new Font("Century Gothic", Font.BOLD, 13));
		Seja.setHorizontalAlignment(SwingConstants.CENTER);
		Seja.setBounds(17, 112, 135, 29);
		SegundaTela.add(Seja);
		
		JLabel Plataforma = new JLabel("\u00C0 PLATAFORMA");
		Plataforma.setHorizontalAlignment(SwingConstants.CENTER);
		Plataforma.setFont(new Font("Century Gothic", Font.BOLD, 13));
		Plataforma.setBounds(17, 143, 135, 29);
		SegundaTela.add(Plataforma);
		
		JLabel Integracao = new JLabel("DE INTEGRA\u00C7\u00C3O DE");
		Integracao.setHorizontalAlignment(SwingConstants.CENTER);
		Integracao.setFont(new Font("Century Gothic", Font.BOLD, 13));
		Integracao.setBounds(17, 169, 135, 29);
		SegundaTela.add(Integracao);
		
		JLabel Arquivos = new JLabel("ARQUIVOS");
		Arquivos.setHorizontalAlignment(SwingConstants.CENTER);
		Arquivos.setFont(new Font("Century Gothic", Font.BOLD, 13));
		Arquivos.setBounds(17, 201, 135, 29);
		SegundaTela.add(Arquivos);
		
		JLabel Shapegis = new JLabel("SHAPEFILE / POSTGIS.");
		Shapegis.setHorizontalAlignment(SwingConstants.CENTER);
		Shapegis.setFont(new Font("Century Gothic", Font.BOLD, 13));
		Shapegis.setBounds(17, 230, 135, 29);
		SegundaTela.add(Shapegis);
		
		JButton Logout = new JButton("LOGOUT");
		Logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		Logout.setBackground(new Color(192, 192, 192));
		Logout.setFont(new Font("Century Gothic", Font.BOLD, 17));
		Logout.setBounds(17, 283, 128, 50);
		SegundaTela.add(Logout);
	}
}