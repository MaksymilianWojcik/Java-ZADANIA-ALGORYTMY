package Zadanka3;

import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisz funkcjê multiply wyznaczaj¹c¹ iloczyn dwóch zadanych liczb 
		// ca³kowitych. Dzia³anie funkcji sprawdŸ pisz¹c odpowiedni program.
		
		Zad3 zadanie = new Zad3();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj dwie sumowane liczby: ");
		System.out.println(zadanie.multiply(sc.nextInt(), sc.nextInt()));
		sc.close();
		
	}
	
	
	private int multiply(int x, int y){
		return x*y;
	}


	

}
