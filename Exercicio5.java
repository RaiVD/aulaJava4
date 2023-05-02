public class Exercicio5 {
    public static void main(String[] args) {
        String vendedor="Ana";
        double salario=3199.99;
        double venda= 2000;
        double comissao=(15*venda)/100;

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
