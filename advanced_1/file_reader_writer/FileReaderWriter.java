package advanced_1.file_reader_writer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {
	
	public void lihatHasil() {
		FileReader in = null;
		FileWriter out = null;

		try {
			
			/* Path file input */
			String pathInput = "input.txt";	
			
			/* Path file output */
			String pathOutput = "output.txt";
			
			/* Input file reader */
			in = new FileReader(new File(pathInput));
			
			/* Output File Writer */
			out = new FileWriter(pathOutput);

			int c;
			while ((c = in.read()) != -1)
				out.write(c);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */
	public static void main(String[] args) {
		FileReaderWriter fileReaderWriter = new FileReaderWriter();
		fileReaderWriter.lihatHasil();
	}
}
