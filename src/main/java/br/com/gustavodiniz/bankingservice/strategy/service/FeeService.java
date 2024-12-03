package br.com.gustavodiniz.bankingservice.strategy.service;

import br.com.gustavodiniz.bankingservice.strategy.strategies.BusinessFeeStrategy;
import br.com.gustavodiniz.bankingservice.strategy.strategies.FeeStrategy;
import br.com.gustavodiniz.bankingservice.strategy.strategies.IndividualFeeStrategy;
import br.com.gustavodiniz.bankingservice.strategy.strategies.VipFeeStrategy;

import java.math.BigDecimal;
import java.util.Map;

public class FeeService {

    private final Map<String, FeeStrategy> strategies = Map.of(
            "INDIVIDUAL", new IndividualFeeStrategy(),
            "BUSINESS", new BusinessFeeStrategy(),
            "VIP", new VipFeeStrategy()
    );

    public BigDecimal calculateFee(String customerType, BigDecimal amount) {
        var strategy = strategies.get(customerType.toUpperCase());
        if (strategy == null) {
            throw new IllegalArgumentException("Invalid customer type");
        }
        return strategy.calculateFee(amount);
    }
}
