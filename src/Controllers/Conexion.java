package Controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static Connection con;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "martinmelo";
    private static final String pass = "administrador";
    private static final String url = "jdbc:mysql://localhost:3306/MEDIO_AMBIENTE";
    
    public Conexion() {
        con = null;
        try
        {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pass);
            if(con != null)
            {
                System.out.println("Conexion establecida correctamente");

            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("Error al conectar "+ e);
        }
    }
    
    public Connection getConexion(){
        return con;
    }
    
    public void closeConexion(){
        con = null;
        if(con == null)
        {
            System.out.println("Conexion terminada");
        }
    }
    
}
