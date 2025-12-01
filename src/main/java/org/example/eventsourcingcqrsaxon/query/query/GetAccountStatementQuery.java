package org.example.eventsourcingcqrsaxon.query.query;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class GetAccountStatementQuery {
    private String accountId;
}
