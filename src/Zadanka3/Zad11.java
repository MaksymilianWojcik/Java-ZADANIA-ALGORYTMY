package Zadanka3;

public class Zad11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisz funkcj�, kt�ra odczytuje jako 
		// argument liczb� i wypisuje liczb� dzielnik�w
		
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
