package daosImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Panels.PanelMagazzino;

public class FruttaDAOImpl {

	

	public  boolean InsertFrutta(String nome, String marca, float prezzo, String datadiscadenza, String datadiraccolta,
			String idprodotto, int disponibilitatotale, PanelMagazzino panelmagazzino) throws Exception {
		 try {
			 
             	Class.forName("org.postgresql.Driver");//load il driver            
             	Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione          
             	PreparedStatement pst= con.prepareStatement("INSERT INTO FRUTTA VALUES(?,?,?::real,?::date,?::date,?,?)");
             
        		 pst.setString(1, nome);
            	 pst.setString(2, marca);
                 pst.setFloat(3, prezzo);
                 pst.setString(4, datadiscadenza);
                 pst.setString(5, datadiraccolta);
                 pst.setString(6, idprodotto);
                 pst.setInt(7, disponibilitatotale)
                 ;
                 
                 pst.executeUpdate();
                 
            
          
              }
            catch (SQLException e) {
            	
            	String exc= e.getMessage();
            	if( exc.contains("check_nome_lettere") ) {
            		panelmagazzino.getLblcnome().setVisible(true);
            		panelmagazzino.getLblcnome().setText("attenzione, campo sbagliato, inserire solo lettere"); //CONSTRAINT PER NOME non accetta numeri
            	}
            	else if( exc.contains("check_marca_lettere") ) {
            		panelmagazzino.getLblcmarca().setVisible(true);
            		panelmagazzino.getLblcmarca().setText("attenzione, campo sbagliato, inserire solo lettere"); //CONSTRAINT PER MARCA non accetta numeri
            	}
            	
            	else if( exc.contains("constraint_data_di_scadenza") ) {
            		panelmagazzino.getLbldatadiscadenza().setVisible(true);
            		panelmagazzino.getLbldatadiscadenza().setText("attenzione, data precede la raccolta"); //CONSTRAINT PER DATA DI SCADANZA
            	}
            	
            	else if( exc.contains("magazzino_pkey") ) {
            		panelmagazzino.getLblcidprodotto().setVisible(true);
            		panelmagazzino.getLblcidprodotto().setText("attenzione, prodotto gia' esistente"); //CONSTRAINT PER PK DI FRUTTA
            	}
            	
            	else if( exc.contains("check_id_prodotto")) {
             		panelmagazzino.getLblcidprodotto().setVisible(true);
             		panelmagazzino.getLblcidprodotto().setText("attenzione, ID non valido"); //CONSTRAINT PER L'ID PRODOTTO
             	}
            	
    	       return false;
             }
		return true;
	}


		
	

	

}
