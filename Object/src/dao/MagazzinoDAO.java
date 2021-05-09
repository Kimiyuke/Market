package dao;

import java.util.ArrayList;

import Classi.Magazzino;

public interface MagazzinoDAO {
	public  ArrayList<Magazzino> SelectProdottiFrutta();
	public  ArrayList<Magazzino> SelectProdottiVerdura();
	public  ArrayList<Magazzino> SelectProdottiLatticini();
	public  ArrayList<Magazzino> SelectProdottiConfezionati();
	public  ArrayList<Magazzino> SelectProdottiFarinacei();
	public  ArrayList<Magazzino> SelectProdottiUova();
}
