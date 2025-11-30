package org.example.eventsourcingcqrsaxon.command.dto;

public record DebitAccountDTO(String accountId, double amount, String currency) {
}