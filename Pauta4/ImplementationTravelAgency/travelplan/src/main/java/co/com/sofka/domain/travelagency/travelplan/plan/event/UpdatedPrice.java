package co.com.sofka.domain.travelagency.travelplan.plan.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.travelagency.travelplan.plan.value.Price;

public class UpdatedPrice extends DomainEvent {

    private final Price price;

    public UpdatedPrice(Price price) {
        super("travelplan.plan.updatedprice");
        this.price = price;
    }

    public Price getPrice() {
        return price;
    }
}
