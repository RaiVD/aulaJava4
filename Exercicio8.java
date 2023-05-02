import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner lervalor = new Scanner(System.in);
        double valorDoProduto;
        double porcentagemDoProduto;

        System.out.println("Qual o valor do produto: ");
        valorDoProduto = lervalor.nextDouble();

        System.out.println("Quantos porcento você deseja lucrar: ");
        porcentagemDoProduto = lervalor.nextDouble();

        double conta= (porcentagemDoProduto*valorDoProduto)/100;
        double valorVenda=valorDoProduto+conta;

        ValorFinal(valorVenda);
    }
    public static double ValorFinal(double valorVenda) {
        System.out.println("O valor final do seu produto è: "+valorVenda);

        return valorVenda;
    }
}
