package exercicio1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer a, b, c;

		System.out.println("Entre com um n�mero");
		a = sc.nextInt();
		sc.nextLine();

		System.out.println("Entre com outro n�mero");
		b = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Entre com outro n�mero");
		c = sc.nextInt();
		sc.nextLine();
		
		

		if(a > b || a > c) {
			System.out.println("O maior �:" + a);
		}
		else if(b > c) {
			System.out.println("O maior �:" + b);
		}else {
			System.out.println("O maior � "+  c);
		}
		
		sc.close();
	}
}
