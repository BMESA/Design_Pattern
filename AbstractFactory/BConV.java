package AbstractFactory;

public class BConV implements BFruitAndVegetables{
    @Override
    public Fruit CreateF() {
        return null;
    }

    @Override
    public Vegetables CreateV() {
        cabbage Cabbage=new cabbage();
        return Cabbage;
    }
}
