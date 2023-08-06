package GUI;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.border.TitledBorder;
import javax.xml.validation.Validator;

import org.apache.commons.validator.EmailValidator;
import org.apache.commons.validator.routines.IntegerValidator;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Crear_Clientes extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtDirecion;
	private JTextField txtTelefono;
	private JTextField txtCorreo;
	private JTextField txtCedula;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Crear_Clientes frame = new Crear_Clientes();
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
	public Crear_Clientes() {
		setResizable(true);
		setClosable(true);
		setBorder(new TitledBorder(null, "Datos ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setTitle("Crear-Clientes");
		setBounds(100, 100, 600, 400);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Datos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panelImagen = new JPanel();
		panelImagen.setBackground(new Color(255, 128, 0));
		panelImagen.setForeground(new Color(0, 255, 0));
		panelImagen.setBounds(346, 11, 242, 345);
		panel.add(panelImagen);
		panelImagen.setLayout(null);
		
		JLabel lblNombreCliente = new JLabel("Nombre:");
		lblNombreCliente.setBounds(10, 83, 68, 14);
		panel.add(lblNombreCliente);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(88, 80, 200, 20);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(10, 113, 68, 14);
		panel.add(lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(88, 110, 248, 20);
		panel.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		JLabel lblDirecionCliente = new JLabel("Dirección:");
		lblDirecionCliente.setBounds(10, 155, 68, 14);
		panel.add(lblDirecionCliente);
		
		txtDirecion = new JTextField();
		txtDirecion.setBounds(88, 152, 248, 20);
		panel.add(txtDirecion);
		txtDirecion.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(10, 185, 54, 20);
		panel.add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(88, 183, 250, 20);
		panel.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(10, 227, 46, 14);
		panel.add(lblCorreo);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(88, 224, 248, 20);
		panel.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		JButton btnCrearCliente = new JButton("Crear");
		btnCrearCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cedula = txtCedula.getText().strip();
				String nombre = txtNombre.getText().strip();
				String Apellidos = txtApellidos.getText().strip();
				String Direccion = txtDirecion.getText().strip();
				String Telefono = txtTelefono.getText().strip();
				String correo = txtCorreo.getText().strip();
				
				if(cedula.isEmpty()) {
					JOptionPane.showMessageDialog(Crear_Clientes.this, "El campo cedula es obligatorio", "Advertencia",JOptionPane.WARNING_MESSAGE);	
					return;
				}
				
				Integer numeroCedula = IntegerValidator.getInstance().validate(cedula);
				if(numeroCedula == null) {
					JOptionPane.showMessageDialog(Crear_Clientes.this, "El campo cedula debe ser númerico", "Advertencia",JOptionPane.WARNING_MESSAGE);	
					return;
					
				}
				if(numeroCedula < 0) {
					JOptionPane.showMessageDialog(Crear_Clientes.this, "El campo cedula debe ser un número positivo", "Advertencia",JOptionPane.WARNING_MESSAGE);	
					return;
				}
				
				
				if(nombre.isEmpty()) {
					JOptionPane.showMessageDialog(Crear_Clientes.this, "El campo nombre es obligatorio", "Advertencia",JOptionPane.WARNING_MESSAGE);	
					return;
				}
				
				if(Apellidos.isEmpty()) {
					JOptionPane.showMessageDialog(Crear_Clientes.this, "El campo apellidos es obligatorio", "Advertencia",JOptionPane.WARNING_MESSAGE);	
					return;
				}
				if(Direccion.isEmpty()) {
					JOptionPane.showMessageDialog(Crear_Clientes.this, "El campo dirección es obligatorio", "Advertencia",JOptionPane.WARNING_MESSAGE);	
				}
				
				if(Telefono.isEmpty()) {
					JOptionPane.showMessageDialog(Crear_Clientes.this, "El campo telefono es obligatorio", "Advertencia",JOptionPane.WARNING_MESSAGE);	
					return;
				}
				if(Telefono.length() != 10) {
					JOptionPane.showMessageDialog(Crear_Clientes.this, "El número de telefono debe contener 10 digitos", "Advertencia",JOptionPane.WARNING_MESSAGE);	
					return;
					
				}
				
				Integer numero = IntegerValidator.getInstance().validate(Telefono);
				if(numero == null) {
					JOptionPane.showMessageDialog(Crear_Clientes.this, "El campo telefono debe ser númerico", "Advertencia",JOptionPane.WARNING_MESSAGE);	
					return;
					
				}
				if(numero <= 0) {
					JOptionPane.showMessageDialog(Crear_Clientes.this, "El campo telefono debe ser  números positivo", "Advertencia",JOptionPane.WARNING_MESSAGE);	
					return;
				}
				
				if(correo.isEmpty()) {
					JOptionPane.showMessageDialog(Crear_Clientes.this, "El campo correo es obligatorio", "Advertencia",JOptionPane.WARNING_MESSAGE);	
					return;
				}
				
				if(!EmailValidator.getInstance().isValid(correo)) {
					JOptionPane.showMessageDialog(Crear_Clientes.this, "El valor del campo correo no es valido", "Advertencia",JOptionPane.WARNING_MESSAGE);	
					return;
					
				}
			}
		});
		btnCrearCliente.setBounds(42, 282, 89, 23);
		panel.add(btnCrearCliente);
		
		JButton btnLimpiarcampos = new JButton("Limpiar");
		btnLimpiarcampos.setBounds(206, 282, 89, 23);
		panel.add(btnLimpiarcampos);
		
		JLabel lblCedula = new JLabel("Cedula:");
		lblCedula.setBounds(10, 39, 46, 14);
		panel.add(lblCedula);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(88, 36, 200, 20);
		panel.add(txtCedula);
		txtCedula.setColumns(10);

	}
}
