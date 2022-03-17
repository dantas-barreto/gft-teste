import java.util.Random;
import java.util.Scanner;

public class exe02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();

        String numString = sc.nextLine();

        String[] numSeparado = numString.split(" ");

        int[] numArray = new int[numSeparado.length];

        for (int i = 0; i < numSeparado.length; i++) {
            numArray[i] = Integer.parseInt(numSeparado[i]);
        }

        System.out.println("Maior número: " + maiorNum(numArray));
        System.out.println("Soma dos números: " + soma(numArray));
        System.out.println("Testar com as entradas abaixo:");

        System.out.println("'55 2 1 854 963 1 0 98 8'");
        System.out.println("''");
        System.out.println("'2 3 44 8 99 6 55 72 3 01 25'");
        System.out.println("'98 99 100 101 102 103 105 105'");
        System.out.println("'1'");

    }

    public static int maiorNum(int[] a) {
        int[] aux = a;
        int maior = 0;

        for (int num : aux) {
            if (num >= maior) {
                maior = num;
            }
        }
        return maior;
    }

    public static int soma(int[] a) {
        int[] aux = a;
        int soma = 0;

        for (int num : aux) {
            soma += num;
        }

        return soma;
    }
}
