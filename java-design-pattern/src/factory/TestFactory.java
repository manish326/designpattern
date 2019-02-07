package factory;

public class TestFactory {

	public static void main(String[] args) {
		FectoryService service = new XMLReaderFectoryService ();
		FileReader reader= service.getReader();
		reader.read();
		service = new PDFReaderFactoryService();
		reader= service.getReader();
		reader.read();
	}
}
