public class Exercicio1 {
    public static void main(String[] args) {
       valordoUsuario(4);
    }
    public static int valordoUsuario (int valor) {

        int soma = 0;
        for (int i = 1; i <= valor; ++i) {
            soma = soma + i;
            System.out.println(i);
        }

        System.out.println("Resultado: " + soma);

        return soma;
    }
}

