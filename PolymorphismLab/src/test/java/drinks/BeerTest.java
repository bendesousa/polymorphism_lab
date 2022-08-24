package drinks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void shouldAddIce(){
        String expected = "Should ice be added to the beer: false.";
        String actual = beer.chill(false);
        assertEquals(expected, actual);
    }

    @Test
    public void haveIntrusiveThought(){
        String expected = "Should ice be added to the beer: false. But why shouldn't I?";
        String actual = beer.chill(false, " But why shouldn't I?");
        assertEquals(expected, actual);
    }
}
