//Conversor de temperatura

package Exercicios;

public class Exercicio01 {
    public static void main(String[] args) {

        double grausCelsius = 100;
        double grausFahrenheit = (grausCelsius * 1.8) + 32;

        System.out.println("=== Conversor de temperatura ===");
        System.out.println("Graus Celsius: " + grausCelsius);
        System.out.println("Graus Fahrenheit: "+ grausFahrenheit);

    }
}
/*public class DesafioTemperatura {

    public static void main(String[] args) {
        double temperaturaEmCelsius = 30.4;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaEmCelsius, temperaturaEmFahrenheit);

        System.out.println(mensagem);

        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);

    }

}*/
