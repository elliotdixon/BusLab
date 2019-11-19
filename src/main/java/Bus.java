import java.util.ArrayList;

public class Bus {

    private ArrayList<Passengers> passengers;
    private Integer capacity;


    public Bus(int capacity) {
        this.passengers = new ArrayList<Passengers>();
        this.capacity = capacity;



    }

    public int passengerCount() {
        return this.passengers.size();

    }

    public void addPassenger(Passengers passengers) {
        this.passengers.add(passengers);
    }

    public void addPassengerIfSpace(Passengers passengers) {

        if( this.passengers.size() < this.capacity )
            this.passengers.add(passengers);

    }
    public void removePassengers() {
         this.passengers.remove(0);
    }

}


