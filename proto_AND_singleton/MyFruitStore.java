package proto_AND_singleton;

import java.util.Hashtable;

public class MyFruitStore {
    Hashtable<Integer,MyFruit> fruitTable=null;
    static MyFruitStore Store=null;
    private MyFruitStore(){
        fruitTable=new Hashtable<>();
    }
    public static MyFruitStore getFruitStore(){
        if(Store==null){
            Store = new MyFruitStore();
        }
        return Store;
    }
    public  void AddFruit(int Key,MyFruit fru){
        fruitTable.put(Key,fru);
    }
    public  MyFruit GetFruit(int Key){
        return (MyFruit) fruitTable.get(Key).clone();
    }
}
