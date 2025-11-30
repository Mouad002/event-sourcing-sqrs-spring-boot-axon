package org.example.eventsourcingcqrsaxon.query.repository;

import org.example.eventsourcingcqrsaxon.query.entity.AccountOperation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OperationRepository extends JpaRepository<AccountOperation,Long> {
    List<AccountOperation> findByAccountId(String id);
}