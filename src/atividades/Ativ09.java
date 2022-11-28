package atividades;

import java.util.Scanner;

public class Ativ09 {

	public static void main(String[] args) {
		
		/*
		 * Vamos fazer junto usando estrutura de repetição FOR.
		 * Ler 10 valores e mostrar quantos desses valores lidos estão no intervalo [10, 20]
		 * (incluindo os valores 10 e 20 no intervalo) e quantos deles estão fora deste intervalo
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um valor qualquer");
		
		int i, valor, dentro, fora;
		
		valor = 0;
		dentro = 0;
		fora = 0;
		
		for (i = 10; i <= 20; i++) {
			
			valor = entrada.nextInt();
			
			if (valor >= 10 && valor <= 20) {
				dentro++;
			} else {
				fora++;
			}
		}
		
		System.out.println("Dentro do intervalo 10 a 20: " + dentro);
		System.out.println("Fora do intervalo 10 a 20: " + fora);
		
		entrada.close();

	}

}
