package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Double nota1 , nota2, media;
		
		
		System.out.println("Entre com a primeira Nota:");
		nota1 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Entre com a segunda Nota: ");
		nota2 = sc.nextDouble();
		sc.nextLine();
		
		media = (nota1 + nota2)/2;
		
		System.out.println(media);
		
		
		
		sc.close();
		
	}
	
	
	
}


