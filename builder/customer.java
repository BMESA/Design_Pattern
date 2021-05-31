package builder;

public class customer {
    public static void main(String[] args){
        waiter waiter=new waiter();
        String food="秘制小汉堡",drink="腐乳";
        waiter.order(food,drink);
        meal meal=waiter.Serve();
        System.out.println("客户享用食物："+meal.food);
        System.out.println("客户享用饮料："+meal.drink);
    }
}
