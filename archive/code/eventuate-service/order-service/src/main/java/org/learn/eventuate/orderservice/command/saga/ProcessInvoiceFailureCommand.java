package org.learn.eventuate.orderservice.command.saga;

import lombok.NoArgsConstructor;
import org.learn.eventuate.coreapi.ParticipantFailureInfo;

@NoArgsConstructor
public class ProcessInvoiceFailureCommand implements OrderSagaCommand {

    private ParticipantFailureInfo failureInfo;

    public ProcessInvoiceFailureCommand(ParticipantFailureInfo failureInfo) {
        this.failureInfo = failureInfo;
    }

    public ParticipantFailureInfo getFailureInfo() {
        return failureInfo;
    }
}
