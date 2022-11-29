package atividades;

import java.util.Scanner;

public class Ativ12 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa que leia a idade de vários alunos de uma turma O programa
		 * vai parar quando for digitada a idade 999 No final, mostre quantos alunos
		 * existem na turma e qual é a maior idade do grupo.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		int idade = 0, contador = 0, maiorIdade = 0;
		
		do {
			System.out.println("Digite a idade dos alunos");
			idade = entrada.nextInt();
			contador++;
			
			if (idade > maiorIdade && idade != 0) {
				maiorIdade = idade;
			}
			
		} while (idade != 0);
		
		System.out.printf("Exitem %d alunos na sala e o aluno mais velho tem %d", contador, maiorIdade);
		
		entrada.close();

	}

}
