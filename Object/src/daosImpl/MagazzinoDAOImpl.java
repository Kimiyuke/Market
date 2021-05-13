package daosImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import Classi.Magazzino;


public class MagazzinoDAOImpl {

	public  ArrayList<Magazzino> SelectProdottiFrutta() {
		
		ArrayList<Magazzino> magazzino = new ArrayList<Magazzino>();
        Magazzino m;
   
   try {
         Class.forName("org.postgresql.Driver");//load il driver
        
         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
         
         Statement st= con.createStatement();//creo object di statement 
         
         ResultSet rs= st.executeQuery("SELECT MAGAZZINO.ID_PRODOTTO, MAGAZZINO.DISPONIBILITA_TOTALE, MAGAZZINO.NOME, MAGAZZINO.MARCA, MAGAZZINO.PREZZO FROM MAGAZZINO NATURAL JOIN FRUTTA");

         



          while (rs.next()) {//FETCHA RISULTATO IN ARRAYLIST CREANDO UN CLIENTE PER OGNI ISTANZA TROVATA
              m= new Magazzino(
                      rs.getString("Id_prodotto"),
                      rs.getInt("disponibilita_totale"),
                     rs.getString("nome"),
                     rs.getString("marca"),
                     rs.getFloat("prezzo")
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

	public ArrayList<Magazzino> SelectProdottiFarinacei() {
		ArrayList<Magazzino> magazzino = new ArrayList<Magazzino>();
        Magazzino m;
   
   try {
         Class.forName("org.postgresql.Driver");//load il driver
        
         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
         
         Statement st= con.createStatement();//creo object di statement 
         
         ResultSet rs= st.executeQuery("SELECT MAGAZZINO.ID_PRODOTTO, MAGAZZINO.DISPONIBILITA_TOTALE, MAGAZZINO.NOME, MAGAZZINO.MARCA, MAGAZZINO.PREZZO FROM MAGAZZINO NATURAL JOIN FARINACEI");

         



          while (rs.next()) {//FETCHA RISULTATO IN ARRAYLIST CREANDO UN CLIENTE PER OGNI ISTANZA TROVATA
              m= new Magazzino(
                      rs.getString("Id_prodotto"),
                      rs.getInt("disponibilita_totale"),
                     rs.getString("nome"),
                     rs.getString("marca"),
                     rs.getFloat("prezzo")
                      );
              magazzino.add(m);
          }

          

          }
          catch (Exception x) {
      System.out.println("SelectProdottiFarinacei");
     return null;
           }
   return magazzino;
	
	}

	public ArrayList<Magazzino> SelectProdottiVerdura() {
		ArrayList<Magazzino> magazzino = new ArrayList<Magazzino>();
        Magazzino m;
   
   try {
         Class.forName("org.postgresql.Driver");//load il driver
         
         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
         
         Statement st= con.createStatement();//creo object di statement 
         
         ResultSet rs= st.executeQuery("SELECT MAGAZZINO.ID_PRODOTTO, MAGAZZINO.DISPONIBILITA_TOTALE, MAGAZZINO.NOME, MAGAZZINO.MARCA, MAGAZZINO.PREZZO FROM MAGAZZINO NATURAL JOIN VERDURA");

         



          while (rs.next()) {//FETCHA RISULTATO IN ARRAYLIST CREANDO UN CLIENTE PER OGNI ISTANZA TROVATA
              m= new Magazzino(
                      rs.getString("Id_prodotto"),
                      rs.getInt("disponibilita_totale"),
                     rs.getString("nome"),
                     rs.getString("marca"),
                     rs.getFloat("prezzo")
                      );
              magazzino.add(m);
          }

          

          }
          catch (Exception x) {
      System.out.println("SelectProdottiFarinacei");
     return null;
           }
   return magazzino;
	
	}

	public ArrayList<Magazzino> SelectProdottiConfezionati() {
		ArrayList<Magazzino> magazzino = new ArrayList<Magazzino>();
        Magazzino m;
   
   try {
         Class.forName("org.postgresql.Driver");//load il driver
         
         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
         
         Statement st= con.createStatement();//creo object di statement 
         
         ResultSet rs= st.executeQuery("SELECT CONFEZIONATI.ID_PRODOTTO, CONFEZIONATI.DISPONIBILITA_TOTALE, CONFEZIONATI.NOME, CONFEZIONATI.MARCA, CONFEZIONATI.PREZZO FROM CONFEZIONATI");

         



          while (rs.next()) {//FETCHA RISULTATO IN ARRAYLIST CREANDO UN CLIENTE PER OGNI ISTANZA TROVATA
              m= new Magazzino(
                      rs.getString("Id_prodotto"),
                      rs.getInt("disponibilita_totale"),
                     rs.getString("nome"),
                     rs.getString("marca"),
                     rs.getFloat("prezzo")
                      );
              magazzino.add(m);
          }

          

          }
          catch (Exception x) {
      System.out.println("SelectProdottiFarinacei");
     return null;
           }
   return magazzino;
	
	}

	public ArrayList<Magazzino> SelectProdottiLatticini() {
		ArrayList<Magazzino> magazzino = new ArrayList<Magazzino>();
        Magazzino m;
   
   try {
         Class.forName("org.postgresql.Driver");//load il driver
         
         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
         
         Statement st= con.createStatement();//creo object di statement 
         
         ResultSet rs= st.executeQuery("SELECT MAGAZZINO.ID_PRODOTTO, MAGAZZINO.DISPONIBILITA_TOTALE, MAGAZZINO.NOME, MAGAZZINO.MARCA, MAGAZZINO.PREZZO FROM MAGAZZINO NATURAL JOIN LATTICINI");

         



          while (rs.next()) {//FETCHA RISULTATO IN ARRAYLIST CREANDO UN CLIENTE PER OGNI ISTANZA TROVATA
              m= new Magazzino(
                      rs.getString("Id_prodotto"),
                      rs.getInt("disponibilita_totale"),
                     rs.getString("nome"),
                     rs.getString("marca"),
                     rs.getFloat("prezzo")
                      );
              magazzino.add(m);
          }

          

          }
          catch (Exception x) {
      System.out.println("SelectProdottiFarinacei");
     return null;
           }
   return magazzino;
	
	}

	public ArrayList<Magazzino> SelectProdottiUova() {
		ArrayList<Magazzino> magazzino = new ArrayList<Magazzino>();
        Magazzino m;
   
   try {
         Class.forName("org.postgresql.Driver");//load il driver
         
         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
        
         Statement st= con.createStatement();//creo object di statement 
         ResultSet rs= st.executeQuery("SELECT MAGAZZINO.ID_PRODOTTO, MAGAZZINO.DISPONIBILITA_TOTALE, MAGAZZINO.NOME, MAGAZZINO.MARCA, MAGAZZINO.PREZZO FROM MAGAZZINO NATURAL JOIN UOVA");

         



          while (rs.next()) {//FETCHA RISULTATO IN ARRAYLIST CREANDO UN CLIENTE PER OGNI ISTANZA TROVATA
              m= new Magazzino(
                      rs.getString("Id_prodotto"),
                      rs.getInt("disponibilita_totale"),
                     rs.getString("nome"),
                     rs.getString("marca"),
                     rs.getFloat("prezzo")
                      );
              magazzino.add(m);
          }

        

          }
          catch (Exception x) {
      System.out.println("SelectProdottiFarinacei");
     return null;
           }
   return magazzino;
	
	}

}
