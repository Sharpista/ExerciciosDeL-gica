package exercicio8;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		Double raio = 0.0, pi, areaDoCirculo;
		
		System.out.println("Entre com o raio do Circulo: ");
		raio = sc.nextDouble();
		sc.nextLine();
		pi = Math.PI;
		
		areaDoCirculo = pi *(Math.pow(raio, 2));
		
		System.out.println(areaDoCirculo);
		sc.close();
	}
	
}
