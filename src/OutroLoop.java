import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int quantidadeNota = 0;

        while (nota != -1) {
            System.out.println("Avalie o filme! Ou digite -1 para encerrar: ");
            nota = leitura.nextDouble();
            if (nota != -1){
            mediaAvaliacao += nota;
            quantidadeNota ++;
            }
        }
        System.out.println("Média das notas: " + (mediaAvaliacao/quantidadeNota));
    }
}
