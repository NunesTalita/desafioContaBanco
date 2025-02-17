package src;

import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Conta : ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Por favor digite o número da Agência : ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o Nome do Cliente : ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o Saldo : ");
        double saldo = scanner.nextDouble();

        ContaBanco cliente = new ContaBanco(numero, agencia, nomeCliente, saldo);

        cliente.exibirMensagem();

        scanner.close();
    }

}
