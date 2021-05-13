package daosImpl;
import java.sql.*;
import java.util.ArrayList;

import Panels.PanelAggiuntaClienti;
import Classi.Cliente;

public class ClienteDAOImpl {

    public  ArrayList<Cliente> SelectClientiPerPuntiFrutta() {
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
                      + "ORDER BY PUNTI_FRUTTA\n"
                      + " DESC");

              



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
           System.out.println("Connesione cliente");
          return null;
                }
        return cliente;

    }

	public  ArrayList<Cliente> SelectClientiPerPuntiVerdura() {
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
                 + "ORDER BY PUNTI_VERDURA\n"
                 + " DESC");

         



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
      System.out.println("Connesione cliente");
     return null;
           }
   return cliente;

}

	public ArrayList<Cliente> SelectClientiPerPuntiConfezionati() {
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
                 + "ORDER BY PUNTI_CONFEZIONATI\n"
                 + " DESC");

        



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
      System.out.println("Connesione cliente");
     return null;
           }
   return cliente;

}
	public  ArrayList<Cliente> SelectClientiPerPuntiUova() {
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
                 + "ORDER BY PUNTI_UOVA\n"
                 + " DESC");

         



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
      System.out.println("Connesione cliente");
     return null;
           }
   return cliente;

}

	public  ArrayList<Cliente> SelectClientiPerPuntiLatticini() {
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
                 + "ORDER BY PUNTI_LATTICINI\n"
                 + " DESC");

         



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
      System.out.println("Connesione cliente");
     return null;
           }
   return cliente;

}

	public  ArrayList<Cliente> SelectClientiPerPuntiFarinacei() {
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
                 + "ORDER BY PUNTI_FRUTTA\n"
                 + " DESC");

         



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
      System.out.println("Connesione cliente");
     return null;
           }
   return cliente;

}

	public  ArrayList<Cliente> SelectClientiPerPezziFrutta() {
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
                 + "ORDER BY N_PEZZI_FRUTTA\n"
                 + " DESC");

         



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
      System.out.println("Connesione cliente");
     return null;
           }
   return cliente;

}
	public ArrayList<Cliente> SelectClientiPerPezziVerdura() {
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
                 + "ORDER BY N_PEZZI_VERDURA\n"
                 + " DESC");

         



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
      System.out.println("Connesione cliente");
     return null;
           }
   return cliente;

}

	public  ArrayList<Cliente> SelectClientiPerPezziUova() {
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
                 + "ORDER BY N_PEZZI_UOVA\n"
                 + " DESC");

         



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
      System.out.println("Connesione cliente");
     return null;
           }
   return cliente;

}

	public  ArrayList<Cliente> SelectClientiPerPezziLatticini() {
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
                 + "ORDER BY N_PEZZI_LATTICINI\n"
                 + " DESC");

         



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
      System.out.println("Connesione cliente");
     return null;
           }
   return cliente;

}

	public  ArrayList<Cliente> SelectClientiPerPezziConfezionati() {
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
                 + "ORDER BY N_PEZZI_CONFEZIONATI\n"
                 + " DESC");

         



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
      System.out.println("Connesione cliente");
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

	public boolean Addcliente(String cf, String nome, String cognome, String codicetessera, PanelAggiuntaClienti panelaggiuntaclienti) throws Exception {
		 try {
             Class.forName("org.postgresql.Driver");//load il driver            
             Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione          
             PreparedStatement pst= con.prepareStatement("INSERT INTO CLIENTE VALUES(?,?,?,?)");
             
        		 pst.setString(1, nome);
            	 pst.setString(2, cognome);
                 pst.setString(3, codicetessera);
                 pst.setString(4, cf);
    
                 pst.executeUpdate();
            
            
          
              }
              catch (SQLException e) {
            	 
          
          String exc= e.getMessage();
          if( exc.contains("check_nome_lettere") ) {
        	  panelaggiuntaclienti.getLblcnome().setVisible(true);
        	  panelaggiuntaclienti.getLblcnome().setText("Attenzione, campo sbagliato, inserire solo lettere"); //CONSTRAINT PER NOME non accetta numeri
       		}
          
          if( exc.contains("check_cognome_lettere") ) {
        	  panelaggiuntaclienti.getLblcognome().setVisible(true);
        	  panelaggiuntaclienti.getLblcognome().setText("Attenzione, campo sbagliato, inserire solo lettere"); //CONSTRAINT PER COGNOME non accetta numeri
       		}
          
          if( exc.contains("check_codice_tessera_") ) {
        	  panelaggiuntaclienti.getLblcodicetessera().setVisible(true);
        	  panelaggiuntaclienti.getLblcodicetessera().setText("Attenzione, campo sbagliato"); //CONSTRAINT PER CODICE TESSERA. 4 LETTERE E 4 NUMERI
          }
          if( exc.contains("check_cf") ) {
        	  panelaggiuntaclienti.getLblccf().setVisible(true);
        	  panelaggiuntaclienti.getLblccf().setText("Attenzione, campo sbagliato"); //CONSTRAINT PER CODICE FISCALE
       		}
          
          if( exc.contains("cliente_pkey") ) {
        	  panelaggiuntaclienti.getLblccf().setVisible(true); 
        	  panelaggiuntaclienti.getLblcodicetessera().setText("Tessera gia' registrata"); //CONSTRAINT PER CODICE FISCALE
       		}
          
          if( exc.contains("cf_unico") ) {
        	  panelaggiuntaclienti.getLblccf().setVisible(true);
        	  panelaggiuntaclienti.getLblccf().setText("Attenzione, Cliente gia' registrato"); //CONSTRAINT PER CODICE FISCALE
        	  
       		}
      return false;
          }
               
		return true;
	}
	
}

