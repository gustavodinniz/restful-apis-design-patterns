package br.com.gustavodiniz.bankingservice.strategy.strategies;

import java.math.BigDecimal;

public class VipFeeStrategy implements FeeStrategy {

    @Override
    public BigDecimal calculateFee(BigDecimal amount) {
        return BigDecimal.ZERO;
    }
}
