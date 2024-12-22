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
	
	gestorOperaciones(operacion,num1,num2);
	}
	public static void gestorOperaciones(String operacion, int num1, int num2) {
		switch(operacion) {
		case "+":
			System.out.println("El resultado de la suma es: "+sumar(num1,num2));
			break;
		
		}
	}
	
	public static int  sumar(int num1, int num2) {
		return num1 + num2;
	}
}
