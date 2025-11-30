package org.example.eventsourcingcqrsaxon.event;

import org.example.eventsourcingcqrsaxon.enums.AccountStatus;

public record AccountStatusUpdatedEvent(String accountId, AccountStatus status) {
}
