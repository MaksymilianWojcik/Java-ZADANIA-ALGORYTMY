package Zadanka3;

public class Zad9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisz funkcjê, która stwierdza, czy zadana jako parametr liczba 
		// ca³kowita jest szeœcianem pewnej liczby naturalnej.
		
		//Math.pow(x, 1.0/3.0)
		//Math.cbrt
		
		Zad9 zadanie = new Zad9();
		
		int x = 125;
		zadanie.czyJestSzescianem(x);
		
	}
	
	boolean czyJestSzescianem(int x){
		
		double y = Math.cbrt(x);
		
		for (int i = 2; i<11; i++){
			if (y%i==0){
				System.out.println("Jest");
				return true;
			} 
		}
		System.out.println("nie jest");
		return false;
	}

}
