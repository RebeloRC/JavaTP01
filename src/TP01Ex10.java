import java.util.Scanner;

public class TP01Ex10 {

    public static void main(String[] args)
    {

    //10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
        //exibir sua temperatura equivalente em Fahrenheit.

        Scanner ler =  new Scanner(System.in);
        System.out.println("Entre com o valor em °C : ");
        double graus = ler.nextDouble();

        double f = graus*1.8+32;
        System.out.println("Equivalente em Fahrenheit é : "+f);


    }
}
