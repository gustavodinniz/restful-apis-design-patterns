package br.com.gustavodiniz.bankingservice.template.service;

import br.com.gustavodiniz.bankingservice.template.dto.PayBoletoDTO;
import br.com.gustavodiniz.bankingservice.template.dto.TransferDTO;
import br.com.gustavodiniz.bankingservice.template.templates.BoletoPaymentProcessor;
import br.com.gustavodiniz.bankingservice.template.templates.TransferProcessor;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    public void processTransfer(TransferDTO transferDTO) {
        var transferProcessor = new TransferProcessor();
        transferProcessor.processTransaction(transferDTO.accountFrom(), transferDTO.accountTo(), transferDTO.amount());
    }

    public void processBoletoPayment(PayBoletoDTO payBoletoDTO) {
        var boletoPaymentProcessor = new BoletoPaymentProcessor();
        boletoPaymentProcessor.processTransaction(payBoletoDTO.accountFrom(), payBoletoDTO.boletoCode(), payBoletoDTO.amount());
    }
}
