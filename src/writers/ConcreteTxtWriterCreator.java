package writers;

public class ConcreteTxtWriterCreator extends WriterCreator{
	
	public WriterProduct factoryMethod(){
		return new ConcreteTxtWriterProduct();
	}  
}
