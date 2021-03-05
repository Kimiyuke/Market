package Classi;

import java.util.Date;
public class Magazzino {
private String IdProdotto;
private String Categoria;
private int DisponibilitaTotale;
public String getIdProdotto() {
	return IdProdotto;
}
public void setIdProdotto(String idProdotto) {
	IdProdotto = idProdotto;
}
public String getCategoria() {
	return Categoria;
}
public void setCategoria(String categoria) {
	Categoria = categoria;
}
public int getDisponibilitaTotale() {
	return DisponibilitaTotale;
}
public void setDisponibilitaTotale(int disponibilitaTotale) {
	DisponibilitaTotale = disponibilitaTotale;
}
public Magazzino(String idProdotto, String categoria, int disponibilitaTotale) {
	super();
	IdProdotto = idProdotto;
	Categoria = categoria;
	DisponibilitaTotale = disponibilitaTotale;
}


}
