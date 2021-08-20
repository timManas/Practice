package Math.AddDigits;

public class AddDigits {
    public static void main(String [] args) {
        int num = 38;
        System.out.println("Add Digits: " + addDigits(num));

        int num2 = 0;
        System.out.println("Add Digits: " + addDigits(num2));
    }

    public static int addDigits(int num) {
        String [] numArray = String.valueOf(num).split("");
        int total = 0;
        for (String i : numArray) {
            total += Integer.valueOf(i);
        }

        return total >= 10 ? addDigits(total) : total;
    }
}
