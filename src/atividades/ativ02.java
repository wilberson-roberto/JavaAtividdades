package atividades;

public class ativ02 {

	public static void main(String[] args) {
		
		/*
		 * 2- Desenvolva um código que seja atribuído a uma variável o nome de um
		 * piloto, uma distância percorrida em km e o tempo que o piloto levou para
		 * percorrê la (em horas) O programa deve calcular a velocidade média em km/h, e
		 * exibir a seguinte frase A velocidade média de XX foi YY km/h o nde XX é o
		 * nome do piloto, e YY é sua velocidade média
		 */
		
		String piloto = "Wilberson";
		int distancia = 500;
		int horas = 3;
		int resultado = distancia / horas;
		
		System.out.println("A velocidade media de " + piloto + " foi de " + resultado + " km/h");

	}

}
