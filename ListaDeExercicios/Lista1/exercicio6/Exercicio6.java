package exercicio6;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		double areaQuadrado, resultado, aux;
		
		System.out.println("Ente com a area do Quadrado");
		areaQuadrado = sc.nextDouble();
		sc.nextLine();
		
		resultado = Math.pow(areaQuadrado, 2);
		
		System.out.println(resultado);
		
		sc.close();
		
	}
}
