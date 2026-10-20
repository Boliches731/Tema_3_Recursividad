package Ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(potencia(2, 3));

	}
	
	static int potencia(int base, int exponente) {
		//Mientras exponente sea distito de 0
		//llama a potencia, estoy lo hace 3 veces,
		//hasta que la ultima devulve cero
		//entonces empieza a multiplicar 
		//2 * ()
		if (exponente == 0) {
			return 1;
		}else return base * potencia(base, exponente-1);
		
	}

}

