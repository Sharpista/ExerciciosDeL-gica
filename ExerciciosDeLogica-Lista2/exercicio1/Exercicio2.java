package exercicio1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		Integer numero;
		
		System.out.println("Digite um numero: ");
		numero = sc.nextInt();
		
		if (numero %2 ==0) {
			System.out.println("O"   + numero +  "é Par");
		}else {
			System.out.println("O"   + numero +  "é Impar");
		}
		
		
		sc.close();
		
	}
}
