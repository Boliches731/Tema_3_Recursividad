package Ejercicio1YT;

public class Ejercicio1YT {

	public static void main(String[] args) {
		
		int n = 9;
		
		int resultado = sumaRecursiva(n);
		
		System.out.println(resultado);
	}

	
	//Llamamos a la recursiva de 9 esta a su vez llama a la de 8
	//asi sucesivamente hasta que llegamos a 1, una vez llegamos a 1
	//este devuleve un y se deshace pero en sentido contrario
	//a 1 se le suma 2, a esa suma se le suma 3, y asi sucesivamente
	//hasta llegar a 9, digamos que es como extender una barja de cartas
	//y cuando llegamos a la mas pequeña recogerla
	
	static int sumaRecursiva(int numero) {
		
		if (numero == 1) {
			return 1;
		}else {
			return numero + sumaRecursiva(numero - 1);
		}
		
	}
}
