import java.util.Locale;
import java.util.Scanner;

public class beecrowd1004 {
        public static void main(String[] args) {

            //Alterar localidade da pontuação
            Locale.setDefault(Locale.US);

            //Adicionar scanner para armazenar valor
            Scanner sc = new Scanner(System.in);

            //Declarar variaveis
            int X, Y, PROD;

            //Solicitar variáveis para efetuar o produto
            X = sc.nextInt();
            Y = sc.nextInt();

            //Efetuar os cálculos e exibir resultado
            PROD = X * Y;

            System.out.println("PROD = " + PROD);

            sc.close();
        }
}

