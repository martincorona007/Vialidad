package pri;

import java.sql.*;

import javax.swing.JOptionPane;

import Formularios.LoginAdministrator;
import Formularios.LoginUser;
public class DbConnection {
	/**Parametros de conexion*/
	   static String bd = "basevialidad";
	   static String login = "root";
	   static String password = "virusantrax12";
	   static String url = "jdbc:mysql://localhost/"+bd;
	   
	   Connection connection = null;
	   private java.sql.ResultSet rs; // conjunto de resultados
	   /** Constructor de DbConnection */

	   
	   public DbConnection() {
	      try{
	        
	         Class.forName("com.mysql.jdbc.Driver");
	         
	         connection = DriverManager.getConnection(url,login,password);
	        
	         if (connection!=null){
	            System.out.println("Conexi�n a base de datos "+bd+" OK\n");
	         }
	      }
	      catch(Exception e){
	    	  System.out.println("NO HAY CONEXXION\n");
	         System.out.println(e);
	      }
	      
	   }
	   /**Permite retornar la conexi�n*/
	   public Connection getConnection(){
	      return connection;
	   }
	   public void entrar(String sentencia)throws SQLException{
		   Statement stmt=connection.createStatement();
		   stmt.executeUpdate(sentencia);
		}
	   public void insertar(String sentencia) throws SQLException{
		   Statement stmt=connection.createStatement();
		   stmt.executeUpdate(sentencia);
		   rs=stmt.getResultSet();
		   while(rs.next()){
			   
		   }
		   
	   }
	   public void eliminar(String sentencia) throws SQLException{
		   Statement stmt=connection.createStatement();
		   stmt.executeUpdate(sentencia);
		   rs=stmt.getResultSet();
		   while(rs.next()){
			   
		   }
	   }
	   public void consultar(String sentencia)throws SQLException{
		   Statement stmt=connection.createStatement();
		   stmt.executeQuery(sentencia);
		   rs=stmt.getResultSet();
		   	while(rs.next()){
		   		
		   JOptionPane.showMessageDialog(null,rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		   	}
	   }
	   
	   public void desconectar(){
	      connection = null;
	   }
	   
}
