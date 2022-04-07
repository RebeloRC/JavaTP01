import java.util.Scanner;

public class TP01Ex08 {

    public static void main(String[] args)
    {
    //8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
        //dois metros e que um quilômetro possui mil metros, fazer um programa para
        //converter milhas marítimas em quilômetros.

        Scanner ler =  new Scanner(System.in);
        System.out.println("Entre milha : ");
        double milha = ler.nextDouble();
        double km = milha*1.852;

        System.out.println("Em KM são : "+km);

    }
}
