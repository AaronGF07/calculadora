package calculadora;

import java.util.Scanner;

public class calculadora {

	
	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int num1;
	int num2;
	String operacion;
	
	System.out.println("Ingrese primer numero:");
	num1=sc.nextInt();
	System.out.println("Ingrese segundo numero:");
	num2=sc.nextInt();
	System.out.println("Ingrese operacion (+, -, *, / ): ");
	operacion=sc.next();
	
	}

}
