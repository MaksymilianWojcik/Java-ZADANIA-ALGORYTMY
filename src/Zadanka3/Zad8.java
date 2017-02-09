package Zadanka3;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Zad8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisz funkcjê, która stwierdza, czy zadana jako parametr liczba
		// ca³kowita jest kwadratem pewnej liczby ca³kowitej. Liczby bêd¹ce
		// kwadratami liczb ca³kowitych to 1, 4, 9, 16 itd. Wartoœci¹ funkcji
		// ma byæ prawda, jeœli liczba spe³nia warunek oraz fa³sz w przeciwnym
		// wypadku.

		Zad8 zadanie = new Zad8();

		int x = 9;
		zadanie.czyKwadrat(x);
	}

	boolean czyKwadrat(int x) {

		for (int i = 0; i < x; i++) {
			if (x == i * i) {
				System.out.println("TRUE");
				return true;
			}
		}
		System.out.println("FALSE");
		return false;
	}

	// ALBO OPCJA 2

	boolean isNumberQuadOf(double number) {

		double temp = sqrt(number);
		double temp2 = pow(temp, 2);

		if (number == temp2)
			return true;
		else
			return false;
	}
	
	// NAJLEPSZZA OPCJA
	
    boolean ifSqrt(int a) {
        if (Math.sqrt(a) % 1 == 0) {
            System.out.println("Jest to prawda");
            return true;
        }
        else{
            System.out.println("Jest to falsz");
            return false;
        }
    }

}
