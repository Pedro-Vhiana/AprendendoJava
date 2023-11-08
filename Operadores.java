package atividadesJava;

import java.util.Scanner;

public class Operadores {
	
	// Usando exemplo de calculo ponderado.
	// Calculo ponderado é onde o peso da nota varia.

	public static void main(String[] args) {
		
		
		// Criar um objeto de scanner, para armazenar e interagir com a pessoa.
		Scanner leia = new Scanner(System.in);
		
		String nome = "Pedro";
		float n1,n2,n3,media;
		
		
		System.out.println("\n Digite sua primeira nota = ");
		n1 = leia.nextFloat();
		
		
		System.out.println("\n Digite sua segunda nota = ");
		n2 = leia.nextFloat();
		
		
		System.out.println("\n Digite sua terceira nota = ");
		n3 = leia.nextFloat();
		
		
		// Calculo ponderado:
		media = (n1*2+n2*3+n3*5) / 10;
		
		System.out.println("Essa é sua média final => "+media);
		
		// Operadores relacionais = <, >, <=, >=, !=, ==
		// Operadores lógicos = &&, ||
		// Módulo % = resto da divisão por inteiros
		
		
		
		

	}

}
