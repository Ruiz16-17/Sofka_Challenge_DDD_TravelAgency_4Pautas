package co.com.sofka.domain.travelagency.travelplan.hotel.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.LocationId;

public class AssignedLocationId extends DomainEvent {

    private final LocationId locationId;

    public AssignedLocationId(LocationId locationId) {
        super("travelplan.hotel.asignedlocationid");
        this.locationId = locationId;
    }

    public LocationId getLocationId() {
        return locationId;
    }
}
