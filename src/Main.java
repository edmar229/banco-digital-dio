import java.util.Scanner;

import banco.Banco;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Banco banco = new Banco();

		int opcao = 0;
		
		do {
			System.out.println("BEM VINDO AO BANCO DIGITAL\n 1.Entrar \n 2.Criar conta corrente\n 3.Criar conta poupança\n 4.Sair");
			System.out.println("Escolha a opção: ");

			opcao = scan.nextInt();

			switch (opcao) {
				case 1:
					System.out.println("Login:");
					break;
				case 2:
					System.out.println("INSIRA OS DADOS:");
					break;
				case 3:
					System.out.println("INSIRA OS DADOS:");
					break;
				case 4:
					System.out.println("Saindo...");
				default:
					System.out.println("Opção inválida");
					break;
			}
		} while (opcao != 4);

		scan.close();
	}

}
