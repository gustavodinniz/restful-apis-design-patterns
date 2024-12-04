package br.com.gustavodiniz.bankingservice.template.dto;

import java.math.BigDecimal;

public record TransferDTO(
        String accountFrom,
        String accountTo,
        BigDecimal amount
) {
}
