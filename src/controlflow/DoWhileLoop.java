package controlflow;

public class DoWhileLoop {

    public static void main(String[] args) {
        int age = 18;

//   do {
//       System.out.println("hello");
//       age--;
//
//   }
//
//    while (age>19);
//
//do {
//    System.out.println("my age is 38");
//    age++;
//
//}while (age>38  );// the condition is not true so it run at least one time and then it dosnt run any more
//        int myAge = 22;
//
//        do {
//            System.out.println("my age is 22");
//            myAge--;// this call iterator
//        } while (myAge > 18);
//
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
    int age = 35;
    public static void wishOnBirthday(String name, int age) {


        do {
            System.out.println("its my birthday" + name);
            age++;
        }
        while (age < 34);
    }

}
// he create public non return method then he  call the method in main method but he put condition false so it execute al teast one time