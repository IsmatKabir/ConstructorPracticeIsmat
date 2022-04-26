package constructorIsmat;

public class ConstructorClass {


    //classname object=new constructor of a class
    // constructor has no return type
    //constructor name should be as classname

    // constructor is used to initialize object
    // how to create constructor
    // AccessModifier constructorname or classname () {}

    String name = "aumi";
    int age = 18;
    String address = "queens, ny";
    String salary;
    double number;
    public ConstructorClass(String name ,int age, String  address , double number ) {
        System.out.println("my name is ismat");
        this.name = name;
        this.age=age;
        this.address=address;


        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println("name is  " +""+this.name+"and age is "+""+this.age +""+ this.address       );
    }
// default constructor coz its without any parameter
// we can create multiple  constructor with different parameter pattern


    public static void main(String[] args) {

       //ConstructorClass cc = new ConstructorClass();
       // ConstructorClass co=new ConstructorClass("aunonto");// passing the argument inside the constructor
       // Mobile m = new Mobile();
       // ConstructorClass ct=new ConstructorClass("tania");

       // ConstructorClass con = new ConstructorClass( "tania" ,24  );
        //ConstructorClass cons=new ConstructorClass("tania",24,"fl");
        ConstructorClass cont= new ConstructorClass("ismat " ,33,"florida","100k"  );
        ConstructorClass ctc= new ConstructorClass("1200",10.10);

    }

public ConstructorClass(String name ,int age, String  address,String salary    ){

        this .name=name;
        this.age=age;
        this.address=address;
        this.salary=salary;
    System.out.println(name+" "+age+""+address+"  "+salary);






}
public ConstructorClass(String salary,double number   ){
      this.salary=salary;
      this.number=number;
    System.out.println(this.salary+""+ this.number          );

}
}
