package business;

import java.util.*;

public class SportartikelListe <T extends Sportartikel> {
	
	private List<T> sportartikelListe = new ArrayList<T>();
	
    public int getAnzahlSportartikel() {
    	return this.sportartikelListe.size();
    }
    
    public T getSportartikel(int i) {
    	return this.sportartikelListe.get(i);
    }
    
    public void addSportartikel(T sportartikel) {
    	this.sportartikelListe.add(sportartikel);
    }
    
    public void removeAllSportartikel() {
    	while(this.getAnzahlSportartikel() > 0) {
    	  	this.sportartikelListe.remove(0);
    	}
    }
}
