package Collections.TaskD;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(findMonth());
        returnMonthBySeason();
        returnMonthByDays();
        returnMonthWithEvenDays();
        returnMonthWithOddDays();
        checkMonthByDays();

    }

    public static String findMonth() {
        System.out.println("Enter value for finding a month if it exist");
        Scanner input = new Scanner(System.in);
        String word = input.next();
        for (Month month : Month.values()) {
            if (word.equalsIgnoreCase(String.valueOf(month)))
                return "Month exists in the list";
        }
        return "Mont is not found in the list, check if it is correct";
    }

    public static void returnMonthBySeason() {
        System.out.println("Enter value for finding months that are in the same season");
        Scanner input = new Scanner(System.in);
        String text = input.next();
        Month currMonth = null;
        try {
            currMonth = Month.valueOf(text.toUpperCase());
        } catch (Exception e) {
            System.out.println("Incorrect message ");
            return;
        }

        Season currSeason = currMonth.getSeason();
        System.out.println("Months with the same season: ");
        for (Month month : Month.values()) {
            if (currSeason.toString().equalsIgnoreCase(month.getSeason().toString())) {
                System.out.println(month);
            }
        }
    }

    public static void returnMonthByDays() {
        System.out.println("Enter value for finding months that have the same count of days");
        Scanner input = new Scanner(System.in);
        String text = input.next();
        Month currMonth = null;
        try {
            currMonth = Month.valueOf(text.toUpperCase());
        } catch (Exception e) {
            System.out.println("Incorrect message, Month doesn't exist");
            return;
        }
        Integer countOfDays = currMonth.getDays();
        System.out.println("Months with the same number of days: ");
        for (Month month : Month.values()) {
            if (countOfDays == month.getDays()) {
                System.out.println(month);
            }
        }
    }

    public static void returnMonthWithEvenDays() {
        System.out.println("All month with even number of days: ");
        for (Month month : Month.values()) {
            if (month.getDays() % 2 == 0) {
                System.out.println(month);
            }
        }
    }

    public static void returnMonthWithOddDays() {
        System.out.println("All month with odd number of days: ");
        for (Month month : Month.values()) {
            if (month.getDays() % 2 != 0) {
                System.out.println(month);
            }
        }
    }

    public static void checkMonthByDays() {
        System.out.println("Enter month for receiving info about even number of days");
        Scanner input = new Scanner(System.in);
        String monthInput = input.next();
        Month checkMonth = null;
        try {
            checkMonth = Month.valueOf(monthInput.toUpperCase());
        } catch (Exception e) {
            System.out.println("Incorrect message ");
            return;
        }

            if (checkMonth.getDays() % 2 == 0) {
                System.out.println("Entered month - " + checkMonth + " has an even number of days");
            } else {
                System.out.println("Entered month - " + checkMonth + " has an odd number of days");
            }

    }
}
