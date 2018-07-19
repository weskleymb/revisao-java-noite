package exemplos;

public class Exemplo1 {

	public static void main(String args[]) {
		
		//tipos primitivos de numeros inteiros
		int numero1 = 30;
		long numero2 = 10L;
		
		//tipos primitivos de numeros decimais
		float numero3 = 35.5f;
		double numero4 = 51.2;
		
		//tipo primitivo caractere
		char letra = 'b';
		
		//tipo primitivo logico
		boolean ehMaior = true;
		
		//Classe que representa as strings
		String nome = "Weskley";
		
		int soma = numero1 + (int) numero2;
		
		if (numero1 < 3) {
			System.out.println("parabens");
		} else if (numero1 < 7 && numero2 > 15) {
			//todo
		} else {
			//todo
		}
		
		switch (nome) {
			case "jose":
				System.out.println("jose");
				break;
			case "pedro":
				System.out.println("pedro");
				break;
			default:
				System.out.println("outro nome");
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		while (numero1 >= 20) {
			System.out.println(numero1);
			numero1--;
		}
		
		System.out.println(soma);
		
	}
	
}
