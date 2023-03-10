import java.util.Locale;
import java.util.Scanner;

public class beecrowd1006 {
    public static void main(String[] args) {

        //Alterar localidade da pontuação
        Locale.setDefault(Locale.US);

        //Adicionar scanner para armazenar valor
        Scanner sc = new Scanner(System.in);

        //Declarar variaveis
        double X, Y, Z, MED;

        //Solicitar variáveis para efetuar a média
        X = sc.nextDouble();
        Y = sc.nextDouble();
        Z = sc.nextDouble();

        //Efetuar os cálculos e exibir resultado
        MED = (X * 2.0 + Y * 3.0 + Z * 5.0) / 10.0;

        System.out.printf("MEDIA = %.1f\n", MED);

        sc.close();
    }
}
