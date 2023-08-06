package Config;

/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexion {
	Connection Con;
	
	public Connection getConnection() {
		try {
			String MyDB = "jdbc:mysql://localhost:3306/sistema_de_inventario";
			Con = DriverManager.getConnection(MyDB, "root", "");
			JOptionPane.showMessageDialog(null, "Conexion exitosa");
			return Con;
		} catch (SQLException e) {
			System.out.println(e.toString());
			JOptionPane.showMessageDialog(null, "Conexion no establecida" + e.getMessage());
		}
		return null;
	}
}*/

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class Conexion {
	Connection Con;
	
	public Conexion () {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_inventario", "root", "");
			JOptionPane.showMessageDialog(null, "Conexion establecida");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Conexion no establecida" + e.getMessage());
		}
	}
	
	public Connection getConnection() {
		return Con;
	}
}
