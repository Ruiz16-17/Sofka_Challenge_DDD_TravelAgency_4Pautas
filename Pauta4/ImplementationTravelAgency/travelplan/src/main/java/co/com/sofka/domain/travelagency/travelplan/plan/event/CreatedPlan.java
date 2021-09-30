package co.com.sofka.domain.travelagency.travelplan.plan.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Description;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Name;
import co.com.sofka.domain.travelagency.travelplan.plan.entity.Feeding;
import co.com.sofka.domain.travelagency.travelplan.plan.entity.Recreation;
import co.com.sofka.domain.travelagency.travelplan.plan.value.*;

import java.util.Set;

public class CreatedPlan extends DomainEvent {

    protected Name name;
    protected Description description;
    protected DestinationPlace destinationPlace;
    protected Price price;
    protected NumberPeople numberPeople;
    protected NumberDay numberDay;

    public CreatedPlan(Name name, Description description, DestinationPlace destinationPlace, Price price, NumberPeople numberPeople, NumberDay numberDay) {
        super("travelplan.plan.createdplan");
        this.name = name;
        this.description = description;
        this.destinationPlace = destinationPlace;
        this.price = price;
        this.numberPeople = numberPeople;
        this.numberDay = numberDay;
    }

    public Name getName() {
        return name;
    }

    public Description getDescription() {
        return description;
    }

    public DestinationPlace getDestinationPlace() {
        return destinationPlace;
    }

    public Price getPrice() {
        return price;
    }

    public NumberPeople getNumberPeople() {
        return numberPeople;
    }

    public NumberDay getNumberDay() {
        return numberDay;
    }
}
