import java.util.Scanner;

import banco.Banco;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Banco banco = new Banco();
		
		System.out.println("BEM VINDO AO BANCO DIGITAL\n 1.Entrar \n 2.Criar conta corrente\n 3.Criar conta poupança\n 4.Sair\n");

		String decisao = scan.nextLine();

		switch (decisao) {
			case "1":
				System.out.println("Login:");
				break;
			case "2":
				System.out.println("INSIRA OS DADOS:");
				break;
			case "3":
				System.out.println("INSIRA OS DADOS:");
				break;
			case "4":
				System.out.println("Saindo...");
			default:
				System.out.println("Opção inválida");
				break;
		}

		scan.close();
	}

}
