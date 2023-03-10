import java.util.Locale;
import java.util.Scanner;
public class beecrowd1014 {
    public static void main(String[] args) {

        //Alterar localidade da pontuação
        Locale.setDefault(Locale.US);

        //Adicionar scanner para armazenar valor
        Scanner sc = new Scanner(System.in);

        //Declarar variaveis
        int km;
        double litros, consumo;

        //Solicitar variáveis para efetuar os cálculos
        km = sc.nextInt();
        litros = sc.nextDouble();

        //Efetuar os cálculos e exibir resultado
        consumo = km / litros;

        System.out.printf("%.3f km/l%n", consumo);

        sc.close();
    }
}
