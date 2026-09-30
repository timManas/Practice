package Lists.Unique3DigitEvenNum;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Unique3DigitEvenNum {
    public static void main(String [] args) {
        int [][] input = {{1,2,3,4}, {0,2,2}, {6,6,6}, {1,3,5}};
        for (int [] i : input)
            System.out.println("UniquNum: " + totalNumbers(i) + "\n");
    }

    public static int totalNumbers(int[] digits) {
        int total = 0;

        Arrays.sort(digits);

        Set<Integer> set = new TreeSet<>();
        for (int i=0; i<digits.length; i++) {

            int first = digits[i];
            for (int j=0; j < digits.length;j++) {

                int second = digits[j];
                for (int k=0; k < digits.length; k++) {

                    if (i==j || i==k || j==k)
                        continue;

                    int third = digits[k];

                    StringBuilder sb = new StringBuilder();
                    sb.append(first);
                    sb.append(second);
                    sb.append(third);
                    int combination = Integer.parseInt(sb.toString());

                    if (combination < 100)
                        continue;

                    if (combination % 2 != 0)
                        continue;

                    if (set.contains(combination))
                        continue;
                    set.add(combination);

                    System.out.println("combination: " + combination);
                }
            }
        }



        return set.size();
    }

}


/*
    {a,b,c,d}
     4 3 2

    1 2 3 4

    1 2 3
    1 3 2
    2 1 3
    2 3 1
    3 2 1
    3 1 2

    4               3              2
    (a,b,c,d)     (a,b,c)          (b,c)

    [a,b,c,d,e,f,g,h]

    2 kids
    FF/FM/MF/MM

    S FF
    S
    M
    T
    W
    T
    F

    52

    S  FM
    S
    M
    T FM
    W
    T
    F

    1 X 52 = X

    S  MF
    S
    M
    T
    W
    T
    F


    S  MM
    S
    M
    T
    W
    T
    F

    1 X 52 = 52

    4 321
    1 3

    1 X 3 / 36

    1 X 4321

 */