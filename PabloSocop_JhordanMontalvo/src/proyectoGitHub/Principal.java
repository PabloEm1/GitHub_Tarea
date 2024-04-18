package proyectoGitHub;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Introduce un número:");
	        int numero = scanner.nextInt();
	        Clase_Programador1.encontrarDivisores(numero);     
	}

}
