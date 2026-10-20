package Ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(contarCifras(57));

	}
	
	static int contarCifras(int n) {
		
		//Comprobamos que es mayor de 10
		if (n >= 10) {
			//Si es mayor de 10 que divida n entre 10, y se le suma uno ya que
			//todos los numeros tienen al menos una cifra
			return contarCifras(n / 10) + 1;
		}else return 1;
	}
	//Push desde PC de Casa Mi perro

}
