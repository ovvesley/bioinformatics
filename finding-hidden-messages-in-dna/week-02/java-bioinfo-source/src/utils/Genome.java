package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Genome {
	private String path;
	private String genomeData = "";

	public Genome(String path) {
		this.path = path;
		readGenomeFile();
	}
	
	public String getGenomeData() {
		return genomeData;
	}

	private void readGenomeFile() {
		
		try {
			File myObj = new File(this.path);
			Scanner myReader = new Scanner(myObj);
			genomeData = new String();
			while (myReader.hasNextLine()) {
				genomeData += myReader.nextLine();
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
