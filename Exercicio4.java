public class Exercicio4 {
    public static void main(String[] args) {
        int vetor[] = new int[3];
        vetor[0] = 10;
        vetor[1] = 3;
        vetor[2] = 7;

        numeros(vetor);
    }
    public static int numeros(int vetor[]) {

        if(vetor[0] < vetor[1] && vetor[0] < vetor[2]){
            System.out.println(vetor[0]);

        }else if(vetor[1] < vetor[2] && vetor[1] < vetor[0]){
            System.out.println(vetor[1]);

        }else{
            System.out.println(vetor[2]);
        }

        return 0;
    }
}
