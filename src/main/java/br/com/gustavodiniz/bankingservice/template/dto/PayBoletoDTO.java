package br.com.gustavodiniz.bankingservice.template.dto;

import java.math.BigDecimal;

public record PayBoletoDTO(
        String accountFrom,
        String boletoCode,
        BigDecimal amount
) {
}
