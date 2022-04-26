package constructorIsmat;

public class Constructorpractice {


    String name;
    String address;
    int stId;
    double salary = 100;
    int age = 20;
    byte houseNumber;
    char dressSize;

    public Constructorpractice(String name) {
        this.name = name;
        System.out.println("his  name is " + name);
    }

    public Constructorpractice(String name, String address, int stId) {

        System.out.println("my name is ismat");

        this.name = name;
        this.address = address;
        this.stId = stId;
        System.out.println("my name is  " + name + "address is  " + address + "my id is  " + stId);


    }


    public Constructorpractice(String address, int stId, String name) {
        this.address = address;
        this.stId = stId;
        this.name = name;
        System.out.println("my address is  " + address + "my student id is  " + stId + "my name is  " + name);
    }

    public Constructorpractice(String name, String address, int stId, double salary) {
        this.name = name;
        this.address = address;
        this.stId = stId;
        this.salary = salary;
        System.out.println("my name is  " + name + "my address is  " + address + "and salary is " + salary);
    }

    public Constructorpractice(String name, String address) {
        this.name = name;
        this.address = address;

        System.out.println("my name is  " + name + "my address is  " + address);
    }

    public Constructorpractice(String name, String address, int stId, byte houseNumber, char dressSize) {
        this.name = name;
        this.address = address;
        this.stId = stId;
        this.houseNumber = houseNumber;
        this.dressSize = dressSize;

        System.out.println("my name is " + name + "my address is " + address + "my stid is " + stId + " my house number is " + houseNumber + " my dresssize is" + dressSize);

    }


    public void ConstructorClass( String name,int age,String address, double salary){
       this.name=name;
       this.age=age;
       this.address=address;
       this.salary=salary;
        System.out.println("name "+name+"age is " +age+"address is "  +address+"salary is " +salary);

    }

    public static void main(String[] args) {
        Constructorpractice cc = new Constructorpractice("ismat", "queens", 1003);
        Constructorpractice ct = new Constructorpractice("queens", 1003, "ismat");
        Constructorpractice con = new Constructorpractice("tania", "queens", 1002, 100);
        Constructorpractice cons = new Constructorpractice("ismat", "tania");
        Constructorpractice ctt = new Constructorpractice("Irin");
        Constructorpractice ctp = new Constructorpractice("ismat", "queens", 1002, (byte) 5, 'm');
        ConstructorClass cst=new ConstructorClass("ismat",38,"jamaica",100000);
        ctt.name = "Husna";
        System.out.println("her name is " + ctt.name);
        ctt.salary = 10000;
        System.out.println("her salary is" + ctt.salary);

        ctt.address = "long island";
        System.out.println("her address is " + ctt.address);
    }

}