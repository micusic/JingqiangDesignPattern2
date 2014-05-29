import java.util.ArrayList;
import java.util.List;

public class StandardCocktail extends Cocktail {
    @Override
    public double getPrice() {
        return 1.0;
    }

    @Override
    public List<String> getIngredients() {
        List ingredients = new ArrayList();
        ingredients.add("ice cubes");
        return ingredients;
    }
}
