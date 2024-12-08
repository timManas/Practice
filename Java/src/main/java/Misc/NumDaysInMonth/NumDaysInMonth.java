package Misc.NumDaysInMonth;

import java.time.LocalDate;

public class NumDaysInMonth {
    public static void main(String [] args) {
        int year = 1992;
        int month = 7;
        System.out.println("Num Days: " +  numberOfDays(year, month));
    }

    public static int numberOfDays(int year, int month) {
        LocalDate ld = LocalDate.of(year, month, 1);
        return ld.lengthOfMonth();
    }
}
