import java.util.Locale;
import java.util.Scanner;
public class beecrowd1017 {
    public static void main(String[] args) {

        //Alterar localidade da pontuação
        Locale.setDefault(Locale.US);

        //Adicionar scanner para armazenar valor
        Scanner sc = new Scanner(System.in);

        //Declarar variaveis
        int tempo, velocidade;
        double litros;

        //Solicitar variáveis para efetuar os cálculos
        tempo = sc.nextInt();
        velocidade = sc.nextInt();

        //Efetuar os cálculos e exibir resultado
        litros = (double) tempo * velocidade / 12.0;

        System.out.printf("%.3f%n", litros);

        sc.close();
    }
}
