package Zadanka2;

public class zadanie3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//W tablicy jednowymiarowej znajdŸ liczbê, która wystêpuje najczêœciej.
		
		int[] arrayOfInt = {1,1,5,12,141,1,5,5,3,3,3,2,6123,12,1,623,31,3,3,3};
		 int[] arrayOfResponse = new int[arrayOfInt.length];
		 
		 // Zapisujemy sobie do odrebnej tablicy, wynik grupowania danych
		 for(int i = 0; i < arrayOfInt.length; i++) { 
			 int counter = 0; 
			 for(int number : arrayOfInt)  {
				  if(arrayOfInt[i] == number) counter++;
			 }
			 arrayOfResponse[i] = counter;
			 
			 System.out.println("i to: " + i + " ,counter to: " + counter);

			 System.out.print("W arrayofresponse: " +arrayOfResponse[i]);
			 System.out.println();
			 
			 //Czyli tak, sprawdzamy w kazdym elemencie arrayOfInt: dla kazdego integera w tej tablicy, jezeli wartosc danego elementu 
			//wystepuje w tej tablicy, to zwiekszamy tego countera
		 }
		 
		 	
		 // Szukamy najwiekszej liczby która sie powtarza w tablicy arrayofresponse
		 int temp = 0; 
		 int tempIndex = 0;
		 for(int i = 0; i < arrayOfResponse.length; i++) { 
			 if(arrayOfResponse[i]  > temp) { 
				 temp = arrayOfResponse[i];
				 tempIndex = i; 
			 }
		 }
		 
		 System.out.println("Najczesciej wystepujaca liczba to: " + arrayOfInt[tempIndex]);
	}
		
}
