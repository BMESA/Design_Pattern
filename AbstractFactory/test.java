package AbstractFactory;

public class test {
    public static void main(String[] args){
        AConF AF=new AConF();
        AConV AV=new AConV();
        BConF BF=new BConF();
        BConV BV=new BConV();
        AF.CreateF().eat();
        BF.CreateF().eat();
        AV.CreateV().plant();
        BV.CreateV().plant();
    }
}
