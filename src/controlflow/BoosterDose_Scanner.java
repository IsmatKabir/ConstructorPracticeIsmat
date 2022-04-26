package controlflow;

import java.util.Scanner;

public class BoosterDose_Scanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("booster dose eligibility");

        System.out.println("is  your first dose done?");
        String firstDose = input.nextLine();

        System.out.println("Is  your second dose done");
        String secondDose = input.nextLine();
        if (firstDose.equalsIgnoreCase("yes") && (secondDose.equalsIgnoreCase("yes"))) {
            System.out.println("you are eligible for booster dose");
        } else {
            System.out.println("you are not eligible for booster dose");
        }

        input.close();
    }



}