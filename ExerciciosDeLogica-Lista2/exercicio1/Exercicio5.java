package exercicio1;

import java.util.Scanner;

import sun.reflect.generics.tree.Tree;

public class Exercicio5 {

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
		

		if(a > b) {
			
			c = a;
			a = b;
			
			
		}

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
	
		
		sc.close();
	}
	

}
