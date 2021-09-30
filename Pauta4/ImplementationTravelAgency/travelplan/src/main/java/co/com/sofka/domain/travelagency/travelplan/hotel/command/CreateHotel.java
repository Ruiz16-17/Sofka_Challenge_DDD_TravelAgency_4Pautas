package co.com.sofka.domain.travelagency.travelplan.hotel.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Description;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Name;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.HotelId;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.Star;

public class CreateHotel extends Command {

    private final HotelId hotelId;
    private final Name name;
    private final Star star;
    private final Description description;

    public CreateHotel(HotelId hotelId, Name name, Star star, Description description) {
        this.hotelId = hotelId;
        this.name = name;
        this.star = star;
        this.description = description;
    }

    public HotelId getHotelId() {
        return hotelId;
    }

    public Name getName() {
        return name;
    }

    public Star getStar() {
        return star;
    }

    public Description getDescription() {
        return description;
    }
}
