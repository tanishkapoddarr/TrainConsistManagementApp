import java.util.Scanner;
import java.util.regex.Pattern;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("===================================================");
                System.out.println("UC11 - Validate Train ID & Cargo Codes (Regex)");
        System.out.println("===================================================");
                System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();
        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();
        System.out.println();
        System.out.println("Validation Results: ");
        Pattern pattern1 = Pattern.compile(trainId);
        Pattern pattern2 = Pattern.compile(cargoCode);
        boolean isTrainIdValid = trainId.matches("[A-Z]+-\\d+");
        boolean isCargoIdValid = cargoCode.matches("[A-Z]+-[A-Z]{2}");
        System.out.println("Train ID Valid: " +isTrainIdValid);
        System.out.println("Cargo Code Valid: " +isCargoIdValid);
        System.out.println();
        System.out.println("UC11 validation completed...");
        scanner.close();
    }
}