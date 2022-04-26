package singletonconcept;

public class Pizza {

    String pizzaName;
    double pizzaPrice;

    // default private constructor
    private Pizza() {
    }

    public Pizza(String pizzaName) {
        this.pizzaName = pizzaName;


    }

    public Pizza(String pizzaName, double pizzaPrice) {
        this.pizzaName = pizzaName;
        this.pizzaPrice = pizzaPrice;


    }
// to call private constructor we need to creat a private object and dont need  main method

    private static Pizza instance = new Pizza();
// syntax private static classname object name= new classname();

//create a public return type of method
    public  static  Pizza  getInstance(){
        return instance;

    }

}
