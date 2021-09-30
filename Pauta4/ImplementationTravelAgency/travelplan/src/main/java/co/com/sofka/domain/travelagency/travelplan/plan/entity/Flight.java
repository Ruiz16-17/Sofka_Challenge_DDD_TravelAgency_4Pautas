package co.com.sofka.domain.travelagency.travelplan.plan.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.travelagency.travelplan.plan.value.AirlineId;
import co.com.sofka.domain.travelagency.travelplan.plan.value.FlightId;
import co.com.sofka.domain.travelagency.travelplan.plan.value.Weight;

import java.util.Objects;

public class Flight extends Entity<FlightId> {

    private AirlineId airlineId;
    private Weight weight;

    public Flight(FlightId entityId, AirlineId airlineId, Weight weight) {
        super(entityId);
        this.airlineId = airlineId;
        this.weight = weight;
    }

    public void assignAirlineId(AirlineId airlineId){
        this.airlineId = Objects.requireNonNull(airlineId);
    }

    public void updateWeight(Weight weight){
        this.weight = Objects.requireNonNull(weight);
    }

    public AirlineId AirlineId() {
        return airlineId;
    }

    public Weight Weight() {
        return weight;
    }
}
