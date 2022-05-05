package Mentoring_Java_Advance;

public class Constructor {
    public static void main(String[] args) {
        Constructor con= new Constructor("ismat",32,"queens");
       Constructor cons= new Constructor("Aumi",20);

    }

   String name;
    int age;
    String address;


    public Constructor( String name, int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
        System.out.println("my name is " +name+"my age is "+age+ "mt address is " +address);
    }



public  Constructor( String name, int age){
       this.name=name;
       this.age=age;
    System.out.println("name is " +name+"age is "+ age);
}







}