package co.com.sofka.domain.travelagency.travelplan.plan.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.travelagency.travelplan.plan.value.FlightId;
import co.com.sofka.domain.travelagency.travelplan.plan.value.Weight;

public class UpdatedWeightFlight extends DomainEvent {

    private final FlightId flightId;
    private final Weight weight;

    public UpdatedWeightFlight(FlightId flightId, Weight weight) {
        super("travelplan.plan.updatedweightflight");
        this.flightId = flightId;
        this.weight = weight;
    }
}
