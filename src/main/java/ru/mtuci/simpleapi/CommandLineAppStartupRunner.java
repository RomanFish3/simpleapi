package ru.mtuci.simpleapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.mtuci.simpleapi.dao.PayerRepository;
//import sun.tools.jar.CommandLine;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {
    private final PayerRepository payerRepository;

    @Autowired
    public CommandLineAppStartupRunner(PayerRepository payerRepository){
        this.payerRepository = payerRepository;
    }
    @Override
    public void run(String...args) throws Exception{
        System.out.println("START");
    }
}
