import java.util.ArrayList;
import java.util.Scanner;

import banco.Banco;
import cadastro.CriarConta;
import cadastro.EnumTipoConta;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Banco banco = new Banco();
		banco.setContas(new ArrayList<>());

		int opcao = 0;
		
		do {
			System.out.println("BEM VINDO AO BANCO DIGITAL\n 1.Criar conta corrente\n 2.Criar conta poupança\n 3.Sair");
			System.out.println("Escolha a opção: ");

			opcao = scan.nextInt();

			switch (opcao) {
				case 1:
					System.out.println("INSIRA OS DADOS REQUERIDOS: ");
					CriarConta criadorContaCorrente = new CriarConta();
					banco.getContas().add(criadorContaCorrente.cadastrarCliente(EnumTipoConta.CORRENTE));
					break;
				case 2:
					System.out.println("INSIRA OS DADOS REQUERIDOS: ");
					CriarConta criadorContaPoupanca = new CriarConta();
					banco.getContas().add(criadorContaPoupanca.cadastrarCliente(EnumTipoConta.CORRENTE));
					break;
				case 3:
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opção inválida!");
			}
		} while (opcao != 3);

		scan.close();
	}

}
