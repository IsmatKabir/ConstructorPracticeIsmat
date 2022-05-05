package Mentoring_Java_Advance;

public class Method {
    public static void main(String[] args) {
//        Method m = new Method();
//        Method.dosum(30, 20);
//        m.dosum1(4, 9);
//        Method.istomorrowEid();
//        m.getshopping("sari", "dress", 250);
//        m.wishOnE();
//        m.wishonday("ismat");
//        m.getinformation(23);
         // Method.wishOnEid();
       // Method.getbreak();
       //
        // Method.istomorrowEid1();
        Method.doWhile(25);

    }


    public static int dosum(int num1, int num2) {
        int total = num1 + num2;
        System.out.println(num1 + num2);
        return num1 + num2;
    }

    void dosum1(int num1, int num2) {
        System.out.println(num1 = num2);
    }

    public static String getinfo() {
        String name = "ismat";
        System.out.println(name);
        return name;
    }

    public static boolean istomorrowEid() {
        boolean istomorroweid = true;
        if (istomorroweid == true) {
            System.out.println("we will celebrate");
        } else {
            System.out.println("no celebrate");
        }
        return istomorroweid;
    }

    boolean getshopping(String name, String dress, double price) {
        double newprice = 200;
        if (newprice == 500) {
            System.out.println("no shopping");
        } else {
            System.out.println("yes shopping");
        }
        return true;
    }

    boolean wishOnE() {
        for (int i = 0; i < 5; i++) {
            boolean wishoneid = true;
            if (wishoneid == false) {
                System.out.println("no eid");
            } else {
                System.out.println("eid mubarak");
            }

        }
        return true;
    }

    boolean wishonday(String name) {
        for (int i = 0; i < 5; i++) {
            String name1 = "ismat";
            if (name1 == "ismat") {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }
        return  true;
    }
    void getinformation(int age){
        int myage =5;
        do {
            System.out.println("hey");
            myage++;
        }
        while (myage<12);

    }
static boolean wishOnEid() {
    for (int i = 0; i < 5; i++) {
        boolean tomorrowEid = true;
        if (tomorrowEid == true) {
            System.out.println("eid mubarak");

        } else {
            System.out.println("we are going to celebrate Eid");
        }

    }
    return true;
}

static boolean getbreak(){
        boolean getbreak=true;
     do {
         System.out.println("we got eid break");


     }while (getbreak==false);
   return true;
}
  public  static  boolean  istomorrowEid1( ){
      for (int i =0; i<5;i++) {

          boolean tomorrowEid= true;
          if (tomorrowEid==true){
              System.out.println( "we will celebrate eid");
          }
          else {
              System.out.println("we are going to celebrate");
          }
      }


   return true;
}
public static void doWhile(int age){
        int age1 =20;
     do {
         System.out.println(  "his age is 20");
         age1++;
     }
     while (age1<25);

}
}