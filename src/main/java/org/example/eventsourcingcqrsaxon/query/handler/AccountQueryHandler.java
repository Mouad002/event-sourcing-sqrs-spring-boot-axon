package org.example.eventsourcingcqrsaxon.query.handler;

import lombok.AllArgsConstructor;
import org.axonframework.queryhandling.QueryHandler;
import org.example.eventsourcingcqrsaxon.query.entity.Account;
import org.example.eventsourcingcqrsaxon.query.entity.AccountOperation;
import org.example.eventsourcingcqrsaxon.query.query.GetAllAccountsQuery;
import org.example.eventsourcingcqrsaxon.query.repository.AccountRepository;
import org.example.eventsourcingcqrsaxon.query.repository.OperationRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class AccountQueryHandler {
    private AccountRepository accountRepository;
    private OperationRepository operationRepository;

    @QueryHandler
    public List<Account> on(GetAllAccountsQuery query) {
        return accountRepository.findAll();
    }
}
