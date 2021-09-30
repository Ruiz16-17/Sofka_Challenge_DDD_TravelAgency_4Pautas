package co.com.sofka.domain.travelagency.travelplan.plan.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.travelagency.travelplan.plan.value.HotelId;
import co.com.sofka.domain.travelagency.travelplan.plan.value.PlanId;

public class AssignHotel extends Command {

    private final PlanId planId;
    private final HotelId hotelId;

    public AssignHotel(PlanId planId, HotelId hotelId) {
        this.planId = planId;
        this.hotelId = hotelId;
    }

    public PlanId getPlanId() {
        return planId;
    }

    public HotelId getHotelId() {
        return hotelId;
    }
}
