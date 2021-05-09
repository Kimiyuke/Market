package dao;

import Panels.PanelMagazzino;

public interface LatticiniDAO {
	public  boolean InsertLatticini(String nome, String marca, Float prezzo, String datadiscadenza, Integer peso,
			String datadimungitura, String datadiproduzione, String idprodotto, Integer disponibilitatotale, PanelMagazzino panelmagazzino);
}
