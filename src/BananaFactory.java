public class BananaFactory implements DessertFactory {
    @Override
    public IDessert makeDessert() {
        return new Banana();
    }
}
