import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        while (true) {
        try {
                System.out.println("Digite o valor do primeiro parâmetro: ");
                int parameterOne = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Digite o valor do segundo parâmetro: ");
                int parameterTwo = scanner.nextInt();
                scanner.nextLine();            
                contar(parameterOne, parameterTwo);
                break;
            } catch (InvalidParameterException e) {
                System.err.println("Erro: " + e.getMessage());
                continue;
            } catch (InputMismatchException e) {
                System.err.println("Digite apenas números inteiros");
                scanner.nextLine();
                continue;
            }
        }
        scanner.close();
        System.out.println("Prograna finalizado!!");

    }

    static void contar(int parameterOne, int parameterTwo){
        if (parameterOne > parameterTwo){
            throw new InvalidParameterException("O segundo parametro deve ser maior do que o primeiro.");
        } else {
            int finalParameter = parameterTwo - parameterOne;
            System.out.printf("O número de iterações será de: %d\n", finalParameter);
            for(int i = 1; i <= finalParameter; i++){
                System.out.printf("Contando: %d\n", i);
            }
        }
    }
}
