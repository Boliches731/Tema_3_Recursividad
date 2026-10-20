package Ejercicio4YT;

public class Ejercicio4YT {
	
	public static void main(String[] args) {
		
		int[] array= {1,2,3,4,5};
		int elementoBuscar = 3;
		int posicionEncontrado= posicionElementoRecursivo(array, elementoBuscar, 0);
		System.out.println(posicionEncontrado);
		
		
	}
	
	static int posicionElementoRecursivo(int[] array, int elementoBuscar, int indice) {
		
		if (indice == array.length) {
			return -1;
			
		}else if (array[indice] == elementoBuscar) {
			return indice;
			
		}else {
			return posicionElementoRecursivo(array, elementoBuscar, indice + 1);
		}
		
	}
	
}
