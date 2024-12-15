package writers;

public class ConcreteKonsoleWriterCreator extends WriterCreator{
	
	public WriterProduct factoryMethod(){
		return new ConcreteKonsoleWriterProduct();
	}  
}
