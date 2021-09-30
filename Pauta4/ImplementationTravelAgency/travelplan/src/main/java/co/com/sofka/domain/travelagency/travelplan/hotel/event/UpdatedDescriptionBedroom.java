package co.com.sofka.domain.travelagency.travelplan.hotel.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Description;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.BedroomId;

public class UpdatedDescriptionBedroom extends DomainEvent {

    private final BedroomId bedroomId;
    private final Description description;

    public UpdatedDescriptionBedroom(BedroomId bedroomId, Description description) {
        super("travelplan.hotel.updateddescriptionbedroom");
        this.bedroomId = bedroomId;
        this.description = description;
    }

    public BedroomId getBedroomId() {
        return bedroomId;
    }

    public Description getDescription() {
        return description;
    }
}
