package com.iestyn.randomOdds;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class RandomOddsController {
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/randomNumber")
    public int randomNumber(@RequestParam(value = "number",defaultValue = "100") int number){
        RandomOdds randomOdds = new RandomOdds(counter.incrementAndGet());
        return randomOdds.randomNumber(number);
    }

    @GetMapping("/randomBoolean")
    public Boolean randomBoolean(@RequestParam(value = "numerator",defaultValue = "0") int numerator, @RequestParam(value = "denominator",defaultValue = "100") int denominater){
        RandomOdds randomOdds = new RandomOdds(counter.incrementAndGet());
        return randomOdds.randomBoolean(numerator,denominater);
    }
}
