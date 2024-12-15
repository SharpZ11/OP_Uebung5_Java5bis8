package writers;

import java.io.*;
import java.util.ArrayList;

import business.Artikel;

public class ConcreteKonsoleWriterProduct extends WriterProduct{
	
	public void schreibeArtikel(ArrayList<Artikel> artikel) 
		throws IOException{
		System.out.println("Anzahl vorhandener Artikel: " + artikel.size() + "");
		System.out.println("");
		for(Artikel art : artikel) {
			System.out.println("Artikelnummer: " + art.getArtikelnummer());
			System.out.println("Artikelname:   " + art.getArtikelname());
			System.out.println("Basispreis:    " + art.getBasispreis());
			System.out.println("");
		}    
	}	

}
