package exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Double salario, novoSalario, reajsute, aux;
		
		System.out.println("Entre com o valor do Sálario:");
		salario = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Entre com o valor do reajsute: ");
		reajsute = sc.nextDouble();
		sc.nextLine();
		
		aux = (salario * reajsute)/100; 
		
		novoSalario = salario + aux;
		
		System.out.println(novoSalario);
		
		sc.close();
	}
}
