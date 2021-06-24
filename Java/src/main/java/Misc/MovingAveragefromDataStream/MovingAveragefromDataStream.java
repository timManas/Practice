package Misc.MovingAveragefromDataStream;

public class MovingAveragefromDataStream {
    public static void main(String [] args) {
        int size = 3;

        MovingAverage obj = new MovingAverage(size);
        double param_1 = obj.next(1);
        System.out.println(param_1);

        double param_2 = obj.next(10);
        System.out.println(param_2);

        double param_3 = obj.next(3);
        System.out.println(param_3);

        double param_4 = obj.next(5);
        System.out.println(param_4);
    }


}
