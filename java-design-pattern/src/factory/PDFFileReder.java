package factory;

public class PDFFileReder implements FileReader {

	@Override
	public String read() {
		System.out.println("Reading PDF File ...");
		return "PDF File Contents";

	}

}
