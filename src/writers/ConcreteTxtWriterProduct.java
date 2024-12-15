package writers;

import java.io.*;
import java.util.ArrayList;

import business.Artikel;

public class ConcreteTxtWriterProduct extends WriterProduct{
	
	public void schreibeArtikel(ArrayList<Artikel> artikel) 
		throws IOException{
		BufferedWriter aus = new BufferedWriter(new FileWriter("Artikel.txt"));
		aus.write(artikel.size() + "");
		aus.newLine();
		for(Artikel art : artikel) {
			aus.write(art.getArtikelnummer());
			aus.newLine();
			aus.write(art.getArtikelname());
			aus.newLine();
			aus.write(art.getBasispreis() + "");
			aus.newLine();		
		}
		aus.close();
	}	

}
