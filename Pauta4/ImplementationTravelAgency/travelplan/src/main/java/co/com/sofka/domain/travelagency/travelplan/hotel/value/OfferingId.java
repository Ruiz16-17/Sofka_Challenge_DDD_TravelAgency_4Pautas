package co.com.sofka.domain.travelagency.travelplan.hotel.value;

import co.com.sofka.domain.generic.Identity;

public class OfferingId extends Identity {

    private OfferingId(String id) {
        super(id);
    }

    public OfferingId() {
    }

    public static OfferingId of(String id){
        return new OfferingId(id);
    }
}
