import java.util.Scanner;

public class TP01Ex02 {
    public static void main(String[] args)
    {
        //2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será
        //digitado.

        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com a aresta: ");
        double aresta = ler.nextDouble();

        double area = aresta * aresta;

        System.out.println("A área é : "+area);

    }

}
