package dao;

import java.util.ArrayList;
import java.util.List;

import model.Impiegato;

public class ImpiegatoDao {

	private List<Impiegato> listaImpiegato = new ArrayList<>();
	
	public Impiegato ricercaPerCodiceFiscale(String cf) {
		// ricerca l'impiegato con codice fiscale 
		for (Impiegato i: listaImpiegato) {
			if (i.getCodiceFiscale().equals(cf))
					return i;
		}
		return null;
	}
	
	public void inserisci(Impiegato i) {
		// Inserisci l'impiegato o nella lista
		listaImpiegato.add(i);
	}
	
	public boolean aggiorna(Impiegato i) {
		// aggiorna impiegato se trovato
		for (Impiegato x: listaImpiegato) {
			if (x.getCodiceFiscale().equals(i.getCodiceFiscale())) {
				x.setCognome(i.getCognome());
				x.setNome(i.getNome());
				x.setMatricola(i.getMatricola());
				return true;
			}
		}
		return false;
	}
	
	public boolean elimina (String cf) {
		// elimina impiegato se trovato
		for (Impiegato i: listaImpiegato) {
			if (i.getCodiceFiscale().equals(cf)) {
				listaImpiegato.remove(i);
				return true;
			}
		}
		return false;
	}
}
