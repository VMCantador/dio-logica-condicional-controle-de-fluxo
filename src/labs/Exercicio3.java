package labs;

public class Exercicio3 {

	public static void main(String[] args) {
		// Exercicio sobre controle de fluxo.
		
	
		 ifFlexa();
		 ifSemFlexa();
		 
		 switchSemana();
		
	}	
	
	// Evitar o Efeito Flexa, do exemploa abaixo não faz parte das boas praticas.
	
	private static void ifFlexa() {
		
		int mes = 9;
		if (mes == 1) {
			System.out.println("Janeiro");
		} else {
			if (mes == 2) {
				System.out.println("Fevereiro");
			} else {
				if (mes == 3) {
					System.out.println("Março");
				} else {
					if (mes == 4) {
						System.out.println("Abril");
					} else {
						if (mes == 5) {
							System.out.println("Maio");
						} else {
							if (mes == 6) {
								System.out.println("Junho");
							} else {
								if (mes == 7) {
									System.out.println("julho");
								} else {
									if (mes == 8) {
										System.out.println("Agosto");
									} else { 
										if (mes == 9) {
											System.out.println("Setembro");
										} else {
											if (mes == 10) {
												System.out.println("Outubro");
											} else {
												if (mes == 11) {
													System.out.println("Novembro");
												} else {
													System.out.println("Dezembro");
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	/* Utilizar o If - Else de forma a evitar o efeito flexa, 
	faz com que fique mais faceil para um terceiro entender o codigo.
	*/
	
	private static void ifSemFlexa() {
		
		int mes = 12;
		if (mes == 1) {
			System.out.println("Janeiro");
		} else if (mes == 2) {
			System.out.println("Fevereiro");
		} else if (mes == 3) {
			System.out.println("Março");
		} else if (mes == 4) {
			System.out.println("Abril");
		} else if (mes == 5) {
			System.out.println("Maio");
		} else if (mes == 6) {
			System.out.println("Junho");
		} else if (mes == 7) {
			System.out.println("Julho");
		} else if (mes == 8) {
			System.out.println("Agosto");
		} else if (mes == 9) {
			System.out.println("Setembro");
		} else if (mes == 10) {
			System.out.println("Outubro");
		} else if (mes == 11) {
			System.out.println("Novembro");
		} else {
			System.out.println("Dezembro");
		}
	}

	// Exemplo de Switch
	
	private static void switchSemana() {
		
		String dia = "Terça-Feira";
		
		switch(dia){
			case "segunda-Feira":
				System.out.println(2);
				break;
			case "Terça-Feira":
				System.out.println(3);
				break;
			case "Quarta-Feira":
				System.out.println(4);
				break;
			case "Quinta-Feira":
				System.out.println(5);
				break;
			case "Sexta-Feira":
				System.out.println(6);
				break;
			case "Sabado":
				System.out.println(7);
				break;
			case "Domingo":
				System.out.println(1);
				break;
			default:
				System.out.println("Dia Invalido");
				break;
		}
	}

	
}