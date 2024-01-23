package fun.turbstructor.workshop.operator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdderTest {
    @Test
    void AdderWorksWell()
    {
        assertEquals(Adder.add(100, 200), (100 + 200));
    }
}
