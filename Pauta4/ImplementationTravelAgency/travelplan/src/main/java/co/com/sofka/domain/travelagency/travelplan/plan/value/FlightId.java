package co.com.sofka.domain.travelagency.travelplan.plan.value;

import co.com.sofka.domain.generic.Identity;

public class FlightId extends Identity {

    public FlightId() {
    }

    private FlightId(String id) {
        super(id);
    }

    public static FlightId of(String id) {
        return new FlightId(id);
    }
}
