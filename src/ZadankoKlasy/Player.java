package ZadankoKlasy;

public class Player {

	private String name;
	private String surname;
	private int score = 0;


	public Player(String name, String surname, int score){
		this.name = name;
		this.surname = surname;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getScore() {
		return score;
	}
	
	public String fullName(){
		return name + " " + surname;
	}



}
