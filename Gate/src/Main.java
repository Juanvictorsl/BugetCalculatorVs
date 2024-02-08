import java.util.Scanner;

public class Main {
    public static float lengthMeters;
    public static float heightMeters;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o comprimento do portão em metros: ");
        lengthMeters = scanner.nextFloat();
        System.out.print("Informe a altura do portão em metros: ");
        heightMeters = scanner.nextFloat();

       AluminiumFrames aluminiumFrames = new AluminiumFrames();
        aluminiumFrames.frameQuantity(lengthMeters, heightMeters);


    }
}