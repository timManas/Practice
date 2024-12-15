package Misc.IntegerToEnglishWords;

public class IntegerToEnglishWords {

    public static void main(String [] args) {
        int [] input = {123, 12345, 1234567, 2147483647};
        for (int i : input) System.out.println("Number to words: " + numberToWords(i) + "\n");
    }

    //2,147,483,647
    public static String numberToWords(int num) {
        StringBuilder sb = new StringBuilder();

        // Divide Number into Equal Pieces
        if (num / 1000000000 > 0) {
            int trillion = num / 1000000000;
            num = num % 1000000000;
            System.out.println("trillion: " + trillion);

            if (num / 1000000 > 0) {
                int million = num / 1000000;
                num = num % 1000000;
                System.out.println("million: " + million);

                if (num / 1000 > 0) {
                    int thousands = num / 1000;
                    num = num % 1000;
                    System.out.println("thousands: " + thousands);

                    if (num / 100 > 0) {
                        int hundreds = num / 100;
                        num = num % 100;
                        System.out.println("hundreds: " + hundreds);

                        if (num / 10 > 0) {
                            int tens = num / 10;
                            num = num % 10;
                            System.out.println("tens: " + tens);
                            System.out.println("singles: " + num);
                        }
                    }
                }
            }
        }


        if (num / 1000000 > 0) {
            int million = num / 1000000;
            num = num % 1000000;
            System.out.println("million: " + million);

            if (num / 1000 > 0) {
                int thousands = num / 1000;
                num = num % 1000;
                System.out.println("thousands: " + thousands);

                if (num / 100 > 0) {
                    int hundreds = num / 100;
                    num = num % 100;
                    System.out.println("hundreds: " + hundreds);

                    if (num / 10 > 0) {
                        int tens = num / 10;
                        num = num % 10;
                        System.out.println("tens: " + tens);
                        System.out.println("singles: " + num);
                    }
                }
            }
        }

        if (num / 1000 > 0) {
            int thousands = num / 1000;
            num = num % 1000;
            System.out.println("thousands: " + thousands);

            if (num / 100 > 0) {
                int hundreds = num / 100;
                num = num % 100;
                System.out.println("hundreds: " + hundreds);

                if (num / 10 > 0) {
                    int tens = num / 10;
                    num = num % 10;
                    System.out.println("tens: " + tens);
                    System.out.println("singles: " + num);
                }
            }
        }

        if (num / 100 > 0) {
            int hundreds = num / 100;
            num = num % 100;
            System.out.println("hundreds: " + hundreds);

            if (num / 10 > 0) {
                int tens = num / 10;
                num = num % 10;
                System.out.println("tens: " + tens);
                System.out.println("singles: " + num);
            }
        }

        if (num / 10 > 0) {
            int tens = num / 10;
            num = num % 10;
            System.out.println("tens: " + tens);
            System.out.println("singles: " + num);
        }


        return sb.toString();
    }


}
