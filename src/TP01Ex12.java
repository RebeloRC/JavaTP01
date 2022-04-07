import java.util.Scanner;

public class TP01Ex12 {

    public static void main(String[] args)
    {
        //12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
        //base que serão digitados.


        Scanner ler =  new Scanner(System.in);
        System.out.println("Entre com o raio : ");
        double raio = ler.nextDouble();
        raio = Math.pow(raio,2);
        System.out.println("Entre com a altura : ");
        double altura = ler.nextDouble();

        double volume = (3.14*raio*altura)/3;

        System.out.println("O volume é : "+volume);


    }
}
