package Zadanka2;

public class zadanie2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// W tablicy jednowymiarowej przechowuj�c� liczby ca�kowite znale�� liczb� minimaln� ci�gu.


		int[] array = {5,2,3,4,5,6};
		
		int wynik = array[0];
		for (int i = 0; i <= array.length-1; i++){
			if (wynik > array[i]){
				wynik = array[i];
			}
			
		}
		System.out.println(wynik);

	}

}
