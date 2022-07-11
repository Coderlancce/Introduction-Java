/* write a program to calculate the month salary of a seler
if earning 1000 for month + 150 per car + 5% for total
value for car, you can ask for total sales in cars */

import java.util.Scanner;

public class sales_salary {

    public static void main(String[] args) {

	Scanner values = new Scanner(System.in);
	final int salaryFi = 1000;
	int numCars;
	float valueCars, salary;

	// Request data
	System.out.print("write much cars you sell: ");
	numCars = values.nextInt();
	System.out.print("write the value in sales cars: ");
	valueCars = values.nextFloat();

	// Operators
	salary = ((5 * valueCars) / 100);
	salary += (150 * numCars);
	salary += salaryFi;

	// print total earnings this month
	System.out.println("Your earnings this month is: " + salary + "$");
    }
}
