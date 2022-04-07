import java.util.Scanner;

public class TP01Ex11 {

    public static void main(String[] args)
    {
    //11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.

        Scanner ler =  new Scanner(System.in);
        System.out.println("Entre com o diametro : ");
        double diametro = ler.nextDouble();

        double raio = diametro/2;
        raio = Math.pow(raio,2);

        double area = 3.14*raio;
        System.out.println("A área é : "+area);


    }
}
