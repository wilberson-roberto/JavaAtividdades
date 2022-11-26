package atividades;

import java.util.Scanner;

public class Ativ06 {

	public static void main(String[] args) {
		
		/*
		 * Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O
		 * aluguel de um carro custa R$ 90,00 por dia para carro popular e R$ 150,00 por
		 * dia para carro de luxo. Além disso, o cliente paga por KM percorrido. Faça um
		 * programa que leia o tipo de carro alugado (popular ou luxo), quantos dias de
		 * aluguel e quantos KM foram percorridos. No final mostre o preço a ser pago de
		 * acordo com a tabela a seguir:
		 * 
		 * - Carros populares (aluguel de R$ 90,00 por dia) até 100km percorridos: R$
		 * 0,20 por km acima de 100km percorridos: R$ 0,10 por km
		 * 
		 * - carros de luxo (aluguel de R$ 150,00 por dia) até 200km percorridos: R$
		 * 0,30 por km acima de 200km percorridos: R$ 0,25 por km
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		double popular = 90.00;
		double luxo = 150.00;
		
		String tipo;
		System.out.println("escolha popular ou luxo");
		tipo = entrada.next();
		
		String tipo1 = "popular";
		String tipo2 = "luxo";
		
		int kmPecorrido;
		System.out.println("Quantos km foram pecorridos?");
		kmPecorrido = entrada.nextInt();
		
		int diasAlugado;
		System.out.println("Por quantos dia foi alugado?");
		diasAlugado = entrada.nextInt();
		
		double popularAte100 = (diasAlugado * popular) + kmPecorrido * 0.20;
		double popular100Mais = (diasAlugado * popular) + kmPecorrido * 0.10;
		double luxoAte200 = (diasAlugado * luxo) + kmPecorrido * 0.30;
		double luxo200Mais = (diasAlugado * luxo) + kmPecorrido * 0.25;
		
		if (tipo.equals(tipo1) && kmPecorrido <= 100) { // equals() faz a validação do tipo exato do string
			System.out.printf("Alugou um carro %s por %d dias e percorreu %d km, esta dentro dos 100 km, valor final: %.2f", tipo1, diasAlugado, kmPecorrido, popularAte100);
		} else if (tipo.equals(tipo1) && kmPecorrido > 100) {
			System.out.printf("Alugou um carro %s por %d dias e percorreu %d km, ultrapassou 100 km, valor final: %.2f", tipo1, diasAlugado, kmPecorrido, popular100Mais);
		} else if (tipo.equals(tipo2) && kmPecorrido <= 200) {
			System.out.printf("Alugou um carro %s por %d dias e percorreu %d km, esta dentro dos 200 km, valor final: %.2f", tipo2, diasAlugado, kmPecorrido, luxoAte200);
		} else if (tipo.equals(tipo2) && kmPecorrido > 200) {
			System.out.printf("Alugou um carro %s por %d dias e percorreu %d km, ultrapassou 200 km, valor final: %.2f", tipo2, diasAlugado, kmPecorrido, luxo200Mais);
		}
		
		entrada.close();

	}

}
