package dao;

import Panels.PanelMagazzino;

public interface FruttaDAO {
	public  boolean InsertFrutta(String nome, String marca, float prezzo, String datadiscadenza, String datadiraccolta,
			String idprodotto, int disponibilitatotale, PanelMagazzino panelmagazzino) ;
}
