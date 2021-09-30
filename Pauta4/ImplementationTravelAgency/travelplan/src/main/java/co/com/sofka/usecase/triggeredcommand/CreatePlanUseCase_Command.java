package co.com.sofka.usecase.triggeredcommand;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.travelagency.travelplan.plan.Plan;
import co.com.sofka.domain.travelagency.travelplan.plan.command.CreatePlan;
import co.com.sofka.domain.travelagency.travelplan.plan.value.Price;

public class CreatePlanUseCase_Command extends UseCase<RequestCommand<CreatePlan>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CreatePlan> createPlanRequestCommand) {
        var command = createPlanRequestCommand.getCommand();
        Plan plan;

        if(command.getPrice().value() < 300000.0){

            plan = new Plan(
                    command.getPlanId(),
                    command.getName(),
                    command.getDescription(),
                    command.getDestinationPlace(),
                    new Price(300000.0),
                    command.getNumberPeople(),
                    command.getNumberDay()
            );
        }else {

            plan = new Plan(
                    command.getPlanId(),
                    command.getName(),
                    command.getDescription(),
                    command.getDestinationPlace(),
                    command.getPrice(),
                    command.getNumberPeople(),
                    command.getNumberDay()
            );
        }

        emit().onResponse(new ResponseEvents(plan.getUncommittedChanges()));
    }
}
