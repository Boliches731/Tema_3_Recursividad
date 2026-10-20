package SumarHastaNumero;

public class SumarHastaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sumarHastaNumero(4));
		
		System.out.println(sumarHasta4());

	}
	
	//Esta es la forma recursiva
	static int sumarHastaNumero(int n) {
		if (n == 1) {
			return 1;
		}else {
			return n + sumarHastaNumero(n -1);
		}
	}
	
	//Esto es lo mismo que lo de arriba
	static int sumarHasta1() {
        return 1;
    }

    static int sumarHasta2() {
        return 2 + sumarHasta1();
    }

    static int sumarHasta3() {
        return 3 + sumarHasta2();
    }

    static int sumarHasta4() {
        return 4 + sumarHasta3();
    }
	
}
