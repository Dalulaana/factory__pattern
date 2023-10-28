public class StrawberryFactory implements DessertFactory {
    @Override
    public IDessert makeDessert() {
        return new Strawberry();
    }
}
