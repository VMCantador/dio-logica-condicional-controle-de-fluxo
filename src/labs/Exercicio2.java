package labs;

public class Exercicio2 {

	public static void main(String[] args) {
		// Exercicio operadores lógicos.
		
		boolean b01 = true;
		boolean b02 = false;
		boolean b03 = true;
		boolean b04 = false;
		
		System.out.println("b01 && b02: " + (b01 && b02));
		System.out.println("b03 && b04: " + (b03 && b04));
		
		System.out.println("b02 || b03: " + (b02 || b03));
		System.out.println("b02 || b04: " + (b02 || b04));
		
		System.out.println("b01 ^ b03: " + (b01 ^ b03));
		System.out.println("b04 ^ b01: " + (b04 ^ b01));
		
		System.out.println(!b01);
		System.out.println(!b02);
		
		int i01 = 10;
		int i02 = 5;
		float f01 = 20f;
		float f02 = 50f;
		System.out.println("((i01 + i02) < (f02 - f01)) && true: " + (((i01 + i02) < (f02 - f01)) && true));
		System.out.println("(i01 > i02) || (f02 < f01): " + ((i01 > i02) || (f02 < f01)));
		
		double salarioMensal = 11893.58d;
		double mediaSalarial = 10500d;
		
		int quantidadeDependentes = 4;
		int mediaDependentes = 2;
		
		System.out.println((salarioMensal < mediaSalarial) && (quantidadeDependentes >= mediaDependentes));
		
		boolean salarioBaixo = salarioMensal < mediaSalarial;
		boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
		
		System.out.println((salarioBaixo) && (muitosDependentes));
		
		boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
		System.out.println("Recebe Auxilio: " + recebeAuxilio);

	}

}
