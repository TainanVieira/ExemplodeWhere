import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int somatotal= 0;
        int valor = 0;
        Scanner sc = new Scanner(System.in);
        while (valor != 99) {
         /*   System.out.println(valor);
            valor = valor +1; //Igual valor++*/


            System.out.println("Imforme o valor: ");

            System.out.println("Imforme 99 para sair ");
            valor = sc.nextInt();
            somatotal += valor;



        }


        System.out.println("Total é "+somatotal);


    }
}