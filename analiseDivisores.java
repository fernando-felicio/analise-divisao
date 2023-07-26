package analise_divisores;
import java.util.Scanner;

public class analiseDivisores {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Recebendo input do numero que será analisado
		System.out.println("Digite um número inteiro para ser analisado: ");
		int numDiv = sc.nextInt();
		
		//Criando regra de begócio
		
		for (int i=1; i<=numDiv; i++) {
			if (numDiv % i == 0) {
				System.out.println(i);
			}
		}
		
	}

}
