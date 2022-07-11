import java.util.Scanner;

public class week_earnings {

    public static void main(String[] args) {

	Scanner value = new Scanner(System.in);
	float hours, salary, result;

	// Asigment of values
	
	System.out.print("Write your hours job this week: ");
	hours = value.nextFloat();
	System.out.print("Write you salary for hour: ");
	salary = value.nextFloat();

	// Asigment operation result
	
	result = salary * hours;

	// Print the earnings salary
	
	System.out.println("Your earnings this week are: " + result);
    }
}
