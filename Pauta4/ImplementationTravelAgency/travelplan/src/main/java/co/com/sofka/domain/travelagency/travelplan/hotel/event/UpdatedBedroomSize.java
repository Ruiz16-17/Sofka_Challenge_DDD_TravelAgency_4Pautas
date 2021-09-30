package co.com.sofka.domain.travelagency.travelplan.hotel.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.BedroomId;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.SizeBedroom;

public class UpdatedBedroomSize extends DomainEvent {

    private final BedroomId bedroomId;
    private final SizeBedroom sizeBedroom;

    public UpdatedBedroomSize(BedroomId bedroomId, SizeBedroom sizeBedroom) {
        super("travelplan.hotel.updatedadbedroomsize");
        this.bedroomId = bedroomId;
        this.sizeBedroom = sizeBedroom;
    }

    public BedroomId getBedroomId() {
        return bedroomId;
    }

    public SizeBedroom getSizeBedroom() {
        return sizeBedroom;
    }
}
