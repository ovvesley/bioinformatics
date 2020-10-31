package exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import utils.Base;

public class SkewExercice {

	public static void skewDiagramResult(String genome) {

		int skewIndex = 0;

		System.out.print(skewIndex + " ");
		for (char base : genome.toCharArray()) {

			if (base == Base.ADENINE.getBase()) {
				skewIndex = skewIndex + 0;
			}

			if (base == Base.TIMINE.getBase()) {
				skewIndex = skewIndex + 0;
			}

			if (base == Base.CYTOSINE.getBase()) {
				skewIndex = skewIndex - 1;
			}

			if (base == Base.GUANINE.getBase()) {
				skewIndex = skewIndex + 1;
			}
			System.out.print(skewIndex + " ");
		}
	}

	public static void minimumSkewProblem(String genome) {
		int skewIndex = 0;
		int skew = 0; 
		int minSkew = 0;
		int indexI = 1;		
		ArrayList <Integer> skewSet = new ArrayList<Integer>();
		
		try {
			File myObj = new File("C:\\\\Workspace\\\\bioinformatics\\\\genomes\\\\extra_skew.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				
				for (char base : myReader.nextLine().toCharArray()) {	
					System.out.print(indexI);
					if (base == Base.CYTOSINE.getBase()) {
						skewIndex = skewIndex - 1;
					}
					if (base == Base.GUANINE.getBase()) {
						skewIndex = skewIndex + 1;
					}		
					if (skewIndex < minSkew) {
						skewSet.add(indexI);
						System.out.print(indexI+ " ");
						
						minSkew = skew;
					}						
					indexI++;
				}
				
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		
		System.out.println(skewSet);
	}
	
	

}
