package atividades;

import java.lang.reflect.Executable;
import java.util.Scanner;

public class Ativ05 {

	public static void main(String[] args) {
		
		/*
		 * Uma operadora de telefonia cobra R 50 00 por um plano básico que dá direito a
		 * 100 minutos de telefone Cada minuto que exceder a franquia de 100 minutos
		 * custa R 2 00 Fazer um programa para ler a quantidade de minutos que uma
		 * pessoa consumiu, mostrar o valor a ser pago
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		double valorPlano = 50.00;
		
		int minutos;
		System.out.println("digite a quantidade de minutos utilizado");
		minutos = entrada.nextInt();
		
		double excedido = valorPlano += (minutos - 100) * 2;
		// para multiplicar o valor de a cordo com a quantidade o calculo deve ser feito desta forma.
		
		if (minutos <= 100) {
			System.out.println("Nao ultrapassou a franquia");
		} else {
			System.out.printf("Voce usou %d minutos e ultrapassou a franquia, tera de pagar %.2f R$%n", minutos, excedido);
		}

	}

}
