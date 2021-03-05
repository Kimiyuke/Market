package Controller;
import Frames.HomeDashboard;

import Frames.LogInFrame;

import Panels.PanelAggiuntaAcquisto;
import Panels.PanelClienti;
import Panels.PanelMagazzino;
import DAOS.*;

public class Controller {
    //FRAMES
    LogInFrame LogInFrame;
    HomeDashboard Home;

    //PANELs
     PanelClienti panelclienti;
     PanelMagazzino panelmagazzino;

    //DAOS
    AcquistoDAO acquistodao;
    ConfenzionatiDAO confenzionatidao;
    FarinaceiDAO farinaceidao;
    LatticiniDAO latticinidao;
    MagazzinoDAO magazzinodao;
    TesseraPuntiDAO tesserapuntidao;
    UovaDAO uovadao;
    VerduraDAO verduradao;
    ClienteDAO clientidao;
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

public ConfenzionatiDAO getConfenzionatidao() {
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


    private  PanelMagazzino Magazzino;
    private  PanelAggiuntaAcquisto AddAcquisto;


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

	




}