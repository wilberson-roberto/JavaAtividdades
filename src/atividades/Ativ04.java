package atividades;

import java.util.Scanner;

public class Ativ04 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que leia o número de um funcionário, seu número de
		 * horas trabalhadas, o valor que recebe por hora e calcular o salário desse
		 * funcionário A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais
		 */

		Scanner entrada = new Scanner(System.in);

		int funcionario = 0;
		System.out.println("digite o numero do funcionario");
		funcionario = entrada.nextInt();

		int horasTrabalhadas = 0;
		System.out.println("digite a qtd de horas trabalhadas");
		horasTrabalhadas = entrada.nextInt();

		double valorHora = 0;
		System.out.println("digite o valor da hora trabalhada");
		valorHora = entrada.nextDouble();

		double salario = horasTrabalhadas * valorHora;

		System.out.printf("O trabalhador %d fez um salario de %.2f R$", funcionario, salario);

		entrada.close();

	}

}
