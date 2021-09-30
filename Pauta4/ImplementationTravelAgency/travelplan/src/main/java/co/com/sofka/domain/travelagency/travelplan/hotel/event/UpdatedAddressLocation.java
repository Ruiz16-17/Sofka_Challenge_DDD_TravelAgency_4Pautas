package co.com.sofka.domain.travelagency.travelplan.hotel.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Address;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.LocationId;

public class UpdatedAddressLocation extends DomainEvent {

    private final LocationId locationId;
    private final Address address;

    public UpdatedAddressLocation(LocationId locationId, Address address) {
        super("travelplan.hotel.updatedaddreslocation");
        this.locationId = locationId;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public LocationId getLocationId() {
        return locationId;
    }
}
