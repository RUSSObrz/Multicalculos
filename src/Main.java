import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Programa de 'multicálculos'\nDigite o primeiro número: ");
                float num1 = in.nextInt();

                System.out.print("Digite o segundo número: ");
                float num2 = in.nextInt();

                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                System.out.println("Resto da divisão entre " + num1 + " e " + num2 + " = " + (num1 % num2));


            } catch (InputMismatchException e) {
                System.out.println("Valor inválido, por favor digite apenas números!");
                in.nextLine();
            }
        }
    }
    }