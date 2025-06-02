//Numero Positivo
//Numeros iguais
//Calculo de Areas
package Exercicios;

import java.util.Scanner;

public class Exercici03 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero = 0;

        System.out.print("Digite um número: ");
        numero = leitura.nextInt();

        if (numero >= 0){
            System.out.println(numero+" é positivo!");
        } else{
            System.out.println(numero + " é negativo!");
        }

    }
}

class Exercicio33 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao = 0;
        double ladoQuadrado = 0;


        while (opcao != 3) {
            System.out.println("""
                    1.Calcular área do quadrado
                    2.Calcular área do circulo
                    3.Sair
                    ----------------------------
                    escolha uma opção: 
                     """);
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("""
                            === Área do quadrado ===
                           digite o valor do lado 1:
                            """);
                    ladoQuadrado = leitura.nextDouble();
                    System.out.println("Área total do quadrado: " + (ladoQuadrado*ladoQuadrado));

            }
        }

    }

}
