import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.hasItem;

public class CocktailTest {

    @Test
    public void shouldVerifyStandardCocktail() throws Exception {
        // Given
        Cocktail cocktail = new StandardCocktail();

        // then
        assertThat(cocktail.getPrice(), equalTo(1.0));
        assertThat(cocktail.getIngredients(), hasItem("ice cubes"));
        assertThat(cocktail.getIngredients().size(), equalTo(1));
    }

    @Test
    public void shouldVerifyPinaColada() throws Exception {
        // Given
        Cocktail cocktail = new StandardCocktail();
        cocktail = new DecoratorRum(cocktail);
        cocktail = new DecoratorCoconut(cocktail);
        cocktail = new DecoratorPinapple(cocktail);

        // then
        //every item costs 1.0
        assertThat(cocktail.getPrice(), equalTo(4.0));
        assertThat(cocktail.getIngredients(), hasItem("ice cubes"));
        assertThat(cocktail.getIngredients(), hasItem("rum"));
        assertThat(cocktail.getIngredients(), hasItem("coconut milk"));
        assertThat(cocktail.getIngredients(), hasItem("pineapple juice"));
        assertThat(cocktail.getIngredients().size(), equalTo(4));
    }

    @Test
    public void shouldVerifyTimsWeirdMix() throws Exception {
        // Given
        Cocktail cocktail = new StandardCocktail();
        cocktail = new DecoratorCoconut(cocktail);
        cocktail = new DecoratorStrawberry(cocktail);

        // then
        //every item costs 1.0
        assertThat(cocktail.getPrice(), equalTo(3.0));
        assertThat(cocktail.getIngredients(), hasItem("ice cubes"));
        assertThat(cocktail.getIngredients(), hasItem("coconut milk"));
        assertThat(cocktail.getIngredients(), hasItem("strawberry icecream"));
        assertThat(cocktail.getIngredients().size(), equalTo(3));
    }

}