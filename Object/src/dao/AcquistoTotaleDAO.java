package dao;

import java.util.ArrayList;

import Classi.AcquistoTotale;

public interface AcquistoTotaleDAO {
	public  int getprezzototale(Integer idacquisto);
	public  int getpuntitotale(Integer idacquisto);
	public  ArrayList<AcquistoTotale> AcquistiPerData(int mese, int anno); 
	public float getguadagnomensile(int mese, int anno);
}
