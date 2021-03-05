package Classi;

import java.util.Date;
public class Confenzionati {
private String Nome;
private String Marca;
private  float Prezzo;
private String IdProdotto;
private Date DataDiScadenza;
private String Ingriedenti;
private int Peso;
private int DisponibilitaTotale;
public String getNome() {
	return Nome;
}
public void setNome(String nome) {
	Nome = nome;
}
public String getMarca() {
	return Marca;
}
public void setMarca(String marca) {
	Marca = marca;
}
public float getPrezzo() {
	return Prezzo;
}
public void setPrezzo(float prezzo) {
	Prezzo = prezzo;
}
public String getIdProdotto() {
	return IdProdotto;
}
public void setIdProdotto(String idProdotto) {
	IdProdotto = idProdotto;
}
public Date getDataDiScadenza() {
	return DataDiScadenza;
}
public void setDataDiScadenza(Date dataDiScadenza) {
	DataDiScadenza = dataDiScadenza;
}
public String getIngriedenti() {
	return Ingriedenti;
}
public void setIngriedenti(String ingriedenti) {
	Ingriedenti = ingriedenti;
}
public int getPeso() {
	return Peso;
}
public void setPeso(int peso) {
	Peso = peso;
}
public int getDisponibilitaTotale() {
	return DisponibilitaTotale;
}
public void setDisponibilitaTotale(int disponibilitaTotale) {
	DisponibilitaTotale = disponibilitaTotale;
}
public Confenzionati(String nome, String marca, float prezzo, String idProdotto, Date dataDiScadenza,
		String ingriedenti, int peso, int disponibilitaTotale) {
	super();
	Nome = nome;
	Marca = marca;
	Prezzo = prezzo;
	IdProdotto = idProdotto;
	DataDiScadenza = dataDiScadenza;
	Ingriedenti = ingriedenti;
	Peso = peso;
	DisponibilitaTotale = disponibilitaTotale;
}




}
