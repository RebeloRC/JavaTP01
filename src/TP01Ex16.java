import java.util.Scanner;

public class TP01Ex16 {

    public static void main(String[] args)
    {
        //Nomes : Guilherme Pontes e Rodrigo Rebelo

        //16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
        //seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
        //Lembre-se que uma função trigonométrica trabalha em radianos.

        Scanner ler =  new Scanner(System.in);
        System.out.println("Entre com o ângulo em graus : ");
        double angulo = ler.nextDouble();
        double rad = (Math.PI/180) * angulo;
        double tangente = Math.tan(rad);
        double seno = Math.sin(rad);
        double cosseno = Math.cos(rad);
        double secante = 1/cosseno;
        System.out.println("Cosseno :"+cosseno);
        System.out.println("Seno : "+seno);
        System.out.println("Tangente : "+tangente);
        System.out.println("Secante : "+secante);



    }
}