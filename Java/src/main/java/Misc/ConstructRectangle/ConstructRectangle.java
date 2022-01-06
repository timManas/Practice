package Misc.ConstructRectangle;

public class ConstructRectangle {
    public static void main(String [] args) {
        int [] input = {4, 37, 122122};
        for (int i : input) {
            int[] output = constructRectangle(i);
            System.out.println("length: " + output[0] + "   width: " + output[1] + "\n");
        }
    }



    public static int[] constructRectangle(int area) {
        int [] output = new int[2];
        output[0] = area;
        output[1] = 1;

        // Check if equals
        if (Math.sqrt(area) % 1 == 0) {
            output[0] = (int) Math.sqrt(area);
            output[1] = (int) Math.sqrt(area);
            return output;
        }

        int length = (int) Math.sqrt(area);
        int width = length;

        System.out.println("length: " + length + "   width: " + width);
        while (width >= 1) {
            System.out.println("length: " + ++length + "   width: " + --width);
            if (length * width == area) {
                output[0] = length;
                output[1] = width;
                return output;
            }
        }

        return output;
    }
}
