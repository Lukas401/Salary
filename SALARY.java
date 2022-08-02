import java.util.Locale;
import java.util.Scanner;

public class SALARY {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        System.out.println("Inform the number of the employee");
        int numFuncionario = input.nextInt();
        System.out.println("INFORM THE NUMBER OF HOURS WORKED");

        int qtdHorasTrabalhadas = input.nextInt();
        System.out.println("INFORM THE VALUE OF THE TIME");

        double valorHora = input.nextDouble();

        double SALARIO = qtdHorasTrabalhadas * valorHora;

        System.out.println("NUMBER = " + numFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", SALARIO);

        input.close();

    }

}
