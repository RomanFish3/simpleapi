package ru.mtuci.simpleapi.service;

import ru.mtuci.simpleapi.Model.Payer;

import java.util.List;

public interface PayerService {
    Payer get(Long id);

    List<Payer> getAll();

    Payer save(Payer payer);

    void delete(Long id);
}
