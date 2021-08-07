package Strings.ReformatDate;

public class ReformatDate {
    public static void main(String [] args) {
        String [] inputs = {"20th Oct 2052", "6th Jun 1933", "26th May 1960"};
        for (String i : inputs)
            System.out.println("Date: " + reformatDate(i));

    }

    public static  String reformatDate(String date) {

        // Step1 - Create output variables
        String day = null;
        String month = null;
        String year = null;

        // Step2 - Split date into respective sections
        String [] dateArr = date.split(" ");

        // Step3 - Traverse each section and figure out if they are day, month or year
        for (String element : dateArr) {

            if (element.contains("st") || element.contains("nd") || element.contains("rd") || element.contains("th")) {
                day = element.replace("st", "").
                        replace("nd", "").
                        replace("rd", "").
                        replace("th", "");

                if (day.length() == 1) {
                    day = "0" + day;
                }
            } else if (element.length() == 4 && element.matches("[0-9]+")) {
                year = element;
            } else {

                switch (element) {
                    case "Jan": {
                        month = "01";
                        break;
                    }
                    case "Feb": {
                        month = "02";
                        break;
                    }
                    case "Mar": {
                        month = "03";
                        break;
                    }
                    case "Apr": {
                        month = "04";
                        break;
                    }
                    case "May": {
                        month = "05";
                        break;
                    }
                    case "Jun": {
                        month = "06";
                        break;
                    }
                    case "Jul": {
                        month = "07";
                        break;
                    }
                    case "Aug": {
                        month = "08";
                        break;
                    }
                    case "Sep": {
                        month = "09";
                        break;
                    }
                    case "Oct": {
                        month = "10";
                        break;
                    }
                    case "Nov": {
                        month = "11";
                        break;
                    }
                    case "Dec": {
                        month = "12";
                        break;
                    }
                }
            }
        }

        return (year + "-" + month + "-" + day);
    }
}
