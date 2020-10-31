import exercise.SkewExercice;
import utils.Genome;

public class Main {
	public static String genome = "TAAAGACTGCCGAGAGGCCAACACGAGTGCTAGAACGAGGGGCGTAAACGCGGGTCCGAT";

	public static void main(String args[]) {
		Genome gen = new Genome("C:\\Workspace\\bioinformatics\\genomes\\extra_skew.txt");
//		System.out.println(gen.getGenomeData());
//		SkewExercice.skewDiagramResult(gen.getGenomeData());
		SkewExercice.minimumSkewProblem(gen.getGenomeData());
		

	}

}
