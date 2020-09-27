package no.hvl.dat100.lab6.matriser;

public class Matriser {
	
	public static void main(String[] args) {
		
		int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		skrivUt(matrix);
	}
	
	// a)
	public static void skrivUt(int[][] matrise) {
		
		for(int[] rad : matrise) 
		{
			for(int kol : rad)
			{
			System.out.print(kol+"  ");
			}
		System.out.print("\n");
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String matrise1 = "";
		for(int[] rad : matrise) 
		{
			for(int kol : rad) 
			{
			matrise1 += kol + " ";
			}
			matrise1 += "\n";
		}
		return matrise1;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] nyMatrise = new int[matrise.length][matrise[0].length];
		
		for(int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[i].length; j++) {
				nyMatrise[i][j] = matrise[i][j] * tall;
			}
		}
		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean lik = true;
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[i].length; j++) {
				
				if(a[i][j] != b[i][j]) {
					lik = false;
				}
			}
		}
		return lik;
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
