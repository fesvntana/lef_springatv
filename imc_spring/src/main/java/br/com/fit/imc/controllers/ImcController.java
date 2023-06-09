package br.com.fit.imc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fit.imc.models.Person;
import br.com.fit.imc.services.ImcCalculatorService;

@RestController
@RequestMapping("/imc")
public class ImcController {
    @Autowired
    private ImcCalculatorService imcService;

    @PostMapping("/calc")
    public Person calculateImc(@RequestBody Person person) {
        imcService.calculate(person);

        return person;
    }
}
