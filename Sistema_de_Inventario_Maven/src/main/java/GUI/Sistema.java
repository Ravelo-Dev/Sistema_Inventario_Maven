package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JDesktopPane;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sistema {

	private JFrame frmGestinDeInventario;
    private JDesktopPane dpnEscritorio;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sistema window = new Sistema();
					window.frmGestinDeInventario.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sistema() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGestinDeInventario = new JFrame();
		frmGestinDeInventario.setTitle("Gestión de inventario - Boutique los Socios");
		frmGestinDeInventario.setBounds(100, 100, 800, 600);
		frmGestinDeInventario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmGestinDeInventario.setJMenuBar(menuBar);
		
		JMenu MnuArchivo = new JMenu("Archivo");
		menuBar.add(MnuArchivo);
		
		JMenuItem mniSalir = new JMenuItem("Salir");
		mniSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i=JOptionPane.showConfirmDialog(null, "Seguro que quiere salir?"); 
                if(i==0) {
                    System.exit(0);
                }
			}
		});
		MnuArchivo.add(mniSalir);
		
		JMenu mnuCliente = new JMenu("Clientes");
		menuBar.add(mnuCliente);
		
		JMenuItem mniCrearCliente = new JMenuItem("Crear");
		mniCrearCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Crear_Clientes crearClientes = new Crear_Clientes();
				dpnEscritorio.add(crearClientes);
				crearClientes.show();
			}
		});
		mnuCliente.add(mniCrearCliente);
		
		JMenuItem mniBuscarClientes = new JMenuItem("Buscar");
		mnuCliente.add(mniBuscarClientes);
		
		JMenuItem mniActualizarClientes = new JMenuItem("Actualizar");
		mnuCliente.add(mniActualizarClientes);
		
		JMenuItem mniEliminarClientes = new JMenuItem("Eliminar");
		mnuCliente.add(mniEliminarClientes);
		
		JMenu mnuProveedor = new JMenu("Proveedores");
		menuBar.add(mnuProveedor);
		
		JMenuItem mniCrearProveedor = new JMenuItem("Crear");
		mnuProveedor.add(mniCrearProveedor);
		
		JMenuItem mniBuscarProveedores = new JMenuItem("Buscar");
		mnuProveedor.add(mniBuscarProveedores);
		
		JMenuItem mniActualizarProveedor = new JMenuItem("Actualizar");
		mnuProveedor.add(mniActualizarProveedor);
		
		JMenuItem mniEliminarProveedor = new JMenuItem("Eliminar");
		mnuProveedor.add(mniEliminarProveedor);
		
		JMenu mnuProducto = new JMenu("Productos");
		menuBar.add(mnuProducto);
		
		JMenuItem mniCrearProducto = new JMenuItem("Crear");
		mnuProducto.add(mniCrearProducto);
		
		JMenuItem mniBuscarProveedor = new JMenuItem("Buscar");
		mnuProducto.add(mniBuscarProveedor);
		
		JMenuItem mniActualizarProducto = new JMenuItem("Actualizar");
		mnuProducto.add(mniActualizarProducto);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Eliminar");
		mnuProducto.add(mntmNewMenuItem_12);
		
		JMenu mnuFacturacion = new JMenu("Facturación");
		menuBar.add(mnuFacturacion);
		
		JMenuItem mniCrearFactura = new JMenuItem("Crear");
		mnuFacturacion.add(mniCrearFactura);
		
		JMenuItem mniBucarFactura = new JMenuItem("Buscar");
		mnuFacturacion.add(mniBucarFactura);
		
		JMenu mnuAyuda = new JMenu("Ayuda");
		menuBar.add(mnuAyuda);
		
		JMenuItem MniAcercaAyuda = new JMenuItem("Acerca de");
		mnuAyuda.add(MniAcercaAyuda);
		
		dpnEscritorio = new JDesktopPane();
		frmGestinDeInventario.getContentPane().add(dpnEscritorio, BorderLayout.CENTER);
	}
}
