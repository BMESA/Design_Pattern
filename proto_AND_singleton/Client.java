package proto_AND_singleton;

public class Client {
    public static void main(String[] args){
    MyFruitStore store1=MyFruitStore.getFruitStore();
    MyFruitStore store2=MyFruitStore.getFruitStore();
    store1.AddFruit(1,new apple());
    store2.AddFruit(2,new banana());
    MyFruit fru1= store1.GetFruit(2);
    MyFruit fru2= store2.GetFruit(1);
    fru1.display();
    fru2.display();
    System.out.println(store1.equals(store2));
    }
}

