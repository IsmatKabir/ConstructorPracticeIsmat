package string;

public class String_practice_1 {


    public static void main(String[] args) {


        String birthdayWish="Happy Birthday to Ahmed";

        System.out.println("length value " +birthdayWish.length());
        System.out.println("lower case  "   + birthdayWish.toLowerCase());
        System.out.println("upper case  "   + birthdayWish.toUpperCase());
        System.out.println("char at  "  +birthdayWish.charAt(10));
        // index start from zero
        System.out.println("sub String "+ birthdayWish.substring(7));
        System.out.println("sub string "+ birthdayWish.substring(8,12));
        System.out.println("compare " + birthdayWish.equals("Happy Birthday to Ahmed"));
        System.out.println("compare " + birthdayWish.equals("happy birthday to ahmed"));
        System.out.println("compare ignorcase " + birthdayWish.equalsIgnoreCase("happy Birthday to Ahmed"));
        System.out.println("concatenation: "+"stid ".concat("1234") );
        System.out.println("__________________split___________________");

        String stid="102:ahmed";
        String studentName="ismat@israt@tahmina@tania";
        int age =24;
        System.out.println(stid.toString());
        System.out.println(stid.contains("ah"));
        System.out.println(stid.contains(":"));
        System.out.println(stid.split(":"));
        System.out.println(stid.split("@",4));
        String[] demoArray=studentName.split("@",4);
        //for each loop
       // for (String a:demoArray) {
        //    System.out.println(a);
        //}

        for (String b:demoArray) {
            System.out.println(b);
        }
        for (int i=0;i<demoArray.length;i++){
            System.out.println(demoArray[i]);
        }

        System.out.println("______________________________________________________");
        //exception handling
        // try catch block
        //try{}catch(){}
        try {
            System.out.println("length value " +birthdayWish.charAt(24));
        }
        catch (Exception e){
           // e.printStackTrace();
            System.out.println("string index out of bounds exception");
        }
        }


    }








