package br.com.gustavodiniz.bankingservice.template.templates;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class BoletoPaymentProcessor extends TransactionProcessor {

    @Override
    protected void validateTransaction(String accountFrom, String accountTo, BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
        if (!accountTo.startsWith("BOL")) {
            throw new IllegalArgumentException("Invalid boleto identifier");
        }
        log.info("Validated boleto payment from {} to {}", accountFrom, accountTo);
    }

    @Override
    protected void executeTransaction(String accountFrom, String accountTo, BigDecimal amount) {
        log.info("Executed boleto payment from {} to {} of amount {}", accountFrom, accountTo, amount);
    }
}
