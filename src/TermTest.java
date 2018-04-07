
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TermTest {

    @Test
    public void test() {
        Term term = new Term(88, 11);
        assertEquals(term.getCoefficient(), 88);
        assertEquals(term.getExponent(), 11);
        System.out.println("Pass all tests! ");
    }
}
