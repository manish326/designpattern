package factory;

public class PDFReaderFactoryService extends FectoryService {
	
	@Override
	public FileReader getReader() {
		return new PDFFileReder();
	}
}
