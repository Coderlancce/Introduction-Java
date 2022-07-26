import java.util.Scanner;

public class invoiceDetail {
    public static void main(String[] args) {
	Scanner priceProducts = new Scanner(System.in);
	String nameOfBill;
	double price1, price2, total;

	System.out.print("Name or detail of the bill: ");
	nameOfBill = priceProducts.nextLine();
	System.out.print("First Price: ");
	price1 = priceProducts.nextDouble();
	System.out.print("Second Price: ");
	price2 = priceProducts.nextDouble();

	total = ((price1 + price2) * 0.19);
	total += price1 + price2;

	System.out.print("your bill: " + nameOfBill.toUpperCase() + " with taxes, have a total of: " + total);
    }
}
