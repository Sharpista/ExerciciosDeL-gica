package exercicio1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer a, b, c;

		System.out.println("Entre com um número");
		a = sc.nextInt();
		sc.nextLine();

		System.out.println("Entre com outro número");
		b = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Entre com outro número");
		c = sc.nextInt();
		sc.nextLine();
		
		

		if(a > b || a > c) {
			System.out.println("O maior é:" + a);
		}
		else if(b > c) {
			System.out.println("O maior é:" + b);
		}else {
			System.out.println("O maior é "+  c);
		}
		
		sc.close();
	}
}
