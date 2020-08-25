import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;

    @Before
    public void before() {
        bus = new Bus("Leith", 50);
    }

    @Test
    public void hasDestination() {
        assertEquals("Leith", bus.getDestination());
    }

    @Test
    public void hasCapacity() {
        assertEquals(50, bus.getCapacity());
    }
}
