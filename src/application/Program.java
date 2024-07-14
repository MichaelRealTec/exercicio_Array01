package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Programa para ler um número inteiro N (máximo = 10)
		// Mostrar na tela os números negativos lidos.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int numero = sc.nextInt();
		int[] vect = new int[numero];
		
		for(int i = 0; i < numero; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
		
		for(int i = 0; i < numero; i++) {
	
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
			
		sc.close();
	}

}
