import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person1;

    @Before
    public void before() {
        bus = new Bus("Leith", 50);
        person1 = new Person();
    }

    @Test
    public void hasDestination() {
        assertEquals("Leith", bus.getDestination());
    }

    @Test
    public void hasCapacity() {
        assertEquals(50, bus.getCapacity());
    }

    @Test
    public void totalPassengers() {
        assertEquals(0, bus.getNumberOfPassengers());
    }

    @Test
    public void canAddPassenger() {
        bus.addPassenger(person1);
        assertEquals(1, bus.getNumberOfPassengers());
    }

    @Test
    public void cannotAddPassenger() {
        Bus smolBus = new Bus("nowhere", 0);
        smolBus.addPassenger(person1);
        assertEquals(0, smolBus.getNumberOfPassengers());
    }

    @Test
    public void canRemovePassenger() {
        bus.addPassenger(person1);
        bus.removePassenger(person1);
        assertEquals(0, bus.getNumberOfPassengers());
    }
}
