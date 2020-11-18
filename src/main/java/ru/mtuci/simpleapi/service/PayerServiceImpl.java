package ru.mtuci.simpleapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mtuci.simpleapi.Model.Payer;
import ru.mtuci.simpleapi.dao.PayerRepository;

import java.util.List;

@Service
public class PayerServiceImpl implements PayerService {

    private final PayerRepository payerRepository;

    @Autowired
    public PayerServiceImpl(PayerRepository payerRepository){
        this.payerRepository = payerRepository;
    }

    @Override
    public Payer get(Long id) {
        return payerRepository.findById(id).orElse(null);
    }

    @Override
    public List<Payer> getAll() {
        return payerRepository.findAll();
    }

    @Override
    public Payer save(Payer product) {
        return payerRepository.save(product);
    }

    @Override
    public void delete(Long id) {
        payerRepository.delete(id);
    }
}
