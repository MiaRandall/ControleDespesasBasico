package despesa;
import java.util.Scanner;

public class PerguntasComEstatisticas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean continuar = true;
		int totalPerguntas = 6;
		int[] simCount = new int[totalPerguntas];
		int[] naoCount = new int[totalPerguntas];
		String[] perguntas = {
				"Você trabalha?",
				"Você recebe uma renda mensalmente?",
				"Você possui mais de uma receita/renda?",
				"Você tem controle sobre os seus gastos mensais?",
				"Você faz planejamento financeiro?",
				"Um software ajudaria no planejamento financeiro da sua vida?",
		};
		
		while (continuar) {
			System.out.println("Responda com SIM ou NÃO para as seguintes perguntas:");
			
			for (int i = 0; i < totalPerguntas; i++) {
				boolean respostaValida = false;
					
				while (!respostaValida) {
					System.out.println((i + 1) + ". " + perguntas[i]);
					String resposta = scanner.nextLine().toUpperCase();
				
					if (resposta.equals("SIM")) {
						simCount[i]++;
						respostaValida = true;
					} else if (resposta.equals("NÃO")) {
						naoCount[i]++;
						respostaValida = true;
					} else {
						System.out.println("Resposta inválida. Por favor, responda com SIM ou NÃO.");
					}
				}
			}
		
			exibirEstatisticas(simCount, naoCount, perguntas);
			
			System.out.println("\nDeseja responder novamente? (SIM/NÃO)");
			String respostaContinuar = scanner.nextLine().toUpperCase();
			
			if (!respostaContinuar.equals("SIM")) {
				continuar = false;
			}
		}
		
		System.out.println("Programa encerrado.");
		scanner.close();
	}
	
	private static void exibirEstatisticas(int[] simCount, int[] naoCount, String[] perguntas) {
		System.out.println("\nEstatísticas das Respostas:");
		
		for (int i = 0; i < simCount.length; i++) {
			int totalRespostas = simCount[i] + naoCount[i];
			System.out.println("Pergunta " + (i + 1) + ": " + perguntas[i]);
			System.out.println("  SIM: " + simCount[i]);
			System.out.println("  NÃO: " + naoCount[i]);
			System.out.println("  Total de Respostas: " + totalRespostas);
		}
	}
}
