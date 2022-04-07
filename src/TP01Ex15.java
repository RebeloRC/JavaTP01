import java.util.Scanner;

public class TP01Ex15 {

    public static void main(String[] args)
    {
        //15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
        //dólares. Calcular e exibir o valor correspondente em Reais (R$).


        Scanner ler =  new Scanner(System.in);
        System.out.println("Entre com a cotação do dolar : ");
        double cotacao = ler.nextDouble();
        System.out.println("Entre com o valor em dolar : ");
        double valor = ler.nextDouble();
        double real = cotacao*valor;
        System.out.println("O valor em Real é : R$ "+real);


    }
}
