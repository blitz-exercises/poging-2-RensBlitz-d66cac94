package nl.learninablitz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;

public class OddNumberFilterTest {

    @Test
    public void testFilterOddNumbers_allOdd_expectedEmpty() {
        OddNumberFilter onf = new OddNumberFilter();
        assertTrue(onf.filterOddNumbers(Arrays.asList(1, 3, 5)).isEmpty());
    }

    @Test
    public void testFilterOddNumbers_allEven_expectedSame() {
        OddNumberFilter onf = new OddNumberFilter();
        assertEquals(Arrays.asList(2, 4, 6), onf.filterOddNumbers(Arrays.asList(2, 4, 6)));
    }

    @Test
    public void testFilterOddNumbers_mixedInput_expectedEven() {
        OddNumberFilter onf = new OddNumberFilter();
        assertEquals(Arrays.asList(2, 4), onf.filterOddNumbers(Arrays.asList(1, 2, 3, 4, 5)));
    }

    @Test
    public void testFilterOddNumbers_emptyInput_expectedEmpty() {
        OddNumberFilter onf = new OddNumberFilter();
        assertTrue(onf.filterOddNumbers(Collections.emptyList()).isEmpty());
    }
}