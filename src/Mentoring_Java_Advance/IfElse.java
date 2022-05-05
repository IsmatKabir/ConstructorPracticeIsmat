package Mentoring_Java_Advance;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("enter student number");
        int studentNum=scan.nextInt();
        System.out.println( "enter vote count");
        int voteCount = scan.nextInt();
        for (int i =0; i<voteCount; i++){
            if ( studentNum==15&& voteCount>=9){
                System.out.println( "break");
            }
            else {
                System.out.println( " no break");
            }
        }

    }
}
