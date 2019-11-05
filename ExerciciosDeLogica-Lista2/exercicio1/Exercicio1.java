package exercicio1;

import java.util.Scanner;

public class Exercicio1 {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		Integer numero;
		
		System.out.println("Entre com um numero");
		numero = sc.nextInt();
		sc.nextLine();
		
		if(numero < 0) {
			
			System.out.println("O Numero digitado é Negativo");
		}else if(numero > 0 && numero != 0) {
			System.out.println("O Numero digitado é Positivo e diferente de Zero ! ");
		}else {
			System.out.println("O Numero digitado é igual a :"+ numero);
		}
		
		sc.close();
	}
}
