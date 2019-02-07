package factory;

public class XMLReaderFectoryService extends FectoryService{
	
	@Override
	public FileReader  getReader() {
		return new XMLFileReader();
	}
}
