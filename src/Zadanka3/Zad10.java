package Zadanka3;

import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisz funkcj�, kt�ra wyznacza maksimum z dw�ch zadanych liczb 
		// ca�kowitych. Warto�ci� funkcji ma by� wi�ksza spo�r�d liczb.
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		Zad10 zadanie = new Zad10();
		System.out.println(zadanie.wieksza(x, y));
		
	}
	
	int wieksza(int x, int y){
		if (x>y){
			return x;
		}
		return y;
	}

}
