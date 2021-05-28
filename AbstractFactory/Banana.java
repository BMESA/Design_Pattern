package AbstractFactory;

public class Banana extends Fruit{
    @Override
    public void eat() {
        System.out.println("eating Banana");
        super.eat();
    }
}
