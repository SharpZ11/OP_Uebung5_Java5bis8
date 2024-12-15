package business.baelle;

import business.Sportartikel;

public class Ball extends Sportartikel{
	
	private String material;
	private String sportart;
	private String status;
	private String nutzung;
	
	public Ball(int einkaufsdatum, String material, String sportart,
		String status, String nutzung, double preis) 
	 	throws Exception {
		super(einkaufsdatum, preis);
		this.material = material;
		this.sportart = sportart;
		this.status = status;
		this.nutzung = nutzung;
	}
	 
	public boolean ueberpruefeSportart(){
	    if(this.sportart == null){
	    	return false;
	    }
	    else
	    	return true;
	}		
	
	public String getMaterial() {
		return material;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public String getSportart() {
		return sportart;
	}
	
	public void setSportart(String sportart) {
		this.sportart = sportart;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getNutzung() {
		return nutzung;
	}
	
	public void setNutzung(String nutzung) {
		this.nutzung = nutzung;
	}
	
	@Override	
	public String gibZurueck(char trenner) {
		return (super.gibZurueck(trenner) + trenner + this.getMaterial() + trenner
		+ this.getSportart() + trenner + this.getStatus() + trenner
		+ this.getNutzung());
	}
	
}
