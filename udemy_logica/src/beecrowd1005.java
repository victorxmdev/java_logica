import java.util.Locale;
import java.util.Scanner;

public class beecrowd1005 {
    public static void main(String[] args) {

        //Alterar localidade da pontuação
        Locale.setDefault(Locale.US);

        //Adicionar scanner para armazenar valor
        Scanner sc = new Scanner(System.in);

        //Declarar variaveis
        double X, Y, MED;

        //Solicitar variáveis para efetuar a média
        X = sc.nextDouble();
        Y = sc.nextDouble();

        //Efetuar os cálculos e exibir resultado
        MED = (X * 3.5 + Y * 7.5) / 11.0;

        System.out.printf("MEDIA = %.5f\n", MED);

        sc.close();
    }
}
