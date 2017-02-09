package Zadanka3;

import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisz funkcjê, która wyznacza maksimum z dwóch zadanych liczb 
		// ca³kowitych. Wartoœci¹ funkcji ma byæ wiêksza spoœród liczb.
		
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
