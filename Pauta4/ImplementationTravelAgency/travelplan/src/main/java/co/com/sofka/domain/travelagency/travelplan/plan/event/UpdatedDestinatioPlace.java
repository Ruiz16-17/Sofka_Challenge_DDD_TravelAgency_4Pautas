package co.com.sofka.domain.travelagency.travelplan.plan.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.travelagency.travelplan.plan.value.DestinationPlace;

public class UpdatedDestinatioPlace extends DomainEvent {

    private final DestinationPlace destinationPlace;

    public UpdatedDestinatioPlace(DestinationPlace destinationPlace) {
        super("travelplan.plan.updateddestinationplace");
        this.destinationPlace = destinationPlace;
    }

    public DestinationPlace getDestinationPlace() {
        return destinationPlace;
    }
}
