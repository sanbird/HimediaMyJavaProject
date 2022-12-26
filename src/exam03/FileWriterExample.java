package exam03;

import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {		
		try(FileWriter fw = new FileWriter("file.txt")){
			fw.write("java");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
