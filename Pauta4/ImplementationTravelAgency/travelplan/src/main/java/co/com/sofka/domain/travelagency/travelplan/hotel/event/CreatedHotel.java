package co.com.sofka.domain.travelagency.travelplan.hotel.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Description;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Name;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.Star;

public class CreatedHotel extends DomainEvent {

    private final Name name;
    private final Star star;
    private final Description description;

    public CreatedHotel(Name name, Star star, Description description) {
        super("travelplan.hotel.createdhotel");
        this.name = name;
        this.star = star;
        this.description = description;
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
