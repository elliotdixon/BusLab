import org.junit.Before;
import org.junit.Test;




import static org.junit.Assert.assertEquals;


public class BusTest {

    private Bus bus;
    private Passengers passengers;


    @Before
    public void before(){
        bus = new Bus(5);
        passengers = new Passengers();


    }

    @Test
    public void busStartsEmpty() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger() {
        bus.addPassenger(passengers);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canAddPassengerIfSpace() {
        bus.addPassengerIfSpace(passengers);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(passengers);
        bus.addPassenger(passengers);
        bus.removePassengers();
        assertEquals(1, bus.passengerCount());
    }

}

