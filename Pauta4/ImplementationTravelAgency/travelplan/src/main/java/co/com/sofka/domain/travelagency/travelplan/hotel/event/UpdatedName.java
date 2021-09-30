package co.com.sofka.domain.travelagency.travelplan.hotel.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Name;

public class UpdatedName extends DomainEvent {

    private final Name name;

    public UpdatedName(Name name) {
        super("travelplan.hotel.updatedname");
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
