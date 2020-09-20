package org.teste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.JPasswordField;

// Código da Primeira Tela, Login, para acesso à ferramenta de importação e exportação de shapefiles.

// Nesse momento da Sprint 1, ainda não há a validação de acesso em Banco de dados, sendo requisito a ser
// atacado nas Sprints futuras, porém os campos de Username e Senha já estão codificados corretamente.

public class ViewPrimeiraTela {

	private JFrame GeoGIS;
	private JTextField usernameField;
	private JPasswordField passwordField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPrimeiraTela window = new ViewPrimeiraTela();
					window.GeoGIS.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewPrimeiraTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		GeoGIS = new JFrame();
		GeoGIS.setResizable(false);
		GeoGIS.setFont(new Font("Fira Code Medium", Font.PLAIN, 12));
		GeoGIS.setTitle("GeoGIS");
		GeoGIS.getContentPane().setBackground(new Color(255, 140, 0));
		GeoGIS.getContentPane().setForeground(new Color(255, 153, 0));
		GeoGIS.setBounds(100, 100, 450, 300);
		GeoGIS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GeoGIS.getContentPane().setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.LIGHT_GRAY);
		desktopPane.setBounds(46, 81, 341, 155);
		GeoGIS.getContentPane().add(desktopPane);
		
		usernameField = new JTextField();
		usernameField.setBounds(10, 32, 321, 26);
		desktopPane.add(usernameField);
		usernameField.setColumns(10);
		
		JLabel lbNome = new JLabel("USERNAME:");
		lbNome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbNome.setHorizontalAlignment(SwingConstants.LEFT);
		lbNome.setBounds(10, 11, 117, 24);
		desktopPane.add(lbNome);
		
		JLabel lblSenha = new JLabel("SENHA:");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSenha.setHorizontalAlignment(SwingConstants.LEFT);
		lblSenha.setBounds(10, 56, 117, 26);
		desktopPane.add(lblSenha);
		
		JButton Iniciar = new JButton("INICIAR");
		Iniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewSegundaTela vst = new ViewSegundaTela();
				vst.setVisible(true);
			}
		});
		
		Iniciar.setForeground(new Color(0, 0, 0));
		Iniciar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Iniciar.setBounds(126, 118, 89, 23);
		desktopPane.add(Iniciar);
		Iniciar.setBackground(new Color(255, 140, 0));
		
		passwordField = new JPasswordField();
		passwordField.setBounds(10, 81, 321, 26);
		desktopPane.add(passwordField);
		JLabel lblImg = new JLabel("");
		lblImg.setBounds(188, 11, 67, 59);
		GeoGIS.getContentPane().add(lblImg);
		ImageIcon icon = new ImageIcon("src/Tela/0.png");
		icon.setImage(icon.getImage().getScaledInstance(lblImg.getWidth(), lblImg.getHeight(), 1));
		lblImg.setIcon(new ImageIcon("C:\\Users\\Alexandra\\eclipse-workspace\\PrimeiraTelaGUI\\src\\org\\teste\\0.png"));
		}
}
