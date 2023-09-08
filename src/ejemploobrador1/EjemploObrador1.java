
package ejemploobrador1;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;



public class EjemploObrador1 {

  
    public static void main(String[] args) {
        
        
         String user= "root";
            String clave = "";
            String url = "jdbc:mariadb://localhost:3306/obrador2023";
            Connection con;
            Statement st;
            ResultSet rs;
            
            
        try {
           
 
            Class.forName("org.mariadb.jdbc.Driver");
            
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error de carga de Driver");
        }
        try {
            con = DriverManager.getConnection(url, user, clave);
            st = con.createStatement();
           /*Agrega un elemento a la tabla empleado de la base de datos obrador 2023
           st.executeUpdate("INSERT INTO empleado VALUES (null, 12958784,'Vartolome', 'Mario', 5, 1)");*/
           /*Elimina un elemento a la tabla empleado de la base de datos obrador 2023  
            st.executeUpdate("DELETE fROM empleado WHERE dni = 12958784");*/
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error de carga");
        }
        
       
    }
    
}
