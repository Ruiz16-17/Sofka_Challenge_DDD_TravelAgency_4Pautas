package co.com.sofka.domain.travelagency.travelplan.hotel.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Name;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.BedroomId;

public class UpdatedNumberBedBedroom extends DomainEvent {

    private final BedroomId bedroomId;
    private final Name name;

    public UpdatedNumberBedBedroom(BedroomId bedroomId, Name name) {
        super("travelplan.hotel.updatednumberbedbedroom");
        this.bedroomId = bedroomId;
        this.name = name;
    }

    public BedroomId getBedroomId() {
        return bedroomId;
    }

    public Name getName() {
        return name;
    }
}
