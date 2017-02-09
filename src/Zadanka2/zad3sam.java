package Zadanka2;

import java.util.Scanner;

public class zad3sam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] array = {1,2,3,4,5,4,2,3,4,5,7,7,5,3,5,1,5,3,3,3,3,2,1,1,1,1,1,1,5,4,3,2,1,1,4,5,6};
		//int[] arrayTemp = new int[array.length];
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Podaj oddzielone spacjami elementy tablicy: ");
		String[] arrayString = sc.nextLine().split(" ");
		int[] array = new int[arrayString.length];
		sc.close();
		for (int i = 0; i <arrayString.length; i++){
			array[i] = Integer.parseInt(arrayString[i]);
		}
												  //index: 0  1  2  3  4  5
		// po powyzszym mamy tablice array integerow, np: [1][2][3][4][5][4]
		
		
		
		int[] arrayTemp = new int[array.length];
		// 0 1 2 3 4 5
		// [][][][][][]
		
		for (int i = 0; i < array.length; i++){
			int counter = 0;
			for (int number : array){
				if(array[i] == number){
					counter++;
				}
			}
				arrayTemp[i] = counter;
				
				// przyklad dla i= 0:
				// i=0 -->  counter=0 --> petla (i=0) --> dla kazdego int'a w tablicy array --? jezeli array[0] (czyli wartosc 1) == jakis integer z tablicy array
				// -> to counter++. 1 wystepuje w powyzszym przykladzie 1 raz, wiec counter=1. --> wychodzimy z ifa' --> wychodzimy z petli foreach
				// --> i przypisujemy do arrayTemp[0] wartosc countera, czyli 1.
				
				// System.out.println("i wynosi: " + i + ", counter wynosi: " + counter);
				// System.out.print("W arrayofresponse: " +arrayTemp[i]);
				// System.out.println();
				
				// wyjasnienie ponizszych instrukcji, kontynuacja programu:
				// temp = 0. tempIndex =0  -->  petla (rozwazamy i=0) --> jezeli arrayTemp[0] (wartosc 1) > temp( wartosc 0), to --> 
				// temp=arrayTemp[0], czyli temp=1 --> tempIndex = 0 (bo i z petli bylo akurat 0).
				// --> Na koniec najczesniej wystepuje liczba array[tempIndex], czyli biorac pod uwage juz wsyzstkie iteracje petli
				// i powyzsza przykladowa tabele, bedzie to liczba i = 3, temp = arrayTemp[3] czyli temp=4, tempIndex = 3
				//--> a wiec najwieksza to array[tempIndex], czyli array[3], czyli liczba '4' !! proste
			
		}
		
		int temp = 0;
		int tempIndex = 0;
		for(int i = 0; i < arrayTemp.length; i++){
			if (arrayTemp[i]>temp){
				temp = arrayTemp[i];
				tempIndex = i;
			}
		}
		System.out.println("najczesciej wystepuje liczba: " + array[tempIndex]);
	}
}
		
		



