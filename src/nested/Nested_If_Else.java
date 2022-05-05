package nested;

public class Nested_If_Else {

    public static void main(String[] args) {
        int age = 55;
        if (age > 18) {
            System.out.println("you are adult");
            if (age > 23) {
                System.out.println("get the license");
            } else if (age > 35) {
                System.out.println("update your licence");
            } else if (age > 45) {
                System.out.println("you are still young");
            }
            if (age > 55) {
                System.out.println("take care your heart");

            }
            if (age > 60) {
                System.out.println("you will eligible for presidential election");
            } else{

                System.out.println("enjoy life");
        } if (age>65){
            System.out.println("you are out of range");
            }

    } else {

        System.out.println("you are not adult");
    }


}

}
