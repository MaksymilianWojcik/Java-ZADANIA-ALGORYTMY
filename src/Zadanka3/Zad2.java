package Zadanka3;

import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisz funkcj� substract wyznaczaj�c� r�nic� dw�ch zadanych liczb 
		// ca�kowitych. Dzia�anie funkcji sprawd� pisz�c odpowiedni program.
		
		Zad2 zadanie = new Zad2();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj dwie sumowane liczby: ");
		System.out.println(zadanie.substract(sc.nextInt(), sc.nextInt()));
		sc.close();
		
	}
	
	
	private int substract(int x, int y){
		return x-y;
	}
		
	

}
