package org.example.eventsourcingcqrsaxon.command.dto;

import org.example.eventsourcingcqrsaxon.enums.AccountStatus;

public record UpdateAccountStatusRequestDTO(String accountId, AccountStatus status) {
}