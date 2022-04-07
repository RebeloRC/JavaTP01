
import java.util.Scanner;
public class TP01Ex01 {
    public static void main(String[] args)
    {

        //1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
        //área.

        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com a base: ");
        double base = ler.nextDouble();

        System.out.println("Entre com a altura: ");
        double altura = ler.nextDouble();

        double area = base * altura;

        System.out.println("A área é : "+area);
    }

}
