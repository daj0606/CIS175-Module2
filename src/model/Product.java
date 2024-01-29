/**
 * @author ${user} - djackson16
 * CIS175 - Spring 2024
 * 1/29/2024
 */
package model;

public class Product {
	private String name;
	private double price;
	private double discount;
	
	public Product() {
	}
	
	public Product(String name) {
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
