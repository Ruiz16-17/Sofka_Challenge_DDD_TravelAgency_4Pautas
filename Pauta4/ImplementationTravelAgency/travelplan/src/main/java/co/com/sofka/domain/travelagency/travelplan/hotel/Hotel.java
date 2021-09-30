package co.com.sofka.domain.travelagency.travelplan.hotel;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Description;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Name;
import co.com.sofka.domain.travelagency.travelplan.hotel.entity.Bedroom;
import co.com.sofka.domain.travelagency.travelplan.hotel.entity.Offering;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.LocationId;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.Star;
import co.com.sofka.domain.travelagency.travelplan.plan.value.HotelId;

import java.util.List;
import java.util.Set;

public class Hotel extends AggregateEvent<HotelId> {

    protected HotelId hotelId;
    protected LocationId locationId;
    protected Set<Bedroom> bedroomSet;
    protected Set<Offering> offeringSet;
    protected Name name;
    protected Star star;
    protected Description description;

    //region Builders

    public Hotel(HotelId entityId, Name name, Star star, Description description) {
        super(entityId);
        this.name = name;
        this.star = star;
        this.description = description;
    }

    private Hotel(HotelId entityId){
        super(entityId);
        subscribe(new HotelChange(this));
    }

    public static Hotel from(HotelId hotelId, List<DomainEvent> events){
        var hotel = new Hotel(hotelId);
        events.forEach(hotel::applyEvent);
        return hotel;
    }

    //endregion

}
