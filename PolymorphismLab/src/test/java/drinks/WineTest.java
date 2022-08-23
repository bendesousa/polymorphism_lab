package drinks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WineTest {

    private Wine wine;

    @BeforeEach
    public void setUp(){
        wine = new Wine ("House Wine", true, "short");
    }

    @Test
    public void canRequestId(){
        String expected = "Can I see your ID?";
        String actual = wine.requireId();
        assertEquals(expected, actual);
    }

    @Test
    public void willNotOfferStraw(){
        String expected = "Enjoy your drink!";
        String actual = wine.offerStraw();
        assertEquals(expected, actual);
    }

    @Test
    public void redOrWhiteTest(){
        String expected = "Would you like red or white?";
        String actual = wine.redOrWhite();
        assertEquals(expected, actual);
    }


}
