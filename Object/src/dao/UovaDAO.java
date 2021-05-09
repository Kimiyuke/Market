package dao;

import Panels.PanelMagazzino;

public interface UovaDAO {
	public  boolean InsertUova(String nome, String marca, Float prezzo, String datadiscadenza, Integer quantita,
			String datadideposizione, String provenienzaallevamento, String idprodotto, Integer disponibilitatotale, PanelMagazzino panelmagazzino);
}
