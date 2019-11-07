package exercicio1;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		String  caractere;
		
		
		System.out.println("Entre com uma letra");
		caractere = sc.nextLine();
		
		if(caractere.equals("a") || caractere.equals("A")) {
			System.out.println("VOGAL");
		}else if(caractere.equals("e") || caractere.equals("E")){
			System.out.println("VOGAL");
		}else if(caractere.equals("i") || caractere.equals("I")) {
			System.out.println("VOGAL");
		}else if(caractere.equals("o") || caractere.equals("O")) {
			System.out.println("VOGAL");
		}else if(caractere.equals("u") || caractere.equals("U")) {
			System.out.println("VOGAL");
		}else{
			System.out.println("CONSOANTE");
		}
		
		sc.close();
	}
}
