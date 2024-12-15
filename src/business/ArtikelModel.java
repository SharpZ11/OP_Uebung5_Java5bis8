package business;

import java.io.IOException;
import java.util.ArrayList;

import readers.*;
import writers.*;

public class ArtikelModel {
	
	//private Artikel[] artikel = new Artikel[100];
	
	//Ersetzen von Artikel[] Array durch ArrayList<Artikel<
	private ArrayList<Artikel> artikel = new ArrayList<>();
	
	//private int anzahlArtikel;
	
	//public int getAnzahlArtikel() {
	//	return anzahlArtikel;
	//}

	//public void setAnzahlArtikel(int anzahlArtikel) {
	//	this.anzahlArtikel = anzahlArtikel;
	//}
  
	public void leseArtikelAusCsvDatei()
        throws IOException{
		ReaderCreator readerCreator = new ConcreteCsvReaderCreator();
		ReaderProduct reader = readerCreator.factoryMethod();
		//this.setAnzahlArtikel(reader.leseAnzahlArtikel());
		this.artikel = reader.leseArtikel();
	}
	
	public void schreibeArtikelInTxtDatei()
	    throws IOException{
		WriterCreator writerCreator = new ConcreteTxtWriterCreator();
		WriterProduct writer = writerCreator.factoryMethod();
		//writer.schreibeArtikel(this.getAnzahlArtikel(), this.artikel);
		writer.schreibeArtikel(this.artikel);
	}
	
	public void schreibeArtikelInKonsole()
		throws IOException{
		WriterCreator writerCreator = new ConcreteKonsoleWriterCreator();
		WriterProduct writer = writerCreator.factoryMethod();
		//writer.schreibeArtikel(this.getAnzahlArtikel(), this.artikel);
		writer.schreibeArtikel(this.artikel);
	}

}
