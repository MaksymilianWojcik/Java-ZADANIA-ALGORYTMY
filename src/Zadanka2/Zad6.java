package Zadanka2;

public class Zad6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrayA = { 1, 3, 2, 6 };
		int[] arrayB = new int[arrayA.length];
		
		
		for (int i = 0; i<arrayA.length; i++){
			for (int j = i; j<arrayA.length; j++){
				arrayB[i] += arrayA[j];
			}
			
		}
		
		
		for (int i = 0; i<arrayA.length; i++){
			System.out.println(arrayB[i]);
		}

	}

}
