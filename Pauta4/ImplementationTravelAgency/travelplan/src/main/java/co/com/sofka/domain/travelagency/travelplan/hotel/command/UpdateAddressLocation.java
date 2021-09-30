package co.com.sofka.domain.travelagency.travelplan.hotel.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Address;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.HotelId;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.LocationId;

public class UpdateAddressLocation extends Command {

    private final HotelId hotelId;
    private final LocationId locationId;
    private final Address address;

    public UpdateAddressLocation(HotelId hotelId, LocationId locationId, Address address) {
        this.hotelId = hotelId;
        this.locationId = locationId;
        this.address = address;
    }

    public HotelId getHotelId() {
        return hotelId;
    }

    public LocationId getLocationId() {
        return locationId;
    }

    public Address getAddress() {
        return address;
    }
}
