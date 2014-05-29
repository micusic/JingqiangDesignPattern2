import java.util.List;

public class DecoratorPinapple extends Decorator {
    @Override
    public double getPrice() {
        return super.getPrice() + 1;
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients = super.getIngredients();
        ingredients.add("pineapple juice");
        return ingredients;
    }

    public DecoratorPinapple(Cocktail cocktail) {
        super(cocktail);
    }
}
