package controlflow;

import java.util.Scanner;

public class Vaccine_Eligibility {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("************Vaccine eligibility************");
        System.out.println("enter your age");
        int age = input.nextInt();
        System.out.println("Enter your gender");
        String gender = input.next();
        if (gender.equalsIgnoreCase("female") || (age > 12)) {
            System.out.println("you are  eligible for vaccine");

        } else if (gender.equalsIgnoreCase("male") || (age > 12)) {
            System.out.println("you are   eligible for vaccine");
        } else {
            System.out.println("you are  not eligible for vaccine");
        }

        input.close();
    }
}