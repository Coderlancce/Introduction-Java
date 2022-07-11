import java.util.Scanner;

public class operators {

    public static void main(String[] args) {

	Scanner oper = new Scanner(System.in);
	float num1, num2, sum, res, mul, div, rest;

	System.out.print("Digite 2 numeros: ");
	num1 = oper.nextFloat();
	num2 = oper.nextFloat();

	sum = num1 + num2;
	res = num1 - num2;
	mul = num1 * num2;
	div = num1 / num2;
	rest = num1 % num2;

	System.out.println("La suma es: " + sum);
	System.out.println("La resta es: " + res);
	System.out.println("La multiplicacion es: " + mul);
	System.out.println("La division es: " + div);
	System.out.println("El resto de la division es: " + rest);
	}
}
