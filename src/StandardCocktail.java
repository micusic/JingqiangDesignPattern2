import java.util.Arrays;
import java.util.List;

public class StandardCocktail extends Cocktail {
    @Override
    public double getPrice() {
        return 1.0;
    }

    @Override
    public List<String> getIngredients() {
        return Arrays.asList("ice cubes");
    }
}
