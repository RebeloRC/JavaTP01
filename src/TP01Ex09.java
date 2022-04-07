import java.util.Scanner;

public class TP01Ex09 {

    public static void main(String[] args)
    {
        //9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
        //valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.

        Scanner ler =  new Scanner(System.in);
        System.out.println("Entre com a resistência : ");
        double resitencia = ler.nextDouble();
        System.out.println("Entre com a corrente : ");
        double corrente = ler.nextDouble();
        double tensao = resitencia*corrente;
        System.out.println("A tensão é :  "+tensao);

    }
}
