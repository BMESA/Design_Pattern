package AbstractFactory;

public class AConF implements AFruitAndVegetables{
    @Override
    public Fruit CreateF() {
        Apple apple= new Apple();
        return apple;
    }

    @Override
    public Vegetables CreateV() {
        return null;
    }
}
