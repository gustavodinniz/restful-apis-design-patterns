package br.com.gustavodiniz.bankingservice.strategy.strategies;

import java.math.BigDecimal;

public interface FeeStrategy {

    BigDecimal calculateFee(BigDecimal amount);
}
