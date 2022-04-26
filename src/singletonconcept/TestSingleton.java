package singletonconcept;

public class TestSingleton {

    public static void main(String[] args) {


        SingletonConcept single = new SingletonConcept();
      Pizza myPizza=new Pizza(  "dominos");
      Pizza hisPizza=new Pizza("dominos",20);
    //classname refference variable name/objectname= classname.public return method name();
        Pizza herPizza=Pizza.getInstance();


        herPizza.pizzaPrice=20.00;
       System.out.println("pizza price is "  +herPizza.pizzaPrice   );

    }

}
