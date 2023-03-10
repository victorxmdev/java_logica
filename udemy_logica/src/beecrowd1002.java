import java.util.Locale;
import java.util.Scanner;

public class beecrowd1002 {

    public static void main(String[] args){

        //Alterar localidade da pontuação
        Locale.setDefault(Locale.US);

        //Adicionar scanner para armazenar valor
        Scanner sc = new Scanner(System.in);

        //Declarar variaveis
        double R, A, pi = 3.14159;

        //Solicitar ao usuário as variáveis
        R = sc.nextDouble();

        //Efetuar os cálculos e exibir resultado
        A = pi * R * R;

        System.out.printf("A=%.4f%n", A);

        sc.close();

    }
}
