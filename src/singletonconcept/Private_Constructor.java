package singletonconcept;

public class Private_Constructor {

    Private_Constructor(){
        System.out.println( "this is private constructor");
    }

    String name;
    int age;

    private static Private_Constructor obj= new Private_Constructor();

    public static Private_Constructor  practicing( ){
        return  obj;
    }

    public Private_Constructor(String name, int age){
     this.name=name;
     this.age= age;
     System.out.println("my name is " +name+"and age is " +age);
    }
}