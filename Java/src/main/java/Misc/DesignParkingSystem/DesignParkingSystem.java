package Misc.DesignParkingSystem;

public class DesignParkingSystem {
    public static void main(String [] args) {
//        int big = 1;
//        int medium = 1;
//        int small = 0;
//
//        ParkingSystem obj = new ParkingSystem(big, medium, small);
//        System.out.println(obj.addCar(1));
//        System.out.println(obj.addCar(2));
//        System.out.println(obj.addCar(3));
//        System.out.println(obj.addCar(1));

        int big = 0;
        int medium = 0;
        int small = 2;

        ParkingSystem obj = new ParkingSystem(big, medium, small);
        System.out.println(obj.addCar(1));
        System.out.println(obj.addCar(2));
        System.out.println(obj.addCar(3));


    }
}
