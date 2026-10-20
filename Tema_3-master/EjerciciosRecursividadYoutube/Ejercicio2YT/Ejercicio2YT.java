package Ejercicio2YT;

public class Ejercicio2YT {

	public static void main(String[] args) {
		
		int n = 10;
		
		System.out.println(factorialRecursivo(n));
	
		
	}
	
	static int factorialRecursivo(int numero) {
		
		int factorial = 0;
		
		if (numero == 1) {
			return 1;
		}else {
			factorial += numero * factorialRecursivo(numero - 1);
		}
		
		return factorial;
		
	}
	
}
