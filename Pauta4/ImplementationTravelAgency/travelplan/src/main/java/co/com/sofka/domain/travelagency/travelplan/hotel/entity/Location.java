package co.com.sofka.domain.travelagency.travelplan.hotel.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Address;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.CityLocation;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.LocationId;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.PostalCodeLocation;

import java.util.Objects;

public class Location extends Entity<LocationId> {

    private PostalCodeLocation postalCodeLocation;
    private CityLocation cityLocation;
    private Address address;

    public Location(LocationId entityId, PostalCodeLocation postalCodeLocation, CityLocation cityLocation, Address address) {
        super(entityId);
        this.postalCodeLocation = postalCodeLocation;
        this.cityLocation = cityLocation;
        this.address = address;
    }

    public void updatePostalCodeLocation(PostalCodeLocation postalCodeLocation) {
        this.postalCodeLocation = Objects.requireNonNull(postalCodeLocation);
    }

    public void updateCityLocation(CityLocation cityLocation) {
        this.cityLocation = Objects.requireNonNull(cityLocation);
    }

    public void updateAddress(Address address) {
        this.address = Objects.requireNonNull(address);
    }

    public PostalCodeLocation PostalCodeLocation() {
        return postalCodeLocation;
    }

    public CityLocation CityLocation() {
        return cityLocation;
    }

    public Address Address() {
        return address;
    }

}
