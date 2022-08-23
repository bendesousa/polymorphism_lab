package drinks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BeerTest {

    private Beer beer;

    @BeforeEach
    public void setUp(){
        beer = new Beer("Fosters", true, "tall");
    }

    @Test
    public void canRequestId(){
        String expected = "Can I see your ID?";
        String actual = beer.requireId();
        assertEquals(expected, actual);
    }

    @Test
    public void canOfferStraw(){
        String expected = "Would you like a straw?";
        String actual = beer.offerStraw();
        assertEquals(expected, actual);
    }

    @Test
    public void canOfferReplacement(){
        String expected = "Let me get you another.";
        String actual = beer.offerReplacement();
        assertEquals(expected, actual);
    }
}
