package exercicio1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		Integer a,b;
		
		
		System.out.println("Entre com um n�mero");
		a = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Entre com outro n�mero");
		b = sc.nextInt();
		sc.nextLine();
		
		if(a > b) {
			System.out.println("O maior � "+ a);
		}else {
			System.out.println("O maior � "+ b);
		}
		
		sc.close();
	}
}
