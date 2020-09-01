package Conexion;
import java.sql.*;

public class conecta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//1. Crear Conexion.
			
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:8080/bd_eva02", "root", "122417");
			
			//2. Crear objeto statement
			
			Statement miStatement = miConexion.createStatement();
			
			//3. Ejecutar instruccion sql.
			
			ResultSet miResultset=miStatement.executeQuery("SELECT * FROM PERSONA");
			
			//4. Recorrer el resulset.
			
			while(miResultset.next()){
				
				System.out.println(miResultset.getString("Rut") + " " + miResultset.getString("Nombre") + " " + miResultset.getString("Apellido") + " " + miResultset.getString("Telefono") + " " + miResultset.getString("FechaIngreso"));
				
			}
			
			
		} catch (Exception e) {
			 System.out.println("No conecta");
			 
			 e.printStackTrace();
		}

	}

}
