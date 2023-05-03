import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner Lernumero = new Scanner(System.in);
        int valor ;
        System.out.println("Digite seu peso: ");
        valor= Lernumero.nextInt();
        int soma=NumerodoUsuario(valor);
        System.out.println("Resultado: " +soma);
    }
    public static int NumerodoUsuario (int valor) {

        int soma = 0;
        for (int i = 1; i <= valor; ++i) {
            soma = soma + i;
            System.out.println(i);
        }

        return soma;
    }
}