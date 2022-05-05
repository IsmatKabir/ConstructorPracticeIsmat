package Mentoring_Java_Advance;

public class Singleton2 {

    public static void main(String[] args) {
        singleton1 single=singleton1.getInstance();
        singleton1 s= new singleton1("ismat",23);
        singleton1 sn = new singleton1("ismat");
        single.name="isrt";
        System.out.println(" her name is "  +single.name);
    }

}
