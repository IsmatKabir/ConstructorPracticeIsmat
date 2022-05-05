package singletonconcept;

public class Chicken {


    public static void main(String[] args) {

        //Chicken chic =new Chicken();
       Berger newBerger = new Berger("mac" ,5.50   );
       Berger oldBerger=new Berger("kid");
        System.out.println(" my kids favourite  " +oldBerger.name);
        System.out.println("my berger is mac" + newBerger.name+"my berger price is"+ newBerger.bergerPrice );
     Berger.getBerger();

        System.out.println("my berger   name "  +newBerger.bergerPrice  );

    }




}
