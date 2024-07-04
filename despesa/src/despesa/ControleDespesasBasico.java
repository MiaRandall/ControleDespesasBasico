package despesa;

import java.util.Scanner;

public class ControleDespesasBasico {

    private double totalDespesas = 0;
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ControleDespesasBasico app = new ControleDespesasBasico();
        app.iniciar();
    }

    public void iniciar() {
        boolean continuar = true;
        while (continuar) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após o número

            switch (opcao) {
                case 1:
                    adicionarDespesa();
                    break;
                case 2:
                    exibirTotalDespesas();
                    break;
                case 3:
                    continuar = false;
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        scanner.close();
    }

    private void exibirMenu() {
        System.out.println("\n=== Menu ===");
        System.out.println("1. Adicionar Despesa");
        System.out.println("2. Exibir Total das Despesas");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private void adicionarDespesa() {
        System.out.print("\nDigite o valor da despesa: ");
        double valor = scanner.nextDouble();
        totalDespesas += valor;
        System.out.println("Despesa de R$" + valor + " adicionada com sucesso!\n");
    }

    private void exibirTotalDespesas() {
        System.out.println("\nTotal das despesas: R$" + totalDespesas);
    }
}
