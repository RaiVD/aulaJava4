import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner dolar = new Scanner(System.in);
        double valordaCotação;
        double quantidadeDeDolares;

        System.out.println("Qual a cotação atual do dólar: ");
        valordaCotação = dolar.nextDouble();

        System.out.println("Digite qual valor você tem em dólar: ");
        quantidadeDeDolares = dolar.nextDouble();

        double resultado = quantidadeDeDolares*valordaCotação;
        valoremReal(resultado);

    }
    public static double valoremReal (double real) {
        System.out.println("Você tem "+ real +" em reais!" );

        return real;
    }
}
