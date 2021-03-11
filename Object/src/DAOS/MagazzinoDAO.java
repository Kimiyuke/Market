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
         ResultSet rs= st.executeQuery("SELECT MAGAZZINO.ID_PRODOTTO, MAGAZZINO.DISPONIBILITA_TOTALE, MAGAZZINO.NOME, MAGAZZINO.MARCA, MAGAZZINO.PREZZO FROM MAGAZZINO NATURAL JOIN FRUTTA");

         System.out.println("connession");



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

          System.out.println("connession3");

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
         System.out.println("connession1");
         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
         System.out.println("connession2");
         Statement st= con.createStatement();//creo object di statement 
         System.out.println("connession3");
         ResultSet rs= st.executeQuery("SELECT MAGAZZINO.ID_PRODOTTO, MAGAZZINO.DISPONIBILITA_TOTALE, MAGAZZINO.NOME, MAGAZZINO.MARCA, MAGAZZINO.PREZZO FROM MAGAZZINO NATURAL JOIN FARINACEI");

         System.out.println("connession");



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

          System.out.println("connession3");

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
         System.out.println("connession1");
         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
         System.out.println("connession2");
         Statement st= con.createStatement();//creo object di statement 
         System.out.println("connession3");
         ResultSet rs= st.executeQuery("SELECT MAGAZZINO.ID_PRODOTTO, MAGAZZINO.DISPONIBILITA_TOTALE, MAGAZZINO.NOME, MAGAZZINO.MARCA, MAGAZZINO.PREZZO FROM MAGAZZINO NATURAL JOIN VERDURA");

         System.out.println("connession");



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

          System.out.println("connession3");

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
         System.out.println("connession1");
         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
         System.out.println("connession2");
         Statement st= con.createStatement();//creo object di statement 
         System.out.println("connession3");
         ResultSet rs= st.executeQuery("SELECT CONFEZIONATI.ID_PRODOTTO, CONFEZIONATI.DISPONIBILITA_TOTALE, CONFEZIONATI.NOME, CONFEZIONATI.MARCA, CONFEZIONATI.PREZZO FROM CONFEZIONATI");

         System.out.println("connession");



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

          System.out.println("connession3");

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
         System.out.println("connession1");
         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
         System.out.println("connession2");
         Statement st= con.createStatement();//creo object di statement 
         System.out.println("connession3");
         ResultSet rs= st.executeQuery("SELECT MAGAZZINO.ID_PRODOTTO, MAGAZZINO.DISPONIBILITA_TOTALE, MAGAZZINO.NOME, MAGAZZINO.MARCA, MAGAZZINO.PREZZO FROM MAGAZZINO NATURAL JOIN LATTICINI");

         System.out.println("connession");



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

          System.out.println("connession3");

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
         System.out.println("connession1");
         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
         System.out.println("connession2");
         Statement st= con.createStatement();//creo object di statement 
         System.out.println("connession3");
         ResultSet rs= st.executeQuery("SELECT MAGAZZINO.ID_PRODOTTO, MAGAZZINO.DISPONIBILITA_TOTALE, MAGAZZINO.NOME, MAGAZZINO.MARCA, MAGAZZINO.PREZZO FROM MAGAZZINO NATURAL JOIN UOVA");

         System.out.println("connession");



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

          System.out.println("connession3");

          }
          catch (Exception x) {
      System.out.println("SelectProdottiFarinacei");
     return null;
           }
   return magazzino;
	
	}

}
