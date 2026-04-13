import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
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
        System.out.println(" UC8 - Filter Passenger Bogies Using Streams ");
        System.out.println("==============================================");
        System.out.println();
        System.out.println("All Bogies: ");
        Bogie b1 = new Bogie("Sleeper", 72);
        Bogie b2 = new Bogie("AC Chair", 56);
        Bogie b3 = new Bogie("First Class", 24);
        Bogie b4 = new Bogie("General", 90);
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(b1);
        bogies.add(b2);
        bogies.add(b3);
        bogies.add(b4);
        for (Bogie bogie : bogies) {
            System.out.println(bogie.name + " -> " + bogie.capacity);
        }
        System.out.println();
        System.out.println("Filtered Bogies (Capacity > 60): ");
        Stream<Bogie> stream = bogies.stream();
        List<Bogie> result = bogies.stream().filter(b -> b.capacity > 60).collect(Collectors.toList());
        for (Bogie bogie : result) {
            System.out.println(bogie.name + "-> " + bogie.capacity);
        }
        System.out.println();
        System.out.println("UC8 filtering completed");
    }
}