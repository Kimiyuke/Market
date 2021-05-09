package dao;

import Panels.PanelMagazzino;

public interface VerduraDAO {
	public  boolean InsertVerdura(String nome, String marca, float prezzo, String datadiscadenza, String datadiraccolta,
			String idprodotto, int disponibilitatotale, PanelMagazzino panelmagazzino);
}
