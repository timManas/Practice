package Misc.IntegerToEnglishWords;



public class IntegerToEnglishWords {

    public static void main(String [] args) {
        int [] input = {1000000001, 100000000, 1000010, 100000, 39809, 1010, 12345,  1001, 101, 0, 5, 12, 98, 100, 123, 1234567, 2147483647};
        for (int i : input) System.out.println("Number to words: " + i + "      " + numberToWords(i) + "\n");
    }

    //2,147,483,647
    public static String numberToWords(int num) {
        StringBuilder sb = new StringBuilder();

        if (num == 0) return "Zero";

        // Divide Number into Equal Pieces
        if (num / 1000000000 > 0) {
            int billion = num / 1000000000;
            num = num % 1000000000;
            String strBrillions = getStringNumber(billion);
            System.out.println("billion: " + billion + "      " +"strBrillions: " + strBrillions);
            sb.append(strBrillions.trim() + " Billion ");

            if (num / 1000000 > 0) {
                int million = num / 1000000;
                num = num % 1000000;
                String strMillions = getStringNumber(million);
                System.out.println("million: " + million + "      " + "strMillions: " + strMillions);
                sb.append(strMillions.trim() + " Million ");

                if (num / 1000 > 0) {
                    int thousands = num / 1000;
                    num = num % 1000;
                    String strThousands = getStringNumber(thousands);
                    System.out.println("thousands: " + thousands + "      " + "strHundreds: " + strThousands);
                    sb.append(strThousands.trim() + " Thousand ");


                    if (num / 100 > 0) {
                        int hundreds = num / 100;
                        num = num % 100;
                        String strHundreds = getStringNumber(hundreds);
                        System.out.println("hundreds: " + hundreds + "      " + "strHundreds: " + strHundreds);
                        sb.append(strHundreds.trim() + " Hundred ");

                        if (num / 10 > 0) {
                            int doubles = num;
                            String strDoubles = getStringNumber(doubles);
                            System.out.println("tens: " + doubles + "       " + "strDoubles: " + strDoubles);
                            sb.append(strDoubles.trim());
                        }

                        if (num < 10 && num > 0) {
                            String strSingles = getStringNumber(num);
                            System.out.println("single: " + num + "       " + "strSingles: " + strSingles);
                            sb.append(strSingles.trim());
                        }

                        return sb.toString().trim();
                    }
                }
                if (num / 10 > 0) {
//                num = num % 10;
                    String strDoubles = getStringNumber(num);
                    System.out.println("tens: " + num + "       " +"strDoubles: " + strDoubles);
                    sb.append(strDoubles.trim());
                    return sb.toString().trim();
                }
                if (num < 10 && num > 0) {
                    String strSingles = getStringNumber(num);
                    System.out.println("single: " + num + "       " +"strSingles: " + strSingles);
                    sb.append(strSingles.trim());
                }
                return sb.toString().trim();
            }

            if (num / 1000 > 0) {
                int thousands = num / 1000;
                num = num % 1000;
                String strThousands = getStringNumber(thousands);
                System.out.println("thousands: " + thousands + "      " + "strHundreds: " + strThousands);
                sb.append(strThousands.trim() + " Thousand ");

                if (num / 100 > 0) {
                    int hundreds = num / 100;
                    num = num % 100;
                    String strHundreds = getStringNumber(hundreds);
                    System.out.println("hundreds: " + hundreds + "      " + "strHundreds: " + strHundreds);
                    sb.append(strHundreds.trim() + " Hundred ");

                    if (num / 10 > 0) {
                        int doubles = num;
                        String strDoubles = getStringNumber(doubles);
                        System.out.println("tens: " + doubles + "       " + "strDoubles: " + strDoubles);
                        sb.append(strDoubles.trim());
                    }

                    if (num < 10 && num > 0) {
                        String strSingles = getStringNumber(num);
                        System.out.println("single: " + num + "       " + "strSingles: " + strSingles);
                        sb.append(strSingles.trim());
                    }

                    return sb.toString().trim();
                }
            }

            if (num / 10 > 0) {
//                num = num % 10;
                String strDoubles = getStringNumber(num);
                System.out.println("tens: " + num + "       " +"strDoubles: " + strDoubles);
                sb.append(strDoubles.trim());
                return sb.toString().trim();
            }
            if (num < 10 && num > 0) {
                String strSingles = getStringNumber(num);
                System.out.println("single: " + num + "       " +"strSingles: " + strSingles);
                sb.append(strSingles.trim());
            }

            return sb.toString().trim();
        }


        if (num / 1000000 > 0) {
            int million = num / 1000000;
            num = num % 1000000;
            String strMillions = getStringNumber(million);
            System.out.println("million: " + million + "      " + "strMillions: " + strMillions);
            sb.append(strMillions.trim() + " Million ");

            if (num / 1000 > 0) {
                int thousands = num / 1000;
                num = num % 1000;
                String strThousands = getStringNumber(thousands);
                System.out.println("thousands: " + thousands + "      " + "strHundreds: " + strThousands);
                sb.append(strThousands.trim() + " Thousand ");


                if (num / 100 > 0) {
                    int hundreds = num / 100;
                    num = num % 100;
                    String strHundreds = getStringNumber(hundreds);
                    System.out.println("hundreds: " + hundreds + "      " + "strHundreds: " + strHundreds);
                    sb.append(strHundreds.trim() + " Hundred ");

                    if (num / 10 > 0) {
                        int doubles = num;
                        String strDoubles = getStringNumber(doubles);
                        System.out.println("tens: " + doubles + "       " + "strDoubles: " + strDoubles);
                        sb.append(strDoubles.trim());
                    }

                    if (num < 10 && num > 0) {
                        String strSingles = getStringNumber(num);
                        System.out.println("single: " + num + "       " + "strSingles: " + strSingles);
                        sb.append(strSingles.trim());
                    }

                    return sb.toString().trim();
                }
            }
            if (num / 10 > 0) {
//                num = num % 10;
                String strDoubles = getStringNumber(num);
                System.out.println("tens: " + num + "       " +"strDoubles: " + strDoubles);
                sb.append(strDoubles.trim());
                return sb.toString().trim();
            }

            if (num < 10 && num > 0) {
                String strSingles = getStringNumber(num);
                System.out.println("single: " + num + "       " +"strSingles: " + strSingles);
                sb.append(strSingles.trim());
            }
            return sb.toString().trim();
        }

        if (num / 1000 > 0) {
            int thousands = num / 1000;
            num = num % 1000;
            String strThousands = getStringNumber(thousands);
            System.out.println("thousands: " + thousands + "      " + "strHundreds: " + strThousands);
            sb.append(strThousands.trim() + " Thousand ");


            if (num / 100 > 0) {
                int hundreds = num / 100;
                num = num % 100;
                String strHundreds = getStringNumber(hundreds);
                System.out.println("hundreds: " + hundreds + "      " + "strHundreds: " + strHundreds);
                sb.append(strHundreds.trim()  + " Hundred ");

                if (num / 10 > 0) {
                    int doubles = num;
                    String strDoubles = getStringNumber(doubles);
                    System.out.println("tens: " + doubles + "       " +"strDoubles: " + strDoubles);
                    sb.append(strDoubles.trim());
                }

                if (num < 10 && num > 0) {
                    String strSingles = getStringNumber(num);
                    System.out.println("single: " + num + "       " +"strSingles: " + strSingles);
                    sb.append(strSingles.trim());
                }

                return sb.toString().trim();
            }

            if (num / 10 > 0) {
//                num = num % 10;
                String strDoubles = getStringNumber(num);
                System.out.println("tens: " + num + "       " +"strDoubles: " + strDoubles);
                sb.append(strDoubles.trim());
                return sb.toString().trim();
            }

            if (num < 10 && num > 0) {
                String strSingles = getStringNumber(num);
                System.out.println("single: " + num + "       " +"strSingles: " + strSingles);
                sb.append(strSingles.trim());
            }
            return sb.toString().trim();
        }

        if (num / 100 > 0) {
            int hundreds = num / 100;
            num = num % 100;
            String strHundreds = getStringNumber(hundreds);
            System.out.println("hundreds: " + hundreds + "      " + "strHundreds: " + strHundreds);
            sb.append(strHundreds.trim() + " Hundred ");

            if (num / 10 > 0) {
                String strDoubles = getStringNumber(num);
                System.out.println("tens: " + num + "       " +"strDoubles: " + strDoubles);
                sb.append(strDoubles);
            }

            if (num < 10 && num > 0) {
                String strSingles = getStringNumber(num);
                System.out.println("single: " + num + "       " +"strSingles: " + strSingles);
                sb.append(strSingles);
            }
            return sb.toString().trim();
        }

        if (num / 10 > 0) {
            String strDoubles = getStringNumber(num);
            System.out.println("tens: " + num + "       " +"strDoubles: " + strDoubles);
            sb.append(strDoubles.trim());
        }

        if (num < 10) {
            String strSingles = getStringNumber(num);
            System.out.println("single: " + num + "       " +"strSingles: " + strSingles);
            sb.append(strSingles.trim());
        }
        return sb.toString().trim();
    }

    private static String getStringNumber(int num) {
//        System.out.println("    getStrNum: " + num);

        if (num == 90) return "Ninety";
        if (num == 80) return "Eighty";
        if (num == 70) return "Seventy";
        if (num == 60) return "Sixty";
        if (num == 50) return "Fifty";
        if (num == 40) return "Forty";
        if (num == 30) return "Thirty";
        if (num == 20) return "Twenty";
        if (num == 10) return "Ten";


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

        if (num / 100 > 0) {
            return getStringNumber(num / 100) + " Hundred "+ getStringNumber(num % 100);
        }

        if (num / 10 > 0) {
            String digit = "";
            int remainder = num % 10;
            num = num / 10;
                if (num == 9)
                    digit = "Ninety ";
                if (num == 8)
                    digit = "Eighty ";
                if (num == 7)
                    digit = "Seventy ";
                if (num == 6)
                    digit = "Sixty ";
                if (num == 5)
                    digit = "Fifty ";
                if (num == 4)
                    digit = "Forty ";
                if (num == 3)
                    digit = "Thirty ";
                if (num == 2)
                    digit = "Twenty ";

            return digit + getStringNumber(remainder % 10);
        }


        return "";
    }



}
