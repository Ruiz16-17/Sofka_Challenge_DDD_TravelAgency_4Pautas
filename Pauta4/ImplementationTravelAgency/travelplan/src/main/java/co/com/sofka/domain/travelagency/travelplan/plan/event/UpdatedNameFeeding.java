package co.com.sofka.domain.travelagency.travelplan.plan.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Name;
import co.com.sofka.domain.travelagency.travelplan.plan.value.FeedingId;

public class UpdatedNameFeeding extends DomainEvent {

    private final FeedingId feedingId;
    private final Name name;

    public UpdatedNameFeeding(FeedingId feedingId, Name name) {
        super("travelplan.plan.updatednamefeeding");
        this.feedingId = feedingId;
        this.name = name;
    }

    public FeedingId getFeedingId() {
        return feedingId;
    }

    public Name getName() {
        return name;
    }
}
