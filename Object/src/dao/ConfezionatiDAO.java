package dao;

import Panels.PanelMagazzino;

public interface ConfezionatiDAO {

	public  boolean InsertConfezionati(String nome, String marca, Float prezzo, String datadiscadenza, Integer peso,
			String ingredienti, String datadiproduzione, String idprodotto, Integer disponibilitatotale, PanelMagazzino panelmagazzino);
}
