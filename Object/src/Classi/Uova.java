package Classi;

import java.util.Date;



public class Uova {
private String Nome;
private String Marca;
private float Prezzo;
private Date DataDiScadenza;
private int Quantita;
private Date DataDiDeposizione;
private String ProvenienzaAllevamento;
private String IdProdotto;
private int DisponibilitaTotale;


public Uova(String nome, String marca, float prezzo, Date dataDiScadenza, int quantita,
		Date dataDiDeposizione, String provenienzaAllevamento, String idProdotto, int disponibilitaTotale) {
	super();
	Nome = nome;
	Marca = marca;
	Prezzo = prezzo;
	DataDiScadenza = dataDiScadenza;
	
	Quantita = quantita;
	DataDiDeposizione = dataDiDeposizione;
	ProvenienzaAllevamento = provenienzaAllevamento;
	IdProdotto = idProdotto;
	DisponibilitaTotale = disponibilitaTotale;
}
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
public Date getDataDiScadenza() {
	return DataDiScadenza;
}
public void setDataDiScadenza(Date dataDiScadenza) {
	DataDiScadenza = dataDiScadenza;
}


public int getQuantita() {
	return Quantita;
}
public void setQuantita(int quantita) {
	Quantita = quantita;
}
public Date getDataDiDeposizione() {
	return DataDiDeposizione;
}
public void setDataDiDeposizione(Date dataDiDeposizione) {
	DataDiDeposizione = dataDiDeposizione;
}
public String getProvenienzaAllevamento() {
	return ProvenienzaAllevamento;
}
public void setProvenienzaAllevamento(String provenienzaAllevamento) {
	ProvenienzaAllevamento = provenienzaAllevamento;
}
public String getIdProdotto() {
	return IdProdotto;
}
public void setIdProdotto(String idProdotto) {
	IdProdotto = idProdotto;
}
public int getDisponibilitaTotale() {
	return DisponibilitaTotale;
}
public void setDisponibilitaTotale(int disponibilitaTotale) {
	DisponibilitaTotale = disponibilitaTotale;
}
}
