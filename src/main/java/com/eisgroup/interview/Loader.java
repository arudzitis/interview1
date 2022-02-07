package com.eisgroup.interview;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Loader implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info("Context loaded successfully.");
    }
}
