package Config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Mod_Consultas.*;

public class ObtenerUserLogin {
	Connection Con;
	PreparedStatement Ps;
	ResultSet Rs;
	Conexion Cnxn = new Conexion();
	
	public Usuarios log(String Nombre, String Pass) {
		Usuarios U = new Usuarios();
		String sql = "SELECT * FROM usuarios WHERE Nombre = ? AND Pass = ?";
		try {
			Con = Cnxn.getConnection();
			Ps = Con.prepareStatement(sql);
			Ps.setString(1, Nombre);
			Ps.setString(2, Pass);
			Rs = Ps.executeQuery();
			if (Rs.next()) {
				U.setId(Rs.getInt("Id"));
				U.setNombre(Rs.getString("Nombre"));
				U.setPass(Rs.getString("Correo"));
				U.setCorreo(Rs.getString("Pass"));
			}
		} catch (SQLException e){
			System.out.println(e.toString());
		}
		return U;
	} 
	
}