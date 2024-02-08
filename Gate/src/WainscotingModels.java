import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class WainscotingModels {
    public static String nameModel;
    public static String colorModel;
    public static float widthModel;
    public static int lengthModel;
    public static String outRegister;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Informe o nome do modelo de Lambri: ");
            nameModel = scanner.nextLine();

            System.out.println("Informe a cor do modelo: ");
            colorModel = scanner.nextLine();

            System.out.println("Informe a largura do modelo: ");
            widthModel = scanner.nextFloat();

            scanner.nextLine();

            System.out.println("Deseja continuar o cadastro? Digite SIM ou NÃO.");
            outRegister = scanner.nextLine();
            if (outRegister.equalsIgnoreCase("SIM")) {
                System.out.println("Continue outro cadastro!");
            }

        } while (outRegister.equalsIgnoreCase("SIM"));
            System.out.println("cadastro encerrado!");
    }
}
