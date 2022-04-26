package singletonconcept;

public class Berger {

    private Berger() {
    }


    private static Berger beef = new Berger();

    public static Berger getBerger() {
        return beef;
    }

    String name;
    double bergerPrice;

    public Berger(String name, double bergerPrice) {
        this.bergerPrice = bergerPrice;
        this.name = name;
    }

    public Berger(String name) {
        this.name = name;

    }


}
