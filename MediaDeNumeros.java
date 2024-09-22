import java.util.Scanner;

public class MediaDeNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double valor1 = 0.0;
        Double valor2 =0.0;
        Double media = 0.0;
        String sn = "";
        do {
            System.out.println("Digite  valor 1: ");
            valor1 = sc.nextDouble();

            System.out.println("Digite valor 2:");
            valor2 = sc.nextDouble();

        media = (valor1 + valor2 )/ 2;

            System.out.println("A media Dos valores é:"+media);
            System.out.println("Deseja continuar Sim ou Não ?");
            sn = sc.next();
        }
        while (sn.equalsIgnoreCase("sim"));{
            System.out.println("Finalizado!");
        }

        // .equalsIgnoreCase( Função utilizada para comparar duas string
        // indepente de maiuscula ou minuscula )











    }
}
