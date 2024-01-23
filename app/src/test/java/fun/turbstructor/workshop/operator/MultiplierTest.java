package fun.turbstructor.workshop.operator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplierTest {
    @Test
    void MultiplierWorksWell()
    {
        assertEquals(Multiplier.multiply(50, 20), (50 * 20));
    }
}
