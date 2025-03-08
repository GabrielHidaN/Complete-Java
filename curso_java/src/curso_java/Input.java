package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double altura;
		int idade;
		String nome;
		String s1,s2,s3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		System.out.println("Digite sua altura: ");
		altura = sc.nextDouble();
		
		System.out.println(" Nome " +nome + " Idade : " +  idade + " Altura : " + altura);
		sc.close();
	}

}
