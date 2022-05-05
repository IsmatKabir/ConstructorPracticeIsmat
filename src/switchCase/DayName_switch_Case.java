package switchCase;

import java.util.Scanner;

public class DayName_switch_Case {
    public static void main(String[] args) {
    DayName_switch_Case.getWorkingDays();
    }

    public static void getWorkingDays() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your working day ");
        int workDay = scan.nextInt();
        String dayName;
        switch (workDay) {
            case 1:
                dayName = "monday";
                break;
            case 2:
                dayName = "tuesday";
                break;
            case 3:
                dayName = "wednesday";
                break;
            case 4:
                dayName = "thursday";
                break;
            case 5:
                dayName = "friday";
                break;
            case 6:
                dayName = "saturday";
                break;
            case 7:
                dayName = "sunday";
                break;
            default:
                dayName = "out of the day";
                break;

        }
        System.out.println("my working day " + "" + dayName);
    }

}
