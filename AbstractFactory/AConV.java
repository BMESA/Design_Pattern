package AbstractFactory;

public class AConV implements AFruitAndVegetables{
    @Override
    public Fruit CreateF() {
        return null;
    }

    @Override
    public Vegetables CreateV() {
        tomato Tomato = new tomato();
        return Tomato;
    }
}

