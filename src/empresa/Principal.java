package empresa;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cofrinho cofre = new Cofrinho();

		while (true) {
			System.out.println("\n=== MENU COFRINHO ===");
			System.out.println("1 - Adicionar moeda");
			System.out.println("2 - Remover moeda");
			System.out.println("3 - Listar moedas");
			System.out.println("4 - Calcular total em Real");
			System.out.println("5 - Sair");
			System.out.print("Escolha uma opção: ");
			int opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Escolha o tipo de moeda: 1/Real 2/Dolar 3/Euro.");
				int tipo = sc.nextInt();
				System.out.print("Digite o valor: ");
				double valor = sc.nextDouble();

				if (tipo == 1) {
					cofre.adicionar(new Real(valor));
				} else if (tipo == 2) {
					cofre.adicionar(new Dolar(valor));
				} else if (tipo == 3) {
					cofre.adicionar(new Euro(valor));
				} else {
					System.out.println("Opção inválida!");
				}
				break;

			case 2:
				System.out.println("Escolha o tipo de moeda para remover: 1-Real 2-Dolar 3-Euro");
				int tipoRemover = sc.nextInt();
				System.out.print("Digite o valor: ");
				double valorRemover = sc.nextDouble();

				String tipoStr = "";
				if (tipoRemover == 1)
					tipoStr = "Real";
				else if (tipoRemover == 2)
					tipoStr = "Dolar";
				else if (tipoRemover == 3)
					tipoStr = "Euro";

				if (cofre.remover(tipoStr, valorRemover)) {
					System.out.println("Moeda removida com sucesso!");
				} else {
					System.out.println("Moeda não encontrada.");
				}
				break;

			case 3:
				cofre.listar();
				break;

			case 4:
				System.out.println("Total convertido em Real: " + cofre.calcularTotalConvertido());
				break;

			case 5:
				System.out.println("Encerrando...");
				sc.close();
				return;

			default:
				System.out.println("Opção inválida!");
			}
		}
	}
}