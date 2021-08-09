package Misc.WaterBottles;

public class WaterBottles {
    public static void main(String [] args) {
//        int numBottles = 9, numExchange = 3;
//        System.out.println("Num Water Bottles: " + numWaterBottles(numBottles, numExchange));

        int numBottles2 = 15, numExchange2 = 4;
        System.out.println("Num Water Bottles: " + numWaterBottles(numBottles2, numExchange2));

        int numBottles3 = 5, numExchange3 = 5;
        System.out.println("Num Water Bottles: " + numWaterBottles(numBottles3, numExchange3));

        int numBottles4 = 2, numExchange4 = 3;
        System.out.println("Num Water Bottles: " + numWaterBottles(numBottles4, numExchange4));

    }

    public static int numWaterBottles(int numBottles, int numExchange) {
        // Step1 - Create output variable
        int num = numBottles;

        // Step2 - Create var to store remainders and leftOvers
        int remainder = numBottles;
        int leftOver;

        // Step3 - Continue dividing until the remains is smaller than the numExchange
        while (remainder >= numExchange) {

            // Step4 - Calculate the numWaterBottles dranked
            num += (remainder / numExchange);

            // Step5 - Calculate the remaining leftOver bottles
            leftOver = remainder % numExchange;
            remainder = (remainder / numExchange) + leftOver;

            System.out.println("num: " + num);
        }

        return num;
    }
}
