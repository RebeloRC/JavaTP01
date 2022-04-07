import java.util.Scanner;

public class TP01Ex05 {
    public static void main(String[] args)
    {
        //5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
        //será digitado.

        Scanner ler =  new Scanner(System.in);
        System.out.println("Entre com o diametro : ");
        double diametro = ler.nextDouble();
        double raio = diametro/2;
        raio = Math.pow(raio,3);
        double volume = (4*3.14*raio)/3;
        System.out.println("O volume é : "+volume);



    }
}
