package DAOS;
import java.sql.*;
import java.util.ArrayList;
import Panels.PanelClienti;
import javax.swing.table.DefaultTableModel;

import Classi.Cliente;

public class ClienteDAO {
//
    public  ArrayList<Cliente> SelectClientiPerPuntiFrutta() {
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
                      + " ASC");

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

	public static ArrayList<Cliente> SelectClientiPerPuntiVerdura() {
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
                 + " ASC");

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

	public static ArrayList<Cliente> SelectClientiPerPuntiConfenzionati() {
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
                 + " ASC");

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
	public static ArrayList<Cliente> SelectClientiPerPuntiUova() {
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
                 + " ASC");

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

	public static ArrayList<Cliente> SelectClientiPerPuntiLatticini() {
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
                 + " ASC");

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

	public static ArrayList<Cliente> SelectClientiPerPuntiFarinacei() {
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
                 + " ASC");

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

	public static ArrayList<Cliente> SelectClientiPerPezziFrutta() {
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
                 + " ASC");

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
	public static ArrayList<Cliente> SelectClientiPerPezziVerdura() {
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
                 + " ASC");

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

	public static ArrayList<Cliente> SelectClientiPerPezziUova() {
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
                 + " ASC");

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

	public static ArrayList<Cliente> SelectClientiPerPezziLatticini() {
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
                 + " ASC");

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

	public static ArrayList<Cliente> SelectClientiPerPezziConfenzionati() {
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
                 + " ASC");

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

	public static ArrayList<Cliente> SelectClientiPerPezziFarinacei() {
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
                 + " ASC");

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



}