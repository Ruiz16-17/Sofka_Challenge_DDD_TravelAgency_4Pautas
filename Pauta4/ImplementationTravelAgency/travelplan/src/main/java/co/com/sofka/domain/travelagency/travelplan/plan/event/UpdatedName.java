package co.com.sofka.domain.travelagency.travelplan.plan.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Name;

public class UpdatedName extends DomainEvent {
    private final Name name;

    public UpdatedName(Name name) {
        super("travelplan.plan.updatedname");
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
