package co.com.sofka.domain.travelagency.travelplan.plan.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Name;
import co.com.sofka.domain.travelagency.travelplan.plan.value.FeedingId;
import co.com.sofka.domain.travelagency.travelplan.plan.value.TimeFeeding;

import java.util.Objects;

public class Feeding extends Entity<FeedingId> {

    private Name name;
    private TimeFeeding timeFeeding;

    public Feeding(FeedingId entityId, Name name, TimeFeeding timeFeeding) {
        super(entityId);
        this.name = name;
        this.timeFeeding = timeFeeding;
    }

    public void updateName(Name name){
        this.name = Objects.requireNonNull(name);
    }

    public void updateTimeFeeding(TimeFeeding timeFeeding){
        this.timeFeeding = Objects.requireNonNull(timeFeeding);
    }

    public Name Name() {
        return name;
    }

    public TimeFeeding TimeFeeding() {
        return timeFeeding;
    }
}
