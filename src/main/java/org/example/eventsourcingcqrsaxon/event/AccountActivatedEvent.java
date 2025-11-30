package org.example.eventsourcingcqrsaxon.event;

import org.example.eventsourcingcqrsaxon.enums.AccountStatus;

public record AccountActivatedEvent(String accountId, AccountStatus status) {
}
