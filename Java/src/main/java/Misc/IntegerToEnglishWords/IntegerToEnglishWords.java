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
            String strTrillions = getStringNumber(trillion);
            System.out.println("trillion: " + trillion + "      " +"strTrillions: " + strTrillions);


            if (num / 1000000 > 0) {
                int million = num / 1000000;
                num = num % 1000000;
                String strMillions = getStringNumber(million);
                System.out.println("million: " + million + "      " + "strMillions: " + strMillions);


                if (num / 1000 > 0) {
                    int thousands = num / 1000;
                    num = num % 1000;
                    String strThousands = getStringNumber(thousands);
                    System.out.println("thousands: " + thousands + "      " + "strHundreds: " + strThousands);


                    if (num / 100 > 0) {
                        int hundreds = num / 100;
                        num = num % 100;
                        String strHundreds = getStringNumber(hundreds);
                        System.out.println("hundreds: " + hundreds + "      " + "strHundreds: " + strHundreds);


                        if (num / 10 > 0) {
                            int doubles = num / 10;
                            num = num % 10;
                            String strDoubles = getStringNumber(doubles);
                            String strSingles = getStringNumber(num);
                            System.out.println("tens: " + doubles + "       " +"strDoubles: " + strDoubles);
                            System.out.println("singles: " + num + "       "+ "strSingles: " + strSingles);
                        }
                    }
                }
            }

            return sb.toString();
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
            return sb.toString();
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
            return sb.toString();
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
            return sb.toString();
        }

        if (num / 10 > 0) {
            int tens = num / 10;
            num = num % 10;
            System.out.println("tens: " + tens);
            System.out.println("singles: " + num);
        }


        return sb.toString();
    }

    private static String getStringNumber(int num) {
        System.out.println("    getStrNum: " + num);

        if (num / 100 > 0) {
            return getStringNumber(num / 100) + getStringNumber(num % 100);
        }

        if (num / 10 > 0) {
            return getStringNumber(num / 10) + getStringNumber(num % 10);
        }

        if (num / 10 > 0) {
            if (num / 90 == 1) return "Ninety";
            if (num / 80 == 1) return "Eighty";
            if (num / 70 == 1) return "Seventy";
            if (num / 60 == 1) return "Sixty";
            if (num / 50 == 1) return "Fifty";
            if (num / 40 == 1) return "Fourty";
            if (num / 30 == 1) return "Thirty";
            if (num / 20 == 1) return "Twenty";
            if (num / 10 == 1) return "Ten";
        }

        if (num < 20) {
            if (num == 19) return "Nineteen";
            if (num == 18) return "Eighteen";
            if (num == 17) return "Seventeen";
            if (num == 16) return "Sixteen";
            if (num == 15) return "Fifteen";
            if (num == 14) return "Fourteen";
            if (num == 13) return "Thirteen";
            if (num == 12) return "Twelve";
            if (num == 11) return "Eleven";
            if (num == 10) return "Ten";
        }

        if (num < 10) {
            if (num == 9) return "Nine";
            if (num == 8) return "Eight";
            if (num == 7) return "Seven";
            if (num == 6) return "Six";
            if (num == 5) return "Five";
            if (num == 4) return "Four";
            if (num == 3) return "Three";
            if (num == 2) return "Two";
            if (num == 1) return "One";
        }













        return "Zero";
    }



}
