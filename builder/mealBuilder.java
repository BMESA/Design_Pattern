package builder;

public class mealBuilder {
    meal meal=new meal();
    public void setMeal(String food,String drink) {
            meal.food = food;
            meal.drink = drink;
    }

    public meal getMeal() {
        return meal;
    }
}
