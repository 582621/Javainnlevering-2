package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	
	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("[");
		for(int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i]);
			if(i < tabell.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	// b)
	public static String tilStreng(int[] tabell) {

		String streng = "[";
		for(int i = 0; i < tabell.length; i++) {
			streng += tabell[i];
			if(i < tabell.length - 1) {
				streng += ",";
			}
		}
		streng += "]";
		return streng;
	}

	// c)
	public static int summer1(int[] tabell) {
		
		int sum = 0;
		for(int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}
	public static int summer2(int[] tabell) {

		int sum = 0;
		int i = 0;
		while(i < tabell.length) {
			sum += tabell[i];
			i++;
		}
		return sum;
	}
	public static int summer3(int[] tabell) {
		
		int sum = 0;
		for(int element : tabell) {
			sum += element;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean exist = false;
		for (int element : tabell) {
			if (element == tall) {
				exist = true;
				break;
			}
		}
		return exist;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int pos = -1;
		for (int i = 0; i < tabell.length; i++) {
			if(tabell[i] == tall) {
				pos = i;
				break;
			}
		}
		return pos;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] array = new int [tabell.length];

		for(int i = 0; i < tabell.length; i++) {
			array[i] = tabell[tabell.length-1-i];
		}
		return array;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sort = true;
		for (int i = 1; i < tabell.length; i++) {
			if(tabell[i] < tabell[i-1]) {
				sort = false;
				break;
			}
		}
		return sort;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] tabell = new int [tabell1.length + tabell2.length];
		int index = tabell1.length;
		
		for (int i = 0; i < tabell1.length; i++) {
			tabell[i] = tabell1[i];
			}
		for (int i = 0; i < tabell2.length; i++) {
			tabell[i+index] = tabell2[i];
		}
		return tabell;
	}
}