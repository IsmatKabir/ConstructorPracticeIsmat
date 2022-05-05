package switchCase;

import java.util.Scanner;

public class Switch_case {

    public static void main(String[] args) {
     Switch_case.getFood();

    }
        public  static void getFood(){

            Scanner input= new Scanner(System.in);
            System.out.println("enter your favourite foodSerial number");
            int foodSerial=input.nextInt();
            String foodName;
            switch (foodSerial ){
                case 1:
                    foodName = "pizza";
                    break;
                case 2:
                    foodName = "pasta";
                    break;
                case 3:
                    foodName = "kebab";
                    break;
                case 4:
                    foodName = "rice";
                    break;
                case 5:
                    foodName = "beef";
                    break;
                case 6:
                    foodName = "fries";
                    break;


                default:
                    foodName = "invalid";
                    break;
            }

            System.out.println("my favourite food is "  +" "+foodName);
        }


    }
