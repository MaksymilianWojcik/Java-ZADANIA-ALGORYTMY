package Zadanka2;

import java.util.Scanner;

public class zadanie1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WprowadŸ n liczb ca³kowitych do jednowymiarowej tablicy i wyprowadŸ je na ekran w
		//odwrotnej kolejnoœci.
		
		System.out.println("Podaj elementy tablicy: ");
		Scanner sc = new Scanner(System.in);
		String[] array = sc.nextLine().split(" ");
		sc.close();
		
		//int[] array = {1,2,3,4,5,6};
		
		for (int i = array.length - 1; i >= 0; i--){
			System.out.print(array[i]);
			System.out.print(" ");
		}

	}

}
