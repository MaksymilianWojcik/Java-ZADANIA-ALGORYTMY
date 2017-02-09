package ZadankoKlasy;

public class Samochod {
	
	String brand;
	String model;
	double price;
	
	
	public Samochod(String brand, String model, double price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	public String getBrand(){
		return brand;
	}
	
	public String getModel(){
		return model;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void show(){
		System.out.println(brand + ", " + model + ", " + price);
	}
	
}
