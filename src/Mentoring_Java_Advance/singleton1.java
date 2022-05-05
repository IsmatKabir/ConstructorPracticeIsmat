package Mentoring_Java_Advance;

public class singleton1 {


    private singleton1() {
        System.out.println("hello everyone");
    }

    private static singleton1 single = new singleton1();

    public static singleton1 getInstance() {
        return single;
    }
    String name;
    int age;

    public singleton1(String name, int age) {
   this.name=name;
   this.age=age;
        System.out.println(" i am practicing");
    }
   public singleton1(String name){
        this.name=name;
       System.out.println("my name is  "+ name);
   }

}
