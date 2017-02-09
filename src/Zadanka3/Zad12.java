package Zadanka3;

public class Zad12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Skorzystaj z wczeœniejszej funkcji (zad.11.) do znalezienia liczby
		// od 2 do 10000, która ma najwiêksz¹ liczbê dzielników.

		Zad12 zadanie = new Zad12();

		System.out.println(zadanie.getMaxDividers());
	}
	
	
	
	public int getMaxDividers(){
		
		// znajdujemty ilosc dzielnikow i zapisujemy je do tablicy pomocniczej
		int[] arrayOfAnswer = new int[10000];
		
		for (int i = 2; i < 10000; i++){
			arrayOfAnswer[i] = quantityOfDividers(i);
		}
		
		// zapisujemy najwieksza wartosc pod index. Index temp to ten ktory
		// bedize przechowywal index pola z najwieksza wartoscia dzielnikow
		int max = 0;
		int indexTemp = 0;
		for (int i = 0; i < arrayOfAnswer.length; i++){
			if (max<arrayOfAnswer[i]){
				max = arrayOfAnswer[i];
				indexTemp = i;
			}
		}
		
		return indexTemp;
	}



	private int quantityOfDividers(int x) {
		
		int counter = 2;
		for (int i = 2; i <= x; i++) {
			if (x % i == 0) {
				counter++;
			}
		}
		return counter;
		
	}
	
	
	
	
	
	//Na dole moje proby: DOKONCZYC TO
	
	/*
	static int howManyDividers(int x) {

		int counter = 0;
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				counter++;
			}
		}
		return counter;

	}

	int biggestDivider(int x) {

		int[] array = new int[x];
		int counter1;
		for (int i = 2; i <= 1000; i++) {
			counter1 = howManyDividers(i);
			array[i-2] = counter1;
		}

	} */

}
