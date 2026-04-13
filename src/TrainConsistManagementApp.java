import java.util.*;
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
        System.out.println(" UC9 - Group Bogies by Type ");
        System.out.println("==============================================");
        System.out.println();
        System.out.println("All Bogies: ");
        Bogie b1 = new Bogie("Sleeper", 72);
        Bogie b2 = new Bogie("AC Chair", 56);
        Bogie b3 = new Bogie("First Class", 24);
        Bogie b4 = new Bogie("Sleeper", 70);
        Bogie b5 = new Bogie("AC Chair", 60);
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(b1);
        bogies.add(b2);
        bogies.add(b3);
        bogies.add(b4);
        bogies.add(b5);
        for (Bogie bogie : bogies) {
            System.out.println(bogie.name + " -> " + bogie.capacity);
        }
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream().collect(Collectors.groupingBy(b -> b.name));
        System.out.println("\nGrouped Bogies: ");
        System.out.println();
        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            String key = entry.getKey();
            bogies = entry.getValue();
            System.out.println("Bogie type: " + key);
            System.out.println("Capacity -> " + bogies.get(0).capacity);
            for (int i = 1; i < bogies.size(); i++) {
                System.out.println("Capacity -> " + bogies.get(i).capacity);
            }
            System.out.println();
        }
        System.out.println("UC9 grouping completed...");
    }
}