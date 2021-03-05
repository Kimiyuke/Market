package Classi;

import java.util.Date;
public class AquistoTotale {
private	String NId;
private String CodiceTessera;
private int TotalePunti;
private float PrezzoTotale;
private int NumProdotti;
private int NumProdottiFarinacei;
private int NumProdottiFrutta;
private int NumProdottiVerdura;
private int NumProdottiUova;
private int NumProdottiConfenzionati;
private int NumProdottiLatticini;
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



public int getTotalePunti() {
	return TotalePunti;
}



public void setTotalePunti(int totalePunti) {
	TotalePunti = totalePunti;
}



public float getPrezzoTotale() {
	return PrezzoTotale;
}



public void setPrezzoTotale(float prezzoTotale) {
	PrezzoTotale = prezzoTotale;
}



public int getNumProdotti() {
	return NumProdotti;
}



public void setNumProdotti(int numProdotti) {
	NumProdotti = numProdotti;
}



public int getNumProdottiFarinacei() {
	return NumProdottiFarinacei;
}



public void setNumProdottiFarinacei(int numProdottiFarinacei) {
	NumProdottiFarinacei = numProdottiFarinacei;
}



public int getNumProdottiFrutta() {
	return NumProdottiFrutta;
}



public void setNumProdottiFrutta(int numProdottiFrutta) {
	NumProdottiFrutta = numProdottiFrutta;
}



public int getNumProdottiVerdura() {
	return NumProdottiVerdura;
}



public void setNumProdottiVerdura(int numProdottiVerdura) {
	NumProdottiVerdura = numProdottiVerdura;
}



public int getNumProdottiUova() {
	return NumProdottiUova;
}



public void setNumProdottiUova(int numProdottiUova) {
	NumProdottiUova = numProdottiUova;
}



public int getNumProdottiConfenzionati() {
	return NumProdottiConfenzionati;
}



public void setNumProdottiConfenzionati(int numProdottiConfenzionati) {
	NumProdottiConfenzionati = numProdottiConfenzionati;
}



public int getNumProdottiLatticini() {
	return NumProdottiLatticini;
}



public void setNumProdottiLatticini(int numProdottiLatticini) {
	NumProdottiLatticini = numProdottiLatticini;
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



public AquistoTotale(String nId, String codiceTessera, int totalePunti, float prezzoTotale, int numProdotti,
		int numProdottiFarinacei, int numProdottiFrutta, int numProdottiVerdura, int numProdottiUova,
		int numProdottiConfenzionati, int numProdottiLatticini, boolean completato, Date dataAcquisto) {
	super();
	NId = nId;
	CodiceTessera = codiceTessera;
	TotalePunti = totalePunti;
	PrezzoTotale = prezzoTotale;
	NumProdotti = numProdotti;
	NumProdottiFarinacei = numProdottiFarinacei;
	NumProdottiFrutta = numProdottiFrutta;
	NumProdottiVerdura = numProdottiVerdura;
	NumProdottiUova = numProdottiUova;
	NumProdottiConfenzionati = numProdottiConfenzionati;
	NumProdottiLatticini = numProdottiLatticini;
	Completato = completato;
	DataAcquisto = dataAcquisto;
}



	

}
