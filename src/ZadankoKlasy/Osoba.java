package ZadankoKlasy;

public class Osoba {
		String name;
		String surname;
		int age;
		String gender;
		
		public Osoba(String name, String surname, int age, String gender){
			this.name = name;
			this.surname = surname;
			this.age = age;
			this.gender = gender;
		}
		
		public void setName(String name){
			this.name = name;
		}
		
		public String getName(){
			return name;
		}
		
		public void setSurname(String surname){
			this.surname = surname;
		}
		
		public String getSurname(){
			return surname;
		}
		
		public void setAge(int age){
			this.age = age;
		}
		
		public int getAge(){
			return age;
		}
		
		public void setGender(String gender){
			this.gender = gender;
		}
		
		public String getGender(){
			return gender;
		}
		
		
	
}
