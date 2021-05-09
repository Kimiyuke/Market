package dao;

import Panels.PanelAggiuntaAcquisto;

public interface AcquistoDAO {
	
	//effettua un acquisto di un singolo prodotto
	public  boolean acquistosingolo(String idprodotto, int quantita, String codicetessera, String data, int idacquisto, PanelAggiuntaAcquisto panelaggiuntaacquisto );
	public  boolean acquistototale(String idprodotto, int quantita, String codicetessera, String data, int idacquisto, PanelAggiuntaAcquisto panelaggiuntaacquisto);


}
