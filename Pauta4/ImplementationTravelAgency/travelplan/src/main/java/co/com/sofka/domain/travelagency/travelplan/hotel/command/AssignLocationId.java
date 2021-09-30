package co.com.sofka.domain.travelagency.travelplan.hotel.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.HotelId;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.LocationId;

public class AssignLocationId extends Command {

    private final HotelId hotelId;
    private final LocationId locationId;

    public AssignLocationId(HotelId hotelId, LocationId locationId) {
        this.hotelId = hotelId;
        this.locationId = locationId;
    }

    public HotelId getHotelId() {
        return hotelId;
    }

    public LocationId getLocationId() {
        return locationId;
    }
}
