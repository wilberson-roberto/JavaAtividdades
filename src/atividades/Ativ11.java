package atividades;

import java.util.Scanner;

public class Ativ11 {

	public static void main(String[] args) {
		
		/*
		 * Escreva um programa para ler 10 números Todos os números lidos com valor
		 * inferior a 40 devem ser somados Escreva o valor final da soma efetuada Usando
		 * a estrutura de repetição WHILE e DO WHILE.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		int valor = 0;
		
		int cont = 1;
		
		int acumulado = 0;
		
		do {
			System.out.println("digite qualquer valor");
			valor = entrada.nextInt();
			
			if (valor < 40) {
				acumulado = acumulado + valor;
			}
			cont++;
			
		} while (cont <= 5);
		System.out.println("a soma dos valores menores q 40 e: " + acumulado);
		
		entrada.close();

	}

}
