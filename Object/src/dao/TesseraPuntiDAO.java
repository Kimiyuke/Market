package dao;

import java.util.ArrayList;

import Classi.TesseraPunti;

public interface TesseraPuntiDAO {
	public ArrayList<TesseraPunti> SelectPuntiFrutta();
	public ArrayList<TesseraPunti> SelectPuntiFarinacei();
	public ArrayList<TesseraPunti> SelectPuntiVerdura();
	public ArrayList<TesseraPunti> SelectPuntiConfezionati();
	public ArrayList<TesseraPunti> SelectPuntiLatticini();
	public ArrayList<TesseraPunti> SelectPuntiUova();
	
	public ArrayList<TesseraPunti> SelectPezziFrutta();
	public ArrayList<TesseraPunti> SelectPezziFarinacei();
	public ArrayList<TesseraPunti> SelectPezziVerdura();
	public ArrayList<TesseraPunti> SelectPezziConfezionati();
	public ArrayList<TesseraPunti> SelectPezziLatticini();
	public ArrayList<TesseraPunti> SelectPezziUova();
}
