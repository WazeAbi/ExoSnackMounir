package mounir;

public class Article {
	private int quantity;
	private String Type;
	private double price;
	public Article(int quantity ,String Type , double price) {
		this.quantity =quantity;
		this.Type =Type;
		this.price =price;
	}
	public int getQuantity() {
		return quantity;
	}
	public String getType() {
		return Type;
	}
	public double getPrice() {
		return price;
	}
}
