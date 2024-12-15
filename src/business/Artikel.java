package business;

public class Artikel {
	
	private int artikelnummer;
	private String artikelname;
	private double basispreis;
	
	public Artikel(int artikelnummer, String artikelname, double basispreis) {
		this.artikelnummer = artikelnummer;
		this.artikelname = artikelname;
		this.basispreis = basispreis;
	}
	
	public int getArtikelnummer() {
		return artikelnummer;
	}
	
	public void setArtikelnummer(int artikelnummer) {
		this.artikelnummer = artikelnummer;
	}
	
	public String getArtikelname() {
		return artikelname;
	}
	
	public void setArtikelname(String artikelname) {
		this.artikelname = artikelname;
	}

	public double getBasispreis() {
		return basispreis;
	}
	
	public void setBasispreis(double basispreis) {
		this.basispreis = basispreis;
	}
	
	public double berechnePreisJeArtikel(int anzahlKaufArtikel)
		throws IllegalArgumentException {
		double ergebnisProz = 100;	
		int[] anzArtikel = new int[]{0, 500, 1000};
		int[] preisJeStueckProz = new int[]{100, 75, 60};
		int pos = 1;
		
		if(anzahlKaufArtikel >= 1000){
		 	ergebnisProz = 60;
		}
		else{	
			while(anzArtikel[pos] < anzahlKaufArtikel) {
				pos++;
			}    
			ergebnisProz = 
				((preisJeStueckProz[pos] - 2 * preisJeStueckProz[pos-1]) 
			    / (anzArtikel[pos] - anzArtikel[pos-1])) 
				* (anzahlKaufArtikel - anzArtikel[pos-1]) 
				+  preisJeStueckProz[pos-1];
		}	
	    return (ergebnisProz / 100) * this.basispreis;
	}
}
