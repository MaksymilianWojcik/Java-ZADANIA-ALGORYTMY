package Zadanka3;

public class Zad7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisz funkcj�, kt�ra stwierdza, czy zadana jako parametr liczba
		// ca�kowita jest kwadratem pewnej liczby ca�kowitej. Liczby b�d�ce
		// kwadratami liczb ca�kowitych to 1, 4, 9, 16 itd. Warto�ci� funkcji
		// ma by� prawda, je�li liczba spe�nia warunek oraz fa�sz w przeciwnym
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
