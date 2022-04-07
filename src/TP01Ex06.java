import java.util.Scanner;
public class TP01Ex06 {
    public static void main(String[] args)
    {

    //6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão
        //digitados.
        Scanner ler =  new Scanner(System.in);
        System.out.println("Entre com o primeiro valor : ");
        double n1 = ler.nextDouble();
        System.out.println("Entre com o segundo valor : ");
        double n2 = ler.nextDouble();
        System.out.println("Entre com o terceiro valor : ");
        double n3 = ler.nextDouble();
        System.out.println("Entre com o quarto valor : ");
        double n4 = ler.nextDouble();

        double media = (n1+n2+n3+n4)/4;

        System.out.println("A média é : "+media);




    }

}
