package no.hvl.dat100.lab5.tabeller;

import java.util.Arrays;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for (int i : tabell) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String s = Arrays.toString(tabell);
		String str = s.replaceAll("\\s", "");
		return str; 
	}

	// c)
	public static int summer(int[] tabell) {		
		int sum = 0;
		int index = 1;
		
		// for-loop
		for (index = 1; index <= tabell.length; index++) {
			sum = sum + tabell[index - 1];
		}
		
//		// while-loop
//		while (index <= tabell.length) {
//			sum = sum + tabell[index - 1];
//			index++;
//		}
//		
//		// enhanced for-loop (for-each loop)
//		for(int i : tabell) {
//			sum = sum + i;
//		}

		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean isFound = false;
		for(int i : tabell) {
			if (i == tall) {
				isFound = true;
				break;
			}
		}
		
		return isFound;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}
	
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int arrLength = tabell.length;
		int[] newArray = new int[arrLength];
		
		for (int i = 0; i < arrLength; i++) {
			newArray[arrLength - 1] = tabell[i];
			arrLength--;
		}
		skrivUt(newArray);
		return newArray;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] > tabell[i + 1]) {
				return false;
			}
		}
		
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int min = Math.min(tabell1.length, tabell2.length);
		int max = Math.max(tabell1.length, tabell2.length);
		int[] newArr = new int[min + max];
		int index = 0;
		int i = 0;
		for (i = 0; i < min * 2; i += 2) {
			newArr[i] = tabell1[index];
			newArr[i + 1] = tabell2[index];
			index++;
		}
		
		while (i < min + max) {
			if (tabell1.length > tabell2.length) {
				newArr[i] = tabell1[index];
			} else if (tabell2.length > tabell1.length) {
				newArr[i] = tabell2[index];
			}
			i++;
			index++;
		}
		
		return newArr;
	}
}
