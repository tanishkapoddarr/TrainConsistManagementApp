import java.util.*;
public class TrainConsistManagementApp{
    public static void main(String[] args){
        System.out.println("======================================");
        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("======================================");

        String[] bogieIds = {"BG101","BG205","BG309","BG412","BG550"};

        Arrays.sort(bogieIds);
        String key = "BG309";
        System.out.println("\nSorted Bogie IDs:");
        for (String id : bogieIds){
            System.out.println(id);
        }
        boolean found = false;
        int low = 0, high = bogieIds.length - 1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (bogieIds[mid].compareTo(key) == 0){
                found = true;
                break;
            }
            else if (bogieIds[mid].compareTo(key) > 0){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        if(found){
            System.out.println("\nBogie " +key+ " found using Binary Search.");
        }
        else{
            System.out.println("\nBogie " +key+ " not found using Binary Search.");
        }
        System.out.println("\nUC19 search completed....");
    }
}