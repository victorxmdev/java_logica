import java.util.Scanner;

public class beecrowd1001 {
    public static void main(String[] args) {

        //Adicionar scanner para armazenar valor
        Scanner sc = new Scanner(System.in);

        //Solicitar variáveis para efetuar a soma
        //System.out.print("Digite o primeiro valor da soma: ");
        int A = sc.nextInt();

        //System.out.print("Digite o segundo valor da soma: ");
        int B = sc.nextInt();

        //Calcular soma
        int X = A + B;

        //Exibir resultado
        System.out.println("X = " + X);

        sc.close();
    }
}
