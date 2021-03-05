package Classi;

import java.util.Date;

public class Verdura {
	private String Nome;
	private String Marca;
	private float Prezzo;
	private Date DataDiScadenza;
	
	private Date DataDiRaccolta;
	private String IdProdotto;
	private int DisponibilitaTotale;
	
public Verdura() {
	
}
public String getNome() {
	return Nome;
}
public  String getMarca() {
	return Marca;
}
public float getPrezzo() {
	return Prezzo;
}
public Date getData_di_scadenza() {
	return DataDiScadenza;
}

public Date getData_di_raccolta()
{
return DataDiRaccolta;
}
public String getId_prodotto()
{
	return IdProdotto;
}
public int getDisponibilita_totale()
{
	return DisponibilitaTotale;
}
public void setNome() {
	this.Nome=Nome;
}
public void setMarca() {
	this.Marca=Marca;
	
}
public void setPrezzo()
{
	
	this.Prezzo=Prezzo;
}


public void setData_di_scadenza()
{
	this.DataDiScadenza=DataDiScadenza;
	
}

	

public void setData_di_raccolta()

{
	this.DataDiRaccolta=DataDiRaccolta;
}

public void setId_prodotto()
{
	this.IdProdotto=IdProdotto;
}

public void setDisponibilita_totale()
{
	this.DisponibilitaTotale=DisponibilitaTotale;
}
public Verdura(String nome, String marca, float prezzo, Date dataDiScadenza,  Date dataDiRaccolta,
		String id_prodotto, int disponibilita_totale) {
	super();
	Nome = nome;
	Marca = marca;
	Prezzo = prezzo;
	DataDiScadenza = dataDiScadenza;
	DataDiRaccolta = dataDiRaccolta;
	IdProdotto = id_prodotto;
	DisponibilitaTotale = disponibilita_totale;
}
}


