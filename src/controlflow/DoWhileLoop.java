package controlflow;

public class DoWhileLoop {

    public static void main(String[] args) {
        int age = 18;
        DoWhileLoop.celebrateEid("yes", "yes");
        DoWhileLoop.getAge(20);
        do {
            DoWhileLoop.wishOnBirthday("ismat", 30);
            age++;
        } while (age < 36);
        do {
            System.out.println("hello");
            age--;

        }

        while (age > 19);

        do {
            System.out.println("my age is 38");
            age++;

        } while (age > 38);// the condition is not true so it run at least one time and then it dosnt run any more
        int myAge = 22;

        do {
            System.out.println("my age is 22");
            myAge--;// this call iterator
        } while (myAge > 18);

//
        boolean cakeIsAvailable = false;

        do {
            DoWhileLoop.wishOnBirthday("ismat", 37);
            System.out.println("yeyyy its my Birthday  " + cakeIsAvailable);
        }
        while (cakeIsAvailable = false);


        String cakeName = "chocolate";
        do {
            DoWhileLoop.wishOnBirthday("ismt", 37);
        }
        while (cakeName == "mango");
    }

    //
    public static void wishOnBirthday(String name, int age) {
        int myAge = 30;

        do {
            System.out.println("its my birthday" + name);
            age++;
        }
        while (age < 38);
    }

    public static void celebrateEid(String tomorrowEid, String tomorrowOff) {
        do {
            System.out.println("eid mubarak");
            break;
        } while (tomorrowOff == "yes" && tomorrowOff == "yes");
    }


    public static void getAge(int age) {
        int hisAge = 15;
        do {
            System.out.println("he is 10 years old");
            age--;
        } while (age > 10);
    }
}
