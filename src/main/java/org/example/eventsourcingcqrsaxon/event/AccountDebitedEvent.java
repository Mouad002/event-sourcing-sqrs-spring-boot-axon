package org.example.eventsourcingcqrsaxon.event;

public record AccountDebitedEvent(String accountId, double amount, String currency) {
}