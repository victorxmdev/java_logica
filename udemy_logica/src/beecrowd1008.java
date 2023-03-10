import java.util.Locale;
import java.util.Scanner;
public class beecrowd1008 {
    public static void main(String[] args) {

        //Alterar localidade da pontuação
        Locale.setDefault(Locale.US);

        //Adicionar scanner para armazenar valor
        Scanner sc = new Scanner(System.in);

        //Declarar variaveis
        int numero, horas;
        double valorHora, salario;

        //Solicitar variáveis para efetuar os cálculos
        numero = sc.nextInt();
        horas = sc.nextInt();
        valorHora = sc.nextDouble();

        //Efetuar os cálculos e exibir resultado
        salario = valorHora * horas;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();
    }
}
