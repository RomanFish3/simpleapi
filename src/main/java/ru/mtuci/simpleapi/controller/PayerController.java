package ru.mtuci.simpleapi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.mtuci.simpleapi.Model.Payer;
import ru.mtuci.simpleapi.service.PayerService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = PayerController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class PayerController {
    public static final String REST_URL = "/api/v1/payers";

    private final PayerService payerService;

    @Autowired
    public PayerController(PayerService payerService){
        this.payerService = payerService;
    }

    @GetMapping(value = "/{id}")
    public Payer get(@PathVariable("id") Long id){
        log.info("get" + id);
        return payerService.get(id);
    }

    @GetMapping
    public List<Payer> getAll(){
        log.info("getAll");
        return payerService.getAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Payer save(@RequestBody Payer payer){
        log.info("save" + payer);
        return payerService.save(payer);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id){
        log.info("delete" + id);
        payerService.delete(id);
    }
}
