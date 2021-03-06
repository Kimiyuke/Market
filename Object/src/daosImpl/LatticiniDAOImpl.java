package daosImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Panels.PanelMagazzino;


public class LatticiniDAOImpl {
	


	public  boolean InsertLatticini(String nome, String marca, Float prezzo, String datadiscadenza, Integer peso,
			String datadimungitura, String datadiproduzione, String idprodotto, Integer disponibilitatotale, PanelMagazzino panelmagazzino) throws Exception {
		try {
           
				Class.forName("org.postgresql.Driver");
	
            Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione          
            PreparedStatement pst= con.prepareStatement("INSERT INTO LATTICINI VALUES(?,?,?::real,?::date,?,?::date,?::date,?,?)");
            
       		 pst.setString(1, nome);
           	 pst.setString(2, marca);
                pst.setFloat(3, prezzo);
                pst.setString(4, datadiscadenza);
                pst.setInt(5, peso);
                pst.setString(6, datadimungitura);
                pst.setString(7, datadiproduzione);
                pst.setString(8, idprodotto);
                pst.setInt(9, disponibilitatotale);
                pst.executeUpdate();
            
          
         
             }
		catch (SQLException e) {
         	
         	String exc= e.getMessage();
         	System.out.println("Inserimento latticini panel magazzino: " +e);
         	if( exc.contains("check_nome_lettere") ) {
         		panelmagazzino.getLblcnome().setVisible(true);
         		panelmagazzino.getLblcnome().setText("attenzione, campo sbagliato, inserire solo lettere"); //CONSTRAINT PER NOME non accetta numeri
         	}
         	else if( exc.contains("check_marca_lettere") ) {
         		panelmagazzino.getLblcmarca().setVisible(true);
         		panelmagazzino.getLblcmarca().setText("attenzione, campo sbagliato, inserire solo lettere"); //CONSTRAINT PER MARCA non accetta numeri
         	}
         	
         	
         	
         	else if( exc.contains("magazzino_pkey") ) {
         		panelmagazzino.getLblcidprodotto().setVisible(true);
         		panelmagazzino.getLblcidprodotto().setText("attenzione, prodotto gia' esistente"); //CONSTRAINT PER PK DI FRUTTA
         	}
         	
         	else if( exc.contains("check_id_prodotto")) {
         		panelmagazzino.getLblcidprodotto().setVisible(true);
         		panelmagazzino.getLblcidprodotto().setText("attenzione, ID non valido"); //CONSTRAINT PER L'ID PRODOTTO
         	}
         	
         	else if( exc.contains("constraint_data_di_scadenza")) {
         		panelmagazzino.getLbldatadiscadenza().setVisible(true);
         		panelmagazzino.getLbldatadiscadenza().setText("attenzione, data non coerente maggiore della data di mung"); //CONSTRAINT PER LA DATA DI SCADENZA MAGGIORE DELLA DATA DI MUNGITURA
         	}
         	
         	else if( exc.contains("constraint_data_di_scadenza2")) {
         		panelmagazzino.getLbldatadiscadenza().setVisible(true);
         		panelmagazzino.getLbldatadiscadenza().setText("attenzione, data non coerente maggiore di produzione"); //CONSTRAINT PER LA DATA DI SCADENZA MAGGIORE DELLA DATA DI PRODUZIONE
         	}
         	
         	else if( exc.contains("constraint_data_di_mungitura")) {
         		panelmagazzino.getlblcdata1().setVisible(true);
         		panelmagazzino.getlblcdata1().setText("attenzione, data non coerente minore produzione"); //CONSTRAINT PER LA DATA DI MUNGITURA MINORE DELLA DATA DI PRODUZIONE
         	}
         	
         	else if( exc.contains("constraint_data_di_produzione")) {
         		panelmagazzino.getlblcdata2().setVisible(true);
         		panelmagazzino.getlblcdata2().setText("attenzione, data non coerente maggiore mungitura"); //CONSTRAINT PER LA DATA DI PRODUZIONE MAGGIORE DELLA DATA DI MUNGITURA
         	}
         	
         	
 	       return false;
          }
		 
		 return true;
		
	}
}