public class Exercicio5 {
    public static void main(String[] args) {
        String vendedor="Ana";
        double salario=1200;
        double venda= 2000;
        double comissao=venda*((double) 15 /100);

        double salarioComissao = salario+comissao;

        System.out.println("Nome: "+ vendedor);
        System.out.println("Salário: "+ salario);

        valorVendas(salarioComissao);
    }
    public static double valorVendas (double salarioFinal) {
        System.out.println("Salário com o adicional da comissão: "+salarioFinal);

        return salarioFinal;
    }

}
