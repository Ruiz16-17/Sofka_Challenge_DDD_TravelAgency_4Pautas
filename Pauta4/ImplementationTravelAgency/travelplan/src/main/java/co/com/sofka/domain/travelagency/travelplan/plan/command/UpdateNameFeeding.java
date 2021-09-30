package co.com.sofka.domain.travelagency.travelplan.plan.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Name;
import co.com.sofka.domain.travelagency.travelplan.plan.value.FeedingId;
import co.com.sofka.domain.travelagency.travelplan.plan.value.PlanId;

public class UpdateNameFeeding extends Command {

    private final PlanId planId;
    private final FeedingId feedingId;
    private final Name name;

    public UpdateNameFeeding(PlanId planId, FeedingId feedingId, Name name) {
        this.planId = planId;
        this.feedingId = feedingId;
        this.name = name;
    }

    public PlanId getPlanId() {
        return planId;
    }

    public FeedingId getFeedingId() {
        return feedingId;
    }

    public Name getName() {
        return name;
    }
}
