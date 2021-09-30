package co.com.sofka.domain.travelagency.travelplan.hotel.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.HotelId;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.LocationId;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.PostalCodeLocation;

public class UpdatePostalCodeLocation extends Command {

    private final HotelId hotelId;private final LocationId locationId;
    private final PostalCodeLocation postalCodeLocation;

    public UpdatePostalCodeLocation(HotelId hotelId, LocationId locationId, PostalCodeLocation postalCodeLocation) {
        this.hotelId = hotelId;
        this.locationId = locationId;
        this.postalCodeLocation = postalCodeLocation;
    }

    public HotelId getHotelId() {
        return hotelId;
    }

    public LocationId getLocationId() {
        return locationId;
    }

    public PostalCodeLocation getPostalCodeLocation() {
        return postalCodeLocation;
    }
}
