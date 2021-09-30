package co.com.sofka.domain.travelagency.travelplan.hotel.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.LocationId;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.PostalCodeLocation;

public class UpdatedPostalCodeLocation extends DomainEvent {

    private final LocationId locationId;
    private final PostalCodeLocation postalCodeLocation;

    public UpdatedPostalCodeLocation(LocationId locationId, PostalCodeLocation postalCodeLocation) {
        super("travelplan.hotel.updatedpostalcodelocation");
        this.locationId = locationId;
        this.postalCodeLocation = postalCodeLocation;
    }

    public LocationId getLocationId() {
        return locationId;
    }

    public PostalCodeLocation getPostalCodeLocation() {
        return postalCodeLocation;
    }
}
