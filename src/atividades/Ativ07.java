package atividades;

public class Ativ07 {

	public static void main(String[] args) {
		
		// Criar e resolver 3 problemas usando o operador ternário simples.
		
		int valor = 10;
		System.out.println((valor <= 15) ? "verdadeiro" : "falso");
		
		System.out.println("======================================================");
		
		String homem, mulher;
		homem = "solteiro";
		mulher = "solteira";
		System.out.println((homem != mulher) ? "namorando" : "solteiros");
		
		System.out.println("======================================================");
		
		int itensVendidos = 10;
		int valorVenda = 10;
		int diaria = 100;
		
		int total = itensVendidos * valorVenda;
		System.out.println((total == diaria) ? "bom vendedor" : "esta roubando");

	}

}
