package Exercicios;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Otávio Renato";
        String tipoConta = "Corrente";
        float saldoInicial = 2600;
        float deposito = 0;
        float transferencia = 0;
        int opcao = 0;

        //Menu inicial
        System.out.printf("""
                    **************************************
                    Dados iniciais do cliente:
                    
                    Nome:            %s
                    Tipo conta:      %s
                    Saldo inicial:   %.2f
                    **************************************
                    """, nome, tipoConta, saldoInicial);

        //Repetição
        while (opcao != 4) {


            //Operações
            System.out.printf("""
                    Operações:
                    
                    1. Consultar saldos
                    2. Receber valor
                    3. Transferir valor
                    4. Sair
                    
                    Digite a opção desejada:""", nome, tipoConta, saldoInicial);
            opcao = leitura.nextInt();

            switch (opcao) {
                //Opção 1
                case 1:
                    System.out.println("\nO saldo atual é de R$ " + saldoInicial);
                    System.out.println("------------------------------------------");
                    break;
                //Opção 2
                case 2:
                    System.out.print("\nInforme o valor a receber: ");
                    deposito = leitura.nextFloat();
                    saldoInicial += deposito;
                    System.out.println("Saldo atualizado R$ " + saldoInicial);
                    break;
                //Opção 3
                case 3:
                    System.out.print("\nInforme o valor que deseja transferir: ");
                    transferencia = leitura.nextFloat();
                    //Saída de erro
                    if (transferencia > saldoInicial || transferencia <= 0) {
                        System.out.println("Valor inválido");
                    } else {
                        saldoInicial -= transferencia;
                        System.out.println("Saldo atualizado R$ " + saldoInicial);
                    }
                    break;

            }

        }
        System.out.println("Sistema encerrado!");




    }
}
