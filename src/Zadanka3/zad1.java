package Zadanka3;

import java.util.Scanner;

public class zad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisz funkcj� add wyznaczaj�c� sum� dw�ch zadanych liczb ca�kowitych. Napisz program
		// wykorzystuj�cy funkcj� add
		
		zad1 zadanie = new zad1();
		
		//System.out.println(zadanie.add(5,5));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj dwie sumowane liczby: ");
		System.out.println(zadanie.add(sc.nextInt(), sc.nextInt()));
		sc.close();
		
	}
	
	
	private int add(int x, int y){
		return x+y;
	}
	

}
