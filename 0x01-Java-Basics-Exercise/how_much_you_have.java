/* Write a java program the input is money of guillermo
luis have half of luis, and juan have the half of 
guillermo and luis money 

Print how much money have, guillermo, luis, and juan*/

import java.util.Scanner;

public class how_much_you_have {

    public static void main(String[] args) {

	Scanner getmoney = new Scanner(System.in);
	float guillermo, luis, juan;

	// get input
	System.out.print("How much money have guillermo: ");
	guillermo = getmoney.nextFloat();

	// Asign operators
	
	luis = guillermo / 2;
	juan = (guillermo + luis) / 2;

	// Print value
	
	System.out.println("Guillermo have: " + guillermo + "$");
	System.out.println("Luis have: " + luis + "$");
	System.out.println("Juan have: " + juan + "$");
    }
}
