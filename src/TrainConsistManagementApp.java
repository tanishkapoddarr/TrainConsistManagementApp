import java.util.*;

public class TrainConsistManagementApp{
    static class CargoSafetyException extends RuntimeException{
        public CargoSafetyException(String message){
            super(message);
        }
    }
    static class GoodsBogie{
        String shape;
        String cargo;

        GoodsBogie(String shape){
            this.shape = shape;
        }
        void assignCargo(String cargo){
            try{
                if (cargo.equals("Petroleum") && shape.equals("Rectangular")){
                    throw new CargoSafetyException("Unsafe cargo assignment");
                }
                System.out.println("\nCargo assigned successfully -> " +cargo);
            }catch (CargoSafetyException e){
                System.out.println("\nError: " +e.getMessage());
            }finally {
                System.out.println("Cargo validation completed for " +shape+ " bogie");
            }
        }
    }
    public static void main(String[] args){
        System.out.println("=========================================");
        System.out.println("UC15 - Safe Cargo Assignment ");
        System.out.println("=========================================");

        GoodsBogie g1 = new GoodsBogie("Cylindrical");
        g1.assignCargo("Petroleum");
        GoodsBogie g2 = new GoodsBogie("Rectangular");
        g2.assignCargo("Petroleum");

        System.out.println("\nUC15 runtime handling completed...");
    }
}