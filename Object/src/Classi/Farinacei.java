package Classi;

import java.util.Date;
public class Farinacei {
	private String Nome;
	private String Marca;
	private float Prezzo;
	private Date DataDiScadenza;
	private int Peso;
	private String Ingredienti;
	private Date DataDiProduzione;
	private String IdProdotto;
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
	public Date getDataDiScadenza() {
		return DataDiScadenza;
	}
	public void setDataDiScadenza(Date dataDiScadenza) {
		DataDiScadenza = dataDiScadenza;
	}
	
	
	public int getPeso() {
		return Peso;
	}
	public void setPeso(int peso) {
		Peso = peso;
	}
	public String getIngredienti() {
		return Ingredienti;
	}
	public void setIngredienti(String ingredienti) {
		Ingredienti = ingredienti;
	}
	public Date getDataDiProduzione() {
		return DataDiProduzione;
	}
	public void setDataDiProduzione(Date dataDiProduzione) {
		DataDiProduzione = dataDiProduzione;
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
	public Farinacei(String nome, String marca, float prezzo, Date dataDiScadenza,int peso,
			String ingredienti, Date dataDiProduzione, String idProdotto, int disponibilitaTotale) {
		super();
		Nome = nome;
		Marca = marca;
		Prezzo = prezzo;
		DataDiScadenza = dataDiScadenza;
		Peso = peso;
		Ingredienti = ingredienti;
		DataDiProduzione = dataDiProduzione;
		IdProdotto = idProdotto;
		DisponibilitaTotale = disponibilitaTotale;
	}

	
	
}
