import java.util.Scanner;

public class Exercicio1 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, aux;
		System.out.println("Entre com o N1 :");
		n1= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Entre com N2 :");
		n2 = sc.nextInt();
		
		sc.nextLine();
		
		
		aux = n1;
		n1 = n2;
		n2 = aux;
		
		System.out.println("N1 é igual a "+ n1);
		System.out.println("N2 é igual a "+ n2);
		
		
		
		sc.close();
	}
}
