package controlflow;

import java.util.Scanner;

public class Vote {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("enter vote for eid break");

        int voteCount = input.nextInt();
        System.out.println("enter student number");
        int studentNumber = input.nextInt();
        for (int i = 0; i < voteCount; i++) {
            if (studentNumber <= 50 && voteCount >= 26) {
                System.out.println("we wil get eid break");
            } else {
                System.out.println("we will not get eid break");

            }
        }
    }


//    public static void here(){
//
//        Scanner input= new Scanner(System.in);
//
//        System.out.println("enter total student number");
//        int studentNumber=input.nextInt();
//        System.out.println("Yes");
//        String response=input.nextLine();
//        System.out.println("No");
//        String response2=input.nextLine();
//
//        for ( int i=0;i<response;i++){
//
//
//           // if ( studentNumber<=50 && voteCount<=26){
//                System.out.println("we wil get eid break");
//            }
//           // else {
//               // System.out.println("we will not get eid break");
//
//
//



    }









