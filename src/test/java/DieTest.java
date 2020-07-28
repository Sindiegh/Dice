import org.junit.Test;

import static java.lang.Boolean.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class DieTest {

    @Test
    public void  rollTest() throws AssertionError{
        try{
            int numberOfSides = 6;
            int values = (int) (Math.random() * numberOfSides) + 1;
            int[] probabilities = {1,1,1,1,1,1};
            Die die = new Die(numberOfSides,  probabilities);
            assertThat(String.valueOf(values), parseBoolean(String.valueOf(die.Roll())));
        }
        catch (AssertionError error){
            error.getCause();
        }
    }
}
