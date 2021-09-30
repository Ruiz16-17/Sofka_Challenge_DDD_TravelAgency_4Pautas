package co.com.sofka.domain.travelagency.travelplan.plan.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.travelagency.travelplan.plan.value.NumberPeople;

public class UpdatedNumberPeople extends DomainEvent {

    private final NumberPeople numberPeople;

    public UpdatedNumberPeople(NumberPeople numberPeople) {
        super("travelplan.plan.updatednumberpeople");
        this.numberPeople = numberPeople;
    }

    public NumberPeople getNumberPeople() {
        return numberPeople;
    }
}
