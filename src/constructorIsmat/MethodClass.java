package constructorIsmat;

public class MethodClass {
    public static void main(String[] args) {
        // method is a block of code has name and return value
        // method two type
        //return type// with or wuthout paramter
        //non return type
        //with or without parameter

        //  method syntax

        // accessModifier  returntype(void)mathodname(){}
// create object of MethodClass
        MethodClass mc = new MethodClass();
        mc.doSummation();
        mc.division(20, 4);
        MethodClass.isTomorrowEid("yes");
        MethodClass.isChickenAvailable("queens", 200);
        MethodClass.getInfo("tania", 9000);
        MethodClass.celebrateEid();
        MethodClass.wishOnBirthday("ismat");
        MethodClass.getAgeInfo();
        for (int total = 0; total < 5; total++) {
            MethodClass.dosum();

        }
        int i = 5;
        do {
            MethodClass.practice();
            System.out.println("we are here");
            i++;
        }
        while (i < 6);
   // MethodClass.learning("ismat",23);
    int j=5;
    do {
        System.out.println("hello celia");
        MethodClass.learning("ismat",22);
        j++;
    }while (j<10);
    MethodClass.workingHard(200,20);

    }

    public void doSummation() {
        int num1 = 20;
        int num2 = 30;
        int total = num1 + num2;
        System.out.println(total);
    }


    public void division(int num1, int num2) {
        int number;
        int number2;
        int totalDivision = num1 / num2;
        System.out.println(totalDivision);
    }

    public static void isTomorrowEid(String tomorrowEid) {
        String tomorrowEidYes = "yes";

        if (tomorrowEid == "yes") {
            System.out.println("Eid mubarak");
        } else {
            System.out.println("no eid");
        }

    }


    public static boolean isChickenAvailable(String address, double price) {
        boolean priceReasonable = true;
        String address2 = "far";
        if (priceReasonable == true) {
            System.out.println("we will get chicken");
        } else if (address2 == "far") {
            System.out.println("we will try to  get chicken");
        } else {
            System.out.println("we dont go");
        }
        return priceReasonable;
    }

    public static String getInfo(String name, double salary) {
        String myName = "ismat";
        double mySalary = 9000;
        if (myName == "ismat" && mySalary == 9000) {
            System.out.println("ismat is getting salary 9000");
        } else {
            System.out.println("she is not getting salary");
        }
        return myName;
    }


    public static void celebrateEid() {
        String tomorrow = "eid";
        do {
            System.out.println("eid mubarak");
            break;
        } while (tomorrow == "eid");

    }

    public static void wishOnBirthday(String name) {
        String myName = "ismat";
        do {
            System.out.println("its my birthday");
            break;
        } while (myName == "ismat");

    }

    public static int getAgeInfo() {
        int age = 10;
        for (age = 0; age < 10; age++) {

            System.out.println("he is 10 years old");//why it not 10 times running
        }
        return age;
    }

    public static void dosum() {
        int num1 = 20;
        int num2 = 100;
        int total = num1 + num2;
        System.out.println("total summation number is" + total);
    }

    public static void practice() {
        for (int i = 0; i < 5; i++) {
            System.out.println("we are learning");
        }
    }

public  static void  learning( String nme,int age){
String myname="Israt";
int urage=24;
    do {
        System.out.println("your name is israt");
        break;
    }
while (myname=="Israt" && urage==24);
}

public static void workingHard( int price, int age){
    int newPrice=200;
    int newage=20;
    do {
        System.out.println("we are chiling");
         newage++;

    }while (newage<=26|| newPrice<=198);

}
}