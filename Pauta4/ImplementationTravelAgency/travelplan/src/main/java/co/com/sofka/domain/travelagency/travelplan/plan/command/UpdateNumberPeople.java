package co.com.sofka.domain.travelagency.travelplan.plan.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.travelagency.travelplan.plan.value.NumberPeople;
import co.com.sofka.domain.travelagency.travelplan.plan.value.PlanId;

public class UpdateNumberPeople extends Command {

    private final PlanId planId;
    private final NumberPeople numberPeople;

    public UpdateNumberPeople(PlanId planId, NumberPeople numberPeople) {
        this.planId = planId;
        this.numberPeople = numberPeople;
    }

    public PlanId getPlanId() {
        return planId;
    }

    public NumberPeople getNumberPeople() {
        return numberPeople;
    }
}
