package atividadesJava;

public class EstruturaDecisao {
	
	public static void main(String[] args) {
		
		// if incia se for verdadeiro a expressão lógica
		// else retorna caso o valor de if for falso, não carrega expressão lógica
		// else if carrega expressão lógica e é usado para fluxos mais complexos, onde exige mais resultados.
		
		
		double nota = 9.0;
		
		// Dentro do parenteses carrega a expressão lógica
		if (nota > 5.0 && nota < 7) {
			// Dentro da sintaxe carrega a ação tomada
			System.out.println("Parabéns você foi aprovado!");
			
		}else if (nota >= 9){
			System.out.println("Parabéns você passou de ano!");
		
		}else {
			System.out.println("Você foi reprovado!");
			
		}
	
		
	    double nota2 = 2;
		
		if (nota2 >=5 ) {
			System.out.println("Aprovado");
			
		}else {
			System.out.println("Reprovado");
			
		    }
		
		
		// switch quando for trabalhar com fluxos múltiplos e quiser escolhe-lôs a partir de um valor numérico ( obrigatoriamente um int )
		
		int andar = 3;
		
		switch(andar) {
		case 1: 
			System.out.println("1ºAndar");
			break;
		case 2: 
			System.out.println("2ºAndar");
			break;
		case 3: 
			System.out.println("3ºAndar");
			break;
		default :
			System.out.println("Escolha um andar válido!");
			break;
		
		
	    }	
	    
	 }
	
}
