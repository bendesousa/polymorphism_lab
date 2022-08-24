package drinks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JuiceTest {

    private Juice juice;

    @BeforeEach
    public void setUp(){
        juice = new Juice("Locally Sourced", false, "tall");
    }

    @Test
    public void willNotRequestId(){
        String expected = "Enjoy your drink!";
        String actual = juice.requireId();
        assertEquals(expected, actual);
    }

    @Test
    public void canOfferStraw(){
        String expected = "Would you like a straw?";
        String actual = juice.offerStraw();
        assertEquals(expected, actual);
    }

    @Test
    public void appleOrOrangeTest(){
        String expected = "Would you like apple or orange juice?";
        String actual = juice.appleOrOrange();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAddIce(){
        String expected = "Should ice be added to the juice: true.";
        String actual = juice.chill(true);
        assertEquals(expected, actual);
    }

}
