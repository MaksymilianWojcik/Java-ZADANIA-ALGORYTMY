package zadanka1;

import java.util.Scanner;

public class zad7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisz program, kt�ry odczytuje liczb� i sprawdza ile dana liczba ma dzielnik�w.
		
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		System.out.println("Podaj liczbe: ");
		int x = sc.nextInt();
		sc.close();
		
		for (int i = 1; i<=x; i++){
			if (x%i==0){
				counter++;
			}
		}
		
		System.out.println("liczba " + x + " ma dzielnikow: " + counter);
	}

}
