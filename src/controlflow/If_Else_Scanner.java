package controlflow;

import java.util.Scanner;

public class If_Else_Scanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("______voter eligibility________________");
        System.out.println("enter your age");
        int age = input.nextInt();
        System.out.println("enter your gender");
        String gender = input.next();
        if (gender.equalsIgnoreCase("female") && (age > 18)) {
            System.out.println("you are eligible for vote");
        } else if  (gender.equalsIgnoreCase("male") && (age > 18)) {
                System.out.println("you are eligible for vote");
        } else {
                System.out.println("you are not eligible for vote");

            }
        }
    }
