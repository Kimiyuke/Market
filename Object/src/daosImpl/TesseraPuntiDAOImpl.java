package daosImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Classi.TesseraPunti;


public class TesseraPuntiDAOImpl {

	public  	ArrayList<TesseraPunti> SelectPuntiFrutta() throws Exception {
		ArrayList<TesseraPunti> tessera = new ArrayList<TesseraPunti>();
		TesseraPunti T;
		
		
		
		  try {
		         Class.forName("org.postgresql.Driver");//load il driver
		         
		         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
		         
		         Statement st= con.createStatement();//creo object di statement 
		         
		         ResultSet rs= st.executeQuery("SELECT * FROM TESSERA_PUNTI ORDER BY PUNTI_FRUTTA DESC");

		         



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

	public  	ArrayList<TesseraPunti> SelectPuntiVerdura() throws Exception {
		ArrayList<TesseraPunti> tessera = new ArrayList<TesseraPunti>();
		TesseraPunti T;
		
		
		
		  try {
		         Class.forName("org.postgresql.Driver");//load il driver
		         
		         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
		         
		         Statement st= con.createStatement();//creo object di statement 
		         
		         ResultSet rs= st.executeQuery("SELECT * FROM TESSERA_PUNTI ORDER BY PUNTI_VERDURA DESC");

		         



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

	public  	ArrayList<TesseraPunti> SelectPuntiConfezionati() throws Exception {
		ArrayList<TesseraPunti> tessera = new ArrayList<TesseraPunti>();
		TesseraPunti T;
		
		
		
		  try {
		         Class.forName("org.postgresql.Driver");//load il driver
		         
		         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
		         
		         Statement st= con.createStatement();//creo object di statement 
		         
		         ResultSet rs= st.executeQuery("SELECT * FROM TESSERA_PUNTI ORDER BY PUNTI_CONFEZIONATI DESC");

		        



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
	
	
	public  	ArrayList<TesseraPunti> SelectPuntiLatticini() throws Exception {
		ArrayList<TesseraPunti> tessera = new ArrayList<TesseraPunti>();
		TesseraPunti T;
		
		
		
		  try {
		         Class.forName("org.postgresql.Driver");//load il driver
		         
		         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
		         
		         Statement st= con.createStatement();//creo object di statement 
		         
		         ResultSet rs= st.executeQuery("SELECT * FROM TESSERA_PUNTI ORDER BY PUNTI_Latticini DESC");

		         



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
	
	
	
	public  	ArrayList<TesseraPunti> SelectPuntiUova() throws Exception {
		ArrayList<TesseraPunti> tessera = new ArrayList<TesseraPunti>();
		TesseraPunti T;
		
		
		
		  try {
		         Class.forName("org.postgresql.Driver");//load il driver
		         
		         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
		         
		         Statement st= con.createStatement();//creo object di statement 
		         
		         ResultSet rs= st.executeQuery("SELECT * FROM TESSERA_PUNTI ORDER BY PUNTI_UOVA DESC");

		         



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
	
	
	public  	ArrayList<TesseraPunti> SelectPuntiFarinacei() throws Exception {
		ArrayList<TesseraPunti> tessera = new ArrayList<TesseraPunti>();
		TesseraPunti T;
		
		
		
		  try {
		         Class.forName("org.postgresql.Driver");//load il driver
		         
		         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
		         
		         Statement st= con.createStatement();//creo object di statement 
		         
		         ResultSet rs= st.executeQuery("SELECT * FROM TESSERA_PUNTI ORDER BY PUNTI_Farinacei DESC");

		         


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


	public  	ArrayList<TesseraPunti> SelectPezziFrutta() throws Exception {
		ArrayList<TesseraPunti> tessera = new ArrayList<TesseraPunti>();
		TesseraPunti T;
		
		
		
		  try {
		         Class.forName("org.postgresql.Driver");//load il driver
		         
		         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
		         
		         Statement st= con.createStatement();//creo object di statement 
		         
		         ResultSet rs= st.executeQuery("SELECT * FROM TESSERA_PUNTI ORDER BY N_PEZZI_FRUTTA DESC");

		         



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

	public  	ArrayList<TesseraPunti> SelectPezziVerdura() throws Exception {
		ArrayList<TesseraPunti> tessera = new ArrayList<TesseraPunti>();
		TesseraPunti T;
		
		
		
		  try {
		         Class.forName("org.postgresql.Driver");//load il driver
		         
		         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
		         
		         Statement st= con.createStatement();//creo object di statement 
		         
		         ResultSet rs= st.executeQuery("SELECT * FROM TESSERA_PUNTI ORDER BY N_PEZZI_VERDURA DESC");

		         



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

public  	ArrayList<TesseraPunti> SelectPezziConfezionati() throws Exception {
	ArrayList<TesseraPunti> tessera = new ArrayList<TesseraPunti>();
	TesseraPunti T;
	
	
	
	  try {
	         Class.forName("org.postgresql.Driver");//load il driver
	         
	         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
	         
	         Statement st= con.createStatement();//creo object di statement 
	         
	         ResultSet rs= st.executeQuery("SELECT * FROM TESSERA_PUNTI ORDER BY N_PEZZI_CONFEZIONATI DESC");

	        



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

public  	ArrayList<TesseraPunti> SelectPezziUova() throws Exception {
	ArrayList<TesseraPunti> tessera = new ArrayList<TesseraPunti>();
	TesseraPunti T;
	
	
	
	  try {
	         Class.forName("org.postgresql.Driver");//load il driver
	         
	         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
	         
	         Statement st= con.createStatement();//creo object di statement 
	         
	         ResultSet rs= st.executeQuery("SELECT * FROM TESSERA_PUNTI ORDER BY N_Pezzi_UOVA DESC");

	         



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

public  	ArrayList<TesseraPunti> SelectPezziFarinacei() throws Exception {
	ArrayList<TesseraPunti> tessera = new ArrayList<TesseraPunti>();
	TesseraPunti T;
	
	
	
	  try {
	         Class.forName("org.postgresql.Driver");//load il driver
	         
	         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
	         
	         Statement st= con.createStatement();//creo object di statement 
	         
	         ResultSet rs= st.executeQuery("SELECT * FROM TESSERA_PUNTI ORDER BY N_Pezzi_Farinacei DESC");

	        



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