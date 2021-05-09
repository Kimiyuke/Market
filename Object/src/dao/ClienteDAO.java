package dao;

import java.util.ArrayList;

import Classi.Cliente;
import Panels.PanelAggiuntaClienti;

public interface ClienteDAO {
	
	
	 public  ArrayList<Cliente> SelectClientiPerPuntiFrutta();
	 public  ArrayList<Cliente> SelectClientiPerPuntiVerdura();
	 public ArrayList<Cliente> SelectClientiPerPuntiConfezionati();
	 public  ArrayList<Cliente> SelectClientiPerPuntiUova();
	 public  ArrayList<Cliente> SelectClientiPerPuntiLatticini();
	 public  ArrayList<Cliente> SelectClientiPerPuntiFarinacei();
	 public  ArrayList<Cliente> SelectClientiPerPezziFrutta();
	 public  ArrayList<Cliente> SelectClientiPerPezziVerdura();
	 public  ArrayList<Cliente> SelectClientiPerPezziConfezionati();
	 public  ArrayList<Cliente> SelectClientiPerPezziUova();
	 public  ArrayList<Cliente> SelectClientiPerPezziLatticini();
	 public  ArrayList<Cliente> SelectClientiPerPezziFarinacei();
	 public boolean Addcliente(String cf, String nome, String cognome, String codicetessera, PanelAggiuntaClienti panelaggiuntaclienti);
	 
	 
	 
	 

}
