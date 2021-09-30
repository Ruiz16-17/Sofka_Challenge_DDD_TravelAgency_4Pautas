package co.com.sofka.domain.travelagency.travelplan.hotel.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Name;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.HotelId;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.OfferingId;

public class UpdateNameOffering extends Command {

    private final HotelId hotelId;
    private final OfferingId offeringId;
    private final Name name;

    public UpdateNameOffering(HotelId hotelId, OfferingId offeringId, Name name) {
        this.hotelId = hotelId;
        this.offeringId = offeringId;
        this.name = name;
    }

    public HotelId getHotelId() {
        return hotelId;
    }

    public OfferingId getOfferingId() {
        return offeringId;
    }

    public Name getName() {
        return name;
    }
}
