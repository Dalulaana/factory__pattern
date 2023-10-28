public class BlueberryFactory implements DessertFactory {
    @Override
    public IDessert makeDessert() {
        return new Blueberry();
    }
}
