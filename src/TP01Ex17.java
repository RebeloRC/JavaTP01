import java.util.Scanner;

public class TP01Ex17 {

    public static void main(String[] args)
    {
        //17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
        //cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.




        Scanner ler =  new Scanner(System.in);
        System.out.println("Entre com X : ");
        double x = ler.nextDouble();
        System.out.println("Entre com Y : ");
        double y = ler.nextDouble();

        double elevado = Math.pow(x,y);
        double exp = Math.exp(elevado);
        double ln = Math.log(elevado);
        System.out.println("ELEVADO : "+elevado);
        System.out.println("EXP"+exp);
        System.out.println("LOG : "+ln);

    }
}
