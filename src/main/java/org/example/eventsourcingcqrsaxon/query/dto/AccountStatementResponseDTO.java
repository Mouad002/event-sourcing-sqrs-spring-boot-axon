package org.example.eventsourcingcqrsaxon.query.dto;

import org.example.eventsourcingcqrsaxon.query.entity.Account;
import org.example.eventsourcingcqrsaxon.query.entity.AccountOperation;

import java.util.List;

public record AccountStatementResponseDTO(Account account, List<AccountOperation> operations) {
}
