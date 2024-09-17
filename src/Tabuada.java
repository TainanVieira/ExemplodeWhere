import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        int valor = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        valor = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(valor + " * "+i+ "=" +valor*i);
        }







    }
}
