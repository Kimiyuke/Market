package Controller;
import Frames.HomeDashboard;

import Frames.LogInFrame;

import Panels.*;

import java.awt.event.MouseAdapter;

import DAOS.*;
import Dialogs.AggiuntaClienteSuccesful;
import Dialogs.AggiuntaProdottiSuccesful;
public class Controller {
    //FRAMES
    LogInFrame LogInFrame;
    HomeDashboard Home;

    //PANELs
     PanelClienti panelclienti;
     PanelMagazzino panelmagazzino;
     PanelAggiuntaAcquisto panelaggiuntaacquisto;
     PanelMagazzinoRicerca panelmagazzinoricerca;
     PanelReviewAcquisti panelacquisti;
     PanelAggiuntaClienti panelaggiuntaclienti;
    
//    //DAOS
//   AcquistoDAO acquistodao;
//    ConfezionatiDAO confenzionatidao;
//    FarinaceiDAO farinaceidao;
//    LatticiniDAO latticinidao;
//    MagazzinoDAO magazzinodao;
//    TesseraPuntiDAO tesserapuntidao;
//    UovaDAO uovadao;
//    FruttaDAO fruttadao;
//    VerduraDAO verduradao;
//    ClienteDAO clientidao;
//     AcquistoTotaleDAO acquistototaledao;
     
     
     
    //Dialogs
    AggiuntaProdottiSuccesful aggiuntaprodottisuccesful;
    AggiuntaClienteSuccesful aggiuntaclientesuccesful;
    
    
    
    public ClienteDAO getClientidao() {
        return new ClienteDAO();
    }
  
   public AcquistoTotaleDAO getAcquistototaledao() {
	return new AcquistoTotaleDAO();
}

public AcquistoDAO getAcquistodao() {
	return new AcquistoDAO();
}

public ConfezionatiDAO getConfezionatidao() {
	return new ConfezionatiDAO();
}

public FarinaceiDAO getFarinaceidao() {
	return new FarinaceiDAO();
}

public LatticiniDAO getLatticinidao() {
	return new LatticiniDAO();
}

public  MagazzinoDAO getMagazzinodao() {
	return new MagazzinoDAO();
}

public TesseraPuntiDAO getTesserapuntidao() {
	return new TesseraPuntiDAO();
}

public UovaDAO getUovadao() {
	return new UovaDAO();
}

public VerduraDAO getVerduradao() {
	return new VerduraDAO();
}
public FruttaDAO getFruttadao() {
	return new FruttaDAO();
}



 
    

    public static void main(String[] args) {
        Controller c=Controller.getInstance();
       
        

    }
  
    



    private static Controller Instance=null;


    public void Init() {
        LogInFrame= new LogInFrame(this);
        LogInFrame.setVisible(true);
        
        
    }

    private Controller() {

    
    }
    //singleton
    public static Controller getInstance( ) {

        if(Instance==null) {

            Instance=new Controller();
            Instance.Init();
        }
        return Instance;
    }
    public void Controllo_Credenziali(String username, String password) {

    	



        if(username.equals(" a") && password.equals("la") ) {
            LogInFrame.setVisible(false);
            Home= new HomeDashboard(this);
            Home.setVisible(true);

        }

        else if (username.equals("") || password.equals("Password") ||
                username.equals("")||username.equals("Username")) {
            LogInFrame.getlblErrore().setText("Attenzione, campi obbligatori username e password");
            }
                else {
                    LogInFrame.getlblErrore().setText("Errore, username e password non coincidiono");
                }

    }
    
    

	public void prodottisuccesful() {
		
		aggiuntaprodottisuccesful= new AggiuntaProdottiSuccesful(this);
		aggiuntaprodottisuccesful.setVisible(true);

		aggiuntaprodottisuccesful.setLocationRelativeTo(panelmagazzino);
		
	}

	public void gotomagazzinoricerca(PanelMagazzino panelmagazzino) {
		
		panelmagazzino.setVisible(false);
		
		
		panelmagazzinoricerca= new PanelMagazzinoRicerca(this);
        
		panelmagazzinoricerca.setVisible(true);
		panelmagazzinoricerca.setLocation(237, 11);
		

	}

	
	public void setnullcomponent() {
		panelmagazzinoricerca.remove(panelmagazzinoricerca.getCombobox());
	}

	public void clientisuccesful() {
		aggiuntaclientesuccesful= new AggiuntaClienteSuccesful(this);
		aggiuntaclientesuccesful.setVisible(true);

		aggiuntaclientesuccesful.setLocationRelativeTo(panelaggiuntaclienti);
		
		
	}

	
 


}