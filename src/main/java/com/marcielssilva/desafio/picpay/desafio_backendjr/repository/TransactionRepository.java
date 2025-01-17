package com.marcielssilva.desafio.picpay.desafio_backendjr.repository;

import com.marcielssilva.desafio.picpay.desafio_backendjr.domain.user.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
