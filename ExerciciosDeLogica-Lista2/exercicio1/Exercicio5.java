package exercicio1;

import java.util.Scanner;

import sun.reflect.generics.tree.Tree;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer a, b, c, aux;

		System.out.println("Entre com um n�mero");
		a = sc.nextInt();
		sc.nextLine();

		System.out.println("Entre com outro n�mero");
		b = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Entre com outro n�mero");
		c = sc.nextInt();
		sc.nextLine();
		

		if(a > c) {
			aux = c;
			c = a;
			a = aux;
		}
		
		if(b > c) {
			aux = c;
			c = b;
			b = aux;
		}
		if(a > b) {
			aux = b;
			b = a;
			a = aux;
		}

		System.out.println("N�meros:"+""+  a +" "+b+" " +c );
		
	
		
		sc.close();
	}
	

}
