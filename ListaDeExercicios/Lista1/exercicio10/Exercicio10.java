package exercicio10;

import java.util.Scanner;

public class Exercicio10 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		double raio, altura, volumeCilindro, pi;
		
		pi = Math.PI;
		
		System.out.println("Entre com o Raio");
		raio = sc.nextDouble();
		sc.nextLine();
		System.out.println("Entre com a altura");
		altura = sc.nextDouble();
		sc.nextLine();
		
		volumeCilindro = pi * Math.pow(raio, 2) * altura;
		
		System.out.println(volumeCilindro);
		
		sc.close();
	}
}
