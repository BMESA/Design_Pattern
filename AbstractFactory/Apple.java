package AbstractFactory;

public class Apple extends Fruit{
    @Override
    public void eat() {
        System.out.println("eating Apple");
        super.eat();
    }
}
