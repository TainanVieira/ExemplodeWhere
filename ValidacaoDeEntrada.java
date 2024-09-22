import java.util.Scanner;

public class ValidacaoDeEntrada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade = 0;

        do {
            System.out.println("Digite sua idade: ");
            idade = sc.nextInt();

            System.out.println("Sua idade é:"+idade);

            if (idade <= 15 && idade > 1){
                System.out.println("Criança");
            }
            else if (idade > 15 && idade <=20) {
                System.out.println("Adolecente");

            }
            else if (idade > 20 && idade <= 50) {
                System.out.println("Aduto");

            } else if (idade > 50) {
                System.out.println("Velho");
            }
        }
        while (idade > 0);{
            System.out.println("Valor invalido");
        }









    }
}
