package fun.turbstructor.workshop.operator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SubtractorTest {
    @Test
    void SubtractorWorksWell()
    {
        assertEquals(Subtractor.subtract(300, 200), (300 - 200));
    }
}
