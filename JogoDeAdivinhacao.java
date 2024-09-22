import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
        public static void main(String[] args) {
            Scanner cs = new Scanner(System.in);
            int min = 1;
            int max = 101;
            int numero = 0;
            // Gera numeros Aleatorios entre intervalos min e max (Random)
            int int_random = (int)(Math.random() * (max - min + 1) + min);

            do {
                System.out.println("Adivinhe o numero: ");
                numero = cs.nextInt();
            }
            while (numero != int_random);{
                System.out.println("Parabêns Numero Exato!"+int_random);
            }









        }
}
