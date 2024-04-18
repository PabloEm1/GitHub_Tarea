package proyectoGitHub;

public class Clase_Programador1 {
	 public static void encontrarDivisores(int numero) {
	        System.out.println("Los divisores de " + numero + " son:");
	        for (int i = 1; i <= numero; i++) {
	            if (numero % i == 0) {
	                System.out.println(i);
	            }
	        }
	    }
}
