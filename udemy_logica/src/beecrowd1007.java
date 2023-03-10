import java.util.Locale;
import java.util.Scanner;
public class beecrowd1007 {

    public static void main(String[] args) {

        //Alterar localidade da pontuação
        Locale.setDefault(Locale.US);

        //Adicionar scanner para armazenar valor
        Scanner sc = new Scanner(System.in);

        //Declarar variaveis
        int A, B, C, D, dif;

        //Solicitar variáveis para efetuar a diferença
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        //Efetuar os cálculos e exibir resultado
        dif = A * B - C * D;

	    System.out.println("DIFERENCA = " + dif);

		sc.close();
    }
}
