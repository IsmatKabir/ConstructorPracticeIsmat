package constructorIsmat;

import java.util.Scanner;

public class MethodScanner {
// if public static scanner scan = new Scanner (System.in); then dont needto create inside the method everytime
    public static void addition() {
        Scanner add = new Scanner(System.in);
        System.out.println(".....My calculator........");
        System.out.println("enter first number to add");
        double num1 = add.nextDouble();
        System.out.println("enter second number");
        double num2 = add.nextDouble();
        double totalAddition = num1 + num2;
        System.out.println("total addition" + totalAddition);

    }

    void subtraction() {
        Scanner sub = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = sub.nextInt();
        System.out.println("enter second number");
        float num2 = sub.nextFloat();
        float totalSubtraction = num1 - num2;
        System.out.println("total subtraction is " + totalSubtraction);
    }
    public  int doMultiplication(int num1, int num2){
        int totalMultiNum=num1*num2;
        System.out.println("total multiplication number is" + totalMultiNum  );
        return  totalMultiNum;
    }



    public static void main(String[] args) {

       // Scanner scan = new Scanner(System.in);
        MethodScanner.addition();
        MethodScanner method = new MethodScanner();
        method.subtraction();
        method.doMultiplication(5,6);


    }


}
