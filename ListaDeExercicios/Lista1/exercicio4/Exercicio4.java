package exercicio4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		Double valorDaConta, gorjeta;
		
		
		System.out.println("Entre com o valor da Conta: ");
		valorDaConta = sc.nextDouble();
		sc.nextLine();
		
		gorjeta = (valorDaConta * 10)/100;
		
		System.out.println("O valor da gorjeta será de:"+ gorjeta + "reais");
		
		
		sc.close();
		
		
		
	}
}
