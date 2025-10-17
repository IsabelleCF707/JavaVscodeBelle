
import java.util.Scanner;

public class InputDados_02{
    public static void main(String[] args) {
        int nun01;
        int nun02;
        int total;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        nun01 = ler.nextInt();
        System.out.println("Digite um numero: ");
        nun02 = ler.nextInt();

        total = nun01+nun02;
        System.out.println("Total: "+total);
    }
}