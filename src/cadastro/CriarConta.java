package cadastro;

import java.util.Scanner;

import banco.Cliente;

public class CriarConta {
  public void receberDados() {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite seu nome: ");
    String nome = scan.nextLine();
    System.out.println("Digite seu cpf: ");
    int cpf = scan.nextInt();

    Cliente cliente = new Cliente();
    cliente.setNome(nome);
    cliente.setCpf(cpf);
    scan.close();
  }
}
