package Zadanka3;

public class Zad14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisz funkcjê, która odczytuje 2 liczby i zwraca NWD (a,b)
		
		int x = 3;
		int y = 8;
		
		Zad14 zadanie = new Zad14();
		
		System.out.println(zadanie.euklides(x, y));

	}

	int euklides(int x, int y) {

		while (x != y) {
			if (x > y) {
				x -= y;
			} else {
				y -= x;
			}
		}
		
		return x;
	}

}
