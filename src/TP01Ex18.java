import java.util.Scanner;

public class TP01Ex18 {

    public static void main(String[] args)
    {
        //18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
        //valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
        //que deverá ser devolvido.


        Scanner ler =  new Scanner(System.in);
        System.out.println("Entre com o primeiro produto : ");
        double p1 = ler.nextDouble();
        System.out.println("Entre com o segundo produto : ");
        double p2 = ler.nextDouble();

        System.out.println("Entre com o terceiro produto : ");
        double p3 = ler.nextDouble();

        System.out.println("Entre com o quarto produto : ");
        double p4 = ler.nextDouble();

        System.out.println("Entre com o quinto produto : ");
        double p5 = ler.nextDouble();

        double total = p1+p2+p3+p4+p5;
        System.out.println("Entre com o valor pago : ");
        double pago = ler.nextDouble();

        double troco = total - pago;
        System.out.println("O troco é : "+troco);



    }
}
