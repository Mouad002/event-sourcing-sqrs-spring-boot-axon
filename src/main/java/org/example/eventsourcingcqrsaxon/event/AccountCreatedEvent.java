package org.example.eventsourcingcqrsaxon.event;

import org.example.eventsourcingcqrsaxon.enums.AccountStatus;

public record AccountCreatedEvent(String accountId, double initialBalance, String currency, AccountStatus accountStatus) {
}
