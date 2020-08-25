import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop stop;
    private Person person1;

    @Before
    public void before() {
        stop = new BusStop("City Centre");
        person1 = new Person();
    }

    @Test
    public void hasName() {
        assertEquals("City Centre", stop.getName());
    }

    @Test
    public void queueStartsEmpty() {
        assertEquals(0, stop.queueLength());
    }

    @Test
    public void addPassengerToQueue() {
        stop.addPassenger(person1);
        assertEquals(1, stop.queueLength());
    }

    @Test
    public void removePassengerFromQueue() {
        stop.addPassenger(person1);
        stop.removePassenger(person1);
        assertEquals(0, stop.queueLength());
    }

}
