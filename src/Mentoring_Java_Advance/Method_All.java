package Mentoring_Java_Advance;

public class Method_All {
    public static void main(String[] args) {
     Method_All.dosum();
     Method_All.doSub(18,10);
     Method_All.doMulti();
     Method_All.doDivision(100,5);
     Method_All.istomorrowEid();
     Method_All.celebratEid("true");
    }


   public static int dosum() {
     int num1=5;
     int num2=6;
     int total=num1+num2;
       System.out.println("total is "+total);
       return total;
   }

  public static int doSub(int num1,int num2){
      int number1=num1;
      int number2=num2;
      int total=num1-num2;
      System.out.println("total sub is "+total);
      return total;
  }
public static void doMulti(){
        int num1=5;
        int num2=10;
        int total=num1*num2;
    System.out.println("total multi is "+total);
}

public static void doDivision( int num1, int num2){
        int number1=num1;
        int number2=num2;
        int total=num1/num2;
    System.out.println("total division is " +total);

}

public static void istomorrowEid(){
     for (int i=0; i<5; i++) {
         System.out.println("eid mubarak");
     }



}

public static boolean celebratEid(  String tomorrowEid) {
    boolean istomorrowEid = true;
    if (istomorrowEid == true) {
        System.out.println("yeyy");
    } else {
        System.out.println("oh no");
    }
    return true;
}
}