
public class Main {
    public static void main(String[] args) {
        DessertFactory dessertFactory = new StrawberryFactory();
        IDessert dessert = dessertFactory.makeDessert();

        dessert.description();
    }
}