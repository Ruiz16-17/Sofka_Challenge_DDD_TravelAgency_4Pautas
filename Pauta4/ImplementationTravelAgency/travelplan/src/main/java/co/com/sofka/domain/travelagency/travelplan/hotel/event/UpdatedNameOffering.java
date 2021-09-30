package co.com.sofka.domain.travelagency.travelplan.hotel.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Name;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.OfferingId;

public class UpdatedNameOffering extends DomainEvent {

    private final OfferingId offeringId;
    private final Name name;

    public UpdatedNameOffering(OfferingId offeringId, Name name) {
        super("travelplan.hotel.updatedname");
        this.offeringId = offeringId;
        this.name = name;
    }

    public OfferingId getOfferingId() {
        return offeringId;
    }

    public Name getName() {
        return name;
    }
}
