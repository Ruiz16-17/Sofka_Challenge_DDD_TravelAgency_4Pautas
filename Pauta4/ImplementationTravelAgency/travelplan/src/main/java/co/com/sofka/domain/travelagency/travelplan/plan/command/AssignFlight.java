package co.com.sofka.domain.travelagency.travelplan.plan.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.travelagency.travelplan.plan.value.FlightId;
import co.com.sofka.domain.travelagency.travelplan.plan.value.PlanId;

public class AssignFlight extends Command {

    private final PlanId planId;
    private final FlightId flightId;

    public AssignFlight(PlanId planId, FlightId flightId) {
        this.planId = planId;
        this.flightId = flightId;
    }

    public PlanId getPlanId() {
        return planId;
    }

    public FlightId getFlightId() {
        return flightId;
    }
}
