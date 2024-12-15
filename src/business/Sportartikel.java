package business;

public abstract class Sportartikel {
	
	private int einkaufsdatum;
	private double preis;
	
	public Sportartikel(int einkaufsdatum, double preis) {
		super();
		this.einkaufsdatum = einkaufsdatum;
		this.preis = preis;
	}

	public int getEinkaufsdatum() {
		return einkaufsdatum;
	}
	
	public void setEinkaufsdatum(int einkaufsdatum) {
		this.einkaufsdatum = einkaufsdatum;
	}
	
	public double getPreis() {
		return preis;
	}
	
	public void setPreis(double preis) {
		this.preis = preis;
	}
	
	public String gibZurueck(char trenner) {
		return (getEinkaufsdatum() + "") + trenner + this.getPreis();
	}

}
