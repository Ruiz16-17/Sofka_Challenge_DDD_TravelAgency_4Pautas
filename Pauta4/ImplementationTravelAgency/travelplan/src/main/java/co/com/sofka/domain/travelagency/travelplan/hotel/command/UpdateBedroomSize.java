package co.com.sofka.domain.travelagency.travelplan.hotel.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.BedroomId;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.HotelId;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.SizeBedroom;

public class UpdateBedroomSize extends Command {

    private final HotelId hotelId;
    private final BedroomId bedroomId;
    private final SizeBedroom sizeBedroom;

    public UpdateBedroomSize(HotelId hotelId, BedroomId bedroomId, SizeBedroom sizeBedroom) {
        this.hotelId = hotelId;
        this.bedroomId = bedroomId;
        this.sizeBedroom = sizeBedroom;
    }

    public HotelId getHotelId() {
        return hotelId;
    }

    public BedroomId getBedroomId() {
        return bedroomId;
    }

    public SizeBedroom getSizeBedroom() {
        return sizeBedroom;
    }
}
