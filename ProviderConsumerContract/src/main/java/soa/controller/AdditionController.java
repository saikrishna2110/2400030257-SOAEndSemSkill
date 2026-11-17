package soa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {

    @GetMapping(value = "/ms1/add",
            produces = "text/plain;charset=UTF-8")
    public String add(
            @RequestParam int a,
            @RequestParam int b) {

        int sum = a + b;

        return "MS 1.1 - Additon = " + sum;
    }
}
