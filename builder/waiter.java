package builder;

public class waiter {
    mealBuilder mb=new mealBuilder();
    public void order(String food,String drink) {
        mb.setMeal(food,drink);
    }

    public meal Serve() {
        return mb.getMeal();
    }
}
