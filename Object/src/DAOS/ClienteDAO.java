package DAOS;
import java.sql.*;
import java.util.ArrayList;
import Panels.PanelClienti;
import javax.swing.table.DefaultTableModel;

import Classi.Cliente;

public class ClienteDAO {

    public  ArrayList<Cliente> SelectClientiPerPuntiFrutta() {
         ArrayList<Cliente> cliente = new ArrayList<Cliente>();
             Cliente C;
        
        try {
        	  System.out.println("connession1");
              Class.forName("org.postgresql.Driver");//load il driver
              System.out.println("connession1");
              Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
              System.out.println("connession2");
              Statement st= con.createStatement();//creo object di statement 
              System.out.println("connession3");
              ResultSet rs= st.executeQuery("SELECT CLIENTE.NOME,CLIENTE.COGNOME,CLIENTE.CODICE_TESSERA,CLIENTE.CF\n"
                      + " FROM CLIENTE,TESSERA_PUNTI \n"
                      + "WHERE\n"
                      + " CLIENTE.CODICE_TESSERA=TESSERA_PUNTI.CODICE_TESSERA \n"
                      + "ORDER BY PUNTI_FRUTTA\n"
                      + " DESC");

              System.out.println("connession");



               while (rs.next()) {//FETCHA RISULTATO IN ARRAYLIST CREANDO UN CLIENTE PER OGNI ISTANZA TROVATA
                   C= new Cliente(
                           rs.getString("nome"),
                          rs.getString("cognome"),
                          rs.getString("codice_tessera"),
                          rs.getString("cf")
                           );
                   cliente.add(C);
               }



               }
               catch (Exception x) {
           System.out.println("XaaX");
          return null;
                }
        return cliente;

    }

	public  ArrayList<Cliente> SelectClientiPerPuntiVerdura() {
		ArrayList<Cliente> cliente = new ArrayList<Cliente>();
        Cliente C;
   
   try {
         Class.forName("org.postgresql.Driver");//load il driver
         System.out.println("connession1");
         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
         System.out.println("connession2");
         Statement st= con.createStatement();//creo object di statement 
         System.out.println("connession3");
         ResultSet rs= st.executeQuery("SELECT CLIENTE.NOME,CLIENTE.COGNOME,CLIENTE.CODICE_TESSERA,CLIENTE.CF\n"
                 + " FROM CLIENTE,TESSERA_PUNTI \n"
                 + "WHERE\n"
                 + " CLIENTE.CODICE_TESSERA=TESSERA_PUNTI.CODICE_TESSERA \n"
                 + "ORDER BY PUNTI_VERDURA\n"
                 + " DESC");

         System.out.println("connession");



          while (rs.next()) {//FETCHA RISULTATO IN ARRAYLIST CREANDO UN CLIENTE PER OGNI ISTANZA TROVATA
              C= new Cliente(
                      rs.getString("nome"),
                     rs.getString("cognome"),
                     rs.getString("codice_tessera"),
                     rs.getString("cf")
                      );
              cliente.add(C);
          }



          }
          catch (Exception x) {
      System.out.println("XaaX");
     return null;
           }
   return cliente;

}

	public ArrayList<Cliente> SelectClientiPerPuntiConfezionati() {
		ArrayList<Cliente> cliente = new ArrayList<Cliente>();
        Cliente C;
   
   try {
         Class.forName("org.postgresql.Driver");//load il driver
         System.out.println("connession1");
         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
         System.out.println("connession2");
         Statement st= con.createStatement();//creo object di statement 
         System.out.println("connession3");
         ResultSet rs= st.executeQuery("SELECT CLIENTE.NOME,CLIENTE.COGNOME,CLIENTE.CODICE_TESSERA,CLIENTE.CF\n"
                 + " FROM CLIENTE,TESSERA_PUNTI \n"
                 + "WHERE\n"
                 + " CLIENTE.CODICE_TESSERA=TESSERA_PUNTI.CODICE_TESSERA \n"
                 + "ORDER BY PUNTI_CONFEZIONATI\n"
                 + " DESC");

         System.out.println("connession");



          while (rs.next()) {//FETCHA RISULTATO IN ARRAYLIST CREANDO UN CLIENTE PER OGNI ISTANZA TROVATA
              C= new Cliente(
                      rs.getString("nome"),
                     rs.getString("cognome"),
                     rs.getString("codice_tessera"),
                     rs.getString("cf")
                      );
              cliente.add(C);
          }



          }
          catch (Exception x) {
      System.out.println("XaaX");
     return null;
           }
   return cliente;

}
	public  ArrayList<Cliente> SelectClientiPerPuntiUova() {
		ArrayList<Cliente> cliente = new ArrayList<Cliente>();
        Cliente C;
   
   try {
         Class.forName("org.postgresql.Driver");//load il driver
         System.out.println("connession1");
         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
         System.out.println("connession2");
         Statement st= con.createStatement();//creo object di statement 
         System.out.println("connession3");
         ResultSet rs= st.executeQuery("SELECT CLIENTE.NOME,CLIENTE.COGNOME,CLIENTE.CODICE_TESSERA,CLIENTE.CF\n"
                 + " FROM CLIENTE,TESSERA_PUNTI \n"
                 + "WHERE\n"
                 + " CLIENTE.CODICE_TESSERA=TESSERA_PUNTI.CODICE_TESSERA \n"
                 + "ORDER BY PUNTI_UOVA\n"
                 + " DESC");

         System.out.println("connession");



          while (rs.next()) {//FETCHA RISULTATO IN ARRAYLIST CREANDO UN CLIENTE PER OGNI ISTANZA TROVATA
              C= new Cliente(
                      rs.getString("nome"),
                     rs.getString("cognome"),
                     rs.getString("codice_tessera"),
                     rs.getString("cf")
                      );
              cliente.add(C);
          }



          }
          catch (Exception x) {
      System.out.println("XaaX");
     return null;
           }
   return cliente;

}

	public  ArrayList<Cliente> SelectClientiPerPuntiLatticini() {
		ArrayList<Cliente> cliente = new ArrayList<Cliente>();
        Cliente C;
   
   try {
         Class.forName("org.postgresql.Driver");//load il driver
         System.out.println("connession1");
         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
         System.out.println("connession2");
         Statement st= con.createStatement();//creo object di statement 
         System.out.println("connession3");
         ResultSet rs= st.executeQuery("SELECT CLIENTE.NOME,CLIENTE.COGNOME,CLIENTE.CODICE_TESSERA,CLIENTE.CF\n"
                 + " FROM CLIENTE,TESSERA_PUNTI \n"
                 + "WHERE\n"
                 + " CLIENTE.CODICE_TESSERA=TESSERA_PUNTI.CODICE_TESSERA \n"
                 + "ORDER BY PUNTI_LATTICINI\n"
                 + " DESC");

         System.out.println("connession");



          while (rs.next()) {//FETCHA RISULTATO IN ARRAYLIST CREANDO UN CLIENTE PER OGNI ISTANZA TROVATA
              C= new Cliente(
                      rs.getString("nome"),
                     rs.getString("cognome"),
                     rs.getString("codice_tessera"),
                     rs.getString("cf")
                      );
              cliente.add(C);
          }



          }
          catch (Exception x) {
      System.out.println("XaaX");
     return null;
           }
   return cliente;

}

	public  ArrayList<Cliente> SelectClientiPerPuntiFarinacei() {
		ArrayList<Cliente> cliente = new ArrayList<Cliente>();
        Cliente C;
   
   try {
         Class.forName("org.postgresql.Driver");//load il driver
         System.out.println("connession1");
         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
         System.out.println("connession2");
         Statement st= con.createStatement();//creo object di statement 
         System.out.println("connession3");
         ResultSet rs= st.executeQuery("SELECT CLIENTE.NOME,CLIENTE.COGNOME,CLIENTE.CODICE_TESSERA,CLIENTE.CF\n"
                 + " FROM CLIENTE,TESSERA_PUNTI \n"
                 + "WHERE\n"
                 + " CLIENTE.CODICE_TESSERA=TESSERA_PUNTI.CODICE_TESSERA \n"
                 + "ORDER BY PUNTI_FRUTTA\n"
                 + " DESC");

         System.out.println("connession");



          while (rs.next()) {//FETCHA RISULTATO IN ARRAYLIST CREANDO UN CLIENTE PER OGNI ISTANZA TROVATA
              C= new Cliente(
                      rs.getString("nome"),
                     rs.getString("cognome"),
                     rs.getString("codice_tessera"),
                     rs.getString("cf")
                      );
              cliente.add(C);
          }



          }
          catch (Exception x) {
      System.out.println("XaaX");
     return null;
           }
   return cliente;

}

	public  ArrayList<Cliente> SelectClientiPerPezziFrutta() {
		ArrayList<Cliente> cliente = new ArrayList<Cliente>();
        Cliente C;
   
   try {
         Class.forName("org.postgresql.Driver");//load il driver
         System.out.println("connession1");
         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
         System.out.println("connession2");
         Statement st= con.createStatement();//creo object di statement 
         System.out.println("connession3");
         ResultSet rs= st.executeQuery("SELECT CLIENTE.NOME,CLIENTE.COGNOME,CLIENTE.CODICE_TESSERA,CLIENTE.CF\n"
                 + " FROM CLIENTE,TESSERA_PUNTI \n"
                 + "WHERE\n"
                 + " CLIENTE.CODICE_TESSERA=TESSERA_PUNTI.CODICE_TESSERA \n"
                 + "ORDER BY N_PEZZI_FRUTTA\n"
                 + " DESC");

         System.out.println("connession");



          while (rs.next()) {//FETCHA RISULTATO IN ARRAYLIST CREANDO UN CLIENTE PER OGNI ISTANZA TROVATA
              C= new Cliente(
                      rs.getString("nome"),
                     rs.getString("cognome"),
                     rs.getString("codice_tessera"),
                     rs.getString("cf")
                      );
              cliente.add(C);
          }



          }
          catch (Exception x) {
      System.out.println("XaaX");
     return null;
           }
   return cliente;

}
	public ArrayList<Cliente> SelectClientiPerPezziVerdura() {
		ArrayList<Cliente> cliente = new ArrayList<Cliente>();
        Cliente C;
   
   try {
         Class.forName("org.postgresql.Driver");//load il driver
         System.out.println("connession1");
         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
         System.out.println("connession2");
         Statement st= con.createStatement();//creo object di statement 
         System.out.println("connession3");
         ResultSet rs= st.executeQuery("SELECT CLIENTE.NOME,CLIENTE.COGNOME,CLIENTE.CODICE_TESSERA,CLIENTE.CF\n"
                 + " FROM CLIENTE,TESSERA_PUNTI \n"
                 + "WHERE\n"
                 + " CLIENTE.CODICE_TESSERA=TESSERA_PUNTI.CODICE_TESSERA \n"
                 + "ORDER BY N_PEZZI_VERDURA\n"
                 + " DESC");

         System.out.println("connession");



          while (rs.next()) {//FETCHA RISULTATO IN ARRAYLIST CREANDO UN CLIENTE PER OGNI ISTANZA TROVATA
              C= new Cliente(
                      rs.getString("nome"),
                     rs.getString("cognome"),
                     rs.getString("codice_tessera"),
                     rs.getString("cf")
                      );
              cliente.add(C);
          }



          }
          catch (Exception x) {
      System.out.println("XaaX");
     return null;
           }
   return cliente;

}

	public  ArrayList<Cliente> SelectClientiPerPezziUova() {
		ArrayList<Cliente> cliente = new ArrayList<Cliente>();
        Cliente C;
   
   try {
         Class.forName("org.postgresql.Driver");//load il driver
         System.out.println("connession1");
         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
         System.out.println("connession2");
         Statement st= con.createStatement();//creo object di statement 
         System.out.println("connession3");
         ResultSet rs= st.executeQuery("SELECT CLIENTE.NOME,CLIENTE.COGNOME,CLIENTE.CODICE_TESSERA,CLIENTE.CF\n"
                 + " FROM CLIENTE,TESSERA_PUNTI \n"
                 + "WHERE\n"
                 + " CLIENTE.CODICE_TESSERA=TESSERA_PUNTI.CODICE_TESSERA \n"
                 + "ORDER BY N_PEZZI_UOVA\n"
                 + " DESC");

         System.out.println("connession");



          while (rs.next()) {//FETCHA RISULTATO IN ARRAYLIST CREANDO UN CLIENTE PER OGNI ISTANZA TROVATA
              C= new Cliente(
                      rs.getString("nome"),
                     rs.getString("cognome"),
                     rs.getString("codice_tessera"),
                     rs.getString("cf")
                      );
              cliente.add(C);
          }



          }
          catch (Exception x) {
      System.out.println("XaaX");
     return null;
           }
   return cliente;

}

	public  ArrayList<Cliente> SelectClientiPerPezziLatticini() {
		ArrayList<Cliente> cliente = new ArrayList<Cliente>();
        Cliente C;
   
   try {
         Class.forName("org.postgresql.Driver");//load il driver
         System.out.println("connession1");
         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
         System.out.println("connession2");
         Statement st= con.createStatement();//creo object di statement 
         System.out.println("connession3");
         ResultSet rs= st.executeQuery("SELECT CLIENTE.NOME,CLIENTE.COGNOME,CLIENTE.CODICE_TESSERA,CLIENTE.CF\n"
                 + " FROM CLIENTE,TESSERA_PUNTI \n"
                 + "WHERE\n"
                 + " CLIENTE.CODICE_TESSERA=TESSERA_PUNTI.CODICE_TESSERA \n"
                 + "ORDER BY N_PEZZI_LATTICINI\n"
                 + " DESC");

         System.out.println("connession");



          while (rs.next()) {//FETCHA RISULTATO IN ARRAYLIST CREANDO UN CLIENTE PER OGNI ISTANZA TROVATA
              C= new Cliente(
                      rs.getString("nome"),
                     rs.getString("cognome"),
                     rs.getString("codice_tessera"),
                     rs.getString("cf")
                      );
              cliente.add(C);
          }



          }
          catch (Exception x) {
      System.out.println("XaaX");
     return null;
           }
   return cliente;

}

	public  ArrayList<Cliente> SelectClientiPerPezziConfezionati() {
		ArrayList<Cliente> cliente = new ArrayList<Cliente>();
        Cliente C;
   
   try {
         Class.forName("org.postgresql.Driver");//load il driver
         System.out.println("connession1");
         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
         System.out.println("connession2");
         Statement st= con.createStatement();//creo object di statement 
         System.out.println("connession3");
         ResultSet rs= st.executeQuery("SELECT CLIENTE.NOME,CLIENTE.COGNOME,CLIENTE.CODICE_TESSERA,CLIENTE.CF\n"
                 + " FROM CLIENTE,TESSERA_PUNTI \n"
                 + "WHERE\n"
                 + " CLIENTE.CODICE_TESSERA=TESSERA_PUNTI.CODICE_TESSERA \n"
                 + "ORDER BY N_PEZZI_CONFEZIONATI\n"
                 + " DESC");

         System.out.println("connession");



          while (rs.next()) {//FETCHA RISULTATO IN ARRAYLIST CREANDO UN CLIENTE PER OGNI ISTANZA TROVATA
              C= new Cliente(
                      rs.getString("nome"),
                     rs.getString("cognome"),
                     rs.getString("codice_tessera"),
                     rs.getString("cf")
                      );
              cliente.add(C);
          }



          }
          catch (Exception x) {
      System.out.println("XaaX");
     return null;
           }
   return cliente;

}

	public  ArrayList<Cliente> SelectClientiPerPezziFarinacei() {
		ArrayList<Cliente> cliente = new ArrayList<Cliente>();
        Cliente C;
   
   try {
	   
         Class.forName("org.postgresql.Driver");//load il driver
         
         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
         
         Statement st= con.createStatement();//creo object di statement 
         
         ResultSet rs= st.executeQuery("SELECT CLIENTE.NOME,CLIENTE.COGNOME,CLIENTE.CODICE_TESSERA,CLIENTE.CF\n"
                 + " FROM CLIENTE,TESSERA_PUNTI \n"
                 + "WHERE\n"
                 + " CLIENTE.CODICE_TESSERA=TESSERA_PUNTI.CODICE_TESSERA \n"
                 + "ORDER BY N_PEZZI_FARINACEI\n"
                 + " DESC");

         System.out.println("connession");



          while (rs.next()) {//FETCHA RISULTATO IN ARRAYLIST CREANDO UN CLIENTE PER OGNI ISTANZA TROVATA
              C= new Cliente(
                      rs.getString("nome"),
                     rs.getString("cognome"),
                     rs.getString("codice_tessera"),
                     rs.getString("cf")
                      );
              cliente.add(C);
          }



          }
          catch (Exception x) {
        	  System.out.println("Select clienti per pezzi farinacei " +x);
     return null;
           }
   return cliente;

}

	public void Addcliente(String cf, String nome, String cognome, String codicetessera) throws Exception {
		 try {
             Class.forName("org.postgresql.Driver");//load il driver            
             Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione          
             PreparedStatement pst= con.prepareStatement("INSERT INTO CLIENTI VALUES(?,?,?,?)");
             
        		 pst.setString(1, nome);
            	 pst.setString(2, cognome);
                 pst.setString(3, codicetessera);
                 pst.setString(3, cf);
    
                 pst.executeUpdate();
            
            
          
              }
              catch (SQLException x) {
          System.out.println("Inserimento nuovo cliente " +x);
      
               }
		
	}



}