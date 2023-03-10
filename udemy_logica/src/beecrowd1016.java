import java.util.Locale;
import java.util.Scanner;
public class beecrowd1016 {
    public static void main(String[] args) {

        //Alterar localidade da pontuação
        Locale.setDefault(Locale.US);

        //Adicionar scanner para armazenar valor
        Scanner sc = new Scanner(System.in);

        //Declarar variaveis
        int n, resultado;

        //Solicitar variáveis para efetuar os cálculos
        n = sc.nextInt();

        //Efetuar os cálculos e exibir resultado
        resultado = 2 * n;

        System.out.println(resultado + " minutos");

        sc.close();
    }
}
