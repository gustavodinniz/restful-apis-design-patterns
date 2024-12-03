package br.com.gustavodiniz.bankingservice.strategy.controller;

import br.com.gustavodiniz.bankingservice.strategy.service.FeeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/fees")
public class FeeController {

    private final FeeService feeService;

    public FeeController() {
        this.feeService = new FeeService();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{customerType}")
    public BigDecimal getFee(@PathVariable String customerType, @RequestParam BigDecimal amount) {
        return feeService.calculateFee(customerType, amount);
    }

}
