package switchCase;

import java.util.Scanner;

public class tahmina {
    public static void main(String[] args) {
        tahmina.getFoodSerial();
    }

    private static void getFoodSerial() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter foodSerial");
        int foodSerial = scan.nextInt();
        System.out.println("Enter dessert");
        String dessert = scan.next();

        String foodName;
        String foodName1;

        switch (foodSerial) {
            case 1:
                foodName = "pizza";
                switch (dessert) {
                    case "a":
                        foodName1 = "ice cream";
                        break;
                    case "b":
                        foodName1 = "Pudding";
                        break;
                    case "c":
                        foodName1 = "Sweets";
                        break;
                    default:
                        foodName1 = "No dessert for me";
                        //System.out.println("No dessert for me");
                        break;
                }
                System.out.println("my fev dessert: " + foodName1);
                break;
            case 2:
                foodName = "Chicken";
                break;
            case 3:
                foodName = "halim";
                break;
            case 4:
                foodName = "khichuri";
                break;
            case 5:
                foodName = "fuchka";
                break;
            default:
                foodName = "lkjhhggf";
                // System.out.println("food serial not matching");
                break;

        }
        System.out.println(" my fav food is : " + foodName);
    }
}
