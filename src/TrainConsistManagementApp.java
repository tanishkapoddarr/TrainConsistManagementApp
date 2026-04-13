import java.util.*;
import java.util.stream.Stream;
public class TrainConsistManagementApp{
    static class GoodsBogie{
        String type;
        String cargo;
        GoodsBogie(String type,String cargo){
            this.type = type;
            this.cargo = cargo;
        }
    }
    public static void main(String[] args){
        System.out.println("==================================================");
                System.out.println("UC12 - Safety Compliance Check for Goods Bogies");
                        System.out.println("==================================================");
                                System.out.println();
        System.out.println("Goods Bogies in Train: ");
        GoodsBogie g1 = new GoodsBogie("Cylindrical","Petroleum");
        GoodsBogie g2 = new GoodsBogie("Open","Coal");
        GoodsBogie g3 = new GoodsBogie("Box","Grain");
        GoodsBogie g4 = new GoodsBogie("Cylindrical","Coal");
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(g1);
        goodsBogies.add(g2);
        goodsBogies.add(g3);
        goodsBogies.add(g4);

        for(GoodsBogie goodBogie : goodsBogies){
            System.out.println(goodBogie.type+ " -> " +goodBogie.cargo);
        }
        System.out.println();
        boolean result = goodsBogies.stream().allMatch(b ->
                Objects.equals(b.cargo, "Petroleum"));
        System.out.println("Safety Compliance Status: " +result);
        System.out.println("Train formation is NOT SAFE.");
        System.out.println();
        System.out.println("UC12 safety validation completed...");
    }
}