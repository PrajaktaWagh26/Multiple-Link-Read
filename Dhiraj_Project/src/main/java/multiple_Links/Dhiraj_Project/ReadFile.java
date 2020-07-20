package multiple_Links.Dhiraj_Project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
	private String fileName;

	public ReadFile(String fileName) {
		this.fileName = fileName;
	}

	public List<String> readFileData() throws IOException {
		BufferedReader bufferReader = new BufferedReader(new FileReader(fileName));
		List<String> fileData = new ArrayList<String>();
		try {
			String link = "";
			while ((link = bufferReader.readLine()) != null) {
				fileData.add(link);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			bufferReader.close();
		}
		return fileData;
	}
}
