package Mentoring_Java_Advance;

import java.util.Scanner;

public class If_else_condiion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter student number");
        int studentNumber = input.nextInt();
        System.out.println("total voteCount");
        int voteCount = input.nextInt();
        if (voteCount > 16 && studentNumber == 30) {
            System.out.println("we will get break");
        } else {
            System.out.println("no break");


        }

    }
}
