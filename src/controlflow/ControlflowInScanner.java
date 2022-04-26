package controlflow;

import java.util.Scanner;

public class ControlflowInScanner {


    public static void main(String[] args) {

        ControlflowInScanner controlflow = new ControlflowInScanner();
        controlflow.getScore();
    }

    public void getScore() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your score to get the grade");
        double score = scan.nextDouble();
        if (score >= 94 && score <= 100) {

            System.out.println("Excellent");
        } else if (score >= 90 && score <= 93) {


            System.out.println("very good");
        } else if (score >= 85 && score <= 89) {

            System.out.println("good");
        } else if (score >= 80 && score <= 84) {
            System.out.println("average");
        } else if (score >= 70 && score <= 79) {
            System.out.println("pass");
        } else if (score >= 60 && score <= 69) {
            System.out.println("poor");
        } else if (score >= 50 && score <= 59)
            System.out.println("need to repeat");

        }


    }






















