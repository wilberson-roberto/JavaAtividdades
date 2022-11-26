package atividades;

import java.util.Scanner;

public class ativ03 {

	public static void main(String[] args) {
		
		/*
		 * 3- Considerando que para um consórcio, sabe se o número total de prestações,
		 * a quantidade de prestações pagas e o valor atual da prestação, escreva um
		 * algoritmo que determine o total pago pelo consorciado e o saldo devedor.
		 */
		
		Scanner input = new Scanner(System.in); // ctrl + shift + o => para importar o pacote automaticamente.
		
		int prestacoes = 0;
		System.out.println("didigte o total de prestacoes");
		prestacoes = input.nextInt();
		
		int qtdPaga = 0;
		System.out.println("digite a qtd de parcelas pagas");
		qtdPaga = input.nextInt();
		
		double valorAtual = 0;
		System.out.println("digite o valor da prestacao");
		valorAtual = input.nextDouble();
		
		double totalPago = qtdPaga * valorAtual;
		double devendo = (prestacoes * valorAtual) - totalPago;
		
		System.out.printf("total pago %.2f e saldo devedor e de %.2f", totalPago, devendo);
		// %f - ponto flutuante
		// %.2f - ponto flutuante com quantidade de decimais após a virgula.
		// %d - inteiro
		// %s - texto
		// %n - Quebra de linha
		
		input.close(); // fechamento do objeto entrada.

	}

}
