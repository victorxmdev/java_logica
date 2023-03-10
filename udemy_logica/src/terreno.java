import java.util.Locale;
import java.util.Scanner;

public class terreno {
    public static void main(String[] args) {

        //Alterar localidade da pontuação
        Locale.setDefault(Locale.US);

        //Adicionar scanner para armazenar valor
        Scanner sc = new Scanner(System.in);

        //Declarar variaveis
        double largura, comprimento, valor, area, preco;

        //Solicitar ao usuário as variáveis
        System.out.print("Digite a largura do terreno: ");
        largura = sc.nextDouble();

        System.out.print("Digite o comprimento do terreno: ");
        comprimento = sc.nextDouble();

        System.out.print("Digite o valor do metro quadrado: ");
        valor = sc.nextDouble();

        //Efetuar os cálculos e exibir com 2 casas decimais cada valor
        area = largura * comprimento;

        System.out.printf("Área do terreno = %.2f m2.\n", area);

        preco = area * valor;

        System.out.printf("Preco do terreno = %.2f reais.\n", preco);

        sc.close();
    }
}