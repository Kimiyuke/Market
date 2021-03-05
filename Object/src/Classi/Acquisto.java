package Classi;

import java.util.Date;
public class Acquisto {
private String NId;
private String CodiceTessera;
private  int NPezzi; 
private String Nome;
private String Marca;
private String IdProdotto;
private float Prezzo;
private boolean Completato;
private Date DataAcquisto;

public String getNId() {
	return NId;
}
public void setNId(String nId) {
	NId = nId;
}
public String getCodiceTessera() {
	return CodiceTessera;
}
public void setCodiceTessera(String codiceTessera) {
	CodiceTessera = codiceTessera;
}
public int getNPezzi() {
	return NPezzi;
}
public void setNPezzi(int nPezzi) {
	NPezzi = nPezzi;
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
public String getIdProdotto() {
	return IdProdotto;
}
public void setIdProdotto(String idProdotto) {
	IdProdotto = idProdotto;
}
public float getPrezzo() {
	return Prezzo;
}
public void setPrezzo(float prezzo) {
	Prezzo = prezzo;
}
public boolean isCompletato() {
	return Completato;
}
public void setCompletato(boolean completato) {
	Completato = completato;
}
public Date getDataAcquisto() {
	return DataAcquisto;
}
public void setDataAcquisto(Date dataAcquisto) {
	DataAcquisto = dataAcquisto;
}
public Acquisto(String nId, String codiceTessera, int nPezzi, String nome, String marca, String idProdotto,
		float prezzo, boolean completato, Date dataAcquisto) {
	super();
	NId = nId;
	CodiceTessera = codiceTessera;
	NPezzi = nPezzi;
	Nome = nome;
	Marca = marca;
	IdProdotto = idProdotto;
	Prezzo = prezzo;
	Completato = completato;
	DataAcquisto = dataAcquisto;
}


	

}
