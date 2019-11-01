package exercicio7;

import java.util.Scanner;

public class Exercicio7 {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		Double altura, base, areaDoRetangulo;
		
		
		System.out.println("Entre com a altura do Retangulo");
		altura = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Entre com a base do Retangulo");
		base = sc.nextDouble();
		sc.nextLine();
		
		
		areaDoRetangulo = altura * base ;
		
		System.out.println(areaDoRetangulo);
		
		
		sc.close();
		
	}
}
