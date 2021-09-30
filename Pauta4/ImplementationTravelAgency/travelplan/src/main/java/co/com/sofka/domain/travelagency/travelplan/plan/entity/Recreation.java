package co.com.sofka.domain.travelagency.travelplan.plan.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Address;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Description;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Name;
import co.com.sofka.domain.travelagency.travelplan.plan.value.RecreationId;

import java.util.Objects;

public class Recreation extends Entity<RecreationId> {

    private Name name;
    private Description description;
    private Address address;

    public Recreation(RecreationId entityId, Name name, Description description, Address address) {
        super(entityId);
        this.name = name;
        this.description = description;
        this.address = address;
    }

    public void updateName(Name name) {
        this.name = Objects.requireNonNull(name);
    }

    public void updateDescription(Description description) {
        this.description = Objects.requireNonNull(description);
    }

    public void updateAddress(Address address) {
        this.address = Objects.requireNonNull(address);
    }

    public Name Name() {
        return name;
    }

    public Description Description() {
        return description;
    }

    public Address Address() {
        return address;
    }
}
