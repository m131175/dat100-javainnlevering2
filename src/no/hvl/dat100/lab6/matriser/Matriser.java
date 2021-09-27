package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] row : matrise) {
			for (int x : row) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String stringRep = "";
		for (int[] row : matrise) {
			for (int x : row) {
				stringRep += x + " ";
			}
			stringRep += "\n";
		}
	
		return stringRep;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] newMatrix = new int[matrise.length][matrise[0].length];
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				newMatrix[i][j] = matrise[i][j] * tall;
			}
		}
		
		return newMatrix;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length;j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
