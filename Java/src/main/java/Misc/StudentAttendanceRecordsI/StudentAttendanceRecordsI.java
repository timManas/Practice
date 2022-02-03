package Misc.StudentAttendanceRecordsI;

public class StudentAttendanceRecordsI {
    public static void main(String [] args) {
        String [] input = {"PPALLP", "PPALLL"};
        for (String i : input)
            System.out.println("CheckRecords: " + checkRecord(i));
    }

    public static boolean checkRecord(String s) {
        // Step1 - Create counters to track absent & late occurences
        int absentCounter = 0;
        int lateCounter = 0;

        // Step2 - Travse string character by character
        for (int i=0; i<s.length();i++) {
            char letter = s.charAt(i);

            // Increment respective counters
            switch (letter) {
                case 'A': {
                    ++absentCounter;
                    lateCounter = 0;
                    break;
                }
                case 'L': {
                    ++lateCounter;
                    break;
                }
                case 'P': {
                    System.out.println("Present");
                    lateCounter = 0;
                    break;
                }
            }

            // Step4 - Check if counters are greater
            if (absentCounter >= 2)
                return false;
            if (lateCounter >= 3)
                return false;
        }

        return true;
    }
}
