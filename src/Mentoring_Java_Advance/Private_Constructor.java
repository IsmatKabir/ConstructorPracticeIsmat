package Mentoring_Java_Advance;

public class Private_Constructor {

private Private_Constructor(){
    System.out.println("hello everyone");

}

private static Private_Constructor pc=new Private_Constructor();

public static Private_Constructor getInstance(){
    System.out.println("we are learning private constructor");
    return pc;
}
public  static  void getInfo(String name ){
    System.out.println("name is " +name);

}

}