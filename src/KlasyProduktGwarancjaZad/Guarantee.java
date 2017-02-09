package KlasyProduktGwarancjaZad;

import java.time.LocalDate;

public class Guarantee {
	private Product product;
	private LocalDate validUntil;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public LocalDate getValidUntil() {
		return validUntil;
	}

	public void setValidUntil(LocalDate validUntil) {
		this.validUntil = validUntil;
	}

	public Guarantee() {
	}

	public Guarantee(LocalDate validUntil) {
		this.validUntil = validUntil;
	}

	public Guarantee(Product product, LocalDate validUntil) {
		this(validUntil);
		this.product = product;
	}

	public boolean isValid() {
		if (validUntil.isAfter(LocalDate.now())) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public void clearIfIsInvalid(){
		if (!isValid()){
			this.product = null;
			this.validUntil = null;
		}
	}
	
	public String toString(){
		return product.getName() + " " + product.getDescription();
	}
}
