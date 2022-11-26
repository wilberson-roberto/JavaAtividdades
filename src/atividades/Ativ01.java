package atividades;

public class Ativ01 {

	public static void main(String[] args) {
		
		/*
		 * O custo de um carro novo ao consumidor é a soma do custo de fábrica com a
		 * porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica)
		 * Supondo que o percentual do distribuidor seja de 28 e os impostos de 45
		 * escrever um código para processar e mostrar o custo final ao consumidor.
		 */
		
		int custoFabrica = 5000;
		
		double distribuidor = custoFabrica * 0.28;
		double imposto = custoFabrica * 0.45;
		double custoFinal = custoFabrica + distribuidor + imposto;
		
		System.out.println("O valor total do carro + impostos e de: R$ " + custoFinal);

	}

}
