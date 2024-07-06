import java.text.DecimalFormat;
import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.0");
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("MENU:\n\n" +
                    "1. Depositar\n" +
                    "2. Sacar\n" +
                    "3. Consultar Saldo\n" +
                    "0. Encerrar\n");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false; // Atualiza a variável de controle para encerrar o loop
                    break;
                case 1:
                    System.out.println("Qual valor dejesa depositar?");
                    double saldoDepositado = scanner.nextDouble();
                    saldo += saldoDepositado;
                    System.out.println("Saldo atual: " + deci.format(saldo) + "\n");
                    break;
                case 2:
                    System.out.println("Qual valor dejesa sacar?");
                    double saque = scanner.nextDouble();
                    if (saldo >= saque) {
                      saldo -= saque;
                        System.out.println("Saldo atual: " + deci.format(saldo) + "\n");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + deci.format(saldo) + "\n");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
