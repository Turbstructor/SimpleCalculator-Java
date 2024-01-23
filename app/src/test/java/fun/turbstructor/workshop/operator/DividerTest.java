package fun.turbstructor.workshop.operator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DividerTest {
    @Test
    void DividerWorksWell()
    {
        assertEquals(Divider.divide(50, 2), (50 / 2));
    }

    @Test
    void DividerDoesNotThrowException()
    {
        int result = assertDoesNotThrow(() -> { return Divider.divide(10, 0); });
        assertEquals(result, 0);
    }
}
