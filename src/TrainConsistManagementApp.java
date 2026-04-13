import java.util.*;
import java.util.Comparator;
public class TrainConsistManagementApp {

    static class Bogie {
        String name;
        int capacity;
        Bogie(String name,int capacity){
            this.name = name;
            this.capacity = capacity;
        }
        public String getName(){
            return name;
        }
        public int getCapacity(){
            return capacity;
        }
    }
    public static void main(String[] args){
        System.out.println("==============================================");
                System.out.println(" UC7 - Sort Bogies By Capacity (Comparator) ");
        System.out.println("==============================================");
                System.out.println();
        System.out.println("Before Sorting: ");
        Bogie b1 = new Bogie("Sleeper",72);
        Bogie b2 = new Bogie("AC Chair",56);
        Bogie b3 = new Bogie("First Class",24);
        Bogie b4 = new Bogie("General",90);
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(b1);
        bogies.add(b2);

        bogies.add(b3);
        bogies.add(b4);
        for(Bogie bogie : bogies){
            System.out.println(bogie.getName()+ " -> " +bogie.getCapacity());
        }
        System.out.println();
        System.out.println("After sorting by capacity: ");
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));
        for(Bogie bogie : bogies){
            System.out.println(bogie.getName()+ " -> " +bogie.getCapacity());
        }
        System.out.println();
        System.out.println("UC7 sorting completed...");
    }
}
