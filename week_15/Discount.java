package week_15;

public class Discount {

	public static void main(String[] args) {
		double regularPrice = 59.0;
		double discount;
		double salePrice;
		
		discount = regularPrice * 0.2;
		salePrice = regularPrice - discount;
		
		System.out.println("Regualr Price $" + regularPrice);
		System.out.println("Discoutn Amount " + discount);
		System.out.println("Sale price: $" + salePrice);

	}

}
