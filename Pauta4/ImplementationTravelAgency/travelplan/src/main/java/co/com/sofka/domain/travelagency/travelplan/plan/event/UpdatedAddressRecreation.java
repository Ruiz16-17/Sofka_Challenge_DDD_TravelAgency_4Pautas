package co.com.sofka.domain.travelagency.travelplan.plan.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Address;
import co.com.sofka.domain.travelagency.travelplan.plan.value.RecreationId;

public class UpdatedAddressRecreation extends DomainEvent {

    private final RecreationId recreationId;
    private final Address address;

    public UpdatedAddressRecreation(RecreationId recreationId, Address address) {
        super("travelplan.plan.updatedrecreation");
        this.recreationId = recreationId;
        this.address = address;
    }

    public RecreationId getRecreationId() {
        return recreationId;
    }

    public Address getAddress() {
        return address;
    }
}
