package Mentoring_Java_Advance;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your foodSerial");
        int  foodSerial=input.nextInt();
        System.out.println("enter dessert");
        String dessert=input.next();
        String foodName;
        String dessertName;

        switch (foodSerial){
            case 1:
                foodName= "berger";
                switch (dessert){
                    case "cookie":
                        dessertName="brown";
                        break;
                    case "icecream":
                        dessertName="vanilla";
                        break;
                    default:
                        dessertName=" not valid";
                        break;
                }
                System.out.println("my fav dessert"+dessertName);
                break;
            case 2:
                foodName="chicken";
                break;
            case 3:
                foodName="fries";
                break;
            case 4:
                foodName="pasta";
                break;
            default:
                foodName="not match";
            break;

        }
        System.out.println("my fav food is " +foodName);
    }
}
