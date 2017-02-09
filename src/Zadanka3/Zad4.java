package Zadanka3;

import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisz funkcjê divide wyznaczaj¹c¹ iloraz dwóch zadanych liczb
		// ca³kowitych. Dzia³anie funkcji sprawdŸ pisz¹c odpowiedni program.
		// Dla chêtnych *- Napisz funkcjê z obs³ug¹ b³êdów.

		// Zad4 zadanie = new Zad4();

		// Scanner sc = new Scanner(System.in);
		// System.out.println("Podaj dwie sumowane liczby: ");
		// System.out.println(zadanie.divide(sc.nextInt(), sc.nextInt()));
		// sc.close();

		Scanner sc = new Scanner(System.in);

		Zad4 zadanie = new Zad4();

		System.out.println("Wybierz dzialanie: ");

		switch (sc.nextInt()) {
		case 0:
			System.out.println("Podaj dwie sumowane liczby: ");
			System.out.println(zadanie.add(sc.nextInt(), sc.nextInt()));
			break;

		case 1:
			System.out.println("Podaj dwie odejmowane liczby: ");
			System.out.println(zadanie.substract(sc.nextInt(), sc.nextInt()));
			break;

		case 2:
			System.out.println("Podaj dwie mnozone liczby: ");
			System.out.println(zadanie.multiply(sc.nextInt(), sc.nextInt()));
			break;

		case 3:
			System.out.println("Podaj dwie dzielone liczby: ");
			System.out.println(zadanie.divide(sc.nextInt(), sc.nextInt()));
			break;

		default:
			System.out.println("Niepoprawny wybor");
		}
		sc.close();

	}

	private int divide(int x, int y) {
		// if(y==0) throw new IllegalArgumentException();

		if (y == 0) {
			System.out.println("Y nie moze byc 0");
			return 0;
		}
		return x / y;
	}

	private int add(int x, int y) {
		return x + y;
	}

	private int multiply(int x, int y) {
		return x * y;
	}

	private int substract(int x, int y) {
		return x - y;
	}

}
