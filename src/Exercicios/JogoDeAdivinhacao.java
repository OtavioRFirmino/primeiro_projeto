package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Random random = new Random();
        int numero = random.nextInt(100);
        int tentativa = 1;
        int chute = 0;

        //Título
        System.out.println(""" 
        === Jogo de Adivinhação ===
        Adivinhe o número de 1 a 100 
        """);

        //Pergunta
        while (chute != numero) {
            System.out.print(tentativa + "ª tentativa: ");
            chute = leitura.nextInt();

            if (chute > numero) {
                System.out.println("Errou! O número é menor!");
            } else if (chute < numero) {
                System.out.println("Errou! O número é maior!");
            } else {
                System.out.println("Você acertou!");
            }

            tentativa++;
        }
        System.out.println("Total de tentativas: " + tentativa);
        System.out.println("Número secreto: " + numero);

    }


}
