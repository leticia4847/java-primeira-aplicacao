package org.example;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner entra = new Scanner(System.in);

        String nome = "Letícia Azevedo";
        String conta = "Corrente";
        double saldo = 2500.00;

        System.out.print("Dados iniciais do cliente:\n\n" + "Nome: " + nome + "\nTipo conta: " + conta + "\nSaldo inicial: R$" + saldo);

        System.out.println("\n\nOperações\n\n 1- Consultar saldos\n 2- Receber valor\n 3- Transferir valor\n 4- Sair");

        int opcaoOperacao = 0;
        while (opcaoOperacao != 4) {
            System.out.print("\nDigite a opção desejada: ");
            opcaoOperacao = entra.nextInt();

            if (opcaoOperacao == 1) {
                System.out.print("\nSaldo atual: R$" + saldo);

            } else if (opcaoOperacao == 2) {
                System.out.print("\nInforme o valor a receber:");
                double valorReceber = entra.nextDouble();
                double saldoAtualizado = saldo + valorReceber;
                System.out.print("Saldo atualizado: R$" + saldoAtualizado);

            } else if (opcaoOperacao == 3) {
                System.out.print("Informe o valor que deseja transferir: ");
                double transferencia = entra.nextDouble();

                if (transferencia > saldo) {
                    System.out.print("Não há saldo suficiente para fazer essa transferência");

                }else if (transferencia <= saldo){
                        double saldoTransferencia = saldo - transferencia;
                        System.out.print("Saldo atualizado: R$" + saldoTransferencia);
                        {
                }

                }
            } else if (opcaoOperacao != 4) {
                System.out.println("Opção inválida");

            } else if (opcaoOperacao == 4) {
                break;

            }

        }


        }

    }





