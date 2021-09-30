package co.com.sofka.domain.travelagency.travelplan.plan.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Address;
import co.com.sofka.domain.travelagency.travelplan.plan.value.PlanId;
import co.com.sofka.domain.travelagency.travelplan.plan.value.RecreationId;

public class UpdateAddressRecreation extends Command {

    private final PlanId planId;
    private final RecreationId recreationId;
    private final Address address;

    public UpdateAddressRecreation(PlanId planId, RecreationId recreationId, Address address) {
        this.planId = planId;
        this.recreationId = recreationId;
        this.address = address;
    }

    public PlanId getPlanId() {
        return planId;
    }

    public RecreationId getRecreationId() {
        return recreationId;
    }

    public Address getAddress() {
        return address;
    }
}
