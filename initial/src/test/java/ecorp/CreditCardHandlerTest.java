package ecorp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CreditCardHandlerTest {

    @Test
    public void calculatefakeCards_forDay6() {
        int cards = CreditCardHandler.calculatefakeCards(6);
        assertEquals(4320, cards);
    }
}
