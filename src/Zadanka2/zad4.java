package Zadanka2;

public class zad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Dla danej tablicy liczb ca³kowitych oblicz œredni¹ arytmetyczn¹ oraz sumê ci¹gu.
		
		int[] array = {1,2,3,4,5,6}; //suma:  21, srednia: 3.5 czyli 3
		
		int sum = 0;
		double med = 0;
		
		for (int i = 0; i < array.length; i++){
			sum += array[i];
		}
		
		med = (double) sum/array.length;
		
		System.out.println("Suma wynosi: " + sum + ", srednia wynosi: " + med);
		

	}

}
