import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner lertemperatura = new Scanner(System.in);
        double temperaturaC;

        System.out.println("Qual a temperatuara atual em graus Celsius: ");
        temperaturaC = lertemperatura.nextDouble();

        double temperaturaF = (9*temperaturaC+160)/5;

        temperaturaFinal(temperaturaF);
    }
    public static double temperaturaFinal (double temperatura) {
        System.out.println("Temperatura atual: "+ temperatura + " em Fahrenheit!");

        return temperatura;
    }
}
