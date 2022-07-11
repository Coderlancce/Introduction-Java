/* Write a program to calculate the sum of
   3 notes and give that in a print */

import java.util.Scanner;

public class sum_notes {

    public static void main(String[] args) {

	Scanner getnote = new Scanner(System.in);
	float note1, note2, note3, finalnote;

	System.out.print("Write your notes, max 3: ");
	note1 = getnote.nextFloat();
	note2 = getnote.nextFloat();
	note3 = getnote.nextFloat();

	finalnote = note1 + note2 + note3;

	System.out.println("Your note is: " + finalnote);
    }
}
