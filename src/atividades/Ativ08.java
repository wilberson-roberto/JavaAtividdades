package atividades;

import java.util.Scanner;

public class Ativ08 {
	
	/*
	 * Exercício Usando o switch case, cria um conversor de moedas de pelo três
	 * países diferentes usando como base a cotação das moedas ao lado.
	 * 
	 * Exemplo usuário digita um valor em real e escolhe para qual moeda o
	 * valor deve ser convertido.
	 */

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double brl = 1;
		System.out.println("Bem vindo ao conversor de moedas");
		System.out.println("==========================================================");
		double usd = 5.4082;
		double jpy = 0.03905;
		double cad = 4.1514;

		int moeda;
		System.out.println("Digite 1 para USD, 2 para JPY ou 3 para CAD");
		moeda = entrada.nextInt();
		System.out.println("==========================================================");
		
		double valor;
		System.out.println("Qual o valor em REAIS a ser convertido?");
		valor = entrada.nextDouble();
		System.out.println("==========================================================");
		
		double conversor1, conversor2, conversor3;
		conversor1 = valor / usd;
		conversor2 = valor / jpy;
		conversor3 = valor / cad;

		switch (moeda) {
		case 1:
			System.out.printf("O valor de %.2f Reais convertido, equivale a USD %.2f", valor, conversor1);
			break;

		case 2:
			System.out.printf("O valor de %.2f Reais convertido, equivale a JPY %.2f", valor, conversor2);
			break;

		case 3:
			System.out.printf("O valor de %.2f Reais convertido, equivale a CAD %.2f", valor, conversor3);
			break;

		default:
			System.out.println("ERRO!!! Escolha entre 1, 2 ou 3");
			break;
		}
		
		entrada.close();

	}

}
