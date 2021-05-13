package Classi;

import java.util.Date;
public class Frutta {
	
	private String Nome;
	private String Marca;
	private float Prezzo;
	private Date DataDiScadenza;
	
	private Date DataDiRaccolta;
	private String IdProdotto;
	private int DisponibilitaTotale;
	

public String getNome() {
	return Nome;
}
public  String getMarca() {
	return Marca;
}
public float getPrezzo() {
	return Prezzo;
}
public Date getDataDiScadenza() {
	return DataDiScadenza;
}

public Date getDataDiRaccolta()
{
return DataDiRaccolta;
}
public String getId_prodotto()
{
	return IdProdotto;
}
public int getDisponibilitaTotale()
{
	return DisponibilitaTotale;
}


public Frutta(String nome, String marca, float prezzo, Date dataDiScadenza,Date dataDiRaccolta,
		String idProdotto, int disponibilitaTotale) {
	super();
	Nome = nome;
	Marca = marca;
	Prezzo = prezzo;
	DataDiScadenza = dataDiScadenza;
	DataDiRaccolta = dataDiRaccolta;
	IdProdotto = idProdotto;
	DisponibilitaTotale = disponibilitaTotale;
}

}



