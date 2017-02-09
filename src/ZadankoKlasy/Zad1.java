package ZadankoKlasy;

public class Zad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Player[] players = {
				new Player("maks", "wojcik", 120),
				new Player("aleks", "pecher", 130),
				new Player("lea", "sztym", 131)
		};
		
		Game game = new Game("gra 1", players);
		
		System.out.println(game.getWinner());
		
		 /* Samochod auto = new Samochod("Mercedes", "W123", 300);
		
		auto.show(); 
		*/
		
		
		
		/* Osoba human = new Osoba("maks", "wojcik", 24, "Male");
		
		//human.setName("Aleks");
		human.setAge(28);
		//human.setSurname("Pecherczyk");
		human.setGender("Female");
		
		System.out.println(human.getName());
		System.out.println(human.getSurname());
		System.out.println(human.getAge());
		System.out.println(human.getGender()); */
		
		
	}
	
	

}



