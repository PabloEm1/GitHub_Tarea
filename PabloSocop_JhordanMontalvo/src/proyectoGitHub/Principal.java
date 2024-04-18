package proyectoGitHub;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double num1=12;
		double num2=15;
		
		Programado2 metodo1=new Programado2();
		
		System.out.println(metodo1.suma(num1, num2));
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Introduce un número:");
	        int numero = scanner.nextInt();
	        Clase_Programador1.encontrarDivisores(numero);     
	}

}
