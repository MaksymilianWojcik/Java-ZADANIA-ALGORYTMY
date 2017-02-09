package Zadanka3;

import java.util.Scanner;

public class Zad13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisz funkcjê, która odczytuje a i n i zwraca a do potêgi n
		
		Scanner sc = new Scanner(System.in);
		
		Zad13 zadanie = new Zad13();
		System.out.println(zadanie.potegi(sc.nextInt(),sc.nextInt()));
		sc.close();
	}

	private double potegi(int a, int n) {
		return Math.pow(a, n);
	}

}
