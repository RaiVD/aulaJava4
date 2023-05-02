import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner Lernumero = new Scanner(System.in);
        double peso;
        double altura;

        System.out.println("Digite seu peso: ");
        peso= Lernumero.nextDouble();

        System.out.println("Digite sua altura: ");
        altura= Lernumero.nextDouble();

        double imc = peso/(altura*altura);

        resultado(imc);
    }
    public static Double resultado(Double imc) {

        if (imc<18.5){
            System.out.println("Você está abaixo do peso");
        }
        else if (imc==18.5 || imc<25) {
            System.out.println("Você está no peso normal");
        }
        else if (imc==25 ||imc<30) {
            System.out.println("Você está sobrepeso");
        }
        else if (imc==30 || imc<35) {
            System.out.println("Você está na obesidade grau 1");
        }
        else if (imc==35 || imc<40) {
            System.out.println("Você está na obesidade grau 2");
        }
        else {
            System.out.println("Você está na obesidade grau 3");
        }
        return imc;
    }

}
