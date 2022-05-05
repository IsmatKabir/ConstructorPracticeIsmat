package string;

public class Try_Catch {

    public static void main(String[] args) {
        String address = "Aunonto live in queens";
        try {
            System.out.println(address.charAt(27));
        } catch (Exception e) {
           // e.printStackTrace();
            System.out.println("string index out of bound exception");

        }


    }

}
