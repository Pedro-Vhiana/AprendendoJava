package atividadesJava;

public class EstruturaDeRepeticao {
	public static void main(String[] args) {
		
		// Estrutura de Repetição = Instruções para o bloco de comando, para ser executado várias vezes.
		// while/enquanto = executado enquanto o bloco de comandos for true.
		
		// Estrutura de repetição simples, i tem valor 10, enquanto i for maior que 0, o bloco se repetirá. i-- diminui o valor de i cade vez que repete o código.
		
		// Declarar variável que vai ser usada na estrutura de repetição antes, mas variável que recebem ações é bom declarar dentro da estrutura.
		
		/*
		      int numero = 1;
		      int tabuada = 2;

		      while(numero<=10) {
		    	  
		    	  int mult = numero * tabuada;
		    	  
		    	  System.out.println(numero+" x "+tabuada+" = "+mult);
			    numero++;
			    		
		}    
		*/
		
		
	/*	.
		int numero = 1;
		int tabuada = 2;
		int mult = numero * tabuada;
		
		*/
		
		// do-while = Gera o teste antes da condição, assim fazendo com que comece a contar do 0 não de 1.
		// Não entendi direito, revisar...
		
		/* do {
			System.out.println(numero+" x "+tabuada+" = "+mult);
			 numero++;
		      }while(numero<11);
		*/
		
		
		// No for se constrói na seguinte ordem ( Declara variável e inciar;Condição Lógica;Instrução/Ação caso a condição seja true )
		
		
		
		for(int i = 0; i<=10;i++) {
			System.out.println(i);
		}
		
		
		
		
		
		
	}
	

}
