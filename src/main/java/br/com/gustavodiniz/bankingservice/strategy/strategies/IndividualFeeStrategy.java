package br.com.gustavodiniz.bankingservice.strategy.strategies;

import java.math.BigDecimal;

public class IndividualFeeStrategy implements FeeStrategy {

    @Override
    public BigDecimal calculateFee(BigDecimal amount) {
        return amount.multiply(new BigDecimal("0.02"));
    }
}
