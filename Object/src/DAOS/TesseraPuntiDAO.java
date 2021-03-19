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
import Classi.TesseraPunti;
import Panels.PanelAggiuntaAcquisto;
import Panels.PanelMagazzino;


public class TesseraPuntiDAO {

	public static 	ArrayList<TesseraPunti> SelectPuntiFrutta() throws Exception {
		ArrayList<TesseraPunti> tessera = new ArrayList<TesseraPunti>();
		TesseraPunti T;
		
		
		
		  try {
		         Class.forName("org.postgresql.Driver");//load il driver
		         
		         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
		         
		         Statement st= con.createStatement();//creo object di statement 
		         
		         ResultSet rs= st.executeQuery("SELECT * FROM TESSERA_PUNTI ORDER BY PUNTI_FRUTTA DESC");

		         System.out.println("connession");



		          while (rs.next()) {//FETCHA RISULTATO IN ARRAYLIST CREANDO UN CLIENTE PER OGNI ISTANZA TROVATA
		              T= new TesseraPunti(
		                      rs.getString("Codice_Tessera"),
		                     rs.getDate("Data_Di_Scadenza"),
		                     rs.getInt("Totale_Punti"),
		                     rs.getInt("Punti_Farinacei"),
		                     rs.getInt("Punti_Uova"),
		                     rs.getInt("Punti_Frutta"),
		                     rs.getInt("Punti_Verdura"),
		                     rs.getInt("Punti_Confezionati"),
		                     rs.getInt("Punti_Latticini"),
		                     rs.getInt("N_Pezzi_Frutta"),
		                     rs.getInt("N_Pezzi_Verdura"),
		                     rs.getInt("N_Pezzi_Confezionati"),
		                     rs.getInt("N_Pezzi_Latticini"),
		                     rs.getInt("N_Pezzi_Uova"),
		                     rs.getInt("N_Pezzi_Farinacei")
		                      );
		              tessera.add(T);
		          }



		          }
		  catch (SQLException x) {
	          System.out.println("Tabella punti clienti " +x);
		     return null;
		           }
		   return tessera;
	}

	public static 	ArrayList<TesseraPunti> SelectPuntiVerdura() throws Exception {
		ArrayList<TesseraPunti> tessera = new ArrayList<TesseraPunti>();
		TesseraPunti T;
		
		
		
		  try {
		         Class.forName("org.postgresql.Driver");//load il driver
		         
		         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
		         
		         Statement st= con.createStatement();//creo object di statement 
		         
		         ResultSet rs= st.executeQuery("SELECT * FROM TESSERA_PUNTI ORDER BY PUNTI_VERDURA DESC");

		         System.out.println("connession");



		          while (rs.next()) {//FETCHA RISULTATO IN ARRAYLIST CREANDO UN CLIENTE PER OGNI ISTANZA TROVATA
		              T= new TesseraPunti(
		                      rs.getString("Codice_Tessera"),
		                     rs.getDate("Data_Di_Scadenza"),
		                     rs.getInt("Totale_Punti"),
		                     rs.getInt("Punti_Farinacei"),
		                     rs.getInt("Punti_Uova"),
		                     rs.getInt("Punti_Frutta"),
		                     rs.getInt("Punti_Verdura"),
		                     rs.getInt("Punti_Confezionati"),
		                     rs.getInt("Punti_Latticini"),
		                     rs.getInt("N_Pezzi_Frutta"),
		                     rs.getInt("N_Pezzi_Verdura"),
		                     rs.getInt("N_Pezzi_Confezionati"),
		                     rs.getInt("N_Pezzi_Latticini"),
		                     rs.getInt("N_Pezzi_Uova"),
		                     rs.getInt("N_Pezzi_Farinacei")
		                      );
		              tessera.add(T);
		          }



		          }
		  catch (SQLException x) {
	          System.out.println("Tabella punti clienti " +x);
		     return null;
		           }
		   return tessera;
	}

	public static 	ArrayList<TesseraPunti> SelectPuntiConfezionati() throws Exception {
		ArrayList<TesseraPunti> tessera = new ArrayList<TesseraPunti>();
		TesseraPunti T;
		
		
		
		  try {
		         Class.forName("org.postgresql.Driver");//load il driver
		         
		         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
		         
		         Statement st= con.createStatement();//creo object di statement 
		         
		         ResultSet rs= st.executeQuery("SELECT * FROM TESSERA_PUNTI ORDER BY PUNTI_CONFEZIONATI DESC");

		         System.out.println("connession");



		          while (rs.next()) {//FETCHA RISULTATO IN ARRAYLIST CREANDO UN CLIENTE PER OGNI ISTANZA TROVATA
		              T= new TesseraPunti(
		                      rs.getString("Codice_Tessera"),
		                     rs.getDate("Data_Di_Scadenza"),
		                     rs.getInt("Totale_Punti"),
		                     rs.getInt("Punti_Farinacei"),
		                     rs.getInt("Punti_Uova"),
		                     rs.getInt("Punti_Frutta"),
		                     rs.getInt("Punti_Verdura"),
		                     rs.getInt("Punti_Confezionati"),
		                     rs.getInt("Punti_Latticini"),
		                     rs.getInt("N_Pezzi_Frutta"),
		                     rs.getInt("N_Pezzi_Verdura"),
		                     rs.getInt("N_Pezzi_Confezionati"),
		                     rs.getInt("N_Pezzi_Latticini"),
		                     rs.getInt("N_Pezzi_Uova"),
		                     rs.getInt("N_Pezzi_Farinacei")
		                      );
		              tessera.add(T);
		          }



		          }
		  catch (SQLException x) {
	          System.out.println("Tabella punti clienti " +x);
		     return null;
		           }
		   return tessera;
	}
	
	
	public static 	ArrayList<TesseraPunti> SelectPuntiLatticini() throws Exception {
		ArrayList<TesseraPunti> tessera = new ArrayList<TesseraPunti>();
		TesseraPunti T;
		
		
		
		  try {
		         Class.forName("org.postgresql.Driver");//load il driver
		         
		         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
		         
		         Statement st= con.createStatement();//creo object di statement 
		         
		         ResultSet rs= st.executeQuery("SELECT * FROM TESSERA_PUNTI ORDER BY PUNTI_Latticini DESC");

		         System.out.println("connession");



		          while (rs.next()) {//FETCHA RISULTATO IN ARRAYLIST CREANDO UN CLIENTE PER OGNI ISTANZA TROVATA
		              T= new TesseraPunti(
		                      rs.getString("Codice_Tessera"),
		                     rs.getDate("Data_Di_Scadenza"),
		                     rs.getInt("Totale_Punti"),
		                     rs.getInt("Punti_Farinacei"),
		                     rs.getInt("Punti_Uova"),
		                     rs.getInt("Punti_Frutta"),
		                     rs.getInt("Punti_Verdura"),
		                     rs.getInt("Punti_Confezionati"),
		                     rs.getInt("Punti_Latticini"),
		                     rs.getInt("N_Pezzi_Frutta"),
		                     rs.getInt("N_Pezzi_Verdura"),
		                     rs.getInt("N_Pezzi_Confezionati"),
		                     rs.getInt("N_Pezzi_Latticini"),
		                     rs.getInt("N_Pezzi_Uova"),
		                     rs.getInt("N_Pezzi_Farinacei")
		                      );
		              tessera.add(T);
		          }



		          }
		  catch (SQLException x) {
	          System.out.println("Tabella punti clienti " +x);
		     return null;
		           }
		   return tessera;
	}
	
	
	
	public static 	ArrayList<TesseraPunti> SelectPuntiUova() throws Exception {
		ArrayList<TesseraPunti> tessera = new ArrayList<TesseraPunti>();
		TesseraPunti T;
		
		
		
		  try {
		         Class.forName("org.postgresql.Driver");//load il driver
		         
		         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
		         
		         Statement st= con.createStatement();//creo object di statement 
		         
		         ResultSet rs= st.executeQuery("SELECT * FROM TESSERA_PUNTI ORDER BY PUNTI_UOVA DESC");

		         System.out.println("connession");



		          while (rs.next()) {//FETCHA RISULTATO IN ARRAYLIST CREANDO UN CLIENTE PER OGNI ISTANZA TROVATA
		              T= new TesseraPunti(
		                      rs.getString("Codice_Tessera"),
		                     rs.getDate("Data_Di_Scadenza"),
		                     rs.getInt("Totale_Punti"),
		                     rs.getInt("Punti_Farinacei"),
		                     rs.getInt("Punti_Uova"),
		                     rs.getInt("Punti_Frutta"),
		                     rs.getInt("Punti_Verdura"),
		                     rs.getInt("Punti_Confezionati"),
		                     rs.getInt("Punti_Latticini"),
		                     rs.getInt("N_Pezzi_Frutta"),
		                     rs.getInt("N_Pezzi_Verdura"),
		                     rs.getInt("N_Pezzi_Confezionati"),
		                     rs.getInt("N_Pezzi_Latticini"),
		                     rs.getInt("N_Pezzi_Uova"),
		                     rs.getInt("N_Pezzi_Farinacei")
		                      );
		              tessera.add(T);
		          }



		          }
		  catch (SQLException x) {
	          System.out.println("Tabella punti clienti " +x);
		     return null;
		           }
		   return tessera;
	}
	
	
	public static 	ArrayList<TesseraPunti> SelectPuntiFarinacei() throws Exception {
		ArrayList<TesseraPunti> tessera = new ArrayList<TesseraPunti>();
		TesseraPunti T;
		
		
		
		  try {
		         Class.forName("org.postgresql.Driver");//load il driver
		         
		         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
		         
		         Statement st= con.createStatement();//creo object di statement 
		         
		         ResultSet rs= st.executeQuery("SELECT * FROM TESSERA_PUNTI ORDER BY PUNTI_Farinacei DESC");

		         System.out.println("connession");



		          while (rs.next()) {//FETCHA RISULTATO IN ARRAYLIST CREANDO UN CLIENTE PER OGNI ISTANZA TROVATA
		              T= new TesseraPunti(
		                      rs.getString("Codice_Tessera"),
		                     rs.getDate("Data_Di_Scadenza"),
		                     rs.getInt("Totale_Punti"),
		                     rs.getInt("Punti_Farinacei"),
		                     rs.getInt("Punti_Uova"),
		                     rs.getInt("Punti_Frutta"),
		                     rs.getInt("Punti_Verdura"),
		                     rs.getInt("Punti_Confezionati"),
		                     rs.getInt("Punti_Latticini"),
		                     rs.getInt("N_Pezzi_Frutta"),
		                     rs.getInt("N_Pezzi_Verdura"),
		                     rs.getInt("N_Pezzi_Confezionati"),
		                     rs.getInt("N_Pezzi_Latticini"),
		                     rs.getInt("N_Pezzi_Uova"),
		                     rs.getInt("N_Pezzi_Farinacei")
		                      );
		              tessera.add(T);
		          }



		          }
		  catch (SQLException x) {
	          System.out.println("Tabella punti clienti " +x);
		     return null;
		           }
		   return tessera;
	}


	public static 	ArrayList<TesseraPunti> SelectPezziFrutta() throws Exception {
		ArrayList<TesseraPunti> tessera = new ArrayList<TesseraPunti>();
		TesseraPunti T;
		
		
		
		  try {
		         Class.forName("org.postgresql.Driver");//load il driver
		         
		         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
		         
		         Statement st= con.createStatement();//creo object di statement 
		         
		         ResultSet rs= st.executeQuery("SELECT * FROM TESSERA_PUNTI ORDER BY N_PEZZI_FRUTTA DESC");

		         System.out.println("connession");



		          while (rs.next()) {//FETCHA RISULTATO IN ARRAYLIST CREANDO UN CLIENTE PER OGNI ISTANZA TROVATA
		              T= new TesseraPunti(
		                      rs.getString("Codice_Tessera"),
		                     rs.getDate("Data_Di_Scadenza"),
		                     rs.getInt("Totale_Punti"),
		                     rs.getInt("Punti_Farinacei"),
		                     rs.getInt("Punti_Uova"),
		                     rs.getInt("Punti_Frutta"),
		                     rs.getInt("Punti_Verdura"),
		                     rs.getInt("Punti_Confezionati"),
		                     rs.getInt("Punti_Latticini"),
		                     rs.getInt("N_Pezzi_Frutta"),
		                     rs.getInt("N_Pezzi_Verdura"),
		                     rs.getInt("N_Pezzi_Confezionati"),
		                     rs.getInt("N_Pezzi_Latticini"),
		                     rs.getInt("N_Pezzi_Uova"),
		                     rs.getInt("N_Pezzi_Farinacei")
		                      );
		              tessera.add(T);
		          }



		          }
		  catch (SQLException x) {
	          System.out.println("Tabella punti clienti " +x);
		     return null;
		           }
		   return tessera;
	}

	public static 	ArrayList<TesseraPunti> SelectPezziVerdura() throws Exception {
		ArrayList<TesseraPunti> tessera = new ArrayList<TesseraPunti>();
		TesseraPunti T;
		
		
		
		  try {
		         Class.forName("org.postgresql.Driver");//load il driver
		         
		         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
		         
		         Statement st= con.createStatement();//creo object di statement 
		         
		         ResultSet rs= st.executeQuery("SELECT * FROM TESSERA_PUNTI ORDER BY N_PEZZI_VERDURA DESC");

		         System.out.println("connession");



		          while (rs.next()) {//FETCHA RISULTATO IN ARRAYLIST CREANDO UN CLIENTE PER OGNI ISTANZA TROVATA
		              T= new TesseraPunti(
		                      rs.getString("Codice_Tessera"),
		                     rs.getDate("Data_Di_Scadenza"),
		                     rs.getInt("Totale_Punti"),
		                     rs.getInt("Punti_Farinacei"),
		                     rs.getInt("Punti_Uova"),
		                     rs.getInt("Punti_Frutta"),
		                     rs.getInt("Punti_Verdura"),
		                     rs.getInt("Punti_Confezionati"),
		                     rs.getInt("Punti_Latticini"),
		                     rs.getInt("N_Pezzi_Frutta"),
		                     rs.getInt("N_Pezzi_Verdura"),
		                     rs.getInt("N_Pezzi_Confezionati"),
		                     rs.getInt("N_Pezzi_Latticini"),
		                     rs.getInt("N_Pezzi_Uova"),
		                     rs.getInt("N_Pezzi_Farinacei")
		                      );
		              tessera.add(T);
		          }



		          }
		  catch (SQLException x) {
	          System.out.println("Tabella punti clienti " +x);
		     return null;
		           }
		   return tessera;
	}

public static 	ArrayList<TesseraPunti> SelectPezziConfezionati() throws Exception {
	ArrayList<TesseraPunti> tessera = new ArrayList<TesseraPunti>();
	TesseraPunti T;
	
	
	
	  try {
	         Class.forName("org.postgresql.Driver");//load il driver
	         
	         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
	         
	         Statement st= con.createStatement();//creo object di statement 
	         
	         ResultSet rs= st.executeQuery("SELECT * FROM TESSERA_PUNTI ORDER BY N_PEZZI_CONFEZIONATI DESC");

	         System.out.println("connession");



	          while (rs.next()) {//FETCHA RISULTATO IN ARRAYLIST CREANDO UN CLIENTE PER OGNI ISTANZA TROVATA
	              T= new TesseraPunti(
	                      rs.getString("Codice_Tessera"),
	                     rs.getDate("Data_Di_Scadenza"),
	                     rs.getInt("Totale_Punti"),
	                     rs.getInt("Punti_Farinacei"),
	                     rs.getInt("Punti_Uova"),
	                     rs.getInt("Punti_Frutta"),
	                     rs.getInt("Punti_Verdura"),
	                     rs.getInt("Punti_Confezionati"),
	                     rs.getInt("Punti_Latticini"),
	                     rs.getInt("N_Pezzi_Frutta"),
	                     rs.getInt("N_Pezzi_Verdura"),
	                     rs.getInt("N_Pezzi_Confezionati"),
	                     rs.getInt("N_Pezzi_Latticini"),
	                     rs.getInt("N_Pezzi_Uova"),
	                     rs.getInt("N_Pezzi_Farinacei")
	                      );
	              tessera.add(T);
	          }



	          }
	  catch (SQLException x) {
          System.out.println("Tabella punti clienti " +x);
	     return null;
	           }
	   return tessera;
}

public static 	ArrayList<TesseraPunti> SelectPezziLatticini() throws Exception {
	ArrayList<TesseraPunti> tessera = new ArrayList<TesseraPunti>();
	TesseraPunti T;
	
	
	
	  try {
	         Class.forName("org.postgresql.Driver");//load il driver
	         
	         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
	         
	         Statement st= con.createStatement();//creo object di statement 
	         
	         ResultSet rs= st.executeQuery("SELECT * FROM TESSERA_PUNTI ORDER BY N_PEZZI_Latticini DESC");

	         System.out.println("connession");



	          while (rs.next()) {//FETCHA RISULTATO IN ARRAYLIST CREANDO UN CLIENTE PER OGNI ISTANZA TROVATA
	              T= new TesseraPunti(
	                      rs.getString("Codice_Tessera"),
	                     rs.getDate("Data_Di_Scadenza"),
	                     rs.getInt("Totale_Punti"),
	                     rs.getInt("Punti_Farinacei"),
	                     rs.getInt("Punti_Uova"),
	                     rs.getInt("Punti_Frutta"),
	                     rs.getInt("Punti_Verdura"),
	                     rs.getInt("Punti_Confezionati"),
	                     rs.getInt("Punti_Latticini"),
	                     rs.getInt("N_Pezzi_Frutta"),
	                     rs.getInt("N_Pezzi_Verdura"),
	                     rs.getInt("N_Pezzi_Confezionati"),
	                     rs.getInt("N_Pezzi_Latticini"),
	                     rs.getInt("N_Pezzi_Uova"),
	                     rs.getInt("N_Pezzi_Farinacei")
	                      );
	              tessera.add(T);
	          }



	          }
	  catch (SQLException x) {
          System.out.println("Tabella punti clienti " +x);
	     return null;
	           }
	   return tessera;
}

public static 	ArrayList<TesseraPunti> SelectPezziUova() throws Exception {
	ArrayList<TesseraPunti> tessera = new ArrayList<TesseraPunti>();
	TesseraPunti T;
	
	
	
	  try {
	         Class.forName("org.postgresql.Driver");//load il driver
	         
	         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
	         
	         Statement st= con.createStatement();//creo object di statement 
	         
	         ResultSet rs= st.executeQuery("SELECT * FROM TESSERA_PUNTI ORDER BY N_Pezzi_UOVA DESC");

	         System.out.println("connession");



	          while (rs.next()) {//FETCHA RISULTATO IN ARRAYLIST CREANDO UN CLIENTE PER OGNI ISTANZA TROVATA
	              T= new TesseraPunti(
	                      rs.getString("Codice_Tessera"),
	                     rs.getDate("Data_Di_Scadenza"),
	                     rs.getInt("Totale_Punti"),
	                     rs.getInt("Punti_Farinacei"),
	                     rs.getInt("Punti_Uova"),
	                     rs.getInt("Punti_Frutta"),
	                     rs.getInt("Punti_Verdura"),
	                     rs.getInt("Punti_Confezionati"),
	                     rs.getInt("Punti_Latticini"),
	                     rs.getInt("N_Pezzi_Frutta"),
	                     rs.getInt("N_Pezzi_Verdura"),
	                     rs.getInt("N_Pezzi_Confezionati"),
	                     rs.getInt("N_Pezzi_Latticini"),
	                     rs.getInt("N_Pezzi_Uova"),
	                     rs.getInt("N_Pezzi_Farinacei")
	                      );
	              tessera.add(T);
	          }



	          }
	  catch (SQLException x) {
          System.out.println("Tabella punti clienti " +x);
	     return null;
	           }
	   return tessera;
}

public static 	ArrayList<TesseraPunti> SelectPezziFarinacei() throws Exception {
	ArrayList<TesseraPunti> tessera = new ArrayList<TesseraPunti>();
	TesseraPunti T;
	
	
	
	  try {
	         Class.forName("org.postgresql.Driver");//load il driver
	         
	         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
	         
	         Statement st= con.createStatement();//creo object di statement 
	         
	         ResultSet rs= st.executeQuery("SELECT * FROM TESSERA_PUNTI ORDER BY N_Pezzi_Farinacei DESC");

	         System.out.println("connession");



	          while (rs.next()) {//FETCHA RISULTATO IN ARRAYLIST CREANDO UN CLIENTE PER OGNI ISTANZA TROVATA
	              T= new TesseraPunti(
	                      rs.getString("Codice_Tessera"),
	                     rs.getDate("Data_Di_Scadenza"),
	                     rs.getInt("Totale_Punti"),
	                     rs.getInt("Punti_Farinacei"),
	                     rs.getInt("Punti_Uova"),
	                     rs.getInt("Punti_Frutta"),
	                     rs.getInt("Punti_Verdura"),
	                     rs.getInt("Punti_Confezionati"),
	                     rs.getInt("Punti_Latticini"),
	                     rs.getInt("N_Pezzi_Frutta"),
	                     rs.getInt("N_Pezzi_Verdura"),
	                     rs.getInt("N_Pezzi_Confezionati"),
	                     rs.getInt("N_Pezzi_Latticini"),
	                     rs.getInt("N_Pezzi_Uova"),
	                     rs.getInt("N_Pezzi_Farinacei")
	                      );
	              tessera.add(T);
	          }



	          }
	  catch (SQLException x) {
          System.out.println("Tabella punti clienti " +x);
	     return null;
	           }
	   return tessera;
}
}