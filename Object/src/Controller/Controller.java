package Controller;
import Frames.HomeDashboard;
import Frames.LogInFrame;

import Panels.*;
import daosImpl.*;

import java.awt.Color;

import javax.swing.border.LineBorder;

import Dialogs.AggiuntaAcquistoSingolo;
import Dialogs.AggiuntaAcquistoTotale;
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
    
     
     
     
    //Dialogs
    AggiuntaProdottiSuccesful aggiuntaprodottisuccesful;
    AggiuntaClienteSuccesful aggiuntaclientesuccesful;
    AggiuntaAcquistoSingolo aggiuntaacquistosingolo;
    AggiuntaAcquistoTotale aggiuntaacquistototale;
    
    
    public ClienteDAOImpl getClientidao() {
        return new ClienteDAOImpl();
    }
  
   public AcquistoTotaleDAOImpl getAcquistototaledao() {
	return new AcquistoTotaleDAOImpl();
}

public AcquistoDAOImpl getAcquistodao() {
	return new AcquistoDAOImpl();
}

public ConfezionatiDAOImpl getConfezionatidao() {
	return new ConfezionatiDAOImpl();
}

public FarinaceiDAOImpl getFarinaceidao() {
	return new FarinaceiDAOImpl();
}

public LatticiniDAOImpl getLatticinidao() {
	return new LatticiniDAOImpl();
}

public  MagazzinoDAOImpl getMagazzinodao() {
	return new MagazzinoDAOImpl();
}

public TesseraPuntiDAOImpl getTesserapuntidao() {
	return new TesseraPuntiDAOImpl();
}

public UovaDAOImpl getUovadao() {
	return new UovaDAOImpl();
}

public VerduraDAOImpl getVerduradao() {
	return new VerduraDAOImpl();
}
public FruttaDAOImpl getFruttadao() {
	return new FruttaDAOImpl();
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

	public void checkcodicetessera() {
		panelaggiuntaacquisto.gettxtcodicetessera().setBorder(new LineBorder(Color.red,1));
		
	}

	public void acquistosingolosuccesful() {
		aggiuntaacquistosingolo= new AggiuntaAcquistoSingolo(this);
		aggiuntaacquistosingolo.setVisible(true);

		aggiuntaacquistosingolo.setLocationRelativeTo(panelaggiuntaacquisto);
		
	}

	public void acquistototalesuccesful(int prezzototale, int puntitotale) {
		aggiuntaacquistototale= new AggiuntaAcquistoTotale(Controller.this);
		aggiuntaacquistototale.setVisible(true);
		aggiuntaacquistototale.getlblpunti1().setText(String.valueOf(puntitotale));
		aggiuntaacquistototale.getlbltotale1().setText(String.valueOf(prezzototale));
		aggiuntaacquistototale.getlbleuro().setVisible(true);

		aggiuntaacquistototale.setLocationRelativeTo(panelaggiuntaacquisto);
		
	}

	public void logout(HomeDashboard home) {
		home.setVisible(false);
		Init();
		
	}

	

	
 


}