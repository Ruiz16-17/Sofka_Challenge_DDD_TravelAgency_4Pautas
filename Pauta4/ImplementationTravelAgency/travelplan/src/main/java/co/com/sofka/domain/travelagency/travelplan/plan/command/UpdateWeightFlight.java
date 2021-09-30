package co.com.sofka.domain.travelagency.travelplan.plan.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.travelagency.travelplan.plan.value.FlightId;
import co.com.sofka.domain.travelagency.travelplan.plan.value.PlanId;
import co.com.sofka.domain.travelagency.travelplan.plan.value.Weight;

public class UpdateWeightFlight extends Command {

    private final PlanId planId;
    private final FlightId flightId;
    private final Weight weight;

    public UpdateWeightFlight(PlanId planId, FlightId flightId, Weight weight) {
        this.planId = planId;
        this.flightId = flightId;
        this.weight = weight;
    }

    public PlanId getPlanId() {
        return planId;
    }

    public FlightId getFlightId() {
        return flightId;
    }

    public Weight getWeight() {
        return weight;
    }
}
