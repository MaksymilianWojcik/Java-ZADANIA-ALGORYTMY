package zadanka1;

public class zad6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Stw�rz program, kt�ry odczytuj� dany napis i wypisuje ile razy w danym
		// napisie wyst�puj� ma�e litery
		
		String word = "AaaCBsKJhh"; // 4 wielkie litery
		int counter = 0;
		
		for (int i = 0; i<=word.length()-1; i++){
			if(!(word.charAt(i)>='a' && word.charAt(i)<='z')){
				counter++;
			}
		}
		
		System.out.println(counter);
	}

}
