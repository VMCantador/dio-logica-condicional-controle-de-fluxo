package labs;

public class Exercicio1 {

	public static void main(String[] args) {
		// Exercicio sobre operadores relacionais
		
		int it01 = 10;
		int it02 = 20;
		float ft01 = 4.5f;
		float ft02 = 3.5f;
		double db01 = 59.6;
		double db02 = 65.5;
		char cr01 = 'x';
		char cr02 = 'y';
		String st01 = "fulano";
		String st02 = "fulano";
		String st03 = "cicrano";
		boolean bln01 = true;
		boolean bln02 = false;
		
		long lg01 = 1597L;
		long lg02 = 8997L;
		byte bt01 = 1;
		short sht01 = 25;
		
		// Comparações feitas para entender o conceito.
		
		System.out.println("it01 == it02: " + (it01 == it02) + " it01 != it02: " +(it01 != it02));
		
		System.out.println("ft01 == ft02: " + (ft01 == ft02) + " ft01 != ft02: " +(ft01 != ft02));
		System.out.println("ft01 > ft02: " + (ft01 > ft02) + " ft01 >= ft02: " +(ft01 >= ft02));
		
		System.out.println("ft01 == dbt02: " + (ft01 == db02) + " db01 != ft02: " +(db01 != ft02));

	}

}
