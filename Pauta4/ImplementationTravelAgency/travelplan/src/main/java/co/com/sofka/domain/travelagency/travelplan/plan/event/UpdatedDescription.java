package co.com.sofka.domain.travelagency.travelplan.plan.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Description;

public class UpdatedDescription extends DomainEvent {

    private final Description description;

    public UpdatedDescription(Description description) {
        super("travelplan.plan.updateddescription");
        this.description = description;
    }

    public Description getDescription() {
        return description;
    }
}
