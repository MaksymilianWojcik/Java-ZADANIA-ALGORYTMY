package Zadanka3;

import java.util.Scanner;

public class Zad6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisz funkcjê, która wyznacza sumê cyfr zadanej liczby ca³kowitej.
		
		int x;
		System.out.println("Podaj liczbe calkowita: ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		sc.close();
		
		Zad6 zadanie = new Zad6();
		
		System.out.println(zadanie.suma(x));
		
	}
	
	int suma(int x){
		int score = 0;
		while (x!=0){
			score+=x%10;
			x/=10;
		}
		return score;
	}

}
