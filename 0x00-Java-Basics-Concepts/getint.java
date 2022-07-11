import java.util.Scanner;

public class getint {
    public static void main(String args[]) {
	Scanner more = new Scanner(System.in);
	int number;

	System.out.print("Please, write a number: ");
	number = more.nextInt();

	System.out.println("This is your number: " + number);
    }
}
