package advanced_1.file_reader_writer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {
	public void test() {
		FileReader in = null;
		FileWriter out = null;

		try {
			// Path File Input
			String pathInput = "./input.txt";	
			// Path File Output
			String pathOutput = "./output.txt";
			// Input File Reader
			in = new FileReader(new File(pathInput));
			// Output File Writer
			out = new FileWriter(pathOutput);

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
