package KlasyProduktGwarancjaZad;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product pralka = new Product("Bosz", "Super pralka");
		Guarantee guarantee = new Guarantee();
		guarantee.setValidUntil(LocalDate.of(2017, 12, 12));
		System.out.println(guarantee.isValid());
		guarantee.setProduct(pralka);
		
		Guarantee secondGuarantee = new Guarantee(LocalDate.of(2019, 12, 5));
		System.out.println(secondGuarantee.isValid());
		secondGuarantee.setProduct(pralka);
		
		Guarantee invalid = new Guarantee();
		invalid.setProduct(pralka);
		invalid.setValidUntil(LocalDate.of(2016, 9, 20));
		
		System.out.println(invalid.isValid());
		invalid.clearIfIsInvalid();
		
		
		
		
		
		Product phone = new Product("ajfn", "moj iphone");
		
		Guarantee myGuarantee = new Guarantee(phone,LocalDate.of(2017, 11, 1));
		
	}

}
