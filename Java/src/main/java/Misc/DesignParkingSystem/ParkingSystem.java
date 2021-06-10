package Misc.DesignParkingSystem;

import java.util.ArrayList;
import java.util.List;

class ParkingSystem {
    int bigMax;
    int mediumMax;
    int smallMax;
    List<Integer> bigCars;
    List<Integer> mediumCars;
    List<Integer> smallCars;

    public ParkingSystem(int big, int medium, int small) {
        this.bigMax = big;
        this.mediumMax = medium;
        this.smallMax = small;
        this.bigCars = new ArrayList<>();
        this.mediumCars = new ArrayList<>();
        this.smallCars = new ArrayList<>();
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 1: {
                if (bigCars.size() < bigMax) {
                    bigCars.add(carType);
                    return true;
                }
                return false;
            }
            case 2: {
                if (mediumCars.size() < mediumMax) {
                    mediumCars.add(carType);
                    return true;
                }
                return false;
            }
            case 3: {
                if (smallCars.size() < smallMax) {
                    smallCars.add(carType);
                    return true;
                }
                return false;
            }
            default:
                return false;
        }
    }
}
