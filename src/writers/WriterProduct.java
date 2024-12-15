package writers;

import java.io.IOException;
import java.util.ArrayList;

import business.Artikel;

public abstract class WriterProduct {
	
	public abstract void schreibeArtikel(
		ArrayList<Artikel> artikel)
		throws IOException;


}
