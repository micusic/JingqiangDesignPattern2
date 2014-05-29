import java.util.List;

public class DecoratorStrawberry extends Decorator {
    public DecoratorStrawberry(Cocktail cocktail) {
        super(cocktail);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1;
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients = super.getIngredients();
        ingredients.add("strawberry icecream");
        return ingredients;
    }
}
