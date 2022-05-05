package switchCase;

import java.util.Scanner;

public class Rough {

    public static void getCourseWithExtra() {
        // Switch case: Alternative of if else if
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your course");
        String course = input.nextLine();
        String courseName;
        System.out.println("Enter your Extra course name course");
        String extraCourse = input.nextLine();


        switch (course) {
            case "Marketing":
                courseName = "Marketing 101";
                if (extraCourse.equalsIgnoreCase("Marketing 222")) {
                    System.out.println("This is Marketing course");
                } else {
                    System.out.println("This is not Marketing course");
                }
                break;


        }


    }

    public static void main(String[] args) {


        Rough.getCourseWithExtra();
    }
    }