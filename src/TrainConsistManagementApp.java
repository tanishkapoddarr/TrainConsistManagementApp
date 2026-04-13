import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistManagementApp{
    static class Bogie{
        String type;
        int capacity;

        Bogie(String type, int capacity){
            this.type = type;
            this.capacity = capacity;
        }
    }
    public static void main(String[] args){
        System.out.println("===================================================");
        System.out.println("UC13 - Performance Comparison (Loops Vs Streams) ");
        System.out.println("===================================================");
        Bogie b1 = new Bogie("Sleeper",72);
        Bogie b2 = new Bogie("AC Chair",56);
        Bogie b3 = new Bogie("First Class",24);
        Bogie b4 = new Bogie("General",90);
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(b1);
        bogies.add(b2);
        bogies.add(b3);
        bogies.add(b4);

        long startLoop = System.nanoTime();
        List<Bogie> filteredBogie = new ArrayList<>();
        for (Bogie b : bogies){
            if (b.capacity > 60){
                filteredBogie.add(b);
            }
        }
        long endLoop = System.nanoTime();
        long duration = endLoop - startLoop;
        System.out.println("\nLoop Execution Time (ns): " +duration);

        long start = System.nanoTime();
        List<Bogie> result = bogies.stream().filter(b -> b.capacity > 60).collect(Collectors.toList());
        long end = System.nanoTime();
        long durationStream = end - start;
        System.out.println("Stream Execution Time (ns): " +durationStream);
        System.out.println("\nUC13 performance benchmarking completed...");
    }
}