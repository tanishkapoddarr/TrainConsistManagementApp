import java.util.*;

public class TrainConsistManagementApp {
    static class InvalidCapacityException extends Exception{
        public InvalidCapacityException(String message){
            super(message);
        }
    }
    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) throws InvalidCapacityException {
            if (capacity <= 0){
                throw new InvalidCapacityException("Capacity must be greater than zero.");
            }
            this.type = type;
            this.capacity = capacity;
        }
    }
    public static void main(String[] args) throws InvalidCapacityException{
        System.out.println("=========================================");
        System.out.println("UC14 - Handle Invalid Bogie Capacity ");
        System.out.println("=========================================");

        List<Bogie> bogies = new ArrayList<>();
        try{
            Bogie b1 = new Bogie("Sleeper",72);
            bogies.add(b1);
            System.out.println("\nCreated Bogie: " +b1.type+ " -> " +b1.capacity);
        }catch (InvalidCapacityException e){
            System.out.println("Error: " +e.getMessage());
        }
        try{
            Bogie b2 = new Bogie("Sleeper", -10);
            bogies.add(b2);
            System.out.println("Created Bogie: " +b2.type+ " -> " +b2.capacity);
        }catch (InvalidCapacityException e){
            System.out.println("Error: " +e.getMessage());
        }
        System.out.println("\nUC14 exception handling completed...");
    }
}