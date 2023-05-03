import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner dolar = new Scanner(System.in);
        double valordaCotacao;
        double quantidadeDeDolares;

        System.out.println("Qual a cotação atual do dólar: ");
        valordaCotacao = dolar.nextDouble();

        System.out.println("Digite qual valor você tem em dólar: ");
        quantidadeDeDolares = dolar.nextDouble();

        double resultado = quantidadeDeDolares*valordaCotacao;
        valoremReal(resultado);

    }
    public static void valoremReal (double real) {
        System.out.println("Você tem "+ real +" em reais!" );

    }
}
