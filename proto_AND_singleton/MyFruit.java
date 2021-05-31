package proto_AND_singleton;

public class MyFruit implements Cloneable{
    protected String name=null;
    public void display(){
        System.out.println(this.name);
    }
    public Object clone(){
        Object fru=null;
        try {
            fru=super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return fru;
    }
}
