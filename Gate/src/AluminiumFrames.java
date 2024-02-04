import java.util.Scanner;

public class AluminiumFrames {
    public static float area;
    public static float qtdFramesMeters;
    public static int qtdFramesUnits;

    public static int frameStick = 6;

    public static int frameQuantity() {
        Scanner scanner = new Scanner(System.in);
        // float lengthMeters, heightMeters;

        // The code block calculate the quantity of aluminium frames in meters.
        System.out.print("Inofrme oc comprimento do portão em metros: ");
        float lengthMeters = scanner.nextFloat();
        System.out.print("Informe a altura do portão em metros: ");
        float heigthMeters = scanner.nextFloat();

        area = lengthMeters * heigthMeters;
        System.out.println("Área do portão: " + String.format("%.2f", area) + "m².");

        qtdFramesMeters = (2 * lengthMeters) + (2 * heigthMeters);
        System.out.println("A quantidade de varas em metros é: " + String.format("%.2f", qtdFramesMeters) + "m.");

        qtdFramesUnits = (int) (qtdFramesMeters / frameStick);
        if (qtdFramesMeters % 1 == 0 && qtdFramesMeters % frameStick == 0) {
            System.out.println("A quantidade de varas necessárias para fabricar a estrutura é: " + qtdFramesUnits + " unidade.");
        } else {
            qtdFramesUnits = (int) Math.ceil(qtdFramesUnits);
            qtdFramesUnits++;
            System.out.println("A quantidade de varas necessárias para fabricar a estrutura é: " + qtdFramesUnits + " unidades.");
        }
        return 0;
    }

}
