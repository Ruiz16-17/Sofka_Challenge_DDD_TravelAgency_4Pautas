package co.com.sofka.domain.travelagency.travelplan.plan.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.travelagency.travelplan.plan.value.RecreationId;

public class AssignedRecreation extends DomainEvent {

    private final RecreationId recreationId;

    public AssignedRecreation(RecreationId recreationId) {
        super("travelplan.plan.assignedrecreation");
        this.recreationId = recreationId;
    }

    public RecreationId getRecreationId() {
        return recreationId;
    }
}
