package Zadanka3;

public class Zad7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisz funkcjê, która stwierdza, czy zadana jako parametr liczba
		// ca³kowita jest kwadratem pewnej liczby ca³kowitej. Liczby bêd¹ce
		// kwadratami liczb ca³kowitych to 1, 4, 9, 16 itd. Wartoœci¹ funkcji
		// ma byæ prawda, jeœli liczba spe³nia warunek oraz fa³sz w przeciwnym
		// wypadku.

		Zad7 zadanie = new Zad7();
		int liczba = 5;

		zadanie.czyPierwsza(liczba);

	}

	boolean czyPierwsza(int liczba) {


		if (liczba == 1) {
			System.out.println("Liczba nie jest liczba pierwsza");
			return false;
		}

		for (int i = 2; i < liczba; i++) {
			if (liczba % i == 0) {
				System.out.println("nie jest liczba pirewsza");
				return false;
			}
		}


		System.out.println("Liczba " + liczba + " jest liczba pierwsza");
		return true;

	}

}
