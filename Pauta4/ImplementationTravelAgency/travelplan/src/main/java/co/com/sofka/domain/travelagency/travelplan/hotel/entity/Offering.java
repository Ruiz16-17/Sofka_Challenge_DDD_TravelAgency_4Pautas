package co.com.sofka.domain.travelagency.travelplan.hotel.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Description;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Name;
import co.com.sofka.domain.travelagency.travelplan.hotel.value.OfferingId;

import java.util.Objects;

public class Offering extends Entity<OfferingId> {

    private Name name;
    private Description description;

    public Offering(OfferingId entityId, Name name, Description description) {
        super(entityId);
        this.name = name;
        this.description = description;
    }

    public Name Name() {
        return name;
    }

    public void updateName(Name name) {
        this.name = Objects.requireNonNull(name);
    }

    public Description Description() {
        return description;
    }

    public void updateDescription(Description description) {
        this.description = Objects.requireNonNull(description);
    }
}
