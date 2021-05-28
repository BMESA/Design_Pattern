package AbstractFactory;

public class BConF implements BFruitAndVegetables{
    @Override
    public Fruit CreateF() {
        Banana banana=new Banana();
        return banana;
    }

    @Override
    public Vegetables CreateV() {
        return null;
    }
}
