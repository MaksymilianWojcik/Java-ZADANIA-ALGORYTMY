package zadanka1;

import java.util.Scanner;

public class zad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Napisz program, który sprawdza czy dany odczytany napis jest w
		poprawnym formacie kodu pocztowego tzn: 87-630 jest w formacie poprawnym,
		natomiast 8aa-999 jest niepoprawnym kodem pocztowym ( dwie pierwsze cyfry
		nastêpni myœlnik, nastêpnie trzy cyfry). */
		
		String code = "";
		Scanner sc = new Scanner(System.in);
		boolean isCodeOk = true;
		
		
		System.out.println("Podaj kod pocztowy: ");
		code = sc.next();
		sc.close();
		//jakby nie dzialalo to usunac sc close bo zostal dodany pozniej
		
		if (!(code.length()==6 && code.charAt(2)=='-' )){
			isCodeOk = false;
			System.out.println("Bledny kod");
			} else {
				for (int i = 0; i>=code.length()-1; i--){
					if(!(code.charAt(i)<='9' && code.charAt(i)>=1)){
						isCodeOk = false;
						System.out.println("Bledny kod!");
					}
				}
			}
		
		if (isCodeOk){
			System.out.println("Poprawny kod");
			}
		}
	}


