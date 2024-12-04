package br.com.gustavodiniz.bankingservice.template.templates;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class TransferProcessor extends TransactionProcessor {

    @Override
    protected void validateTransaction(String accountFrom, String accountTo, BigDecimal amount) {
        if (accountFrom.equals(accountTo)) {
            throw new IllegalArgumentException("Cannot transfer to the same account");
        }
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
        log.info("Validated transfer from {} to {}", accountFrom, accountTo);
    }

    @Override
    protected void executeTransaction(String accountFrom, String accountTo, BigDecimal amount) {
        log.info("Executed transfer from {} to {} of amount {}", accountFrom, accountTo, amount);
    }
}
