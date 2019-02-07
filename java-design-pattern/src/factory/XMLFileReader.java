package factory;

public class XMLFileReader implements FileReader {
	
	@Override
	public String read() {
		System.out.println("Reading XML File...");
		return "XMl File Contents";
	}


}
