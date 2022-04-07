import java.util.Scanner;

public class TP01Ex14 {

    public static void main(String[] args)
    {
    //14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
        //“r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão
        //digitados.

        Scanner ler =  new Scanner(System.in);
        System.out.println("Insira o valor da aresta: ");
        double aresta = ler.nextDouble();

        System.out.println("Insira o valor da raio: ");
        double raio = ler.nextDouble();

        double volumeC = Math.pow(aresta,3);
        double volumeE = 4 * 3.14* Math.pow(raio,3);
        double volumeL = volumeC - volumeE;

        System.out.println("O volume livre do ambiente é: " +volumeL);

    }
}
