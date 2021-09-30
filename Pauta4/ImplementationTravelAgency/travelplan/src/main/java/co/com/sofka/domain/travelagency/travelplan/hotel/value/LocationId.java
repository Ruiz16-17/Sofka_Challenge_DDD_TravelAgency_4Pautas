package co.com.sofka.domain.travelagency.travelplan.hotel.value;

import co.com.sofka.domain.generic.Identity;

public class LocationId extends Identity {

    private LocationId(String id) {
        super(id);
    }

    public LocationId() {
    }

    public static LocationId of(String id){
        return new LocationId(id);
    }
}
