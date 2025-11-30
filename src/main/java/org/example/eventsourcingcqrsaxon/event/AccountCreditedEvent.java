package org.example.eventsourcingcqrsaxon.event;

public record AccountCreditedEvent(String accountId, double amount, String currency) {
}