package co.com.sofka.domain.travelagency.travelplan.plan.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.travelagency.travelplan.plan.value.FlightId;

public class AssignedFlight extends DomainEvent {

    private final FlightId flightId;

    public AssignedFlight(FlightId flightId) {
        super("travelplan.plan.assignedFlight");
        this.flightId = flightId;
    }

    public FlightId getFlightId() {
        return flightId;
    }
}
