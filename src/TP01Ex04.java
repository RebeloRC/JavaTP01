import java.util.Scanner;

public class TP01Ex04 {


        public static void main(String[] args)
        {

            //A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.

            Scanner ler = new Scanner(System.in);
            System.out.println("Entre com a base: ");
            double base = ler.nextDouble();

            System.out.println("Entre com a altura: ");
            double altura = ler.nextDouble();

            double area = (base * altura)/2;

            System.out.println("A área é : "+area);
        }

    }


