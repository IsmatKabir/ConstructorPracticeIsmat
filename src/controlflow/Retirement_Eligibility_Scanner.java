package controlflow;

import java.util.Scanner;

public class Retirement_Eligibility_Scanner {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in)  ;
        System.out.println("************Retirement Eligibility***********");
        System.out.println("Enter your age");
        int age= input.nextInt();
        if (age<=64 ){
            System.out.println("you are not eligible for Retirement");
        } else  {
            System.out.println("you are eligible for Retirement");

        }




}}
