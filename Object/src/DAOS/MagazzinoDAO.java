package DAOS;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import Classi.Cliente;
import Classi.Magazzino;
import Panels.PanelAggiuntaAcquisto;
import Panels.PanelMagazzino;


public class MagazzinoDAO {

	public static ArrayList<Magazzino> SelectProdottiFrutta() {
		
		ArrayList<Magazzino> magazzino = new ArrayList<Magazzino>();
        Magazzino m;
   
   try {
         Class.forName("org.postgresql.Driver");//load il driver
         System.out.println("connession1");
         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
         System.out.println("connession2");
         Statement st= con.createStatement();//creo object di statement 
         System.out.println("connession3");
         ResultSet rs= st.executeQuery("SELECT   FROM MAGAZZINO,VERDURA");

         System.out.println("connession");



          while (rs.next()) {//FETCHA RISULTATO IN ARRAYLIST CREANDO UN CLIENTE PER OGNI ISTANZA TROVATA
              m= new Magazzino(
                      rs.getString("Idprodotto"),
                     rs.getInt("disponibilitatotale"),
                     rs.getString("marca"),
                     rs.getString("nome")
                      );
              magazzino.add(m);
          }



          }
          catch (Exception x) {
      System.out.println("SelectProdottiFrutta");
     return null;
           }
   return magazzino;


		
		
		
	}

}
