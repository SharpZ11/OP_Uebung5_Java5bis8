package readers;

public class ConcreteCsvReaderCreator extends ReaderCreator{
	
	public ReaderProduct factoryMethod(){
		return new ConcreteCsvReaderProduct();
	} 

}
