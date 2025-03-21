
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int param1 = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int param2 = scanner.nextInt();

        try {
            counter(param1, param2);
            scanner.close();

        } catch (ParametrosInvalidosException e) {
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    public static void counter(int param1, int param2) throws ParametrosInvalidosException {
        if (param1 > param2) {
            throw new ParametrosInvalidosException();
        }

        int cont = param2 - param1;
        for (int i = 1; i <= cont; i++) {
            System.out.println("Imprimindo o número " + i);
        }

    }
}
