package Ejercicio3YT;

public class Ejercicio3YT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array= {1,2,3,4,5};
		
		mostrarArrayRecursivo(array, 0);

	}
	
	
	//Mientras el indice sea distinto de la longuitud del array
	//impirme del array la posicion indice, y llama al metodo 
	//mostrar arrya con la posicion indice + 1
	static void mostrarArrayRecursivo(int[] array, int indice) {
		
		if (indice != array.length) {
			System.out.println(array[indice]);
			mostrarArrayRecursivo(array, indice + 1);
		}
	}

}
