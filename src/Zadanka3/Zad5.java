package Zadanka3;

public class Zad5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisz funkcjê, która ma trzy parametry formalne a, b, c bêd¹ce 
		// liczbami ca³kowitymi. Funkcja zwraca prawdê, jeœli zadane liczby s¹ 
		// liczbami pitagorejskimi oraz fa³sz w przeciwnym wypadku. Liczby 
		// pitagorejskie spe³niaj¹ warunek: a*a+b*b=c*c.
		
		int a = 3;
		int b = 4;
		int c = 5;
		
		Zad5 zadanie = new Zad5();
		
		zadanie.pitagorejskie(a, b, c);
	}
	
	boolean pitagorejskie(int a, int b, int c){
		
		if (!(((a*a)+(b*b))==(c*c))){
			System.out.println("Liczby nie sa liczbami pitagorejskimi!");
			return false;
		}
		System.out.println("Liczby sa liczbami pitagorejskimi");
		return true;
	}

}
