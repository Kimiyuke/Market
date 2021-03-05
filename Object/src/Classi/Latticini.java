package Classi;

import java.util.Date;
public class Latticini {
	private String Nome;
	private String Marca;
	private float Prezzo;
	private Date DataDiScadenza;
	private String Categoria;
	private int Peso;
	private Date DataDiMungitura;
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
	public String getCategoria() {
		return Categoria;
	}
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	public int getPeso() {
		return Peso;
	}
	public void setPeso(int peso) {
		Peso = peso;
	}
	public Date getDataDiMungitura() {
		return DataDiMungitura;
	}
	public void setDataDiMungitura(Date dataDiMungitura) {
		DataDiMungitura = dataDiMungitura;
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
	public Latticini(String nome, String marca, float prezzo, Date dataDiScadenza, String categoria, int peso,
			Date dataDiMungitura, Date dataDiProduzione, String idProdotto, int disponibilitaTotale) {
		super();
		Nome = nome;
		Marca = marca;
		Prezzo = prezzo;
		DataDiScadenza = dataDiScadenza;
		Categoria = categoria;
		Peso = peso;
		DataDiMungitura = dataDiMungitura;
		DataDiProduzione = dataDiProduzione;
		IdProdotto = idProdotto;
		DisponibilitaTotale = disponibilitaTotale;
	}
	
	
	
	

}
