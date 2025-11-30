package org.example.eventsourcingcqrsaxon.command.dto;

public record AddNewAccountRequestDTO(double initialBalance, String currency) {
}
