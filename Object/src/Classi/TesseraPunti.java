package Classi;

import java.util.Date;
public class TesseraPunti {
private String CodiceTessera;
private Date DataDiScadenza;
private int TotalePunti;
private int PuntiFarinacei;
private int PuntiUova;
private int PuntiFrutta;
private int PuntiVerdura;
private int PuntiConfenzionati;
private int PuntiLatticini;
private int NPezziFrutta;
private int NPezziVerdura;
private int NPezziConfenzionati;
private int NPezziLatticini;
private int NPezziUova;
private int NPezziFarinacei;
public String getCodiceTessera() {
	return CodiceTessera;
}
public int getNPezziFarinacei() {
	return NPezziFarinacei;

}
public void setCodiceTessera(String codiceTessera) {
	CodiceTessera = codiceTessera;
}
public Date getDataDiScadenza() {
	return DataDiScadenza;
}
public void setDataDiScadenza(Date dataDiScadenza) {
	DataDiScadenza = dataDiScadenza;
}
public int getTotalePunti() {
	return TotalePunti;
}
public void setTotalePunti(int totalePunti) {
	TotalePunti = totalePunti;
}
public int getPuntiFarinacei() {
	return PuntiFarinacei;
}
public void setPuntiFarinacei(int puntiFarinacei) {
	PuntiFarinacei = puntiFarinacei;
}
public int getPuntiUova() {
	return PuntiUova;
}
public void setPuntiUova(int puntiUova) {
	PuntiUova = puntiUova;
}
public int getPuntiFrutta() {
	return PuntiFrutta;
}
public void setPuntiFrutta(int puntiFrutta) {
	PuntiFrutta = puntiFrutta;
}
public int getPuntiVerdura() {
	return PuntiVerdura;
}
public void setPuntiVerdura(int puntiVerdura) {
	PuntiVerdura = puntiVerdura;
}
public int getPuntiConfenzionati() {
	return PuntiConfenzionati;
}
public void setPuntiConfenzionati(int puntiConfenzionati) {
	PuntiConfenzionati = puntiConfenzionati;
}
public int getPuntiLatticini() {
	return PuntiLatticini;
}
public void setPuntiLatticini(int puntiLatticini) {
	PuntiLatticini = puntiLatticini;
}
public int getNPezziFrutta() {
	return NPezziFrutta;
}
public void setNPezziFrutta(int nPezziFrutta) {
	NPezziFrutta = nPezziFrutta;
}
public int getNPezziVerdura() {
	return NPezziVerdura;
}
public void setNPezziVerdura(int nPezziVerdura) {
	NPezziVerdura = nPezziVerdura;
}
public int getNPezziConfenzionati() {
	return NPezziConfenzionati;
}
public void setNPezziConfenzionati(int nPezziConfenzionati) {
	NPezziConfenzionati = nPezziConfenzionati;
}
public int getNPezziLatticini() {
	return NPezziLatticini;
}
public void setNPezziLatticini(int nPezziLatticini) {
	NPezziLatticini = nPezziLatticini;
}
public int getNPezziUova() {
	return NPezziUova;
}
public void setNPezziUova(int nPezziUova) {
	NPezziUova = nPezziUova;
}
public TesseraPunti(String codiceTessera, Date dataDiScadenza, int totalePunti, int puntiFarinacei, int puntiUova,
		int puntiFrutta, int puntiVerdura, int puntiConfenzionati, int puntiLatticini, int nPezziFrutta,
		int nPezziVerdura, int nPezziConfenzionati, int nPezziLatticini, int nPezziUova, int nPezziFarinacei) {
	super();
	CodiceTessera = codiceTessera;
	DataDiScadenza = dataDiScadenza;
	TotalePunti = totalePunti;
	PuntiFarinacei = puntiFarinacei;
	PuntiUova = puntiUova;
	PuntiFrutta = puntiFrutta;
	PuntiVerdura = puntiVerdura;
	PuntiConfenzionati = puntiConfenzionati;
	PuntiLatticini = puntiLatticini;
	NPezziFrutta = nPezziFrutta;
	NPezziVerdura = nPezziVerdura;
	NPezziConfenzionati = nPezziConfenzionati;
	NPezziLatticini = nPezziLatticini;
	NPezziUova = nPezziUova;
}




}
