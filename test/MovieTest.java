import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

    private Movie testMovie= new Movie("Pokemon", 5);

    @Test
    public void testGetMovie(){
        assertEquals("Pokemon",testMovie.getTitle());
    }

    @Test
    public void testGetPriceCode(){
        assertEquals(5, testMovie.getPriceCode());
    }

}