import java.util.Arrays;
public class TrainConsistManagementApp{
    public static void main(String[] args){
        System.out.println("==============================================");
        System.out.println("UC17 - Sort Bogie Names Using Arrays.sort()");
        System.out.println("==============================================");

        String[] bogieNames = {"Sleeper" , "AC Chair" , "First Class" , "General" , "Luxury"};

        System.out.println("\nOriginal Bogie Names: ");
        System.out.print(Arrays.toString(bogieNames));

        Arrays.sort(bogieNames);

        System.out.println("\n\nSorted Bogie Names (Alphabetical): ");
        System.out.print(Arrays.toString(bogieNames));

        System.out.println("\n\nUC17 sorting completed...");
    }
}