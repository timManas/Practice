package Lists.Unique3DigitEvenNum;

public class Unique3DigitEvenNum {
    public static void main(String [] args) {
        int [][] input = {{1,2,3,4}, {0,2,2}, {6,6,6}, {1,3,5}};
        for (int [] i : input)
            System.out.println("UniquNum: " + totalNumbers(i) + "\n");
    }

    public static int totalNumbers(int[] digits) {
        int total = 0;

        int numEven = 0;
        int numZeroes = 0;

        for (int i : digits) {
            if (i % 2 == 0)
                ++numEven;
            if (i == 0)
                ++numZeroes;
        }

        int firstElement = digits.length - 1 - numZeroes;
        int secondElement = firstElement - 1;
        int lastElement = numEven;

        total = firstElement * secondElement * lastElement;

        return total;
    }

}


/*
    {a,b,c,d}
     4 3 2


 */