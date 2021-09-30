package co.com.sofka.domain.travelagency.travelplan.plan.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.travelagency.travelplan.plan.value.FeedingId;
import co.com.sofka.domain.travelagency.travelplan.plan.value.TimeFeeding;

public class UpdatedTimeFeeding extends DomainEvent {

    private final FeedingId feedingId;
    private final TimeFeeding timeFeeding;

    public UpdatedTimeFeeding(FeedingId feedingId, TimeFeeding timeFeeding) {
        super("travelplan.plan.updatedtimefeeding");
        this.feedingId = feedingId;
        this.timeFeeding = timeFeeding;
    }

    public FeedingId getFeedingId() {
        return feedingId;
    }

    public TimeFeeding getTimeFeeding() {
        return timeFeeding;
    }
}
