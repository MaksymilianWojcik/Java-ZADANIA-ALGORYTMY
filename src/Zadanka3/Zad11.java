package Zadanka3;

public class Zad11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisz funkcjê, która odczytuje jako 
		// argument liczbê i wypisuje liczbê dzielników
		
		int x = 20;
		
		Zad11 zadanie = new Zad11();
		
		System.out.println(zadanie.howManyDividers(x));
	}
	
	
	int howManyDividers(int x){
		
		int counter = 0;
		for(int i = 1; i<=x;i++){
			if(x%i==0){
				counter++;
			}
		}
		return counter;
	
		
	}


}
