package Mod_Consultas;

public class Usuarios {
	//DECLARACION DE VARIABLES 
			private int Id;
			private String Nombre;
			private String Correo;
			private String Pass;
			
			//CONSTRUCTOR VACIO
			public Usuarios() {
				
			}

			//CONSTRUCTOR SOBRE CARGADOR
			public Usuarios(int id, String nombre, String correo, String pass) {
				Id = id;
				Nombre = nombre;
				Correo = correo;
				Pass = pass;
			}

		    //GETTERS Y SETTERS
			public int getId() {
				return Id;
			}


			public void setId(int id) {
				Id = id;
			}


			public String getNombre() {
				return Nombre;
			}


			public void setNombre(String nombre) {
				Nombre = nombre;
			}


			public String getCorreo() {
				return Correo;
			}


			public void setCorreo(String correo) {
				Correo = correo;
			}


			public String getPass() {
				return Pass;
			}


			public void setPass(String pass) {
				Pass = pass;
			}
			
}