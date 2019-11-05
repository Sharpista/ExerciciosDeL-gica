package exercicio9;

import java.util.Scanner;

public class Exercicio9 {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		double raio, pi, areaEsfera;
		
		pi = Math.PI;
		
		System.out.println("Entre com o Raio da Esfera");
		raio = sc.nextDouble();
		
		sc.nextLine();
		
		areaEsfera = (4*pi)*Math.pow(raio, 2);
		
		System.out.println(areaEsfera);
		
		sc.close();
	}
}
