package br.com.gustavodiniz.bankingservice.template.controller;

import br.com.gustavodiniz.bankingservice.template.dto.PayBoletoDTO;
import br.com.gustavodiniz.bankingservice.template.dto.TransferDTO;
import br.com.gustavodiniz.bankingservice.template.service.TransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController() {
        this.transactionService = new TransactionService();
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/transfer")
    public void transfer(@RequestBody TransferDTO transferDTO) {
        transactionService.processTransfer(transferDTO);
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/boleto")
    public void payBoleto(@RequestBody PayBoletoDTO payBoletoDTO) {
        transactionService.processBoletoPayment(payBoletoDTO);
    }
}
