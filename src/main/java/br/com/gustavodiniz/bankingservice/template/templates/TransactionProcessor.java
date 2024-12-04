package br.com.gustavodiniz.bankingservice.template.templates;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public abstract class TransactionProcessor {

    public final void processTransaction(String accountFrom, String accountTo, BigDecimal amount) {
        validateTransaction(accountFrom, accountTo, amount);
        executeTransaction(accountFrom, accountTo, amount);
        notifyCustomer(accountFrom, accountTo, amount);
    }

    protected abstract void validateTransaction(String accountFrom, String accountTo, BigDecimal amount);

    protected abstract void executeTransaction(String accountFrom, String accountTo, BigDecimal amount);

    private void notifyCustomer(String accountFrom, String accountTo, BigDecimal amount) {
        log.info("Notification sent for transaction from {} to {} of amount {}", accountFrom, accountTo, amount);
    }
}
