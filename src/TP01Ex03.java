import java.util.Scanner;

public class TP01Ex03 {
    public static void main(String[] args) {

        //3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
        //digitado.

        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com a diagonal : ");
        double diagonal = ler.nextDouble();
        diagonal = Math.pow(diagonal,2);

        double area = diagonal/2;

        System.out.println("A área é : "+area);

    }
    }
