package co.com.sofka.domain.travelagency.travelplan.plan.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.travelagency.travelplan.plan.value.HotelId;

public class AssignedHotel extends DomainEvent {
    private final HotelId hotelId;

    public AssignedHotel(HotelId hotelId) {
        super("travelplan.plan.assignedhotel");
        this.hotelId = hotelId;
    }

    public HotelId getHotelId() {
        return hotelId;
    }
}
