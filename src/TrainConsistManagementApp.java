import java.util.*;
import java.util.stream.Stream;
public class TrainConsistManagementApp {
    static class Bogie {
        String name;
        int capacity;
        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println(" UC10 - Count Total Seats in Train ");
        System.out.println("==============================================");
        System.out.println();
        System.out.println("Bogies in Train: ");
        Bogie b1 = new Bogie("Sleeper", 72);
        Bogie b2 = new Bogie("AC Chair", 56);
        Bogie b3 = new Bogie("First Class", 24);
        Bogie b4 = new Bogie("Sleeper", 70);
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(b1);
        bogies.add(b2);
        bogies.add(b3);
        bogies.add(b4);
        for (Bogie bogie : bogies) {
            System.out.println(bogie.name + " -> " + bogie.capacity);
        }
        System.out.println();
        int result = bogies.stream().mapToInt(b -> b.capacity).sum();
        System.out.println("Total Seating Capacity of Train: " +result);
        System.out.println();
        System.out.println("UC10 aggregation completed...");
    }
}