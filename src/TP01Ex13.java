import java.util.Scanner;

public class TP01Ex13 {

    public static void main(String[] args)
    {
        //13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
        //valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
        //(em s) que serão digitados.


        Scanner ler =  new Scanner(System.in);
        System.out.println("Entre com a velociadade inicial : ");
        double velocidadeInicial = ler.nextDouble();
        System.out.println("Entre com a aceleração : ");
        double aceleracao = ler.nextDouble();
        System.out.println("Entre com o tempo : ");
        double tempo = ler.nextDouble();

        double velocidadeFinal = velocidadeInicial+(aceleracao*tempo);
        System.out.println("A velocidade final é : "+velocidadeFinal);

    }
}
