package Classi;

import java.util.Date;
public class Cliente {
	private String Nome;
	 String Cognome;
	 String CodiceTessera;
	 String CF;
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCognome() {
		return Cognome;
	}
	public void setCognome(String cognome) {
		Cognome = cognome;
	}
	public String getCodiceTessera() {
		return CodiceTessera;
	}
	public void setCodiceTessera(String codiceTessera) {
		CodiceTessera = codiceTessera;
	}
	public String getCF() {
		return CF;
	}
	public void setCF(String cF) {
		CF = cF;
	}
	public Cliente(String nome, String cognome, String codiceTessera, String cF) {
		super();
		Nome = nome;
		Cognome = cognome;
		CodiceTessera = codiceTessera;
		CF = cF;
	}
	

	
}
