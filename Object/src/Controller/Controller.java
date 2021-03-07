package Controller;
import Frames.HomeDashboard;

import Frames.LogInFrame;

import Panels.*;

import java.awt.event.MouseAdapter;

import DAOS.*;
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

    //DAOS
    AcquistoDAO acquistodao;
    ConfezionatiDAO confenzionatidao;
    FarinaceiDAO farinaceidao;
    LatticiniDAO latticinidao;
    MagazzinoDAO magazzinodao;
    TesseraPuntiDAO tesserapuntidao;
    UovaDAO uovadao;
    FruttaDAO fruttadao;
    VerduraDAO verduradao;
    ClienteDAO clientidao;
    
    //Dialogs
    AggiuntaProdottiSuccesful aggiuntaprodottisuccesful;
    public ClienteDAO getClientidao() {
        return clientidao;
    }
   AcquistoTotaleDAO acquistototaledao;
   public AcquistoTotaleDAO getAcquistototaledao() {
	return acquistototaledao;
}

public AcquistoDAO getAcquistodao() {
	return acquistodao;
}

public ConfezionatiDAO getConfezionatidao() {
	return confenzionatidao;
}

public FarinaceiDAO getFarinaceidao() {
	return farinaceidao;
}

public LatticiniDAO getLatticinidao() {
	return latticinidao;
}

public MagazzinoDAO getMagazzinodao() {
	return magazzinodao;
}

public TesseraPuntiDAO getTesserapuntidao() {
	return tesserapuntidao;
}

public UovaDAO getUovadao() {
	return uovadao;
}

public VerduraDAO getVerduradao() {
	return verduradao;
}
public FruttaDAO getFruttadao() {
	return fruttadao;
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
	Home.add(panelmagazzinoricerca);
		
		panelmagazzinoricerca.setLocation(237, 11);
		
		
		
      
		
		
	}

	

 


}