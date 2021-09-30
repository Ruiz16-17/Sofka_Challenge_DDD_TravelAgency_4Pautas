package co.com.sofka.domain.travelagency.travelplan.plan.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Name;
import co.com.sofka.domain.travelagency.travelplan.plan.value.RecreationId;

public class UpdatedNameRecreation extends DomainEvent {

    private final RecreationId recreationId;
    private final Name name;

    public UpdatedNameRecreation(RecreationId recreationId, Name name) {
        super("travelplan.plan.updatednamerecreation");
        this.recreationId = recreationId;
        this.name = name;
    }

    public RecreationId getRecreationId() {
        return recreationId;
    }

    public Name getName() {
        return name;
    }
}
