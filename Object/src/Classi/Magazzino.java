package Classi;

import java.util.Date;
public class Magazzino {
private String IdProdotto;
private int DisponibilitaTotale;
private String Nome;
private String Marca;

public String getIdProdotto() {
	return IdProdotto;
}
public void setIdProdotto(String idProdotto) {
	IdProdotto = idProdotto;
}
public String getNome() {
	return Nome;
}
public void setnome(String nome) {
	Nome = nome;
}

public String getMarca() {
	return Marca;
}
public void setmarca(String marca) {
	Marca = marca;
}
public int getDisponibilitaTotale() {
	return DisponibilitaTotale;
}
public void setDisponibilitaTotale(int disponibilitaTotale) {
	DisponibilitaTotale = disponibilitaTotale;
}
public Magazzino(String idProdotto, int disponibilitaTotale, String nome, String marca) {
	super();
	IdProdotto = idProdotto;
	Nome = nome;
	DisponibilitaTotale = disponibilitaTotale;
	Marca= marca;
}


}
