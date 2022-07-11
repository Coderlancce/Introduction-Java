import java.util.Scanner;

public class biography {
    public static void main(String args[]) {
	Scanner subname = new Scanner(System.in);
	Scanner subage = new Scanner(System.in);
	Scanner subprofesion = new Scanner(System.in);

	String request = "Please, write your ";
	String name;
	int age;
	String profesion;
	
	System.out.print(request + "name: ");
	name = subname.nextLine();
	System.out.print(request + "age: ");
	age = subage.nextInt();
	System.out.print(request + "profesion: ");
	profesion = subprofesion.nextLine();

	System.out.print(name + " is a jung of " + age + " years, and ");
	System.out.println("her profesion is " + profesion);
    }
}

