package Mentoring_Java_Advance;

import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
    Switch_case.getFoodSerial();
    }


    public static void getFoodSerial(){
        Scanner input= new Scanner(System.in);
        System.out.println("enter foodSerial");
        int foodSerial=input.nextInt();
        System.out.println("enter dessert name");
        String dessert=input.next();
   ;
        String foodName;
        String dessertName;

        switch (foodSerial){
            case 1:
                foodName="chicken";
            switch (dessert) {
                case "dessert1":
                    dessertName = "icecream";
                    break;
                case "dessert2":
                    dessertName = "chocolate";
                    break;
                default:
                    dessertName = "not match";
                    break;
            }
                System.out.println("my fav dessert "+dessertName);

                break;
            case 2:
                foodName="berger";
                break;
            case 3:
                foodName="pasta";
                break;
            case 4:
                foodName="fries";
                break;
            case 5:
                foodName="beef";
                break;
            default: foodName="not valid food" ;
            break;

        }
        System.out.println("my favourite food is " + foodName);
    }
}
