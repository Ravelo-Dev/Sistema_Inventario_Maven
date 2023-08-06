package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Config.*;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Mod_Consultas.*;


public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField Txt_Usuario;
	private JPasswordField Txt_Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 577);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Img_tenis_Login = new JLabel("");
		Img_tenis_Login.setIcon(new ImageIcon(Login.class.getResource("/Img/img_tenis_login.jpg")));
		Img_tenis_Login.setBounds(505, 0, 319, 538);
		contentPane.add(Img_tenis_Login);
		
		JPanel Panel_main_login = new JPanel();
		Panel_main_login.setBounds(0, 0, 505, 538);
		contentPane.add(Panel_main_login);
		Panel_main_login.setLayout(null);
		
		JLabel Lbl_IniciarSesion = new JLabel("INICIAR SESION");
		Lbl_IniciarSesion.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_IniciarSesion.setLabelFor(this);
		Lbl_IniciarSesion.setFont(new Font("Roboto Black", Font.PLAIN, 20));
		Lbl_IniciarSesion.setBounds(145, 181, 221, 36);
		Panel_main_login.add(Lbl_IniciarSesion);
		
		JLabel Lbl_Usuario = new JLabel("USUARIO");
		Lbl_Usuario.setFont(new Font("Roboto", Font.PLAIN, 17));
		Lbl_Usuario.setBounds(44, 244, 189, 21);
		Panel_main_login.add(Lbl_Usuario);
		
		Txt_Usuario = new JTextField();
		Txt_Usuario.setBorder(null);
		Txt_Usuario.setBounds(44, 276, 410, 36);
		Panel_main_login.add(Txt_Usuario);
		Txt_Usuario.setColumns(10);
		
		JLabel Lbl_Password = new JLabel("CONTRASEÑA");
		Lbl_Password.setFont(new Font("Roboto", Font.PLAIN, 17));
		Lbl_Password.setBounds(44, 336, 189, 21);
		Panel_main_login.add(Lbl_Password);
		
		Txt_Password = new JPasswordField();
		Txt_Password.setBorder(null);
		Txt_Password.setBounds(44, 368, 410, 36);
		Panel_main_login.add(Txt_Password);
		
		JSeparator separator_Usuario = new JSeparator();
		separator_Usuario.setForeground(new Color(243, 113, 56));
		separator_Usuario.setBackground(new Color(243, 113, 56));
		separator_Usuario.setBounds(44, 314, 410, 11);
		Panel_main_login.add(separator_Usuario);
		
		JSeparator separator_Password = new JSeparator();
		separator_Password.setForeground(new Color(243, 113, 56));
		separator_Password.setBackground(new Color(243, 113, 56));
		separator_Password.setBounds(44, 406, 410, 11);
		Panel_main_login.add(separator_Password);
		
		JLabel Icon_login = new JLabel("");
		Icon_login.setIcon(new ImageIcon(Login.class.getResource("/Img/user (1).png")));
		Icon_login.setBounds(191, 35, 128, 135);
		Panel_main_login.add(Icon_login);
		
		JPanel Btn_Entrar = new JPanel();
		Btn_Entrar.addMouseListener(new MouseAdapter() {
			
		/*LA SIGUIENTE LINEA CAMBIA EL COLOR DEL PANEL UTILIZADO COMO BOTON,
		 * A UNO MAS CLARO PARA HACER VER QUE ES CLICKEABLE	*/
			@Override
			public void mouseEntered(MouseEvent e) {
				Btn_Entrar.setBackground(new Color(245,142,99));
			}
			
		/*REGRESA EL PANEL A SU COLOR ORIGINAL*/	
			@Override
			public void mouseExited(MouseEvent e) {
				Btn_Entrar.setBackground(new Color(243, 113, 56));
			}
			
		/*ACCION AL HACER CLICK AQUI*/
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		Btn_Entrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Btn_Entrar.setBackground(new Color(243, 113, 56));
		Btn_Entrar.setBounds(44, 449, 167, 50);
		Panel_main_login.add(Btn_Entrar);
		Btn_Entrar.setLayout(null);
		
		JLabel Lbl_Btn_Entrar = new JLabel("ENTRAR");
		Lbl_Btn_Entrar.setForeground(Color.WHITE);
		Lbl_Btn_Entrar.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Btn_Entrar.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Btn_Entrar.setBounds(38, 11, 91, 28);
		Btn_Entrar.add(Lbl_Btn_Entrar);
	}
	
	/*METODOS DEL LOGIN*/
	
	/*
	 * public void Validar() { String Nombre = Txt_Usuario.getText(); String Pass =
	 * String.valueOf(Txt_Password.getPassword()); if (!"".equals(Nombre) ||
	 * !"".equals(Pass)) { Usuarios USER = new Usuarios(); ObtenerUserLogin login =
	 * new ObtenerUserLogin(); USER = Usuarios.log(Nombre, Pass); } }
	 */
}
