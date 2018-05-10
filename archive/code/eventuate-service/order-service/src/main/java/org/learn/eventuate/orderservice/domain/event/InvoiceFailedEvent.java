package org.learn.eventuate.orderservice.domain.event;

import lombok.NoArgsConstructor;
import org.learn.eventuate.coreapi.ParticipantFailureInfo;

@NoArgsConstructor
public class InvoiceFailedEvent implements OrderSagaEvent {
    private ParticipantFailureInfo failureInfo;

    public InvoiceFailedEvent(ParticipantFailureInfo failureInfo) {
        this.failureInfo = failureInfo;
    }

    public ParticipantFailureInfo getFailureInfo() {
        return failureInfo;
    }
}
