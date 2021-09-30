package co.com.sofka.domain.travelagency.travelplan.plan.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Name;
import co.com.sofka.domain.travelagency.travelplan.plan.value.FeedingId;
import co.com.sofka.domain.travelagency.travelplan.plan.value.TimeFeeding;

public class AddedFeeding extends DomainEvent {

    private final FeedingId feedingId;
    private final Name name;
    private final TimeFeeding timeFeeding;

    public AddedFeeding(FeedingId feedingId, Name name, TimeFeeding timeFeeding) {
        super("travelplan.plan.addedfeeding");
        this.feedingId = feedingId;
        this.name = name;
        this.timeFeeding = timeFeeding;
    }

    public FeedingId getFeedingId() {
        return feedingId;
    }

    public Name getName() {
        return name;
    }

    public TimeFeeding getTimeFeeding() {
        return timeFeeding;
    }
}
