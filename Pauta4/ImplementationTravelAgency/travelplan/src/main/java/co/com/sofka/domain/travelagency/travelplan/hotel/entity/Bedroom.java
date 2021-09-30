package co.com.sofka.domain.travelagency.travelplan.hotel.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Description;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Name;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.BedroomId;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.NumberBedBedroom;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.SizeBedroom;

import java.util.Objects;

public class Bedroom extends Entity<BedroomId> {

    private Name name;
    private Description description;
    private NumberBedBedroom numberBedBedroom;
    private SizeBedroom sizeBedroom;

    public Bedroom(BedroomId entityId, Name name, Description description, NumberBedBedroom numberBedBedroom, SizeBedroom sizeBedroom) {
        super(entityId);
        this.name = name;
        this.description = description;
        this.numberBedBedroom = numberBedBedroom;
        this.sizeBedroom = sizeBedroom;
    }

    public void updateName(Name name) {
        this.name = Objects.requireNonNull(name);
    }

    public void updateDescription(Description description) {
        this.description = Objects.requireNonNull(description);
    }

    public void updateNumberBedBedroom(NumberBedBedroom numberBedBedroom) {
        this.numberBedBedroom = Objects.requireNonNull(numberBedBedroom);
    }

    public void updateSizeBedroom(SizeBedroom sizeBedroom) {
        this.sizeBedroom = Objects.requireNonNull(sizeBedroom);
    }

    public Name Name() {
        return name;
    }
    public Description Description() {
        return description;
    }
    public NumberBedBedroom NumberBedBedroom() {
        return numberBedBedroom;
    }
    public SizeBedroom SizeBedroom() {
        return sizeBedroom;
    }
}
